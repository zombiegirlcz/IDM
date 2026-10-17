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
public final class k0 implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f30083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b1 f30084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30085c;
    private final Lazy d;

    public k0(n0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f30083a = flowConfig;
        this.f30085c = "NavigationDestination.AddressFlow::class.java";
        this.d = yhm.j.b(new ko1(this, 4));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n0 d() {
        return this.f30083a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f30085c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 a(k0 k0Var) {
        b1 b1Var = k0Var.f30084b;
        if (b1Var != null) {
            return b1Var.b();
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
        return new mp1(this, 15);
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof hy) {
            this.f30084b = ((hy) orcaSubcomponent).r().a(new p0(d())).build();
        } else {
            wz.a("Address is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(k0 k0Var, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.a.C0270a.f32230b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1693631316, true, new kj1(k0Var, 1)), 254, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(k0 k0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1693631316, i, -1, "com.fourthline.orca.kyc.internal.flow.address.AddressFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (AddressFlow.kt:40)");
        }
        b1 b1Var = k0Var.f30084b;
        if (b1Var != null) {
            i00.a(b1Var, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
