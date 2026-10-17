package kmf;

import cmf.p;
import hmf.k0;
import kkf.d0;
import kkf.i;
import kkf.k1;
import kkf.k7;
import kkf.o1;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oi3.g;
import okf.h;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.c f185824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k7 f185825h;
    public final d0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final okf.f f185826j;
    public final y0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k1 f185827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f185828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f185829n;
    public final o1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final clf.a f185830p;

    public d(h0 commonDataSource, jt0.b commonHeaderProvider, amf.c hideTransactionMenuOptionProvider, k7 statusBlockProvider, d0 confirmationBlockProvider, okf.f creditCardExplainerBlockProvider, y0 equivalentBlockProvider, k1 fromBlockProvider, i cardBlockProvider, h creditCardFeeChargesBlockProvider, o1 getHelpBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(creditCardExplainerBlockProvider, "creditCardExplainerBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(cardBlockProvider, "cardBlockProvider");
        Intrinsics.checkNotNullParameter(creditCardFeeChargesBlockProvider, "creditCardFeeChargesBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f185824g = hideTransactionMenuOptionProvider;
        this.f185825h = statusBlockProvider;
        this.i = confirmationBlockProvider;
        this.f185826j = creditCardExplainerBlockProvider;
        this.k = equivalentBlockProvider;
        this.f185827l = fromBlockProvider;
        this.f185828m = cardBlockProvider;
        this.f185829n = creditCardFeeChargesBlockProvider;
        this.o = getHelpBlockProvider;
        this.f185830p = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f185830p.Z2();
        p pVarA = this.k.a();
        p pVarA2 = k0.a(this.f185828m.Z2(), this.f185827l.Z2(), this.f185825h.a(), this.i.a());
        h hVar = this.f185829n;
        return h(v.k(pVarZ2, pVarA, pVarA2, new p(new g(hVar.f226015a.d(), hVar, 3), new ok7.b(4), u.c(hVar.f226017c), "CreditCardFeeCharges"), this.f185826j.a(), this.o.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return new go.g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(u.c(this.f185824g.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
