package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.content.NavBackStackEntry;
import androidx.content.NavGraphBuilder;
import androidx.content.compose.NavGraphBuilderKt;
import com.fourthline.orca.internal.q80;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b60 implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e60 f27003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s60 f27004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27005c;
    private final Lazy d;

    public b60(e60 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f27003a = flowConfig;
        this.f27005c = "NavigationDestination.LocationFlow::class.java";
        this.d = yhm.j.b(new gj1(this, 7));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e60 d() {
        return this.f27003a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f27005c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f60 a(b60 b60Var) {
        s60 s60Var = b60Var.f27004b;
        if (s60Var != null) {
            return s60Var.c();
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
        return new mp1(this, 1);
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof hy) {
            this.f27004b = ((hy) orcaSubcomponent).f().a(new g60(d())).build();
        } else {
            wz.a("Location is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(b60 b60Var, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.n.a.f32286b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-584553387, true, new kj1(b60Var, 0)), 254, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(b60 b60Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584553387, i, -1, "com.fourthline.orca.kyc.internal.flow.location.LocationFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (LocationFlow.kt:40)");
        }
        s60 s60Var = b60Var.f27004b;
        if (s60Var != null) {
            q00.a(s60Var, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
