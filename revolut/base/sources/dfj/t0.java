package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114110b;

    public t0(String mobilePlanId, String str) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f114109a = mobilePlanId;
        this.f114110b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f114109a, t0Var.f114109a) && Intrinsics.f(this.f114110b, t0Var.f114110b);
    }

    public final int hashCode() {
        int iHashCode = this.f114109a.hashCode() * 31;
        String str = this.f114110b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
