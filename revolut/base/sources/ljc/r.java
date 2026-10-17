package ljc;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.select_payment.RentAndBillsSelectPaymentScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sgm.e3;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends oki.h implements k {
    public final RentAndBillsSelectPaymentScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xua.a f195642p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bgc.d f195643q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e3 f195644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cjc.b f195645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ojc.a f195646t;
    public final vii.b u;
    public final y v;

    public r(RentAndBillsSelectPaymentScreenContract$InputData inputData, xua.a recurringPaymentInteractor, bgc.d rentAndBillsInteractor, e3 exchangeRatesInteractor, cjc.b linkPaymentStatusDialogFactory, ojc.a linkedPaymentMapper, s stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(rentAndBillsInteractor, "rentAndBillsInteractor");
        Intrinsics.checkNotNullParameter(exchangeRatesInteractor, "exchangeRatesInteractor");
        Intrinsics.checkNotNullParameter(linkPaymentStatusDialogFactory, "linkPaymentStatusDialogFactory");
        Intrinsics.checkNotNullParameter(linkedPaymentMapper, "linkedPaymentMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f195642p = recurringPaymentInteractor;
        this.f195643q = rentAndBillsInteractor;
        this.f195644r = exchangeRatesInteractor;
        this.f195645s = linkPaymentStatusDialogFactory;
        this.f195646t = linkedPaymentMapper;
        this.u = new vii.b();
        this.v = mra.d.b(this, new g(inputData.f84983a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        int i = 2;
        Continuation continuation = null;
        p pVar = new p(i, continuation, this);
        vii.b bVar = this.u;
        wkm.l lVarQ = vkm.q.Q(bVar, pVar);
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(lVarQ, h0Var), null, null, new q(i, continuation, this), 3);
        int i2 = 1;
        yji.l.a1(this, rd0.e.n(vkm.q.Q(bVar, new p(i2, continuation, this)), h0Var), null, null, new q(i2, continuation, this), 3);
        int i3 = 0;
        yji.l.a1(this, rd0.e.n(vkm.q.Q(bVar, new p(i3, continuation, this)), h0Var), null, null, new q(i3, continuation, this), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new kze.h(this, null, 21), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
