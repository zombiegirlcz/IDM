package w80;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import u80.d;
import u80.k;
import u80.p;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f295561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f295562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f295563c;
    public final boolean d;
    public final boolean e;
    public final qd0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v80.a f295564g;

    public a(boolean z, d dVar, boolean z3, boolean z4, boolean z6, qd0.b languageProvider, v80.a moneyBuilderFactory) {
        p moneyUtils = p.f278066a;
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(moneyBuilderFactory, "moneyBuilderFactory");
        Intrinsics.checkNotNullParameter(moneyUtils, "moneyUtils");
        this.f295561a = z;
        this.f295562b = dVar;
        this.f295563c = z3;
        this.d = z4;
        this.e = z6;
        this.f = languageProvider;
        this.f295564g = moneyBuilderFactory;
    }

    public final BigInteger a(String amount, xi0.b currency) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (amount.length() == 0) {
            BigInteger bigInteger = BigInteger.ZERO;
            Intrinsics.h(bigInteger);
            return bigInteger;
        }
        p pVar = p.f278066a;
        return p.b(amount, currency.f306286a, this.f, Integer.valueOf(currency.c()));
    }

    public final String b(BigInteger amount, xi0.b currency) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (amount.signum() < 0) {
            return "";
        }
        if (amount.signum() == 0 && !this.e) {
            return "";
        }
        k kVar = (k) this.f295564g.invoke(this.f);
        Intrinsics.checkNotNullParameter(amount, "amount");
        kVar.f278048c = amount;
        kVar.f278047b = currency;
        if (this.f295563c) {
            kVar.k = true;
        }
        if (this.f295561a) {
            kVar.e();
        }
        if (this.d) {
            kVar.f278053m = true;
        }
        d dVar = this.f295562b;
        if (dVar != null) {
            kVar.o = Character.valueOf(dVar.f278029a.getDecimalFormatSymbols().getMonetaryGroupingSeparator());
        }
        return kVar.a();
    }
}
