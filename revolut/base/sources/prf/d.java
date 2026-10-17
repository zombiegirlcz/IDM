package prf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends qk.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239006c;
    public final String d;

    public d(String sourceCurrencyCode, String portfolioId, String str) {
        Intrinsics.checkNotNullParameter(sourceCurrencyCode, "sourceCurrencyCode");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f239005b = sourceCurrencyCode;
        this.f239006c = portfolioId;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f239005b, dVar.f239005b) && Intrinsics.f(this.f239006c, dVar.f239006c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f239005b.hashCode() * 31, 31, this.f239006c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // qk.d
    public final String i() {
        return this.d;
    }
}
