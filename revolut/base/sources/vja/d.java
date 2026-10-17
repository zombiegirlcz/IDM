package vja;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import nii.y;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import tx0.z4;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kvh.h f289662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yp.b f289663m;

    public d(kvh.h serverErrorHelper, yp.b appStoreNavigationFactory) {
        Intrinsics.checkNotNullParameter(serverErrorHelper, "serverErrorHelper");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        this.f289662l = serverErrorHelper;
        this.f289663m = appStoreNavigationFactory;
    }

    @Override // vja.b
    public final boolean Z2(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return this.f289662l.a(error);
    }

    @Override // vja.b
    public final void b3(Throwable error, Function0 retryAction, Function0 dismissAction) {
        PromptMarketingScreen promptMarketingScreen;
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(retryAction, "retryAction");
        Intrinsics.checkNotNullParameter(dismissAction, "dismissAction");
        kvh.h hVar = this.f289662l;
        ServerError serverErrorC = hVar.c(error);
        Integer numValueOf = serverErrorC != null ? Integer.valueOf(serverErrorC.f51362a) : null;
        if ((numValueOf == null || numValueOf.intValue() != 9504) && (numValueOf == null || numValueOf.intValue() != 9503)) {
            TextLocalisedClause textLocalisedClauseB = hVar.b(error);
            if (textLocalisedClauseB != null) {
                yji.n.j2(this, L2(new y0("ERROR_DIALOG_ID", new z(textLocalisedClauseB, null, new TextLocalisedClause(R$string.common_action_try_again, null, null, 14), null, null, null, true, null, null, null, null, new y(2, com.google.android.gms.internal.mlkit_vision_face.a.o(o0.f186429a.b(error.getClass()).m(), ": ", error.getMessage()), null), null, 24310), false, 4)), null, new ga0.c(retryAction, dismissAction, null, 2), 3);
                return;
            } else {
                yji.n.j2(this, L2(new y0("UPDATE_APP_DIALOG_ID", new z(new TextLocalisedClause(R$string.product_eligibility_status_error_or_app_update_title, null, null, 14), new TextLocalisedClause(R$string.product_eligibility_status_error_or_app_update_description, null, null, 14), new TextLocalisedClause(R$string.common_action_try_again, null, null, 14), new TextLocalisedClause(R$string.product_eligibility_status_app_update_button, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 4)), null, new z4(retryAction, this, dismissAction, null, 5), 3);
                return;
            }
        }
        int iIntValue = numValueOf.intValue();
        PromptMarketingContentDelegate.Model.BackgroundType.Dialog dialog = PromptMarketingContentDelegate.Model.BackgroundType.Dialog.f53101a;
        if (iIntValue == 9503) {
            promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("USER_UNDER_18_NOT_ELIGIBLE_PROMPT_ID", new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.signup_junior_self_signup_not_eligible_prompt_title_dynamic, u.c(18), null, 12), new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.signup_junior_self_signup_not_eligible_prompt_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(new UrlImage("https://assets.revolut.com/mobile/cards/u18_cards.png", null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null), dialog, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.signup_junior_self_signup_not_eligible_prompt_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096544), null, true, false, null, 26));
        } else {
            if (iIntValue != 9504) {
                throw new IllegalArgumentException(j6.a.l(iIntValue, "Unexpected error code: ", ", should be 'under 18' error"));
            }
            promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("USER_UNDER_18_ELIGIBLE_PROMPT_ID", new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.signup_junior_self_signup_eligible_prompt_title_dynamic, u.c(18), null, 12), new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.signup_junior_self_signup_eligible_prompt_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(new UrlImage("https://assets.revolut.com/mobile/cards/u18_cards.png", null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null), dialog, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.signup_junior_self_signup_eligible_prompt_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096544), null, true, false, null, 26));
        }
        N2(promptMarketingScreen, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new vh2.j(this, 10));
    }
}
