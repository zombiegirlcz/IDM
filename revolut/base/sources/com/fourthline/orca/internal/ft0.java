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
public final class ft0 implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final it0 f28659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dv0 f28660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28661c;
    private final Lazy d;

    public ft0(it0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f28659a = flowConfig;
        this.f28661c = "NavigationDestination.QesFlow::class.java";
        this.d = yhm.j.b(new ul1(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(ft0 ft0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(734913921, i, -1, "com.fourthline.orca.qes.internal.QesFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (QesFlow.kt:67)");
        }
        dv0 dv0Var = ft0Var.f28660b;
        if (dv0Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        u00.c(dv0Var, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(ft0 ft0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(73324448, i, -1, "com.fourthline.orca.qes.internal.QesFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (QesFlow.kt:71)");
        }
        dv0 dv0Var = ft0Var.f28660b;
        if (dv0Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        u00.b(dv0Var, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public it0 d() {
        return this.f28659a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public oy b() {
        return (oy) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new mp1(this, 6);
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f28661c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jt0 a(ft0 ft0Var) {
        dv0 dv0Var = ft0Var.f28660b;
        if (dv0Var != null) {
            return dv0Var.h();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(ft0 ft0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-913695483, i, -1, "com.fourthline.orca.qes.internal.QesFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (QesFlow.kt:51)");
        }
        dv0 dv0Var = ft0Var.f28660b;
        if (dv0Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        u00.b(dv0Var, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(ft0 ft0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1575284956, i, -1, "com.fourthline.orca.qes.internal.QesFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (QesFlow.kt:55)");
        }
        dv0 dv0Var = ft0Var.f28660b;
        if (dv0Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        u00.e(dv0Var, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(ft0 ft0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2058092867, i, -1, "com.fourthline.orca.qes.internal.QesFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (QesFlow.kt:59)");
        }
        dv0 dv0Var = ft0Var.f28660b;
        if (dv0Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        u00.d(dv0Var, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(ft0 ft0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1396503394, i, -1, "com.fourthline.orca.qes.internal.QesFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (QesFlow.kt:63)");
        }
        dv0 dv0Var = ft0Var.f28660b;
        if (dv0Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        u00.a(dv0Var, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof hy) {
            this.f28660b = iy.b((hy) orcaSubcomponent).a(new lt0(d())).build();
        } else {
            wz.a("Qes is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final ft0 ft0Var, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        final int i = 0;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.u.b.f32320b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-287968868, true, new oim.n(ft0Var) { // from class: com.fourthline.orca.internal.am1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ft0 f26846b;

            {
                this.f26846b = ft0Var;
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
                        return ft0.a(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return ft0.b(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return ft0.c(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return ft0.d(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return ft0.e(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 5:
                        return ft0.f(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return ft0.g(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i2 = 1;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.u.c.f32322b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-913695483, true, new oim.n(ft0Var) { // from class: com.fourthline.orca.internal.am1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ft0 f26846b;

            {
                this.f26846b = ft0Var;
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
                        return ft0.a(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return ft0.b(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return ft0.c(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return ft0.d(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return ft0.e(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 5:
                        return ft0.f(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return ft0.g(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i3 = 2;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.u.e.f32326b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1575284956, true, new oim.n(ft0Var) { // from class: com.fourthline.orca.internal.am1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ft0 f26846b;

            {
                this.f26846b = ft0Var;
            }

            @Override // oim.n
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i22 = i3;
                AnimatedContentScope animatedContentScope = (AnimatedContentScope) obj2;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                Composer composer = (Composer) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                switch (i22) {
                    case 0:
                        return ft0.a(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return ft0.b(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return ft0.c(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return ft0.d(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return ft0.e(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 5:
                        return ft0.f(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return ft0.g(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i5 = 3;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.u.f(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2058092867, true, new oim.n(ft0Var) { // from class: com.fourthline.orca.internal.am1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ft0 f26846b;

            {
                this.f26846b = ft0Var;
            }

            @Override // oim.n
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i22 = i5;
                AnimatedContentScope animatedContentScope = (AnimatedContentScope) obj2;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                Composer composer = (Composer) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                switch (i22) {
                    case 0:
                        return ft0.a(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return ft0.b(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return ft0.c(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return ft0.d(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return ft0.e(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 5:
                        return ft0.f(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return ft0.g(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i6 = 4;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.u.a(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1396503394, true, new oim.n(ft0Var) { // from class: com.fourthline.orca.internal.am1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ft0 f26846b;

            {
                this.f26846b = ft0Var;
            }

            @Override // oim.n
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i22 = i6;
                AnimatedContentScope animatedContentScope = (AnimatedContentScope) obj2;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                Composer composer = (Composer) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                switch (i22) {
                    case 0:
                        return ft0.a(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return ft0.b(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return ft0.c(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return ft0.d(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return ft0.e(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 5:
                        return ft0.f(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return ft0.g(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i21 = 5;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.u.d.f32324b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(734913921, true, new oim.n(ft0Var) { // from class: com.fourthline.orca.internal.am1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ft0 f26846b;

            {
                this.f26846b = ft0Var;
            }

            @Override // oim.n
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i22 = i21;
                AnimatedContentScope animatedContentScope = (AnimatedContentScope) obj2;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                Composer composer = (Composer) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                switch (i22) {
                    case 0:
                        return ft0.a(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return ft0.b(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return ft0.c(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return ft0.d(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return ft0.e(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 5:
                        return ft0.f(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return ft0.g(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i22 = 6;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.u.g.f32330b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(73324448, true, new oim.n(ft0Var) { // from class: com.fourthline.orca.internal.am1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ft0 f26846b;

            {
                this.f26846b = ft0Var;
            }

            @Override // oim.n
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i222 = i22;
                AnimatedContentScope animatedContentScope = (AnimatedContentScope) obj2;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                Composer composer = (Composer) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                switch (i222) {
                    case 0:
                        return ft0.a(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return ft0.b(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return ft0.c(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return ft0.d(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return ft0.e(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 5:
                        return ft0.f(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return ft0.g(this.f26846b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ft0 ft0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-287968868, i, -1, "com.fourthline.orca.qes.internal.QesFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (QesFlow.kt:47)");
        }
        dv0 dv0Var = ft0Var.f28660b;
        if (dv0Var != null) {
            u00.a(dv0Var, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
