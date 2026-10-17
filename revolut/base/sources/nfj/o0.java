package nfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215007b;

    public o0(String mobilePlanId, String str) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f215006a = mobilePlanId;
        this.f215007b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f215006a, o0Var.f215006a) && Intrinsics.f(this.f215007b, o0Var.f215007b);
    }

    public final int hashCode() {
        int iHashCode = this.f215006a.hashCode() * 31;
        String str = this.f215007b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
