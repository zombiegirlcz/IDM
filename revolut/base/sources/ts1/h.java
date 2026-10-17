package ts1;

import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.feature.apm.bizum.impl.ui.area.homescreen.BizumAreaHomescreenScreen;
import com.revolut.feature.credit.card.impl.ui.limit_hub.manage.CreditCardLimitHubManageScreen;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.CreditCardStatementTransactionsScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.timeframe.TimeframePickerScreen;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import ip0.pb0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import skm.e0;
import skm.p0;
import ttj.b1;
import ttj.e1;
import ttj.h1;
import ttj.k1;
import ttj.o1;
import ttj.q0;
import ttj.u1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273929a;

    public /* synthetic */ h(int i) {
        this.f273929a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f273929a) {
            case 0:
                KProperty[] kPropertyArr = BizumAreaHomescreenScreen.m0;
                return new LargeActionButtonDelegate();
            case 1:
                KProperty[] kPropertyArr2 = BizumAreaHomescreenScreen.m0;
                return new FullScreenStateDelegate();
            case 2:
                rfm.u uVarG = efm.k.g(FreelancerBizFeatureConfig.AccountClosure.f73175a);
                Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                return uVarG;
            case 3:
                return jbb.a.a(ibb.c.f160140a, null, null, null, 14);
            case 4:
                KProperty[] kPropertyArr3 = CreditCardLimitHubManageScreen.T;
                return new RowDelegate(null, null, 7);
            case 5:
                KProperty[] kPropertyArr4 = CreditCardLimitHubManageScreen.T;
                return new CellDetailsLoadingDelegate();
            case 6:
                KProperty[] kPropertyArr5 = CreditCardLimitHubManageScreen.T;
                return new FullScreenStateDelegate();
            case 7:
                return new qlm.e(ttj.a.f274319a);
            case 8:
                return new qlm.e(ttj.v.f274417a);
            case 9:
                return new qlm.e(ttj.p.f274391a);
            case 10:
                return new qlm.e(q0.f274394a);
            case 11:
                return new qlm.e(b1.f274323a);
            case 12:
                return new qlm.e(ttj.p.f274391a);
            case 13:
                return new qlm.e(e1.f274337a);
            case 14:
                return new qlm.e(h1.f274350a);
            case 15:
                return new qlm.e(k1.f274363a);
            case 16:
                return new qlm.e(u1.f274416a);
            case 17:
                return new qlm.e(o1.f274390a);
            case 18:
                return new qlm.e(ttj.p.f274391a);
            case 19:
                ArrayList arrayList = new ArrayList(5);
                for (int i = 0; i < 5; i++) {
                    arrayList.add(t61.a.o("list-id-loading-item-", i, pb0.Companion, false, 6));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 20:
                return new PromptContentDelegate();
            case 21:
                KProperty[] kPropertyArr6 = CreditCardStatementTransactionsScreen.U;
                return new InputDisclosureDelegate();
            case 22:
                KProperty[] kPropertyArr7 = CreditCardStatementTransactionsScreen.U;
                return new RowDelegate(null, null, 7);
            case 23:
                KProperty[] kPropertyArr8 = CreditCardStatementTransactionsScreen.U;
                return new FullScreenStateDelegate();
            case 24:
                return Unit.f186387a;
            case 25:
                return Unit.f186387a;
            case 26:
                return Long.valueOf(System.currentTimeMillis());
            case 27:
                return Unit.f186387a;
            case 28:
                WallpaperAssetSwitcher.Companion aVar = WallpaperAssetSwitcher.INSTANCE;
                return e0.c(kotlin.coroutines.e.d(e0.e(), p0.f264002b));
            default:
                KProperty[] kPropertyArr9 = TimeframePickerScreen.R;
                return new SingleChoiceDelegate();
        }
    }
}
