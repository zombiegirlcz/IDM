package bs4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.CreditCardPrePurchaseDetailsScreenContract$InputData;
import cp4.g0;
import dp4.c0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.r1;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends oki.h implements dli.b {
    public final CreditCardPrePurchaseDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.m f18060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final whf.b f18061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f18062r;

    public t(CreditCardPrePurchaseDetailsScreenContract$InputData inputData, al4.m creditCardInstalmentInteractor, whf.b transactionItemsProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(transactionItemsProvider, "transactionItemsProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f18060p = creditCardInstalmentInteractor;
        this.f18061q = transactionItemsProvider;
        this.f18062r = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        CreditCardPrePurchaseDetailsScreenContract$InputData creditCardPrePurchaseDetailsScreenContract$InputData = this.o;
        String facilityId = creditCardPrePurchaseDetailsScreenContract$InputData.f69383a;
        String planId = creditCardPrePurchaseDetailsScreenContract$InputData.f69384b;
        r1 r1Var = (r1) this.f18060p;
        r1Var.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        c0 c0Var = r1Var.d;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.q(rd0.e.n(xam.a.h(new s(this, continuation, 0), c0Var.f116609j.b(new g0(facilityId, planId), loadingStrategy)), h0.f322473a)), null, null, new s(this, continuation, 1), 3);
    }

    public final void I2(yx4.b item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.f(item.f317544a, "ERROR_STATE_ID")) {
            n2(new aza.g(this, null, 27), new whi.b(6));
        } else {
            Object obj2 = item.f317545b;
            if (obj2 instanceof ql4.j) {
                C2(new h((ql4.j) obj2));
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f18062r;
    }
}
