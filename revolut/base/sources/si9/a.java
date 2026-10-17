package si9;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.jc;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import ip0.n50;
import ip0.o50;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    @NotNull
    public static final C1463a Companion = new C1463a();

    /* JADX INFO: renamed from: si9.a$a, reason: collision with other inner class name */
    public static final class C1463a {
        private C1463a() {
        }
    }

    public static final class b extends a {
        @Override // si9.a
        public final List b(zh9.a configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return v.k(new RowDelegate.Model("HOW_IT_WORKS_WITH_CARD_ROW_ID-1", a.c(1), new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_first_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_first_step_description_to_link, u.c(new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_first_step_link, null, new Click(30, (Integer) null, (Object) null, "PAY_LATER_NAVIGATE_TO_PAY_LATER_CARD_ACTION", false), 10)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("HOW_IT_WORKS_WITH_CARD_ROW_ID-2", a.c(2), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_explainer_how_it_works_has_card_has_upfront_payment_second_step_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_explainer_how_it_works_has_card_has_upfront_payment_second_step_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("HOW_IT_WORKS_WITH_CARD_ROW_ID-3", a.c(3), new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_third_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_third_step_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
    }

    public static final class c extends a {
        @Override // si9.a
        public final List b(zh9.a configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return v.k(new RowDelegate.Model("HowItWorksWithoutCardWithoutUpfrontPayment-1", a.c(1), new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_first_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_first_step_description_to_link, u.c(new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_first_step_link, null, new Click(30, (Integer) null, (Object) null, "PAY_LATER_NAVIGATE_TO_PAY_LATER_CARD_ACTION", false), 10)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("HowItWorksWithoutCardWithoutUpfrontPayment-2", a.c(2), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_explainer_how_it_works_has_card_no_upfront_payment_second_step_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_explainer_how_it_works_has_card_no_upfront_payment_second_step_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("HowItWorksWithoutCardWithoutUpfrontPayment-3", a.c(3), new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_third_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_third_step_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
    }

    public static final class d extends a {
        @Override // si9.a
        public final List b(zh9.a configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return v.k(new RowDelegate.Model("HOW_IT_WORKS_WITHOUT_CARD_ROW_ID-1", a.c(1), new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_no_card_first_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_no_card_first_step_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("HOW_IT_WORKS_WITHOUT_CARD_ROW_ID-2", a.c(2), new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_no_card_second_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_no_card_second_step_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("HOW_IT_WORKS_WITHOUT_CARD_ROW_ID-3", a.c(3), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_explainer_how_it_works_no_card_has_upfront_payment_third_step_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_explainer_how_it_works_no_card_has_upfront_payment_third_step_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
    }

    public static final class e extends a {
        @Override // si9.a
        public final List b(zh9.a configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return v.k(new RowDelegate.Model("HOW_PAY_LATER_CARD_WORKS_ROW_ID-1", a.c(1), new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_first_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.pay_later_how_it_works_first_step_with_card_description_google_play, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("HOW_PAY_LATER_CARD_WORKS_ROW_ID-2", a.c(2), new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_second_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_second_step_description, u.c(new TextClause(configuration.f322247b.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("HOW_PAY_LATER_CARD_WORKS_ROW_ID-3", a.c(3), new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_third_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_pay_later_account_explainer_how_it_works_has_card_third_step_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
    }

    public static final class f extends a {
        @Override // si9.a
        public final List b(zh9.a configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return u.c(new ProgressStepsDelegate.Model("ID_HIW_TIMELINE", n50.BLUE, configuration.f322248c ? new jc(new o50(new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_how_it_works_first_step_title_has_upfront_payment, null, null, 14), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_how_it_works_first_step_description, null, null, 14), true), new o50(new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_how_it_works_upcoming_title_has_upfront_payment, null, null, 14), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_how_it_works_upcoming_description, null, null, 14), false)) : new jc(new o50(new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_how_it_works_first_step_title_no_upfront_payment, null, null, 14), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_how_it_works_first_step_description, null, null, 14), true), new o50(new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_how_it_works_upcoming_title_no_upfront_payment, null, null, 14), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_how_it_works_upcoming_description, null, null, 14), false)), null, null, R$attr.uikit_dp0, 952));
        }
    }

    public static RowDelegate.Model.MainImage.Image24 c(int i) {
        boolean z = false;
        return new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(i, Integer.valueOf(R$attr.uikit_colorGroupedBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 8), z, z, 6);
    }

    public final List a(zh9.a configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        List listB = b(configuration);
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        yp0.b.k(listB, i, i2, i2, i2, 16);
        return listB;
    }

    public abstract List b(zh9.a aVar);
}
