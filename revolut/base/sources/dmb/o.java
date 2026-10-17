package dmb;

import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate.PickYourRateScreenContract$InputData;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends oki.h implements i {
    public final PickYourRateScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ijb.a f115893p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f115894q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.n f115895r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tmb.i f115896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f80.a f115897t;
    public final y u;

    public o(p stateMapper, PickYourRateScreenContract$InputData inputData, ijb.a savingsProductInteractor, t pricingPlanInteractor, wsg.n walletInteractor, tmb.i eventHandlerExtension, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(eventHandlerExtension, "eventHandlerExtension");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = inputData;
        this.f115893p = savingsProductInteractor;
        this.f115894q = pricingPlanInteractor;
        this.f115895r = walletInteractor;
        this.f115896s = eventHandlerExtension;
        this.f115897t = uriHelper;
        this.u = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        t tVar = this.f115894q;
        vkm.d dVarB = rd0.e.b(tVar.q());
        vkm.d dVarB2 = rd0.e.b(tVar.n());
        akg.n nVarA = ijb.a.a(this.f115893p, null, u.c(this.o.f83280a), u.c(ncd.m.ACTIVE), null, 9);
        Continuation continuation = null;
        yji.l.a1(this, mo3.a.g(nim.a.u(new d4f.m(2, 5, continuation), u0.m(u0.i(dVarB, dVarB2, nVarA), rd0.e.b(this.f115895r.J(AccountId.Personal.f51414a, w4l.h.f294642c)))), null, new m(0), 1), new n(this, continuation, 0), null, new n(this, continuation, 1), 2);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
