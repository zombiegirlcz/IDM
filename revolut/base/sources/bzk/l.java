package bzk;

import aw0.m6;
import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static aw0.e a(int i) {
        return new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(i, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "SUBMIT_BUTTON_TAG", false, null, null, f.f20052a, 492), null, null, 55);
    }

    public static lw0.a b(int i, Integer num) {
        return new lw0.a(new TextLocalisedClause(i, null, null, 14), num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : null, new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, GlyphImageTint.WARNING.f59933a, null, 4)), null, false, 24);
    }

    public static RowDelegate.Model d() {
        boolean z = false;
        return new RowDelegate.Model("SUBMITTED_STEP_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusSuccess), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextLocalisedClause(R$string.trading_onboarding_prompt_step_submitted_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(R$string.trading_onboarding_prompt_step_submitted_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }

    public static RowDelegate.Model e(int i, int i2, String str) {
        boolean z = false;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(i2, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        bzk.a domainState = (bzk.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = m.f20055a[domainState.f20048a.ordinal()];
        if (i == 1) {
            lw0.a aVarB = b(R$string.trading_onboarding_prompt_declined_title, null);
            List listK = v.k(d(), e(R$string.trading_onboarding_prompt_declined_step_not_approved_title, R$string.trading_onboarding_prompt_declined_step_not_approved_subtitle, "NOT_APPROVED_STEP_LIST_ID"));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return new cii.b(a(R$string.trading_onboarding_prompt_declined_action_retry), listK, aVarB);
        }
        if (i == 2) {
            lw0.a aVarB2 = b(R$string.trading_onboarding_prompt_info_request_title, Integer.valueOf(R$string.trading_onboarding_prompt_info_request_subtitle));
            List listK2 = v.k(d(), e(R$string.trading_onboarding_prompt_info_request_step_info_required_title, R$string.trading_onboarding_prompt_info_request_step_info_required_subtitle, "INFO_REQUIRED_LIST_ID"));
            yp0.b.k(listK2, 0, 0, 0, 0, 31);
            return new cii.b(a(R$string.trading_onboarding_prompt_info_request_action_retry), listK2, aVarB2);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        lw0.a aVarB3 = b(R$string.trading_onboarding_prompt_retry_limit_reached_title, Integer.valueOf(R$string.trading_onboarding_prompt_retry_limit_reached_subtitle));
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, e.f20051a, 508), null, null, 55), f0.f322471a, aVarB3);
    }
}
