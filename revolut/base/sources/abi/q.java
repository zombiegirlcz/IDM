package abi;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptContract$InputData;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationUseCase;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmailVerificationPromptContract$InputData f2975a;

    public q(EmailVerificationPromptContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f2975a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        PromptMarketingContentDelegate.Model.Button button;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.signup_main_form_email_verify_prompt_title, null, null, 14);
        int i = R$string.signup_main_form_email_verify_prompt_subtitle;
        EmailVerificationPromptContract$InputData emailVerificationPromptContract$InputData = this.f2975a;
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(i, u.c(emailVerificationPromptContract$InputData.f97596a), null, 12);
        PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D001", null, null, null, 30), null);
        PromptMarketingContentDelegate.Model.Button button2 = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.signup_main_form_email_verify_prompt_inbox_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        EmailVerificationUseCase emailVerificationUseCase = emailVerificationPromptContract$InputData.f97598c;
        int[] iArr = p.f2974a;
        int i2 = iArr[emailVerificationUseCase.ordinal()];
        if (i2 == 1) {
            button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.signup_main_form_email_verify_prompt_resend_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.signup_main_form_email_verify_prompt_update_email_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        }
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        int i3 = iArr[emailVerificationUseCase.ordinal()];
        if (i3 == 1) {
            od0.a aVar = od0.a.f224253a;
            if (!od0.a.e() && !od0.a.i()) {
                textLocalisedClause2 = textLocalisedClause5;
                textLocalisedClause3 = null;
                return new f(u.c(new PromptMarketingContentDelegate.Model("EMAIL_VERIFICATION_SCREEN_PROMPT", textLocalisedClause4, textLocalisedClause2, mediaContent, null, null, resourceImage, null, null, button2, button, null, null, null, null, null, null, textLocalisedClause3, null, null, null, 1964464)));
            }
            textLocalisedClause = new TextLocalisedClause(R$string.signup_main_form_email_verify_prompt_debug_otp, null, null, 14);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.signup_main_form_email_verify_prompt_resend_button, null, null, 14);
        }
        textLocalisedClause2 = textLocalisedClause5;
        textLocalisedClause3 = textLocalisedClause;
        return new f(u.c(new PromptMarketingContentDelegate.Model("EMAIL_VERIFICATION_SCREEN_PROMPT", textLocalisedClause4, textLocalisedClause2, mediaContent, null, null, resourceImage, null, null, button2, button, null, null, null, null, null, null, textLocalisedClause3, null, null, null, 1964464)));
    }
}
