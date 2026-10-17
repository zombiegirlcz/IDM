package com.revolut.feature.tax_residency.impl.flows.submit;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlowContract$Step;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.revolut.feature_fourthline_impl.R;
import dki.g;
import ei8.d;
import eif.j;
import eoe.b;
import i26.l;
import ip0.tm0;
import ip0.um0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.y;
import zhm.u;
import zme.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g implements b {

    @NotNull
    public static final eoe.g Companion = new eoe.g();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SubmitTaxResidencyFlowContract$InputData f90068t;
    public final yme.a u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SubmitTaxResidencyFlowContract$Step.Submission f90069w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SubmitTaxResidencyFlowContract$State f90070x;

    public a(SubmitTaxResidencyFlowContract$InputData inputData, yme.a taxResidencyInteractor, j60.a bottomDialogExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        this.f90068t = inputData;
        this.u = taxResidencyInteractor;
        this.v = bottomDialogExtension;
        this.f90069w = SubmitTaxResidencyFlowContract$Step.Submission.f90067a;
        this.f90070x = SubmitTaxResidencyFlowContract$State.f90066a;
    }

    @Override // yji.l
    public final void I1() {
        String str;
        SubmitTaxResidencyFlowContract$InputData submitTaxResidencyFlowContract$InputData = this.f90068t;
        zme.g gVar = l.k(submitTaxResidencyFlowContract$InputData.f90063c, submitTaxResidencyFlowContract$InputData.f90061a).d;
        boolean z = false;
        boolean z3 = gVar != null ? gVar.f323491l : false;
        List<f> list = submitTaxResidencyFlowContract$InputData.f90062b;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            for (f fVar : list) {
                if (l.o(l.k(submitTaxResidencyFlowContract$InputData.f90063c, fVar.f323482a)) && ((str = fVar.f323483b) == null || str.length() == 0)) {
                    break;
                }
            }
            z = true;
        }
        Continuation continuation = null;
        if (z3 && (z || submitTaxResidencyFlowContract$InputData.f90064g)) {
            this.v.x(new y(u.c(new um0("US_PERSON_DECLARATION_BUTTONS_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_agree, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new t(new TextLocalisedClause(R$string.tax_residency_confirmation_title, null, null, 14), new TextLocalisedClause(O2() ? R$string.tax_residency_confirmation_subtitle_is_us_person : R$string.tax_residency_confirmation_subtitle_is_not_us_person, null, null, 14), null, 28), null, null, null, null, 1020));
        } else {
            l2(new j(this, continuation, continuation, 17), new d(this, 24));
        }
    }

    public final boolean O2() {
        List list = this.f90068t.f90062b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            wi0.b bVar = ((f) it8.next()).f323482a;
            wi0.b.Companion.getClass();
            if (Intrinsics.f(bVar, wi0.b.f297770q3)) {
                return true;
            }
        }
        return false;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        SubmitTaxResidencyFlowContract$Step step = (SubmitTaxResidencyFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        return new LayoutViewerScreen(R$layout.screen_transparent);
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f90070x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f90069w;
    }
}
