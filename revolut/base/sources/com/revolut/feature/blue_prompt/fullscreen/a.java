package com.revolut.feature.blue_prompt.fullscreen;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ks2.e;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f64313a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExplicitActivityDestination f64314b = new ExplicitActivityDestination(BluePromptActivity.class);

    private a() {
    }

    public static ActivityNavigateCommand a(a aVar, Clause title, Clause description, BluePromptContent.MediaContent content, TextLocalisedClause textLocalisedClause, Clause clause, TextLocalisedClause textLocalisedClause2, NaviCommand naviCommand, NaviCommand naviCommand2, BrowserCommand browserCommand, ResourceImage resourceImage, NaviCommand naviCommand3, AnalyticsProduct.Retail analyticsProduct, int i) {
        String str = (i & 1) != 0 ? null : "CARD_PERSONALISATION_FLOW";
        TextLocalisedClause textLocalisedClause3 = (i & 16) != 0 ? null : textLocalisedClause;
        TextLocalisedClause textLocalisedClause4 = (i & 128) != 0 ? null : textLocalisedClause2;
        NaviCommand naviCommand4 = (i & 512) != 0 ? null : naviCommand2;
        BrowserCommand browserCommand2 = (i & 1024) != 0 ? null : browserCommand;
        e buttonsStyle = e.VERTICAL;
        LargeActionButton.ButtonStyle.DefaultFilledButton secondaryActionStyle = LargeActionButton.ButtonStyle.f58726b;
        ResourceImage resourceImage2 = (32768 & i) != 0 ? new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246) : resourceImage;
        NaviCommand finishCommand = (i & 65536) != 0 ? new FinishCommand(null, null, null, 7) : naviCommand3;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
        Intrinsics.checkNotNullParameter(secondaryActionStyle, "secondaryActionStyle");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new ActivityNavigateCommand(f64314b, new BluePromptContract$Configuration.Basic(str, title, description, content, resourceImage2, finishCommand, textLocalisedClause3, null, buttonsStyle, null, null, clause, textLocalisedClause4, secondaryActionStyle, naviCommand, naviCommand4, browserCommand2, null, null, true, analyticsProduct, null, null, false), null, null, 0, null, null, null, null, false, 1012);
    }
}
