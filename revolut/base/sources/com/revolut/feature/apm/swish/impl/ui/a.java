package com.revolut.feature.apm.swish.impl.ui;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.swish.impl.ui.SwishFlowContract$Step;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import cp5.d;
import jch.p;
import je2.b;
import je2.c;
import je2.e;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pth.g;
import til.m;
import wli.x;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {

    @NotNull
    public static final e Companion = new e();
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f62917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f62918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f62919r;

    public a(m workflowFlowProvider, jvh.a workflowInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = workflowFlowProvider;
        this.f62917p = workflowInteractor;
        this.f62918q = deeplinkHandler;
        p pVar = new p(this, 7);
        this.f62919r = d.a(this, SwishFlowContract$Step.Intro.f62912a, f0.f322471a, pVar);
    }

    public final void I2() {
        l.a1(this, X1(new y0("ID_PENDING_REGISTRATION_DIALOG", new g0(new TextLocalisedClause(R$string.apm_registration_pending_dialog_title, null, null, 14), new TextLocalisedClause(R$string.apm_registration_pending_dialog_subtitle, null, null, 14), null, new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), null, null, null, null, false, null, false, null, 16372), false, 4)), null, null, new j2c.b(this, null, 18), 3);
    }

    public final void J2(String str) {
        C1(((g) this.o).d(new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), false, new c(this, 3)));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62919r;
    }
}
