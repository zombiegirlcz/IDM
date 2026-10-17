package x15;

import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import ip0.v7;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f302258c;
    public final CreditCardAutopayPayments d;
    public final xw4.a e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f302259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f302260h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f302261j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f302262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f302263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dj0.d f302264n;
    public final dj0.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dj0.d f302265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dj0.d f302266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f302267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LocalDate f302268s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f302269t;
    public final List u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f302270w;

    public f(String facilityId, String pocketId, wi0.b countryCode, CreditCardAutopayPayments creditCardAutopayPayments, xw4.a paymentState, xi0.b currency, boolean z, boolean z3, LocalDate statementMonth, LocalDate prevStatementMonth, boolean z4, dj0.d minimumAmount, a aVar, dj0.d remainingBalance, dj0.d statementBalance, dj0.d accruedInterest, dj0.d dVar, long j2, LocalDate repaymentDueDate, boolean z6, List boletos, boolean z11, int i) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(statementMonth, "statementMonth");
        Intrinsics.checkNotNullParameter(prevStatementMonth, "prevStatementMonth");
        Intrinsics.checkNotNullParameter(minimumAmount, "minimumAmount");
        Intrinsics.checkNotNullParameter(remainingBalance, "remainingBalance");
        Intrinsics.checkNotNullParameter(statementBalance, "statementBalance");
        Intrinsics.checkNotNullParameter(accruedInterest, "accruedInterest");
        Intrinsics.checkNotNullParameter(repaymentDueDate, "repaymentDueDate");
        Intrinsics.checkNotNullParameter(boletos, "boletos");
        this.f302256a = facilityId;
        this.f302257b = pocketId;
        this.f302258c = countryCode;
        this.d = creditCardAutopayPayments;
        this.e = paymentState;
        this.f = currency;
        this.f302259g = z;
        this.f302260h = z3;
        this.i = statementMonth;
        this.f302261j = prevStatementMonth;
        this.k = z4;
        this.f302262l = minimumAmount;
        this.f302263m = aVar;
        this.f302264n = remainingBalance;
        this.o = statementBalance;
        this.f302265p = accruedInterest;
        this.f302266q = dVar;
        this.f302267r = j2;
        this.f302268s = repaymentDueDate;
        this.f302269t = z6;
        this.u = boletos;
        this.v = z11;
        this.f302270w = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f302256a, fVar.f302256a) && Intrinsics.f(this.f302257b, fVar.f302257b) && Intrinsics.f(this.f302258c, fVar.f302258c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e && Intrinsics.f(this.f, fVar.f) && this.f302259g == fVar.f302259g && this.f302260h == fVar.f302260h && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f302261j, fVar.f302261j) && this.k == fVar.k && Intrinsics.f(this.f302262l, fVar.f302262l) && Intrinsics.f(this.f302263m, fVar.f302263m) && Intrinsics.f(this.f302264n, fVar.f302264n) && Intrinsics.f(this.o, fVar.o) && Intrinsics.f(this.f302265p, fVar.f302265p) && Intrinsics.f(this.f302266q, fVar.f302266q) && this.f302267r == fVar.f302267r && Intrinsics.f(this.f302268s, fVar.f302268s) && this.f302269t == fVar.f302269t && Intrinsics.f(this.u, fVar.u) && this.v == fVar.v && this.f302270w == fVar.f302270w;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f302256a.hashCode() * 31, 31, this.f302257b), 31, this.f302258c.f297794a);
        CreditCardAutopayPayments creditCardAutopayPayments = this.d;
        int iC2 = v7.c(j6.a.c(wp5.y.a(wp5.y.a(j6.a.c(j6.a.c(h30.l.j(this.f, (this.e.hashCode() + ((iC + (creditCardAutopayPayments == null ? 0 : creditCardAutopayPayments.hashCode())) * 31)) * 31, 31), 31, this.f302259g), 31, this.f302260h), 31, this.i), 31, this.f302261j), 31, this.k), 31, this.f302262l);
        a aVar = this.f302263m;
        int iC3 = v7.c(v7.c(v7.c((iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f302264n), 31, this.o), 31, this.f302265p);
        dj0.d dVar = this.f302266q;
        return Integer.hashCode(this.f302270w) + j6.a.c(p.a.d(j6.a.c(wp5.y.a(a0.d.c((iC3 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.f302267r), 31, this.f302268s), 31, this.f302269t), 31, this.u), 31, this.v);
    }
}
