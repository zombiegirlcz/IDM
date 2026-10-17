package pni;

import android.graphics.drawable.ShapeDrawable;
import ch.qos.logback.core.CoreConstants;
import com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.BiometricVerificationManualDocumentSelectionScreen;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.barchart.BarChartView;
import com.revolut.core.ui_kit.internal.views.stackedchart.StackedChartView;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.edit_label.EditLabelScreen;
import com.revolut.feature.banners.impl.data.database.entity.BannerActionEmbeddedEntity;
import com.revolut.feature.banners.impl.data.database.entity.BannerActionEmbeddedEntity$ContentHtml$$serializer;
import com.revolut.feature.banners.impl.data.database.entity.BannerActionEmbeddedEntity$Uri$$serializer;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsController;
import com.revolut.feature.credit.card.impl.ui.additional_cards.management.AdditionalCardsManagementScreen;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_increase_preference.CreditCardLimitIncreasePreferenceController;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreen;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreen;
import com.revolut.feature.selfserve.sow.impl.ui.amount.SowAmountFragment;
import com.revolut.feature.tax_residency.impl.screens.rationales.RationalesScreen;
import com.revolut.feature.transfer_reasons.impl.ui.transactions.TransferReasonsTransactionsScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.investment_goals_screen.InvestmentGoalsScreen;
import java.lang.annotation.Annotation;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import q1l.a;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237809a;

    public /* synthetic */ a(int i) {
        this.f237809a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f237809a) {
            case 0:
                return new PromptMarketingContentDelegate();
            case 1:
                KProperty[] kPropertyArr = EditLabelScreen.Q;
                return new InputTextDelegate(null);
            case 2:
                KProperty[] kPropertyArr2 = RationalesScreen.c0;
                return new FullScreenStateDelegate();
            case 3:
                KProperty[] kPropertyArr3 = AdditionalCardsManagementScreen.U;
                return new RowDelegate(null, null, 7);
            case 4:
                BannerActionEmbeddedEntity.Companion companion = BannerActionEmbeddedEntity.Companion;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.banners.impl.data.database.entity.BannerActionEmbeddedEntity", p0Var.b(BannerActionEmbeddedEntity.class), new KClass[]{p0Var.b(BannerActionEmbeddedEntity.ContentHtml.class), p0Var.b(BannerActionEmbeddedEntity.Uri.class)}, new KSerializer[]{BannerActionEmbeddedEntity$ContentHtml$$serializer.INSTANCE, BannerActionEmbeddedEntity$Uri$$serializer.INSTANCE}, new Annotation[0]);
            case 5:
                KProperty[] kPropertyArr4 = BankListScreen.R;
                return new FullScreenStateDelegate();
            case 6:
                KProperty[] kPropertyArr5 = BankListScreen.R;
                return new RowDelegate(null, null, 7);
            case 7:
                return Unit.f186387a;
            case 8:
                BarChartView.Companion aVar = BarChartView.INSTANCE;
                return "Not implemented";
            case 9:
                KProperty[] kPropertyArr6 = GroupChatSettingsScreen.f79374a0;
                return new RowDelegate(null, null, 7);
            case 10:
                KProperty[] kPropertyArr7 = BiometricVerificationManualDocumentSelectionScreen.S;
                return new InputTextDelegate(null);
            case 11:
                KProperty[] kPropertyArr8 = CreditCardLimitIncreasePreferenceController.S;
                return new RowDelegate(null, null, 7);
            case 12:
                KProperty[] kPropertyArr9 = TransferReasonsTransactionsScreen.S;
                return new RowDelegate(null, null, 7);
            case 13:
                int i = StackedChartView.o;
                return new ShapeDrawable();
            case 14:
                return new PromptContentDelegate();
            case 15:
                KProperty[] kPropertyArr10 = IntroductionScreen.T;
                return new ProductSelectionDelegate();
            case 16:
                KProperty[] kPropertyArr11 = WealthProtectionLimitChangeScreen.T;
                return new LargeActionButtonDelegate();
            case 17:
                return new DateTimeFormatterBuilder().appendValue(ChronoField.DAY_OF_MONTH, 2).appendLiteral(CoreConstants.DASH_CHAR).appendValue(ChronoField.MONTH_OF_YEAR, 2).parseDefaulting(ChronoField.YEAR, 0L).toFormatter();
            case 18:
                return j1.a("com.revolut.feature.learn.shared.impl.data.network.dto.common.CourseMode", pz8.b.values(), new String[]{"DEFAULT", "DISCOVER"}, new Annotation[][]{null, null});
            case 19:
                return j1.a("com.revolut.feature.learn.shared.impl.data.network.dto.common.ProductDomainDto", pz8.g.values(), new String[]{"CRYPTO", "TRADING", "FRAUD", "APP_TIPS", "PRO", "YOUTH_TRADING"}, new Annotation[][]{null, null, null, null, null, null});
            case 20:
                int i2 = SowAmountFragment.f85960h0;
                return new AmountEditDelegate(null);
            case 21:
                KProperty[] kPropertyArr12 = InvestmentGoalsScreen.f104185a0;
                return m72.b.v(null, null, 7);
            case 22:
                KProperty[] kPropertyArr13 = RevolutCardSettingsController.X;
                return new RowDelegate(null, null, 7);
            case 23:
                KProperty[] kPropertyArr14 = RevolutCardSettingsController.X;
                return new LargeActionButtonDelegate();
            case 24:
                KProperty[] kPropertyArr15 = RevolutCardSettingsController.X;
                return new TextDelegate();
            case 25:
                KProperty[] kPropertyArr16 = RevolutCardSettingsController.X;
                return new TextDelegate();
            case 26:
                KProperty[] kPropertyArr17 = RevolutCardSettingsController.X;
                return new RowDelegate(null, null, 7);
            case 27:
                KProperty[] kPropertyArr18 = RevolutCardSettingsController.X;
                return new PermissionDelegate();
            case 28:
                return new PromptMarketingContentDelegate();
            default:
                a.b bVar = q1l.a.Companion;
                return new qlm.e(q1l.f.f241473a);
        }
    }
}
