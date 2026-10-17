package dv5;

import efm.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import pt5.t;
import qua.y;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements pt5.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.b f118044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f118045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0i.b f118046c;
    public final xua.a d;
    public final t e;

    public l(whf.b transactionsContentProvider, wsg.n walletInteractor, p0i.b fxOrderInteractor, xua.a recurringPaymentInteractor, t transactionsFilterProvider, lu5.n transactionsFilterProviderForLinkedTransactions) {
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(transactionsFilterProvider, "transactionsFilterProvider");
        Intrinsics.checkNotNullParameter(transactionsFilterProviderForLinkedTransactions, "transactionsFilterProviderForLinkedTransactions");
        this.f118044a = transactionsContentProvider;
        this.f118045b = walletInteractor;
        this.f118046c = fxOrderInteractor;
        this.d = recurringPaymentInteractor;
        this.e = transactionsFilterProvider;
    }

    public final r b(xi0.b bVar) {
        r rVarW = nim.a.w(((x0i.g) this.f118046c).f301642a.e.f(Unit.f186387a, true), new a94.q(this, bVar, 25));
        yua.q qVar = (yua.q) this.d;
        return nim.a.w(u1.d(rVarW, nim.a.w(nim.a.w(qVar.s(false, y.f249342a, false), new vgc.b(qVar, bVar, 17)), new ds4.b(12))), new ds4.b(10));
    }

    public final efm.b c(qua.p payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        ibd.f fVar = payment.f249316b;
        ibd.e eVar = payment.f249314a;
        int i = i.f118043a[fVar.ordinal()];
        xua.a aVar = this.d;
        if (i == 1) {
            pfm.h hVar = new pfm.h(((yua.q) aVar).j(eVar.f160150a), 4);
            Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
            return hVar;
        }
        if (i != 2) {
            pfm.m mVar = pfm.m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        pfm.h hVar2 = new pfm.h(((yua.q) aVar).f(eVar.f160150a), 4);
        Intrinsics.checkNotNullExpressionValue(hVar2, "ignoreElement(...)");
        return hVar2;
    }
}
