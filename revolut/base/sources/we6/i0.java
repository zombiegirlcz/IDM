package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296647b;

    public i0(String deepLink, String consentId) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        this.f296646a = deepLink;
        this.f296647b = consentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f296646a, i0Var.f296646a) && Intrinsics.f(this.f296647b, i0Var.f296647b);
    }

    public final int hashCode() {
        return this.f296647b.hashCode() + (this.f296646a.hashCode() * 31);
    }
}
