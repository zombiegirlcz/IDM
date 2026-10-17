package oce;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import njf.j;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ypg.p;
import yua.q;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xua.a f224229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f224230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a9e.h f224231c;
    public final nhf.a d;

    public h(xua.a recurringPaymentInteractor, ppg.b vaultsInteractor, a9e.h subscriptionsItemMapper, nhf.a unitedWalletInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f224229a = recurringPaymentInteractor;
        this.f224230b = vaultsInteractor;
        this.f224231c = subscriptionsItemMapper;
        this.d = unitedWalletInteractor;
    }

    public static List a(Object obj2) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CONFIRM_UNBLOCK_MERCHANT_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.merchants_block_unblock_merchant_confirm, null, null, 14), false, null, null, obj2, null, 744);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CANCEL_UNBLOCK_MERCHANT_LIST_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.merchants_block_unblock_merchant_decline, null, null, 14), false, null, null, obj2, null, 744);
        yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
        return v.k(model, model2);
    }

    public static r c(h hVar, String merchantId, String str, Object obj2, String str2, int i) {
        if ((i & 4) != 0) {
            obj2 = null;
        }
        String str3 = (i & 8) != 0 ? null : "SUBSCRIPTION_ACTIONS_DELEGATES_KEY";
        if ((i & 16) != 0) {
            str2 = null;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        r rVarDistinctUntilChanged = w.m(((q) hVar.f224229a).n(new qua.a(merchantId)), ((p) hVar.f224230b).e(pcd.d.f234853b), ((j) hVar.d).f()).map(new oc8.e(2, new kwg.e(str, hVar, str2, str3, obj2))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final List b(List list, List list2, Object obj2, k71.q qVar) {
        List listP0 = d0.P0(list, new g());
        ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList.add(a9e.h.d(this.f224231c, new RecurringPaymentWithExtra.General((qua.p) it8.next()), list2, qVar, true, false, null, false, null, null, 496));
        }
        yp0.b.k(arrayList, 0, R$attr.uikit_dp24, 0, 0, 29);
        return i2b.a.o(arrayList, a(obj2));
    }
}
