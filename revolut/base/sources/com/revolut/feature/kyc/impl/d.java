package com.revolut.feature.kyc.impl;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.delegates.bd;
import com.revolut.core.ui_kit.internal.views.ProgressAnimation;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.kyc.impl.KycPromptDestination;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.revolut.analytics.tracking.v3.AnalyticsContext] */
    public final WrapperFlowImpl a(KycPromptDestination destination) {
        KycPromptDestination.Failed failed;
        PromptContentDelegate.Model.b adVar;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Clause f77538a = destination.getF77538a();
        Clause clauseP = c8g.c.p(destination.getF77539b());
        if (destination instanceof KycPromptDestination.Pending) {
            int i = R$attr.uikit_colorActionPhotoHeaderText;
            failed = null;
            adVar = new bd(new ProgressStyle(60, 100, i, i, R$attr.uikit_colorGreyTone50_20, 8.0f, 8.0f, new ProgressAnimation(1500L, true), 512), null, null);
        } else {
            failed = null;
            if (!(destination instanceof KycPromptDestination.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            adVar = new ad(com.revolut.core.ui_kit_core.displayers.image.models.b.c(((KycPromptDestination.Failed) destination).f77535c, null, null, null, 30), false);
        }
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
        Clause f77540c = destination.getF77540c();
        KycPromptDestination.Failed failed2 = destination instanceof KycPromptDestination.Failed ? (KycPromptDestination.Failed) destination : failed;
        return gc0.c.b(new FullScreenPromptScreen(new d67.f(new PromptContentDelegate.Model("KycPrompt", f77538a, clauseP, null, adVar, resourceImage, null, null, false, f77540c, failed2 != null ? failed2.e : failed, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536869320), destination.getE(), failed, true)), new an4.b(this, destination));
    }
}
