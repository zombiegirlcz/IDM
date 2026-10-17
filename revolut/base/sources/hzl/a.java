package hzl;

import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.ui.impl.ui.registration.terms.uri.ApmRegistrationTermsScreen;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewScreen;
import com.revolut.feature.credit.impl.ui.security_deposit.SecurityDepositInfoScreen;
import com.revolut.feature.insurance_pet.impl.ui.profile.dochistory.PetDocumentHistoryActivity;
import com.revolut.feature.pincode.common.R$string;
import com.revolut.feature.stock_lending.impl.ui.screens.details.StockLendingDetailsScreen;
import com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.MarketOrderActivityV2;
import i29.b;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import qlm.d1;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157251a;

    public /* synthetic */ a(int i) {
        this.f157251a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj2 = null;
        switch (this.f157251a) {
            case 0:
                Lazy lazy = b.f157252a;
                return new yqi.f[]{new i0m.d(obj2), new i0m.c(obj2), new i0m.a(new TextLocalisedClause(R$string.revolut_passcode_creation_alert_repeating, null, null, 14), new TextLocalisedClause(R$string.revolut_passcode_creation_alert_consecutive, null, null, 14)), new i0m.b()};
            case 1:
                return BackportedFixQuirk.backportedFixManager_delegate$lambda$0();
            case 2:
                int i = PetDocumentHistoryActivity.f76381w0;
                return new RowDelegate(null, null, 7);
            case 3:
                return new qlm.e(j19.k.Companion.serializer());
            case 4:
                return j1.b("com.revolut.feature.lifestyle.content_gateway.api.model.refresh.RefreshStrategy.Type", i19.f.values());
            case 5:
                KProperty[] kPropertyArr = StockLendingDetailsScreen.f88403h0;
                return new TextDelegate();
            case 6:
                KProperty[] kPropertyArr2 = StockLendingDetailsScreen.f88403h0;
                return new RowDelegate(null, null, 7);
            case 7:
                KProperty[] kPropertyArr3 = StockLendingDetailsScreen.f88403h0;
                return new CellDetailsChevronDelegate();
            case 8:
                KProperty[] kPropertyArr4 = StockLendingDetailsScreen.f88403h0;
                return new FullScreenStateDelegate();
            case 9:
                KProperty[] kPropertyArr5 = StockLendingDetailsScreen.f88403h0;
                return new RowLoadingDelegate();
            case 10:
                KProperty[] kPropertyArr6 = StockLendingDetailsScreen.f88403h0;
                return new ListSubheaderDelegate();
            case 11:
                KProperty[] kPropertyArr7 = StockLendingDetailsScreen.f88403h0;
                return new CounterTextDelegate();
            case 12:
                b.C0906b.C0907b c0907b = b.C0906b.Companion;
                return new qlm.e(w19.c.f293802a);
            case 13:
                return new d1("com.revolut.feature.lifestyle.core.impl.data.model.dto.onboarding.LifestyleOnboardingInfoStateDto.NoInfo", b.c.INSTANCE, new Annotation[0]);
            case 14:
                KProperty[] kPropertyArr8 = MarketOrderActivityV2.I0;
                return "ORDER_EXCHANGE_FLOW";
            case 15:
                KProperty[] kPropertyArr9 = MarketOrderActivityV2.I0;
                return new LargeActionButtonDelegate();
            case 16:
                KProperty[] kPropertyArr10 = MarketOrderActivityV2.I0;
                return new CellDetailsActionDelegate();
            case 17:
                KProperty[] kPropertyArr11 = MarketOrderActivityV2.I0;
                return new TextDelegate();
            case 18:
                KProperty[] kPropertyArr12 = MarketOrderActivityV2.I0;
                return new CellDetailsSwitcherDelegate();
            case 19:
                KProperty[] kPropertyArr13 = SecurityDepositInfoScreen.V;
                return new RowDelegate(null, null, 7);
            case 20:
                KProperty[] kPropertyArr14 = SecurityDepositInfoScreen.V;
                return new CellDetailsDelegate();
            case 21:
                KProperty[] kPropertyArr15 = SecurityDepositInfoScreen.V;
                return new CellDetailsChevronDelegate();
            case 22:
                KProperty[] kPropertyArr16 = ApmRegistrationTermsScreen.T;
                return new WebViewDelegate();
            case 23:
                return new Regex("\\[.*?]|[{}]");
            case 24:
                KProperty[] kPropertyArr17 = TransferReviewScreen.W;
                return new CellDetailsActionDelegate();
            case 25:
                KProperty[] kPropertyArr18 = TransferReviewScreen.W;
                return new CellDetailsSwitcherDelegate();
            case 26:
                KProperty[] kPropertyArr19 = TransferReviewScreen.W;
                return new RowDelegate(null, null, 7);
            case 27:
                KProperty[] kPropertyArr20 = TransferReviewScreen.W;
                return new TextDelegate();
            case 28:
                KProperty[] kPropertyArr21 = TransferReviewScreen.W;
                return new CellDetailsDelegate();
            default:
                return new SimpleDateFormat("yyyy-mm-dd");
        }
    }
}
