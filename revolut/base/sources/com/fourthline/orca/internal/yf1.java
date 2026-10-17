package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.content.NavBackStackEntry;
import androidx.content.NavGraphBuilder;
import androidx.content.compose.NavGraphBuilderKt;
import com.fourthline.orca.internal.q80;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class yf1 implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ef1 f35282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rf1 f35283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35284c;
    private final Lazy d;

    public yf1(ef1 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f35282a = flowConfig;
        this.f35284c = "NavigationDestination.Workflow::class.java";
        this.d = yhm.j.b(new ht1(this, 10));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ef1 d() {
        return this.f35282a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f35284c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff1 a(yf1 yf1Var) {
        rf1 rf1Var = yf1Var.f35283b;
        if (rf1Var != null) {
            return rf1Var.c();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    @Override // com.fourthline.orca.internal.mh0
    public oy b() {
        return (oy) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new ss1(this, 7);
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof hy) {
            this.f35283b = ((hy) orcaSubcomponent).C().a(new hf1(d())).build();
            return;
        }
        throw new IllegalStateException("FL Developer Error. Workflow is not a supported Flow for subtype of OrcaSubcomponent.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(yf1 yf1Var, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.z.a.f32350b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(336828084, true, new kj1(yf1Var, 3)), 254, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(yf1 yf1Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(336828084, i, -1, "com.fourthline.orca.workflow.internal.WorkflowLoadingFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (WorkflowLoadingFlow.kt:36)");
        }
        rf1 rf1Var = yf1Var.f35283b;
        if (rf1Var != null) {
            y00.a(rf1Var, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
