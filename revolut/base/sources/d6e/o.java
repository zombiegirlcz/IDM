package d6e;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends atc.b {
    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        n instance = (n) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        targetCollection.add(instance.f111521b);
    }
}
