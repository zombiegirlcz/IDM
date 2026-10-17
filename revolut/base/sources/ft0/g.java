package ft0;

import ip0.ic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic f137757a;

    public g(ic model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f137757a = model;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF98597a() {
        return this.f137757a.f164669a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f137757a, ((g) obj2).f137757a);
    }

    public final int hashCode() {
        return this.f137757a.hashCode();
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        g gVar = oldItem instanceof g ? (g) oldItem : null;
        if (gVar == null) {
            return null;
        }
        ic icVar = gVar.f137757a;
        dj0.d dVar = icVar.f164670b;
        return new f(!dVar.equals(r2.f164670b), icVar.f164671c != this.f137757a.f164671c);
    }
}
