package dmj;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.recipienttypedialog.CryptoRecipientTypeDialogController;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.documents.DocumentsToAcceptScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_already_installed.EsimAlreadyInstalledBottomSheetScreen;
import dl5.a;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jmrtd.cbeff.ISO781611;
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116139a;

    public /* synthetic */ b(int i) {
        this.f116139a = i;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f116139a) {
            case 0:
                KProperty[] kPropertyArr = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                return new CellDetailsActionDelegate();
            case 1:
                KProperty[] kPropertyArr2 = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                return new CellDetailsRevPointsDelegate();
            case 2:
                ArrayList arrayList = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    arrayList.add(new pb0(a0.d.n("loading-list-id-", i)));
                }
                return arrayList;
            case 3:
                KProperty[] kPropertyArr3 = EsimAlreadyInstalledBottomSheetScreen.W;
                return new TextDelegate();
            case 4:
                return new ImageTransformations(null, new CircleTransformation(Float.valueOf(1.0f), (Integer) null, false, 10), null, null, null, null, null, ISO781611.SMT_TAG);
            case 5:
                return new qlm.e(v1.f247718a);
            case 6:
                return new qlm.e(v1.f247718a);
            case 7:
                return new qlm.e(a.C0684a.f115703a);
            case 8:
                return new qlm.e(a.C0684a.f115703a);
            case 9:
                return new qlm.e(a.C0684a.f115703a);
            case 10:
                return new qlm.e(a.C0684a.f115703a);
            case 11:
                int i2 = CryptoRecipientTypeDialogController.V;
                return new SingleChoiceDelegate();
            case 12:
                return new TextLocalisedClause(R$string.analytics_income_sorter_disclaimers_eea_tcs, null, new Click(20, (Integer) null, (Object) new dqd.n("https://www.revolut.com/en-IE/legal/investment-services-terms/?geo-redirect=true"), "EEA_TC", false), 10);
            case 13:
                return new TextLocalisedClause(R$string.analytics_income_sorter_disclaimers_eea_capital_at_risk, null, new Click(20, (Integer) null, (Object) new dqd.n("https://www.revolut.com/en-IE/legal/services-and-related-risks-description/?geo-redirect=true"), "EEA_CAPITAL_AT_RISK", false), 10);
            case 14:
                int i3 = R$string.analytics_income_sorter_disclaimers_eea_trading_disclosures;
                Intrinsics.checkNotNullParameter("revolut://app/trading/disclosure", "deeplink");
                return new TextLocalisedClause(i3, null, new Click(20, (Integer) null, (Object) new dqd.m(), "EEA_DISCLOSURES", false), 10);
            case 15:
                return new TextLocalisedClause(R$string.analytics_income_sorter_disclaimers_eea_robo_tcs, null, new Click(20, (Integer) null, (Object) new dqd.n("https://www.revolut.com/en-IE/legal/RoboAdvisorTermsandConditions/?geo-redirect=true"), "EEA_ROBO", false), 10);
            case 16:
                Object obj2 = dqd.s.f116956a;
                List listK = zhm.v.k(20, 30, 50);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(listK, 10));
                Iterator it8 = listK.iterator();
                while (it8.hasNext()) {
                    int iIntValue = ((Number) it8.next()).intValue();
                    arrayList2.add(new d01.b(a0.d.n("suggestion_", iIntValue), new TextClause(a0.d.h(iIntValue, "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new aqd.b0(iIntValue), false, null, null, 56));
                }
                return arrayList2;
            case 17:
                return zhm.d0.F0(new d01.b("suggestion_custom", new TextLocalisedClause(R$string.analytics_income_sorter_details_keyboard_custom, null, null, 14), aqd.z.f8417a, false, null, null, 56), (List) dqd.s.f116956a.getValue());
            case 18:
                return zhm.d0.F0(new d01.b("suggestion_done", new TextLocalisedClause(R$string.analytics_income_sorter_details_keyboard_done, null, null, 14), aqd.a0.f8324a, false, null, null, 56), (List) dqd.s.f116956a.getValue());
            case 19:
                KProperty[] kPropertyArr4 = DocumentsToAcceptScreen.j0;
                return new TwinHorizontalButtonDelegate();
            case 20:
                KProperty[] kPropertyArr5 = BlockedMerchantDetailsScreen.f0;
                return new TwinHorizontalButtonDelegate();
            case 21:
                KProperty[] kPropertyArr6 = BlockedMerchantDetailsScreen.f0;
                return new LargeActionButtonDelegate();
            case 22:
                KProperty[] kPropertyArr7 = CreditCardInstalmentHubScreen.f69386a0;
                return new CellDetailsDelegate();
            case 23:
                KProperty[] kPropertyArr8 = CreditCardInstalmentHubScreen.f69386a0;
                return new FullScreenStateDelegate();
            case 24:
                KProperty[] kPropertyArr9 = CreditCardInstalmentHubScreen.f69386a0;
                return new PlainTextWarningDelegate();
            case 25:
                KProperty[] kPropertyArr10 = CreditCardInstalmentHubScreen.f69386a0;
                return new VoucherSmallTileDelegate();
            case 26:
                KProperty[] kPropertyArr11 = CreditCardInstalmentHubScreen.f69386a0;
                return new ListSubheaderDelegate();
            case 27:
                KProperty[] kPropertyArr12 = CreditCardInstalmentHubScreen.f69386a0;
                return new ListCellDelegate();
            case 28:
                KProperty[] kPropertyArr13 = CreditCardInstalmentHubScreen.f69386a0;
                return new LargeActionButtonDelegate();
            default:
                KProperty[] kPropertyArr14 = CreditCardInstalmentHubScreen.f69386a0;
                return new RowDelegate(null, null, 7);
        }
    }
}
