package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.content.NavBackStackEntry;
import androidx.content.NavGraphBuilder;
import androidx.content.compose.NavGraphBuilderKt;
import com.fourthline.orca.internal.d8;
import com.fourthline.orca.internal.q80;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class k01 implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n01 f30086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c11 f30087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30088c;
    private final Lazy d;

    public k01(n01 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f30086a = flowConfig;
        this.f30088c = "NavigationDestination.SelfieFlow::class.java";
        this.d = yhm.j.b(new mo1(this, 1));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n01 d() {
        return this.f30086a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof hy) {
            this.f30087b = ((hy) orcaSubcomponent).w().a(new s01(d())).build();
        } else {
            wz.a("Selfie is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.fourthline.orca.internal.mh0
    public oy b() {
        return (oy) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new mp1(this, 16);
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f30088c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q01 b(k01 k01Var) {
        c11 c11Var = k01Var.f30087b;
        if (c11Var != null) {
            return c11Var.a();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(k01 k01Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1241507606, i, -1, "com.fourthline.orca.kyc.internal.flow.selfie.SelfieFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (SelfieFlow.kt:56)");
        }
        c11 c11Var = k01Var.f30087b;
        if (c11Var != null) {
            v00.b(c11Var, it8, k01Var.d(), composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final k01 k01Var, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Lazy lazyB = yhm.j.b(new mo1(k01Var, 0));
        final int i = 0;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.w.a.f32334b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-630960798, true, new oim.n(k01Var) { // from class: com.fourthline.orca.internal.no1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k01 f31464b;

            {
                this.f31464b = k01Var;
            }

            @Override // oim.n
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i2 = i;
                AnimatedContentScope animatedContentScope = (AnimatedContentScope) obj2;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                Composer composer = (Composer) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                switch (i2) {
                    case 0:
                        return k01.a(this.f31464b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return k01.b(this.f31464b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.w.b(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-379203445, true, new lk1(k01Var, lazyB, 1)), 254, null);
        final int i2 = 1;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.w.c(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1241507606, true, new oim.n(k01Var) { // from class: com.fourthline.orca.internal.no1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k01 f31464b;

            {
                this.f31464b = k01Var;
            }

            @Override // oim.n
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i22 = i2;
                AnimatedContentScope animatedContentScope = (AnimatedContentScope) obj2;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                Composer composer = (Composer) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                switch (i22) {
                    case 0:
                        return k01.a(this.f31464b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return k01.b(this.f31464b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        return Unit.f186387a;
    }

    private static final d8 a(Lazy lazy) {
        return (d8) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d8 a(k01 k01Var) {
        c11 c11Var = k01Var.f30087b;
        if (c11Var != null) {
            d8.a aVarD = c11Var.d();
            c11 c11Var2 = k01Var.f30087b;
            if (c11Var2 != null) {
                return aVarD.a(c11Var2.e()).build();
            }
            Intrinsics.r("subComponent");
            throw null;
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(k01 k01Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-630960798, i, -1, "com.fourthline.orca.kyc.internal.flow.selfie.SelfieFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (SelfieFlow.kt:48)");
        }
        c11 c11Var = k01Var.f30087b;
        if (c11Var != null) {
            v00.a(c11Var, it8, k01Var.d(), composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(k01 k01Var, Lazy lazy, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-379203445, i, -1, "com.fourthline.orca.kyc.internal.flow.selfie.SelfieFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (SelfieFlow.kt:52)");
        }
        v00.a(a(lazy), it8, k01Var.d(), composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }
}
