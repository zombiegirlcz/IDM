package qce;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xua.a f244721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f244722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a9e.h f244723c;
    public final f01.a d;
    public final t70.b e;
    public final hj8.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wsg.n f244724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nhf.a f244725h;

    public d(xua.a recurringPaymentInteractor, ppg.b vaultsInteractor, a9e.h subscriptionsItemMapper, f01.a uiKitResources, t70.b currenciesLocalization, hj8.a juniorProfileInteractor, wsg.n walletInteractor, nhf.a unitedWalletInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f244721a = recurringPaymentInteractor;
        this.f244722b = vaultsInteractor;
        this.f244723c = subscriptionsItemMapper;
        this.d = uiKitResources;
        this.e = currenciesLocalization;
        this.f = juniorProfileInteractor;
        this.f244724g = walletInteractor;
        this.f244725h = unitedWalletInteractor;
    }

    public static List a() {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CONFIRM_BLOCK_SUBSCRIPTION_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.subscription_block_confirm_block_button, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CANCEL_BLOCK_SUBSCRIPTION_LIST_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.subscription_block_confirm_cancel_button, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
        return zhm.v.k(model, model2);
    }

    public final List b(List list, List list2, k71.q qVar) {
        List listP0 = zhm.d0.P0(list, new c());
        ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList.add(a9e.h.d(this.f244723c, new RecurringPaymentWithExtra.General((qua.p) it8.next()), list2, qVar, true, false, null, false, null, null, 496));
        }
        yp0.b.k(arrayList, 0, R$attr.uikit_dp24, 0, 0, 29);
        return i2b.a.o(arrayList, a());
    }

    public final efm.r c(qua.p subscription) {
        Flow flowF;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        String strZ = hx7.l.z(subscription, this.d, this.e);
        Intrinsics.checkNotNullParameter(subscription, "<this>");
        sfm.b bVarN = ((yua.q) this.f244721a).n(new qua.b(subscription.f249314a.f160150a));
        efm.r rVarE = ((ypg.p) this.f244722b).e(pcd.d.f234853b);
        String str = subscription.L;
        if (str == null) {
            od0.i.Companion.getClass();
            flowF = new go.g(od0.i.f224256b, 2);
        } else {
            flowF = mo3.a.f(nim.a.v(boh.f.e(rd0.e.b(this.f244724g.b0(str)), new qa9.r(this, 19)), new qc7.c(6)), new qc8.a(4), new pv7.t(26), new qc8.a(5));
        }
        efm.r rVarDistinctUntilChanged = te0.w.n(bVarN, rVarE, rd0.e.c(flowF, kotlin.coroutines.g.f186406a), ((njf.j) this.f244725h).f()).map(new qc7.d(4, new a(strZ, this, 0))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }
}
