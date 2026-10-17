package um2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.i f281194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f281195b;

    public g(aw0.i model, boolean z) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f281194a = model;
        this.f281195b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f281194a, gVar.f281194a) && this.f281195b == gVar.f281195b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281195b) + (this.f281194a.hashCode() * 31);
    }
}
