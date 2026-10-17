package p54;

import androidx.room.RoomDatabase;
import com.google.common.collect.ImmutableSet;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowActivity;
import com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowContract$Configuration;
import efm.r;
import ft3.j1;
import ip0.v7;
import java.util.Stack;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;
import os9.t;
import ozc.z;
import qc0.y0;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends y0 implements d {

    @NotNull
    public static final i Companion = new i();
    public final rz3.c A;
    public final sri.m B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c90.c f233007x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CreditBackendFlowContract$Configuration f233008y;
    public final kpi.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c90.c uiResources, CreditBackendFlowContract$Configuration creditConfiguration, kpi.c activityResultDelegate, rz3.c creditApplicationRouter, sri.m navigator, qc0.h presentationModel, qc0.j router, qc0.k state, ypi.i nextButtonView, f9b.f errorView, tpi.j progressView, hqi.l toolbarView, npi.a dialogView, pri.f authorizedPresenterDelegate, k3l.b statusViewModel, xpi.g navBarWithToolbarView, rpi.c keyboardView, ImmutableSet initSet, mm.d actionsDispatcher, opi.d expandableDialogView, qd0.b languageProvider) {
        super(router, state, presentationModel, nextButtonView, errorView, progressView, toolbarView, creditConfiguration.f67155c, keyboardView, dialogView, authorizedPresenterDelegate, statusViewModel, navBarWithToolbarView, initSet, actionsDispatcher, expandableDialogView, languageProvider);
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(creditConfiguration, "creditConfiguration");
        Intrinsics.checkNotNullParameter(activityResultDelegate, "activityResultDelegate");
        Intrinsics.checkNotNullParameter(creditApplicationRouter, "creditApplicationRouter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(toolbarView, "toolbarView");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        Intrinsics.checkNotNullParameter(statusViewModel, "statusViewModel");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(initSet, "initSet");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f233007x = uiResources;
        this.f233008y = creditConfiguration;
        this.z = activityResultDelegate;
        this.A = creditApplicationRouter;
        this.B = navigator;
    }

    @Override // qc0.y0
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void N(f view) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        super.N(view);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        CreditBackendFlowContract$Configuration creditBackendFlowContract$Configuration = this.f233008y;
        ((CreditBackendFlowActivity) view).G0 = new AnalyticsContext(v7.m(creditBackendFlowContract$Configuration.e, companion));
        boolean zContains = v.k(j1.MORTGAGE, j1.REFINANCING_MORTGAGE, j1.CREDIT_CARD).contains(creditBackendFlowContract$Configuration.e.d);
        ifm.b bVar = this.f239031a;
        if (!zContains) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            r rVarJust = r.just(Integer.valueOf(this.f233007x.f22265a.getResources().getDisplayMetrics().heightPixels));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            r rVarM = w.m(rVarJust, this.f244503l.a(), ((rpi.b) this.f244507q).i);
            t tVar = new t(ref$IntRef, this, 29);
            Function1 function1K = K();
            Function0 function0J = J();
            r rVarOnErrorResumeNext = rVarM.onErrorResumeNext(new m3l.d(14, new p2i.l(new BreadcrumbException(), 20)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o9h.d(5, tVar), new o9h.d(5, function1K), new z(6, function0J));
            w.j0(bVar, cVarSubscribe);
            Intrinsics.h(cVarSubscribe);
        }
        r rVarN = this.z.N(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        h hVar = new h(this, 1);
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarN.onErrorResumeNext(new m3l.d(14, new p2i.l(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o9h.d(5, hVar), new o9h.d(5, function1K2), new z(6, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
    }

    @Override // qc0.y0, qc0.i
    public final void d() {
        if (this.f233008y.e.f66896j && ((Stack) this.f244502j.r0().get()).contains("STEP_RESULT")) {
            return;
        }
        super.d();
    }
}
