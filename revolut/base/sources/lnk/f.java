package lnk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f197294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f197295b;

    public f(hha.d plan, boolean z) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f197294a = plan;
        this.f197295b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f197294a, fVar.f197294a) && this.f197295b == fVar.f197295b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197295b) + (this.f197294a.hashCode() * 31);
    }
}
