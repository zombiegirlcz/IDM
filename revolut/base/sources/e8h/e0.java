package e8h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xzg.j0 f123682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xzg.l0 f123683b;

    public e0(xzg.j0 assetType, xzg.l0 timeSpan) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        this.f123682a = assetType;
        this.f123683b = timeSpan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return this.f123682a == e0Var.f123682a && this.f123683b == e0Var.f123683b;
    }

    public final int hashCode() {
        return this.f123683b.hashCode() + (this.f123682a.hashCode() * 31);
    }
}
