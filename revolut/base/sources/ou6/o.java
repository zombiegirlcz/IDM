package ou6;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.pe;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.b;
import com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue;
import com.youTransactor.uCube.rpc.Constants;
import ip0.gb0;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.wj;
import ip0.za0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.ranges.IntRange;
import m1c.y;
import m1c.z;
import nel.s0;
import nel.u0;
import nel.w0;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229838a;

    public /* synthetic */ o(int i) {
        this.f229838a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f229838a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter = update.d;
                return h.a(update, null, null, acquiringOrderFilter != null ? acquiringOrderFilter.j9(o0.f186429a.b(AcquiringOrderFilter.Status.class)) : null, null, false, LDSFile.EF_SOD_TAG);
            case 1:
                h update2 = (h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter2 = update2.d;
                return h.a(update2, null, null, acquiringOrderFilter2 != null ? acquiringOrderFilter2.j9(o0.f186429a.b(AcquiringOrderFilter.Channel.class)) : null, null, false, LDSFile.EF_SOD_TAG);
            case 2:
                h update3 = (h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return h.a(update3, null, null, null, null, false, 31);
            case 3:
                h update4 = (h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return h.a(update4, null, null, null, null, true, 63);
            case 4:
                TargetPriceInputValue it8 = (TargetPriceInputValue) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f106872a;
            case 5:
                oul.k update5 = (oul.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return oul.k.a(update5, null, null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 6:
                oul.k it9 = (oul.k) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f229907c;
            case 7:
                return ((oul.k) obj2).f229909h;
            case 8:
                oul.k kVar = (oul.k) obj2;
                TargetPriceInputValue targetPriceInputValue = kVar.f229907c;
                return oul.k.a(kVar, TargetPriceInputValue.a(targetPriceInputValue, targetPriceInputValue.f106872a, null, !pd.b.j(targetPriceInputValue.f106873b), kVar.f229907c.d, 2), null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 9:
                return ((oul.k) obj2).f229907c;
            case 10:
                ov7.j update6 = (ov7.j) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return ov7.j.a(update6, null, !update6.f229974b, 1);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 12:
                z accountState = (z) obj2;
                Intrinsics.checkNotNullParameter(accountState, "accountState");
                if (accountState instanceof y) {
                    return new ovb.g(((y) accountState).f201475a);
                }
                if (accountState instanceof z.a) {
                    return b.a.f83602a;
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = zhm.v.k(new gb0("PRODUCT_INFO_ITEM_ID0"), new s7("PRODUCT_INFO_ITEM_ID1", 0, 0, 0, 0, false, null, 126), new s7("PRODUCT_INFO_ITEM_ID2", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                pb0 pb0VarB = nb0.b(pb0.Companion, "POINTS_PRICE_ITEM_ID", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                return zhm.w.u(zhm.v.k(listK, zhm.u.c(pb0VarB)));
            case 14:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke();
            case 15:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new owf.i(zhm.u.c(new wj("LOADING_ITEM_ID")), null);
            case 17:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 18:
                w0 onboardingDetails = (w0) obj2;
                Intrinsics.checkNotNullParameter(onboardingDetails, "onboardingDetails");
                return Boolean.valueOf((onboardingDetails instanceof s0) || (onboardingDetails instanceof u0));
            case 19:
                Intrinsics.i(((PopupMenuItem) obj2).getF51698j(), "null cannot be cast to non-null type com.revolut.core.ui_kit.models.ActionsToolbarViewModel.ActionItem");
                throw new ClassCastException();
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new cii.b(null, zhm.u.c(new s7("LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126)), new lw0.h(lw0.i.TITLE_SUBTITLE));
            case 21:
                ox5.l update7 = (ox5.l) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return ox5.l.a(update7, null, null, null, null, new Data(null, null, false, 2, null), null, null, null, 0, null, null, false, null, null, false, 32751);
            case 22:
                List recentlyViewed = (List) obj2;
                Intrinsics.checkNotNullParameter(recentlyViewed, "recentlyViewed");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : recentlyViewed) {
                    if (cp5.d.z(((uv5.i) obj3).f283321a)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it10 = arrayList.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(((uv5.i) it10.next()).f283321a);
                }
                return arrayList2;
            case 23:
                ox5.l update8 = (ox5.l) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return ox5.l.a(update8, null, null, null, null, null, null, null, null, 0, null, null, true, null, null, false, 30719);
            case 24:
                ox5.l domainState = (ox5.l) obj2;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                return new iw5.i(domainState.f230585a.f263435a, domainState.f230591l);
            case 25:
                ox5.l it11 = (ox5.l) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Integer.valueOf(it11.i);
            case 26:
                ox5.l update9 = (ox5.l) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return ox5.l.a(update9, null, null, null, null, null, null, null, null, 0, null, null, false, "", null, false, 26623);
            case 27:
                w0h.e data = (w0h.e) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return data.f293760a;
            case 28:
                String currencyCode = (String) obj2;
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                return new zv5.a(currencyCode);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = zhm.u.c(new ListSubheaderDelegate.Model("RECENTLY_VIEWED_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_discovery_recently_viewed, null, null, 14), (ResourceImage) null, false, false, (Clause) null, false, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp16, 0, 0, 0, (String) null, 253754));
                IntRange intRangeO = kotlin.ranges.f.o(0, 4);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it12 = intRangeO.iterator();
                while (it12.f289625c) {
                    arrayList3.add(new pe(a0.d.n("RECENTLY_VIEWED_REWARDS_LOADING_ID", it12.nextInt())));
                }
                za0 za0Var = new za0("RECENTLY_VIEWED_REWARDS_LOADING_ID", arrayList3);
                yp0.b.l(za0Var, 0, 0, 0, 0, null, false, 63);
                return i2b.a.o(listC, zhm.u.c(za0Var));
        }
    }
}
