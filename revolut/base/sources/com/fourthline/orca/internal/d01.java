package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.content.NavBackStackEntry;
import androidx.content.NavGraphBuilder;
import androidx.content.compose.NavGraphBuilderKt;
import com.fourthline.orca.internal.l01;
import com.fourthline.orca.internal.q80;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d01 implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v11 f27615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n21 f27616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27617c;
    private final Lazy d;

    public d01(v11 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f27615a = flowConfig;
        this.f27617c = "NavigationDestination.Selfie::class.java";
        this.d = yhm.j.b(new pk1(this, 0));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v11 d() {
        return this.f27615a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        n21 n21Var = orcaSubcomponent instanceof n21 ? (n21) orcaSubcomponent : null;
        if (n21Var != null) {
            this.f27616b = n21Var;
        } else {
            wz.a("Selfie Component is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.fourthline.orca.internal.mh0
    public oy b() {
        return (oy) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new mp1(this, 3);
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f27617c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n31 b(d01 d01Var) {
        n21 n21Var = d01Var.f27616b;
        if (n21Var != null) {
            return n21Var.b();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(d01 d01Var, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.v.a(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-608845269, true, new qk1(yhm.j.b(new pk1(d01Var, 1)), 0)), 254, null);
        return Unit.f186387a;
    }

    private static final d8 a(Lazy lazy) {
        return (d8) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d8 a(d01 d01Var) {
        n21 n21Var = d01Var.f27616b;
        if (n21Var != null) {
            return n21Var.l().a(new t41(new l01.b(null, 1, null))).build();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Lazy lazy, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-608845269, i, -1, "com.fourthline.orca.selfie.internal.SelfieComponentFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (SelfieComponentFlow.kt:45)");
        }
        w00.a(a(lazy), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }
}
