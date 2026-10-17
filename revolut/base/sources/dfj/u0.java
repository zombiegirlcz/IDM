package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114119b;

    public u0(String mobilePlanId, String str) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f114118a = mobilePlanId;
        this.f114119b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f114118a, u0Var.f114118a) && Intrinsics.f(this.f114119b, u0Var.f114119b);
    }

    public final int hashCode() {
        int iHashCode = this.f114118a.hashCode() * 31;
        String str = this.f114119b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
