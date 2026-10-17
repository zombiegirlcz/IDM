package d89;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        io3.d dVar = (io3.d) obj2;
        io3.d dVar2 = (io3.d) obj3;
        return cim.b.b(Boolean.valueOf(Intrinsics.f(dVar.d, dVar.f163147c)), Boolean.valueOf(Intrinsics.f(dVar2.d, dVar2.f163147c)));
    }
}
