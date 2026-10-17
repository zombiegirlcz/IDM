package com.revolut.feature.payments.profile.impl.flow;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.profile.impl.R$string;
import com.revolut.feature.payments.profile.impl.flow.PaymentProfileUsernameFlowContract$Step;
import com.revolut.feature.username.ui.UsernameScreen;
import com.revolut.feature.username.ui.UsernameScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.revolut.feature_fourthline_impl.R;
import dki.g;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pth.l;
import pw9.b;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gw9.a f79624t;
    public final PaymentProfileUsernameFlowContract$Step.Username u;
    public final PaymentProfileUsernameFlowContract$State v;

    public a(gw9.a helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f79624t = helper;
        this.u = PaymentProfileUsernameFlowContract$Step.Username.f79623a;
        this.v = PaymentProfileUsernameFlowContract$State.f79622a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PaymentProfileUsernameFlowContract$Step step = (PaymentProfileUsernameFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof PaymentProfileUsernameFlowContract$Step.Username)) {
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_profile_set_username, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.payments_profile_screen_change_user_name_subtitle, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R.string.common_action_update, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137500l;
        UsernameScreen usernameScreen = new UsernameScreen(new UsernameScreenContract$InputData(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, resourceImage, com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var)));
        l lVar = new l(this, 11);
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        usernameScreen.H = lVar;
        return usernameScreen;
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
