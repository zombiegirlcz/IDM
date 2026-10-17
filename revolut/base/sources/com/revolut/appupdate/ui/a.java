package com.revolut.appupdate.ui;

import com.revolut.appupdate.R$string;
import com.revolut.appupdate.ui.AppUpdateContract$Step;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.b;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import eq.c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cpi.g f50364t;
    public final AppUpdateContract$Step u;
    public final EmptyFlowState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f50365w;

    public a(AppUpdateContract$InputData inputData, cpi.g storeIntentProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(storeIntentProvider, "storeIntentProvider");
        this.f50364t = storeIntentProvider;
        this.u = inputData.f50361a ? AppUpdateContract$Step.ForceUpdate.f50362a : AppUpdateContract$Step.SoftUpdate.f50363a;
        this.v = EmptyFlowState.f98428a;
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (!Intrinsics.f(A2().f98430b, AppUpdateContract$Step.SoftUpdate.f50363a) || this.f50365w) {
            return;
        }
        this.f50365w = true;
        f2(new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("AppUpdate", new TextLocalisedClause(R$string.appupdateprompt_title, null, null, 14), new TextLocalisedClause(R$string.appupdateprompt_description_soft, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(b.c("3D002", null, null, null, 30), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.appupdateprompt_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30)), ModalDestination.Style.POPUP.f98311a, new c(this, 0));
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        AppUpdateContract$Step step = (AppUpdateContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, AppUpdateContract$Step.ForceUpdate.f50362a)) {
            if (Intrinsics.f(step, AppUpdateContract$Step.SoftUpdate.f50363a)) {
                return new LayoutViewerScreen(R$layout.screen_transparent);
            }
            throw new NoWhenBranchMatchedException();
        }
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("AppUpdate", new TextLocalisedClause(R$string.appupdateprompt_title, null, null, 14), new TextLocalisedClause(R$string.appupdateprompt_description_hard, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(b.c("3D002", null, null, null, 30), null), null, null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.appupdateprompt_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30));
        c block = new c(this, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        promptMarketingScreen.H = block;
        return promptMarketingScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
