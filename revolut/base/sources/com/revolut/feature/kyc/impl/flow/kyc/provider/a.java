package com.revolut.feature.kyc.impl.flow.kyc.provider;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.kyc.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pv8.b;
import yt8.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    @NotNull
    public static final sv8.a Companion = new sv8.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f77719a;

    public a(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f77719a = countryInteractor;
    }

    public final PromptMarketingScreenContract$InputData a(e alert, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        if (sv8.b.f265849a[alert.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        int i = R$string.kyc_document_alert_au_verification_required_title;
        int i2 = R$string.kyc_document_alert_au_verification_required_subtitle;
        int i3 = com.revolut.retail.common.ui.R$string.common_action_continue;
        new KycFlowScreensContentProvider$AdditionalVerificationContent(i, i2, i3, "3D117");
        return new PromptMarketingScreenContract$InputData(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D117", null, null, null, 30), null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(i3, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, analyticsProduct, null, 61272);
    }
}
