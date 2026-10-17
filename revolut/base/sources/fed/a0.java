package fed;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherExtraSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.check_topup.impl.ui_kompot.screen.review.CheckTopUpReviewScreen;
import com.revolut.feature.credit.autopay.ui.screen.account_selection.screen.AccountSelectionScreen;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreen;
import fed.b0;
import fed.c0;
import ff6.a;
import ff6.b;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.j1;
import zhm.q0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134495a;

    public /* synthetic */ a0(int i) {
        this.f134495a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f134495a) {
            case 0:
                b0.b bVar = b0.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 1:
                c0.b bVar2 = c0.Companion;
                return j1.a("com.revolut.shared.feature.wealth.models.corporate_events.EventType", iel.j.values(), new String[]{"MARKET_HOLIDAY", "CASH_DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "LISTING_STATUS_CHANGE", "SYMBOL_CHANGE", "EARNINGS_CALL", "EX_DIVIDEND", "MERGER", "DEMERGER", "BANKRUPTCY", "BOND_COUPON", "INTEREST_PAYMENT", "EARLY_REDEMPTION", "MATURITY_REDEMPTION", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 2:
                a.b bVar3 = ff6.a.Companion;
                return new qlm.e(b.a.f134762a);
            case 3:
                a.b bVar4 = ff6.a.Companion;
                return new qlm.e(b.a.f134762a);
            case 4:
                KProperty[] kPropertyArr = CheckTopUpReviewScreen.S;
                return new ListSubheaderDelegate();
            case 5:
                KProperty[] kPropertyArr2 = CheckTopUpReviewScreen.S;
                return new CellDetailsDelegate();
            case 6:
                return ghb.d.Companion.serializer();
            case 7:
                return ghb.b.Companion.serializer();
            case 8:
                EnumEntries enumEntriesA = iel.j.a();
                int iB = q0.b(zhm.w.t(enumEntriesA, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (Object obj2 : enumEntriesA) {
                    linkedHashMap.put(((iel.j) obj2).getId(), obj2);
                }
                return linkedHashMap;
            case 9:
                EnumEntries enumEntriesA2 = iel.l.a();
                int iB2 = q0.b(zhm.w.t(enumEntriesA2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Object obj3 : enumEntriesA2) {
                    linkedHashMap2.put(((iel.l) obj3).getId(), obj3);
                }
                return linkedHashMap2;
            case 10:
                return fib.j.Companion.serializer();
            case 11:
                return j1.b("com.revolut.feature.retail.salary_account.impl.work_email.domain.model.WorkEmailVerification.Status", fib.j.values());
            case 12:
                KProperty[] kPropertyArr3 = EsimGetPlanScreen.Z;
                return new RowDelegate(null, null, 7);
            case 13:
                KProperty[] kPropertyArr4 = EsimGetPlanScreen.Z;
                return new CellDetailsDelegate();
            case 14:
                KProperty[] kPropertyArr5 = EsimGetPlanScreen.Z;
                return new ListSubheaderDelegate();
            case 15:
                KProperty[] kPropertyArr6 = ShopsCombinedHomeScreen.f87179h0;
                return new BigTileDelegate();
            case 16:
                KProperty[] kPropertyArr7 = ShopsCombinedHomeScreen.f87179h0;
                return new ListSubheaderDelegate();
            case 17:
                KProperty[] kPropertyArr8 = ShopsCombinedHomeScreen.f87179h0;
                return new MapPlainDelegate();
            case 18:
                KProperty[] kPropertyArr9 = ShopsCombinedHomeScreen.f87179h0;
                return new VoucherExtraSmallTileDelegate(0);
            case 19:
                KProperty[] kPropertyArr10 = ShopsCombinedHomeScreen.f87179h0;
                return new RewardsGridDelegate();
            case 20:
                KProperty[] kPropertyArr11 = ShopsCombinedHomeScreen.f87179h0;
                return new VoucherSmallTileDelegate();
            case 21:
                KProperty[] kPropertyArr12 = ShopsCombinedHomeScreen.f87179h0;
                return new VoucherSmallLoadingDelegate();
            case 22:
                KProperty[] kPropertyArr13 = ShopsCombinedHomeScreen.f87179h0;
                return new TextDelegate();
            case 23:
                KProperty[] kPropertyArr14 = ShopsCombinedHomeScreen.f87179h0;
                return new LargeActionButtonDelegate();
            case 24:
                KProperty[] kPropertyArr15 = ShopsCombinedHomeScreen.f87179h0;
                return new FullScreenStateDelegate();
            case 25:
                KProperty[] kPropertyArr16 = ShopsCombinedHomeScreen.f87179h0;
                return new RowDelegate(null, null, 7);
            case 26:
                return Unit.f186387a;
            case 27:
                KProperty[] kPropertyArr17 = AccountSelectionScreen.f68581e0;
                return new ListSubheaderDelegate();
            case 28:
                KProperty[] kPropertyArr18 = AccountSelectionScreen.f68581e0;
                return new RowDelegate(null, null, 7);
            default:
                KProperty[] kPropertyArr19 = AccountSelectionScreen.f68581e0;
                return new FullScreenStateDelegate();
        }
    }
}
