package com.revolut.sso.impl.ui.auth_rejected;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.ui.auth_rejected.AuthenticationRejectedFlowContract$Step;
import cp5.d;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;
import jkl.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import oki.h;
import org.jetbrains.annotations.NotNull;
import u7k.w;
import ukl.b;
import ukl.g;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements b {

    @NotNull
    public static final g Companion = new g();
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f106391p;

    public a(AuthenticationRejectedFlowContract$InputData inputData, e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = dateProvider;
        ZonedDateTime zonedDateTime = inputData.f106382a;
        int i = inputData.f106384c;
        Set set = inputData.f106383b;
        this.f106391p = d.a(this, (zonedDateTime != null || set.isEmpty()) ? (zonedDateTime == null || !set.isEmpty()) ? zonedDateTime != null ? new AuthenticationRejectedFlowContract$Step.FallbackActionsAvailable(zonedDateTime, set) : new AuthenticationRejectedFlowContract$Step.PrimaryActionAvailable(i) : new AuthenticationRejectedFlowContract$Step.NoActionsAvailable(zonedDateTime) : new AuthenticationRejectedFlowContract$Step.PrimaryAndFallbackActionsAvailable(i, set), f0.f322471a, new w(this, 24));
    }

    public final PromptMarketingScreen I2(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, a3 a3Var) {
        TextLocalisedClause textLocalisedClause3;
        PromptMarketingContentDelegate.Model.Button button;
        TextLocalisedClause textLocalisedClause4;
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_rejected_screen_title, null, null, 14);
        if (textLocalisedClause2 != null) {
            textLocalisedClause3 = textLocalisedClause2;
            button = new PromptMarketingContentDelegate.Model.Button((Clause) textLocalisedClause3, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        } else {
            textLocalisedClause3 = textLocalisedClause2;
            button = null;
        }
        int i = a3Var == null ? -1 : ukl.h.f280797a[a3Var.ordinal()];
        if (i == -1) {
            textLocalisedClause4 = null;
        } else {
            if (i != 1) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause4 = new TextLocalisedClause(R$string.revolut_sso_common_actions_chat_with_us, null, null, 14);
        }
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause5, textLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D151", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, button, textLocalisedClause4 != null ? new PromptMarketingContentDelegate.Model.Button((Clause) textLocalisedClause4, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62) : null, null, null, null, null, null, 32344));
        toh.h block = new toh.h(this, 21, textLocalisedClause3, a3Var);
        Intrinsics.checkNotNullParameter(block, "block");
        promptMarketingScreen.H = block;
        return promptMarketingScreen;
    }

    public final PromptMarketingScreen J2(int i) {
        return I2(new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_rejected_screen_description, null, null, 14), new TextLocalisedClause(i, null, null, 14), null);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106391p;
    }
}
