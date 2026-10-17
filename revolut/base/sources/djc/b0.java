package djc;

import com.revolut.data.model.Data;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.l0;
import vkm.t0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends oki.h implements s {

    @NotNull
    public static final u Companion = new u();
    public final RentAndBillsManageLinkedPaymentsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bgc.d f115290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final utk.f f115291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vgc.p f115292r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xua.a f115293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l0 f115294t;
    public final tga.k u;
    public final i7d.o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f115295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f115296x;

    public b0(RentAndBillsManageLinkedPaymentsScreenContract$InputData inputData, bgc.d rentAndBillsInteractor, utk.f nextPaymentInteractor, vgc.p rentAndBillsRevPointsInteractor, xua.a recurringPaymentInteractor, l0 popupMenuDialogDisplayer, tga.k pricingPlanUpgradeEntryPointItemProvider, i7d.o helpWidgetControllerModelExtension, c0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rentAndBillsInteractor, "rentAndBillsInteractor");
        Intrinsics.checkNotNullParameter(nextPaymentInteractor, "nextPaymentInteractor");
        Intrinsics.checkNotNullParameter(rentAndBillsRevPointsInteractor, "rentAndBillsRevPointsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(pricingPlanUpgradeEntryPointItemProvider, "pricingPlanUpgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f115290p = rentAndBillsInteractor;
        this.f115291q = nextPaymentInteractor;
        this.f115292r = rentAndBillsRevPointsInteractor;
        this.f115293s = recurringPaymentInteractor;
        this.f115294t = popupMenuDialogDisplayer;
        this.u = pricingPlanUpgradeEntryPointItemProvider;
        this.v = helpWidgetControllerModelExtension;
        this.f115295w = new vii.b();
        this.f115296x = mra.d.b(this, new i(inputData.f84980a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null, new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        int i = 1;
        Continuation continuation = null;
        w wVar = new w(i, this, continuation);
        vii.b bVar = this.f115295w;
        wkm.l lVarQ = vkm.q.Q(bVar, wVar);
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(lVarQ, h0Var), null, null, new x(i, this, continuation), 3);
        yji.l.a1(this, rd0.e.n(vkm.q.Q(bVar, new w(3, this, continuation)), h0Var), null, null, new x(4, this, continuation), 3);
        yji.l.a1(this, this.f115291q.e(), null, null, new x(2, this, continuation), 3);
        yji.l.a1(this, rd0.e.n(vkm.q.Q(bVar, new w(2, this, continuation)), h0Var), null, null, new x(3, this, continuation), 3);
        yji.l.a1(this, mo3.a.g(this.u.d(mga.v.f205221a), null, new dee.a0(18), 1), null, null, new x(5, this, continuation), 3);
        yji.l.a1(this, vkm.q.Q(new t0(this.f115296x.B(new dce.l0(this, 16)), 1), new w(0, this, continuation)), null, null, new x(0, this, continuation), 3);
    }

    @Override // yji.l
    public final void P1() {
        this.f115294t.a();
    }

    @Override // yji.l
    public final void T1(long j2) {
        this.f115295w.a();
        yji.l.b1(this, rd0.e.b(this.f115294t.f256113c), null, new cyc.c(2, this, b0.class, "onPopupMenuItemClicked", "onPopupMenuItemClicked(Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem;)V", 4, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f115296x;
    }
}
