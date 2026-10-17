package sxd;

import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends oki.h implements k {
    public final EditTopUpOrderScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i61.b f266453p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xoj.a f266454q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e0 f266455r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ang.f f266456s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nxd.b f266457t;
    public final nxd.c u;
    public final kxd.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cli.y f266458w;

    public z(cli.n stateMapper, EditTopUpOrderScreenContract$InputData inputData, i61.b autoTopUpInteractor, xoj.a featuresInteractor, e0 topUpOrderSuggestionsFactory, ang.f userInteractor, nxd.b customOrderAmountRelay, nxd.c selectedAutoTopUpMethodRelay, kxd.a standingOrderInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(autoTopUpInteractor, "autoTopUpInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(topUpOrderSuggestionsFactory, "topUpOrderSuggestionsFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(customOrderAmountRelay, "customOrderAmountRelay");
        Intrinsics.checkNotNullParameter(selectedAutoTopUpMethodRelay, "selectedAutoTopUpMethodRelay");
        Intrinsics.checkNotNullParameter(standingOrderInteractor, "standingOrderInteractor");
        this.o = inputData;
        this.f266453p = autoTopUpInteractor;
        this.f266454q = featuresInteractor;
        this.f266455r = topUpOrderSuggestionsFactory;
        this.f266456s = userInteractor;
        this.f266457t = customOrderAmountRelay;
        this.u = selectedAutoTopUpMethodRelay;
        this.v = standingOrderInteractor;
        AutoTopUpState autoTopUpState = inputData.f88204b;
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.f266458w = mra.d.b(this, new g(autoTopUpState, null, f0Var, null, f0Var, null, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        int i = 26;
        l2(new r(this, null), new yi5.b(i));
        l2(new s(this, null), new yi5.b(i));
        l2(new o(this, null), new yi5.b(i));
        l2(new p(this, null), new yi5.b(i));
        yji.l.a1(this, this.f266457t.f220556b, null, null, new v(this, null), 3);
        yji.l.a1(this, ((nxd.d) this.u).f220558b, null, null, new w(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f266458w;
    }
}
