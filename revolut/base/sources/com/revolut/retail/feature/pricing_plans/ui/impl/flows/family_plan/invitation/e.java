package com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation;

import ajk.f;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.FamilyPlanInvitationFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.a;
import dok.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import oki.h;
import yji.l;
import zfd.s;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends h implements zgk.c {
    public final zgk.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f103032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cha.b f103033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f103034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zgk.a f103035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zfk.c f103036t;
    public final bgk.a u;
    public final yki.a v;

    public e(zgk.d inputData, f pricingPlanNavigationCommandsProvider, cha.b familyPlansInteractor, gte.a featureToggleInteractor, zgk.a familyPlanInvitationDialogMapper, zfk.c planSubscriberControllerExtension, bgk.a planTermsWorkflowControllerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(familyPlanInvitationDialogMapper, "familyPlanInvitationDialogMapper");
        Intrinsics.checkNotNullParameter(planSubscriberControllerExtension, "planSubscriberControllerExtension");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        this.o = inputData;
        this.f103032p = pricingPlanNavigationCommandsProvider;
        this.f103033q = familyPlansInteractor;
        this.f103034r = featureToggleInteractor;
        this.f103035s = familyPlanInvitationDialogMapper;
        this.f103036t = planSubscriberControllerExtension;
        this.u = planTermsWorkflowControllerExtension;
        zba.a aVar = new zba.a(this, 18);
        this.v = cp5.d.a(this, FamilyPlanInvitationFlowContract$Step.Invitation.f103025a, f0.f322471a, aVar);
    }

    public static final void J2(e eVar, a aVar, hha.d pricingPlan, boolean z) {
        if (!Intrinsics.f(aVar, a.b.f103028a)) {
            if (!Intrinsics.f(aVar, a.C0632a.f103027a)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar.C1(new BridgeDestination(eVar.f103032p.d()));
        } else {
            eVar.f103035s.getClass();
            Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
            l.a1(eVar, eVar.X1(new y0("accept_invitation", new j0((Clause) new TextLocalisedClause(R$string.family_plans_join_family_plan_accept_status_title, z ? u.c(new TextLocalisedClause(R$string.plan_duo_short_name, u.c(g.d(pricingPlan, null)), null, 12)) : u.c(g.d(pricingPlan, null)), null, 12), (Clause) new TextLocalisedClause(R$string.family_plans_join_family_plan_accept_status_subtitle_with_plan, u.c(g.d(pricingPlan, null)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.family_plans_join_family_plan_accept_status_button_explore_plan, null, null, 14), new TextLocalisedClause(R$string.family_plans_join_family_plan_accept_status_button_close, null, null, 14)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) new StatusViewContract$Duration.Custom(4000L), (h0) null, (ResourceImage) null, 3564), false, 4)), null, null, new s(eVar, (Continuation) null, 4), 3);
        }
    }

    public final void I2(hha.d dVar, boolean z) {
        Continuation continuation = null;
        if (z) {
            l2(new zah.f(this, dVar, continuation, 7), new yi5.b(26));
            return;
        }
        zgk.d dVar2 = this.o;
        l.a1(this, this.f103036t.Z2(dVar2.f322194b, dVar2.f322193a), null, null, new b(this, dVar, z, null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
