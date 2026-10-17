package g4b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140454c;
    public final boolean d;

    public n(String instrumentRef, String portfolioId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f140452a = instrumentRef;
        this.f140453b = portfolioId;
        this.f140454c = str;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f140452a, nVar.f140452a) && Intrinsics.f(this.f140453b, nVar.f140453b) && Intrinsics.f(this.f140454c, nVar.f140454c) && this.d == nVar.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f140452a.hashCode() * 31, 31, this.f140453b);
        String str = this.f140454c;
        return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
