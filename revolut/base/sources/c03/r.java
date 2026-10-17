package c03;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.BulletImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements q {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final p a(wy2.d reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        int i = s.f20141a[reason.ordinal()];
        if (i == 1) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_replacement_options_never_received, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_replacement_expectation_header_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.card_replacement_expectation_actions_terminate_and_order, null, null, 14);
            String strV = a0.d.v(new Object[]{1}, 1, "STEP_LIST_ID%s", "format(...)");
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.card_replacement_expectations_titles_will_be_terminated, null, null, 14);
            BulletImage bulletImageB = com.revolut.core.ui_kit_core.displayers.image.models.a.b(1, null, null, null, 30);
            ff ffVar = ff.DP_24;
            RowDelegate.Model model = new RowDelegate.Model(strV, bulletImageB, ffVar, null, textLocalisedClause4, null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741800);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            RowDelegate.Model model2 = new RowDelegate.Model(a0.d.v(new Object[]{2}, 1, "STEP_LIST_ID%s", "format(...)"), com.revolut.core.ui_kit_core.displayers.image.models.a.b(2, null, null, null, 30), ffVar, null, new TextLocalisedClause(R$string.card_replacement_expectations_titles_order_replacement, null, null, 14), new TextLocalisedClause(R$string.card_replacement_expectations_subtitles_first_replacement_free, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741672);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            RowDelegate.Model model3 = new RowDelegate.Model(a0.d.v(new Object[]{3}, 1, "STEP_LIST_ID%s", "format(...)"), com.revolut.core.ui_kit_core.displayers.image.models.a.b(3, null, null, null, 30), ffVar, null, new TextLocalisedClause(R$string.card_replacement_expectations_titles_start_using_with, zhm.u.c(new TextLocalisedClause(R$string.cards_home_item_google_pay_title, null, null, 14)), null, 12), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741800);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            return new p(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, zhm.v.k(model, model2, model3));
        }
        if (i == 2) {
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.card_replacement_options_lost, null, null, 14);
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.card_replacement_expectation_header_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.card_replacement_expectation_actions_terminate_and_order, null, null, 14);
            String strV2 = a0.d.v(new Object[]{1}, 1, "STEP_LIST_ID%s", "format(...)");
            TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.card_replacement_expectations_titles_will_be_terminated, null, null, 14);
            TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(R$string.card_replacement_expectations_subtitles_keep_safe, null, null, 14);
            BulletImage bulletImageB2 = com.revolut.core.ui_kit_core.displayers.image.models.a.b(1, null, null, null, 30);
            ff ffVar2 = ff.DP_24;
            RowDelegate.Model model4 = new RowDelegate.Model(strV2, bulletImageB2, ffVar2, null, textLocalisedClause8, textLocalisedClause9, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741672);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            RowDelegate.Model model5 = new RowDelegate.Model(a0.d.v(new Object[]{2}, 1, "STEP_LIST_ID%s", "format(...)"), com.revolut.core.ui_kit_core.displayers.image.models.a.b(2, null, null, null, 30), ffVar2, null, new TextLocalisedClause(R$string.card_replacement_expectations_titles_order_replacement, null, null, 14), new TextLocalisedClause(R$string.card_replacement_expectations_subtitles_may_charge_for_replacement, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741672);
            yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
            RowDelegate.Model model6 = new RowDelegate.Model(a0.d.v(new Object[]{3}, 1, "STEP_LIST_ID%s", "format(...)"), com.revolut.core.ui_kit_core.displayers.image.models.a.b(3, null, null, null, 30), ffVar2, null, new TextLocalisedClause(R$string.card_replacement_expectations_titles_start_using_with, zhm.u.c(new TextLocalisedClause(R$string.cards_home_item_google_pay_title, null, null, 14)), null, 12), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741800);
            yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
            return new p(textLocalisedClause5, textLocalisedClause6, textLocalisedClause7, zhm.v.k(model4, model5, model6));
        }
        if (i == 3) {
            TextLocalisedClause textLocalisedClause10 = new TextLocalisedClause(R$string.card_replacement_options_compromised, null, null, 14);
            TextLocalisedClause textLocalisedClause11 = new TextLocalisedClause(R$string.card_replacement_expectation_header_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
            TextLocalisedClause textLocalisedClause12 = new TextLocalisedClause(R$string.card_replacement_expectation_actions_terminate_and_order, null, null, 14);
            String strV3 = a0.d.v(new Object[]{1}, 1, "STEP_LIST_ID%s", "format(...)");
            TextLocalisedClause textLocalisedClause13 = new TextLocalisedClause(R$string.card_replacement_expectations_titles_will_be_terminated, null, null, 14);
            TextLocalisedClause textLocalisedClause14 = new TextLocalisedClause(R$string.card_replacement_expectations_subtitles_keep_safe, null, null, 14);
            BulletImage bulletImageB3 = com.revolut.core.ui_kit_core.displayers.image.models.a.b(1, null, null, null, 30);
            ff ffVar3 = ff.DP_24;
            RowDelegate.Model model7 = new RowDelegate.Model(strV3, bulletImageB3, ffVar3, null, textLocalisedClause13, textLocalisedClause14, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741672);
            yp0.b.l(model7, 0, 0, 0, 0, null, false, 63);
            RowDelegate.Model model8 = new RowDelegate.Model(a0.d.v(new Object[]{2}, 1, "STEP_LIST_ID%s", "format(...)"), com.revolut.core.ui_kit_core.displayers.image.models.a.b(2, null, null, null, 30), ffVar3, null, new TextLocalisedClause(R$string.card_replacement_expectations_titles_order_replacement, null, null, 14), new TextLocalisedClause(R$string.card_replacement_expectations_subtitles_may_charge_for_replacement, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741672);
            yp0.b.l(model8, 0, 0, 0, 0, null, false, 63);
            RowDelegate.Model model9 = new RowDelegate.Model(a0.d.v(new Object[]{3}, 1, "STEP_LIST_ID%s", "format(...)"), com.revolut.core.ui_kit_core.displayers.image.models.a.b(3, null, null, null, 30), ffVar3, null, new TextLocalisedClause(R$string.card_replacement_expectations_titles_start_using_with, zhm.u.c(new TextLocalisedClause(R$string.cards_home_item_google_pay_title, null, null, 14)), null, 12), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741800);
            yp0.b.l(model9, 0, 0, 0, 0, null, false, 63);
            return new p(textLocalisedClause10, textLocalisedClause11, textLocalisedClause12, zhm.v.k(model7, model8, model9));
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause15 = new TextLocalisedClause(R$string.card_replacement_options_damaged, null, null, 14);
        TextLocalisedClause textLocalisedClause16 = new TextLocalisedClause(R$string.card_replacement_expectation_header_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        TextLocalisedClause textLocalisedClause17 = new TextLocalisedClause(R$string.card_replacement_expectation_actions_order_replacement, null, null, 14);
        String strV4 = a0.d.v(new Object[]{1}, 1, "STEP_LIST_ID%s", "format(...)");
        TextLocalisedClause textLocalisedClause18 = new TextLocalisedClause(R$string.card_replacement_expectations_titles_order_replacement, null, null, 14);
        TextLocalisedClause textLocalisedClause19 = new TextLocalisedClause(R$string.card_replacement_expectations_subtitles_free_replacement, null, null, 14);
        BulletImage bulletImageB4 = com.revolut.core.ui_kit_core.displayers.image.models.a.b(1, null, null, null, 30);
        ff ffVar4 = ff.DP_24;
        RowDelegate.Model model10 = new RowDelegate.Model(strV4, bulletImageB4, ffVar4, null, textLocalisedClause18, textLocalisedClause19, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741672);
        yp0.b.l(model10, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model11 = new RowDelegate.Model(a0.d.v(new Object[]{2}, 1, "STEP_LIST_ID%s", "format(...)"), com.revolut.core.ui_kit_core.displayers.image.models.a.b(2, null, null, null, 30), ffVar4, null, new TextLocalisedClause(R$string.card_replacement_expectations_titles_start_using_with, zhm.u.c(new TextLocalisedClause(R$string.cards_home_item_google_pay_title, null, null, 14)), null, 12), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741800);
        yp0.b.l(model11, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model12 = new RowDelegate.Model(a0.d.v(new Object[]{3}, 1, "STEP_LIST_ID%s", "format(...)"), com.revolut.core.ui_kit_core.displayers.image.models.a.b(3, null, null, null, 30), ffVar4, null, new TextLocalisedClause(R$string.card_replacement_expectations_titles_will_be_terminated, null, null, 14), new TextLocalisedClause(R$string.card_replacement_expectations_subtitles_terminate_after_activation, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741672);
        yp0.b.l(model12, 0, 0, 0, 0, null, false, 63);
        return new p(textLocalisedClause15, textLocalisedClause16, textLocalisedClause17, zhm.v.k(model10, model11, model12));
    }
}
