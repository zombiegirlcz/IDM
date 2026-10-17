package kd3;

import com.revolut.data.model.Data;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreenContract$InputData;
import jki.p;
import k8d.s;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import od3.t0;
import od3.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jd3.k f182793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bd3.a f182794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pd3.d f182795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qpg.b f182796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y0 f182797t;
    public final t0 u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final id3.a f182798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final jd3.k f182799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fk3.a f182800y;
    public final f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p stateMapper, CashbackPocketDetailsScreenContract$InputData inputData, jd3.k cashbackProductAccountProvider, bd3.a cashbackInteractor, pd3.d planProductDataProvider, qpg.b euShieldControllerModelExtension, y0 planCashbackTotalBottomDialogProvider, t0 changeCurrencyBottomDialogProvider, j60.a bottomExpandableDialogControllerExtension, id3.a cashbackCurrencyEventHandler, jd3.k productAccountProvider, fk3.a configInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cashbackProductAccountProvider, "cashbackProductAccountProvider");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(planProductDataProvider, "planProductDataProvider");
        Intrinsics.checkNotNullParameter(euShieldControllerModelExtension, "euShieldControllerModelExtension");
        Intrinsics.checkNotNullParameter(planCashbackTotalBottomDialogProvider, "planCashbackTotalBottomDialogProvider");
        Intrinsics.checkNotNullParameter(changeCurrencyBottomDialogProvider, "changeCurrencyBottomDialogProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(cashbackCurrencyEventHandler, "cashbackCurrencyEventHandler");
        Intrinsics.checkNotNullParameter(productAccountProvider, "productAccountProvider");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        this.f182793p = cashbackProductAccountProvider;
        this.f182794q = cashbackInteractor;
        this.f182795r = planProductDataProvider;
        this.f182796s = euShieldControllerModelExtension;
        this.f182797t = planCashbackTotalBottomDialogProvider;
        this.u = changeCurrencyBottomDialogProvider;
        this.v = bottomExpandableDialogControllerExtension;
        this.f182798w = cashbackCurrencyEventHandler;
        this.f182799x = productAccountProvider;
        this.f182800y = configInteractor;
        this.z = new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f65703a, null);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(m70.a.g(this.f182793p.a(w4l.h.f294642c), null, new s(24), 1)), null, null, new k(this, continuation, 0), 3);
        yji.l.a1(this, rd0.e.b(this.f182794q.e()), null, null, new k(this, continuation, 1), 3);
        yji.l.a1(this, new jij.d((vkm.d) this.f182795r.b(), 29), null, null, new k(this, continuation, 2), 3);
        this.f182799x.getClass();
        yji.l.a1(this, mo3.a.g(jd3.k.b(), null, new s(25), 1), null, null, new k(this, continuation, 3), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }
}
