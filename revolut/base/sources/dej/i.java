package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f113553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f113554c;
    public final boolean d;

    public i(long j2, String partnerTermsUrl, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(partnerTermsUrl, "partnerTermsUrl");
        this.f113552a = partnerTermsUrl;
        this.f113553b = j2;
        this.f113554c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f113552a, iVar.f113552a) && this.f113553b == iVar.f113553b && this.f113554c == iVar.f113554c && this.d == iVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(a0.d.c(this.f113552a.hashCode() * 31, 31, this.f113553b), 31, this.f113554c);
    }
}
