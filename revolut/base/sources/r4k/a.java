package r4k;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.renewed_dialog.RenewedDialogScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday.LoanSelectNewRepaymentDayScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.disputes.PixDisputesScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.CobrandedCardsPlanHubTransactionDetailsScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.tutorial.CommodityTutorialScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreen;
import ip0.pb0;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251470a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f251470a) {
            case 0:
                KProperty[] kPropertyArr = BankTransferReviewScreen.f102115n0;
                return new TextDelegate();
            case 1:
                KProperty[] kPropertyArr2 = BankTransferReviewScreen.f102115n0;
                return new CellDetailsActionDelegate();
            case 2:
                KProperty[] kPropertyArr3 = BankTransferReviewScreen.f102115n0;
                return new CellDetailsNoteDelegate();
            case 3:
                KProperty[] kPropertyArr4 = BankTransferReviewScreen.f102115n0;
                return new CellDetailsSwitcherDelegate();
            case 4:
                KProperty[] kPropertyArr5 = BankTransferReviewScreen.f102115n0;
                return new CellDetailsStandaloneNoteDelegate();
            case 5:
                KProperty[] kPropertyArr6 = BankTransferReviewScreen.f102115n0;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr7 = BankTransferReviewScreen.f102115n0;
                return new HighlightTileDelegate();
            case 7:
                KProperty[] kPropertyArr8 = BankTransferReviewScreen.f102115n0;
                return new SuggestionsBarDelegate();
            case 8:
                KProperty[] kPropertyArr9 = BankTransferReviewScreen.f102115n0;
                return new CounterTextDelegate();
            case 9:
                KProperty[] kPropertyArr10 = BankTransferReviewScreen.f102115n0;
                return new CellDetailsDelegate();
            case 10:
                KProperty[] kPropertyArr11 = LoanSelectNewRepaymentDayScreen.f70404b0;
                return new GridSingleChoiceDelegate();
            case 11:
                int i = RenewedDialogScreen.V;
                return new RowDelegate(null, null, 7);
            case 12:
                KProperty[] kPropertyArr12 = CobrandedCardsPlanHubTransactionDetailsScreen.T;
                return new RowDelegate(null, null, 7);
            case 13:
                KProperty[] kPropertyArr13 = CobrandedCardsPlanHubTransactionDetailsScreen.T;
                return new InputDisclosureDelegate();
            case 14:
                KProperty[] kPropertyArr14 = CobrandedCardsPlanHubTransactionDetailsScreen.T;
                return new FullScreenStateDelegate();
            case 15:
                KProperty[] kPropertyArr15 = CobrandedCardsPlanHubTransactionDetailsScreen.T;
                return new HighlightTileDelegate();
            case 16:
                KProperty[] kPropertyArr16 = CommodityTutorialScreen.S;
                return new TrendViewDelegate(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS);
            case 17:
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 18:
                PixAuthorisationTransactionLimitScreen.a aVar = PixAuthorisationTransactionLimitScreen.Companion;
                return new InputTextDelegate(null);
            case 19:
                PixAuthorisationTransactionLimitScreen.a aVar2 = PixAuthorisationTransactionLimitScreen.Companion;
                return new LargeActionButtonDelegate();
            case 20:
                KProperty[] kPropertyArr17 = PixDisputesScreen.S;
                return new RowDelegate(null, null, 7);
            case 21:
                KProperty[] kPropertyArr18 = PixDisputesScreen.S;
                return new FullScreenStateDelegate();
            case 22:
                ArrayList arrayList = new ArrayList(3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList.add(new pb0(a0.d.n("TRANSFER_ACCOUNTS_LOADING_PREFIX_LIST_ID_", i2)));
                }
                return arrayList;
            case 23:
                Lazy lazy = rbi.a.f253115a;
                return zhm.v.k(tbi.a.ADMINISTRATION, tbi.a.AGRICULTURE_FORESTRY_FISHERY, tbi.a.CRAFT_N_RELATED_TRADES, tbi.a.EDUCATION, tbi.a.FOOD_PREP_N_CLEANING, tbi.a.HEALTH, tbi.a.IT_N_COMMUNICATION, tbi.a.LEGAL_SOCIAL_CULTURAL, tbi.a.MANAGEMENT, tbi.a.MINING_CONSTRUCTION_TRANSPORT, tbi.a.PLANT_N_MACHINE_OPERATIONS, tbi.a.SCIENCE_N_ENGINEERING, tbi.a.SERVICE_N_SALES, tbi.a.STUDENT, tbi.a.RETIRED, tbi.a.UNEMPLOYED, tbi.a.OTHER_SERVICES);
            case 24:
                Lazy lazy2 = rbi.a.f253115a;
                return zhm.v.k(tbi.a.ADMINISTRATION, tbi.a.AGRICULTURE_FORESTRY_FISHERY, tbi.a.CRAFT_N_RELATED_TRADES, tbi.a.EDUCATION, tbi.a.FOOD_PREP_N_CLEANING, tbi.a.HEALTH, tbi.a.IT_N_COMMUNICATION, tbi.a.LEGAL_SOCIAL_CULTURAL, tbi.a.MANAGEMENT, tbi.a.MINING_CONSTRUCTION_TRANSPORT, tbi.a.PLANT_N_MACHINE_OPERATIONS, tbi.a.SCIENCE_N_ENGINEERING, tbi.a.SERVICE_N_SALES, tbi.a.SELF_EMPLOYED_DE, tbi.a.STUDENT, tbi.a.RETIRED, tbi.a.UNEMPLOYED, tbi.a.OTHER_SERVICES);
            case 25:
                Lazy lazy3 = rbi.a.f253115a;
                return zhm.v.k(tbi.a.CORPORATE_OFFICER, tbi.a.COMPANY_EMPLOYEE, tbi.a.PUBLIC_EMPLOYEE_JP, tbi.a.SOLE_PROPRIETOR_OR_SELF_OWNED_BUSINESS, tbi.a.PART_TIMER_OR_CONTRACT_EMPLOYEE, tbi.a.HOMEMAKER_JP, tbi.a.STUDENT_JP, tbi.a.RETIRED_OR_UNEMPLOYED);
            case 26:
                Lazy lazy4 = rbi.a.f253115a;
                return zhm.v.k(tbi.a.PUBLIC_EMPLOYEE_MX, tbi.a.PRIVATE_EMPLOYEE, tbi.a.SELF_EMPLOYED_MX, tbi.a.POLITICAL_ORGANIZATIONS, tbi.a.RELIGIOUS_ORGANIZATIONS, tbi.a.STUDENT, tbi.a.RETIRED, tbi.a.UNEMPLOYED, tbi.a.HOMEMAKER_MX);
            case 27:
                Lazy lazy5 = rbi.a.f253115a;
                return zhm.v.k(tbi.a.AGRICULTURE_IT, tbi.a.CRAFTSMANSHIP_N_HANDICRAFTS, tbi.a.COMMERCE_N_TRADE, tbi.a.CREDIT_N_FINANCE, tbi.a.CONSTRUCTION, tbi.a.INDUSTRY, tbi.a.PUBLIC_ADMINISTRATION_N_DEFENSE, tbi.a.PUBLIC_EDUCATION, tbi.a.HEALTHCARE, tbi.a.SERVICES, tbi.a.TOURISM, tbi.a.ECCLESIASTICAL_ENTITIES, tbi.a.SPORTS_N_ARTS);
            case 28:
                Lazy lazy6 = rbi.a.f253115a;
                return zhm.v.k(tbi.a.AGRICULTURE_GB, tbi.a.CONSTRUCTION_TRANSPORT, tbi.a.EDUCATION_GB, tbi.a.FINANCIAL_SERVICES, tbi.a.FOOD_N_BEVERAGE, tbi.a.GOVERNMENT_N_PUBLIC_ADMINISTRATION, tbi.a.HEALTH_GB, tbi.a.IT_N_COMMUNICATION_GB, tbi.a.LEGAL_SOCIAL_CULTURAL_GB, tbi.a.MANAGEMENT_GB, tbi.a.MINING, tbi.a.REAL_ESTATE, tbi.a.RETIRED_GB, tbi.a.SCIENCE_N_TECHNOLOGY, tbi.a.SERVICE_N_SALES_GB, tbi.a.STUDENT_GB, tbi.a.UNEMPLOYED_GB, tbi.a.OTHER_SERVICES_GB);
            default:
                Lazy lazy7 = rbi.a.f253115a;
                return zhm.v.k(tbi.a.AGRICULTURE_GB, tbi.a.CONSTRUCTION_TRANSPORT, tbi.a.EDUCATION_GB, tbi.a.FINANCIAL_SERVICES, tbi.a.FOOD_N_BEVERAGE, tbi.a.GOVERNMENT_N_PUBLIC_ADMINISTRATION, tbi.a.HEALTH_GB, tbi.a.IT_N_COMMUNICATION_GB, tbi.a.LEGAL_SOCIAL_CULTURAL_GB, tbi.a.MANAGEMENT_GB, tbi.a.MINING, tbi.a.REAL_ESTATE, tbi.a.RETIRED_GB, tbi.a.SCIENCE_N_TECHNOLOGY, tbi.a.SELF_EMPLOYED_IN, tbi.a.SERVICE_N_SALES_GB, tbi.a.STUDENT_GB, tbi.a.UNEMPLOYED_GB, tbi.a.OTHER_SERVICES_GB);
        }
    }
}
