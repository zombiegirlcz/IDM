package com.revolut.feature.credit.application.plugins.impl.ui.spinner;

import be4.d;
import c84.t;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import e84.e;
import i69.p;
import ii4.c;
import ii4.f;
import ii4.h;
import ii4.o;
import ii4.z;
import ip0.v7;
import java.util.ArrayList;
import ju3.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import nii.c0;
import nii.g0;
import nii.j;
import nii.y0;
import skm.a2;
import vkm.v1;
import yji.l;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements ii4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SpinnerFlowContract$InputData f68420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f68421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f68422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f68423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f68424t;
    public final yki.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SpinnerFlowContract$InputData inputData, w revolutJobInteractor, o spinnerInteractor, d waitingBottomSheetControllerProvider, e pluginControllerResolver) {
        FlowStep statusDialog;
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(spinnerInteractor, "spinnerInteractor");
        Intrinsics.checkNotNullParameter(waitingBottomSheetControllerProvider, "waitingBottomSheetControllerProvider");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68420p = inputData;
        this.f68421q = revolutJobInteractor;
        this.f68422r = spinnerInteractor;
        this.f68423s = waitingBottomSheetControllerProvider;
        SpinnerConfiguration spinnerConfiguration = inputData.f68407a;
        if (spinnerConfiguration instanceof SpinnerConfiguration.FullScreen) {
            statusDialog = new SpinnerFlowContract$Step.Spinner((SpinnerConfiguration.FullScreen) spinnerConfiguration);
        } else {
            if (!(spinnerConfiguration instanceof SpinnerConfiguration.Popup)) {
                throw new NoWhenBranchMatchedException();
            }
            statusDialog = new SpinnerFlowContract$Step.StatusDialog((SpinnerConfiguration.Popup) spinnerConfiguration);
        }
        this.u = cp5.d.a(this, statusDialog, f0.f322471a, new p(this, 19));
    }

    public static y0 P2(SpinnerConfiguration.Content.SpinnerContent spinnerContent) {
        return new y0(null, new c0(spinnerContent.f66375a, spinnerContent.f66376b, null, true, null, false, false, null, 1900), false, 5);
    }

    public final void Q2(long j2, ArrayList arrayList) {
        a2 a2Var = this.f68424t;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f68424t = l.b1(this, new v1(new ii4.d(arrayList, j2, null, 0)), null, new f(this, null), 3);
    }

    public final void R2(WaitingPopupScreenConfig waitingPopupScreenConfig, g gVar) {
        a2 a2Var = this.f68424t;
        if (a2Var != null) {
            a2Var.f(null);
        }
        s1();
        int i = c.f161513a[gVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l.a1(this, X1(new y0(null, new g0(waitingPopupScreenConfig.f66427a, waitingPopupScreenConfig.f66428b, null, waitingPopupScreenConfig.f66429c, null, null, null, j.b.f216170a, true, null, false, null, 15988), false, 5)), null, null, new h(this, null), 3);
        } else {
            oki.h.w2(this.u, new SpinnerFlowContract$Step.ModalStep.TimeoutStep(waitingPopupScreenConfig, v7.m(this.f68420p.d, AnalyticsContext.INSTANCE)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        a aVar;
        SpinnerFlowContract$Step spinnerFlowContract$Step = (SpinnerFlowContract$Step) this.u.d();
        if (spinnerFlowContract$Step instanceof SpinnerFlowContract$Step.StatusDialog) {
            SpinnerConfiguration.Popup popup = ((SpinnerFlowContract$Step.StatusDialog) spinnerFlowContract$Step).f68413a;
            SpinnerConfiguration.Content content = popup.f66388a;
            if (content instanceof SpinnerConfiguration.Content.Dynamic) {
                SpinnerConfiguration.Content.Dynamic dynamic = (SpinnerConfiguration.Content.Dynamic) content;
                Q2(dynamic.f66374b, dynamic.f66373a);
                aVar = this;
            } else {
                if (!(content instanceof SpinnerConfiguration.Content.Static)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = this;
                l.a1(aVar, X1(P2(((SpinnerConfiguration.Content.Static) content).f66377a)), null, null, null, 7);
            }
            SpinnerConfiguration.Mode.Limited limited = popup.f66389b;
            SpinnerConfiguration.Mode.Limited.TerminationCondition terminationCondition = limited.d;
            int i = limited.f66381a;
            long j3 = limited.f66382b;
            long j5 = limited.f66383c;
            g gVar = limited.f;
            WaitingPopupScreenConfig waitingPopupScreenConfig = limited.e;
            CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = aVar.f68420p.d;
            l.b1(this, rd0.e.d(((z) aVar.f68422r).d(terminationCondition, j5, i, j3, gVar, waitingPopupScreenConfig, new ii4.g0(creditApplicationPluginFlowContract$Configuration.f66892b, creditApplicationPluginFlowContract$Configuration.f66894g)), h0.f322473a), null, new ii4.e(this, popup, null), 3);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
