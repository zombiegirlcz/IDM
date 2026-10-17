package e8e;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.WhoToTransferFeatureConfig;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.WhoToTransferScreenMode;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.subaccount.api.CreateSubaccountScreenDestination;
import com.revolut.feature.subaccount.api.ManageBillAccountDestination;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.impl.ui.edit.billl.screen.edit.BillSelectorScreenContract$InputData;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import h93.f0;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import rp0.g1;
import vkm.v1;
import zh9.u0;
import zhm.h0;
import zhm.z0;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends jki.g implements p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g6e.d f123658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xua.a f123659q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f123660r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final BillSelectorScreenContract$InputData f123661s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z8e.a f123662t;
    public final g9e.b u;
    public final g1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c7e.b f123663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d0 f123664x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final nhf.a f123665y;
    public final m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(jki.p stateMapper, g6e.d subaccountInteractor, xua.a recurringPaymentInteractor, j60.a bottomExpandableDialogControllerExtension, BillSelectorScreenContract$InputData inputData, z8e.a subscriptionsAppNavigationProvider, g9e.b unlinkCardFromSubaccountFlowFactory, g1 shotDialogDisplayer, c7e.b subaccountDialogMapper, d0 subaccountMulticurrencyBillsConfirmationDialogProvider, nhf.a unitedWalletInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subscriptionsAppNavigationProvider, "subscriptionsAppNavigationProvider");
        Intrinsics.checkNotNullParameter(unlinkCardFromSubaccountFlowFactory, "unlinkCardFromSubaccountFlowFactory");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(subaccountDialogMapper, "subaccountDialogMapper");
        Intrinsics.checkNotNullParameter(subaccountMulticurrencyBillsConfirmationDialogProvider, "subaccountMulticurrencyBillsConfirmationDialogProvider");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f123658p = subaccountInteractor;
        this.f123659q = recurringPaymentInteractor;
        this.f123660r = bottomExpandableDialogControllerExtension;
        this.f123661s = inputData;
        this.f123662t = subscriptionsAppNavigationProvider;
        this.u = unlinkCardFromSubaccountFlowFactory;
        this.v = shotDialogDisplayer;
        this.f123663w = subaccountDialogMapper;
        this.f123664x = subaccountMulticurrencyBillsConfirmationDialogProvider;
        this.f123665y = unitedWalletInteractor;
        String str = inputData.f89071a;
        Data data = new Data(null, null, true, 3, null);
        h0 h0Var = h0.f322473a;
        k71.q.Companion.getClass();
        this.z = new m(str, data, h0Var, h0Var, false, k71.p.a());
    }

    @Override // yji.l
    public final void I1() {
        String str = ((m) t2()).f123642a;
        s6e.z zVar = (s6e.z) this.f123658p;
        yji.l.a1(this, mo3.a.g(c8g.a.D(rd0.e.b(zVar.p(str))), null, null, 3), null, null, new u(this, null, 0), 3);
        final int i = 0;
        final int i2 = 1;
        yji.l.a1(this, nim.a.v(u0.m(boh.f.e(zVar.u(str), new Function1(this) { // from class: e8e.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f123652b;

            {
                this.f123652b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                f0 f0Var;
                switch (i) {
                    case 0:
                        Subaccount subaccount = (Subaccount) obj2;
                        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
                        s6e.z zVar2 = (s6e.z) this.f123652b.f123658p;
                        zVar2.getClass();
                        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
                        return nim.a.v(nim.a.v(vkm.q.Q(new v1(new qg7.p(zVar2, subaccount.getF88959a().f234881a, null)), new r3k.c(null, zVar2, 25)), new s31.a(zVar2, subaccount, 9)), new b8e.k(subaccount, 1));
                    default:
                        h6e.d linkedCardInfo = (h6e.d) obj2;
                        Intrinsics.checkNotNullParameter(linkedCardInfo, "linkedCardInfo");
                        h6e.c cVar = linkedCardInfo.f149629a;
                        String str2 = (cVar == null || (f0Var = cVar.f149628a) == null) ? null : f0Var.f150110a;
                        h6e.b bVar = linkedCardInfo.f149630b;
                        Set cardIds = z0.i(str2, bVar != null ? bVar.f149622a : null);
                        if (cardIds.isEmpty()) {
                            return zi0.c.i(new Pair(null, null));
                        }
                        yua.q qVar = (yua.q) this.f123652b.f123659q;
                        qVar.getClass();
                        Intrinsics.checkNotNullParameter(cardIds, "cardIds");
                        return nim.a.v(rd0.e.b(pd.b.r(nim.a.w(xua.a.b(qVar, null, 2), new ysk.a(qVar, 12)), new yrb.i(qVar, cardIds, 17))), new e87.e(linkedCardInfo, 2));
                }
            }
        }), boh.f.e(zVar.q(str), new Function1(this) { // from class: e8e.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f123652b;

            {
                this.f123652b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                f0 f0Var;
                switch (i2) {
                    case 0:
                        Subaccount subaccount = (Subaccount) obj2;
                        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
                        s6e.z zVar2 = (s6e.z) this.f123652b.f123658p;
                        zVar2.getClass();
                        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
                        return nim.a.v(nim.a.v(vkm.q.Q(new v1(new qg7.p(zVar2, subaccount.getF88959a().f234881a, null)), new r3k.c(null, zVar2, 25)), new s31.a(zVar2, subaccount, 9)), new b8e.k(subaccount, 1));
                    default:
                        h6e.d linkedCardInfo = (h6e.d) obj2;
                        Intrinsics.checkNotNullParameter(linkedCardInfo, "linkedCardInfo");
                        h6e.c cVar = linkedCardInfo.f149629a;
                        String str2 = (cVar == null || (f0Var = cVar.f149628a) == null) ? null : f0Var.f150110a;
                        h6e.b bVar = linkedCardInfo.f149630b;
                        Set cardIds = z0.i(str2, bVar != null ? bVar.f149622a : null);
                        if (cardIds.isEmpty()) {
                            return zi0.c.i(new Pair(null, null));
                        }
                        yua.q qVar = (yua.q) this.f123652b.f123659q;
                        qVar.getClass();
                        Intrinsics.checkNotNullParameter(cardIds, "cardIds");
                        return nim.a.v(rd0.e.b(pd.b.r(nim.a.w(xua.a.b(qVar, null, 2), new ysk.a(qVar, 12)), new yrb.i(qVar, cardIds, 17))), new e87.e(linkedCardInfo, 2));
                }
            }
        })), new e4k.f(28)), null, null, new u(this, null, 1), 3);
        yji.l.a1(this, rd0.e.b(((njf.j) this.f123665y).f()), null, null, new u(this, null, 2), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y2(java.lang.Object r40, java.lang.String r41) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e8e.x.y2(java.lang.Object, java.lang.String):void");
    }

    public final void z2() {
        String str = ((m) t2()).f123642a;
        C1(new BridgeDestination(new FeatureCommand(new WhoToTransferFeatureConfig.Transfer(new WhoToTransferScreenMode.PredefinedFilter(zhm.v.k(WhoToTransferFilter.Revolut.f80005a, WhoToTransferFilter.Accounts.f79984a), true), null, null, new FlowExtras(str == null ? new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CreateSubaccountScreenDestination(null), false, (Integer) null, 603979776, 45)) : com.revolut.retail.core.navigation.a.c(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, ExtendedSubaccountType.Personal.INSTANCE), ProductId.SUBACCOUNT), null), null, null, 12), u0.f(new ManageBillAccountDestination(str)))), null, LDSFile.EF_DG14_TAG))));
    }
}
