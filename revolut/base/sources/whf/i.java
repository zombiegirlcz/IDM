package whf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f297641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f297642b;

    public i(boolean z, h spareChangeVisibility) {
        Intrinsics.checkNotNullParameter(spareChangeVisibility, "spareChangeVisibility");
        this.f297641a = z;
        this.f297642b = spareChangeVisibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f297641a == iVar.f297641a && Intrinsics.f(this.f297642b, iVar.f297642b);
    }

    public final int hashCode() {
        return this.f297642b.hashCode() + (Boolean.hashCode(this.f297641a) * 31);
    }

    public /* synthetic */ i(boolean z) {
        this(z, g.f297640a);
    }
}
