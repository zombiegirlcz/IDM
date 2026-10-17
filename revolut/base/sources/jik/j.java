package jik;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(c cVar) {
        if (cVar instanceof b) {
            return new TextLocalisedClause(R$string.plan_referral_switch_notice_benefit_free, null, null, 14);
        }
        if (cVar instanceof jik.a) {
            return new TextLocalisedClause(R$string.plan_referral_switch_notice_benefit_percentage, u.c(new PercentageClause(((jik.a) cVar).f174592b, new PercentageClause.Format.Custom(0, 14, null, null, null), (Custom) null, 4)), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause b(c cVar, int i, int i2, List list, List list2) {
        if (cVar instanceof b) {
            return new TextLocalisedClause(i, list, null, 12);
        }
        if (cVar instanceof jik.a) {
            return new TextLocalisedClause(i2, list2, null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PromptMarketingScreen c(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, TextLocalisedClause textLocalisedClause4) {
        PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D268", null, null, null, 30), null);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        pd pdVar = pd.BLACK;
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) textLocalisedClause3, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        Object obj2 = null;
        Parcelable parcelable = null;
        String str = null;
        String str2 = null;
        Clause clause = null;
        PromptMarketingContentDelegate.Model.AnimationType animationType = null;
        AnimationRequest animationRequest = null;
        return new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("PLAN_REFERRAL_SWITCH_NOTICE_PROMPT", textLocalisedClause, textLocalisedClause2, mediaContent, null, pdVar, resourceImage, null, null, button, new PromptMarketingContentDelegate.Model.Button((Clause) textLocalisedClause4, (ResourceImage) objArr, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, z, (String) null, 54), id.VERTICAL, 0 == true ? 1 : 0, obj2, parcelable, str, str2, clause, animationType, animationRequest, null, 2093456), null, false, false, null, 30));
    }

    public static PeriodClause d(Period period) {
        return new PeriodClause(new PeriodClause.PeriodComponents(period.getYears(), period.getMonths(), period.getDays(), 0, 0, 0, 56), null);
    }
}
