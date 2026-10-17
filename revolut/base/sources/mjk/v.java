package mjk;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        String str = ((iha.m) obj2).f161337a;
        int i = 2;
        Integer numValueOf = Integer.valueOf(Intrinsics.f(str, "PRIMARY") ? 0 : Intrinsics.f(str, "SECONDARY") ? 1 : 2);
        String str2 = ((iha.m) obj3).f161337a;
        if (Intrinsics.f(str2, "PRIMARY")) {
            i = 0;
        } else if (Intrinsics.f(str2, "SECONDARY")) {
            i = 1;
        }
        return cim.b.b(numValueOf, Integer.valueOf(i));
    }
}
