package com.revolut.feature.kyc.impl;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.impl.KycPromptDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import ks8.l;
import zh9.u0;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements l {
    public final FeatureCommand a(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, String illustrationId, TextLocalisedClause primaryActionLabel, Clause clause, CompositeCommand primaryActionCommand, NaviCommand naviCommand, AnalyticsProduct.Retail automaticEventProduct) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(illustrationId, "illustrationId");
        Intrinsics.checkNotNullParameter(primaryActionLabel, "primaryActionLabel");
        Intrinsics.checkNotNullParameter(primaryActionCommand, "primaryActionCommand");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        return u0.f(new KycPromptDestination.Failed(title, textLocalisedClause, illustrationId, primaryActionLabel, clause, primaryActionCommand, naviCommand, automaticEventProduct));
    }
}
