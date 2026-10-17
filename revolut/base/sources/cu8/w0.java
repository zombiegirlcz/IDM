package cu8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my8.k f108905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final my8.q f108907c;

    public w0(my8.k kycConsent, String str, my8.q kycProvider) {
        Intrinsics.checkNotNullParameter(kycConsent, "kycConsent");
        Intrinsics.checkNotNullParameter(kycProvider, "kycProvider");
        this.f108905a = kycConsent;
        this.f108906b = str;
        this.f108907c = kycProvider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return this.f108905a == w0Var.f108905a && Intrinsics.f(this.f108906b, w0Var.f108906b) && this.f108907c == w0Var.f108907c;
    }

    public final int hashCode() {
        int iHashCode = this.f108905a.hashCode() * 31;
        String str = this.f108906b;
        return this.f108907c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
