package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f151858c;

    public k(String resultId, String externalPartner, m status) {
        Intrinsics.checkNotNullParameter(resultId, "resultId");
        Intrinsics.checkNotNullParameter(externalPartner, "externalPartner");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f151856a = resultId;
        this.f151857b = externalPartner;
        this.f151858c = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f151856a, kVar.f151856a) && Intrinsics.f(this.f151857b, kVar.f151857b) && this.f151858c == kVar.f151858c;
    }

    public final int hashCode() {
        return this.f151858c.hashCode() + p.a.c(this.f151856a.hashCode() * 31, 31, this.f151857b);
    }
}
