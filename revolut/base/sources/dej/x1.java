package dej;

import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTerms;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f113691c;
    public final Instant d;
    public final EsimAutoRenewalTerms e;
    public final String f;

    public x1(boolean z, boolean z3, Instant expirationDate, Instant instant, EsimAutoRenewalTerms esimAutoRenewalTerms, String str) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.f113689a = z;
        this.f113690b = z3;
        this.f113691c = expirationDate;
        this.d = instant;
        this.e = esimAutoRenewalTerms;
        this.f = str;
    }

    public static x1 a(x1 x1Var, boolean z, boolean z3) {
        Instant expirationDate = x1Var.f113691c;
        Instant instant = x1Var.d;
        EsimAutoRenewalTerms esimAutoRenewalTerms = x1Var.e;
        String str = x1Var.f;
        x1Var.getClass();
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        return new x1(z, z3, expirationDate, instant, esimAutoRenewalTerms, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return this.f113689a == x1Var.f113689a && this.f113690b == x1Var.f113690b && Intrinsics.f(this.f113691c, x1Var.f113691c) && Intrinsics.f(this.d, x1Var.d) && Intrinsics.f(this.e, x1Var.e) && Intrinsics.f(this.f, x1Var.f);
    }

    public final int hashCode() {
        int iC = r6.b.c(j6.a.c(Boolean.hashCode(this.f113689a) * 31, 31, this.f113690b), 31, this.f113691c);
        Instant instant = this.d;
        int iHashCode = (iC + (instant == null ? 0 : instant.hashCode())) * 31;
        EsimAutoRenewalTerms esimAutoRenewalTerms = this.e;
        int iHashCode2 = (iHashCode + (esimAutoRenewalTerms == null ? 0 : esimAutoRenewalTerms.hashCode())) * 31;
        String str = this.f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
