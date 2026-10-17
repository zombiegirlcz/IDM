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
public final class zm0 implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final an0 f35638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dn0 f35639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35640c;
    private final Lazy d;

    public zm0(an0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f35638a = flowConfig;
        this.f35640c = "NavigationDestination.PoAFlow::class.java";
        this.d = yhm.j.b(new ht1(this, 16));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public an0 d() {
        return this.f35638a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f35640c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bn0 a(zm0 zm0Var) {
        dn0 dn0Var = zm0Var.f35639b;
        if (dn0Var != null) {
            return dn0Var.d();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(zm0 zm0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1152003867, i, -1, "com.fourthline.orca.kyc.internal.flow.poa.PoAFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (PoAFlow.kt:58)");
        }
        dn0 dn0Var = zm0Var.f35639b;
        if (dn0Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        t00.a(dn0Var, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(zm0 zm0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(267268060, i, -1, "com.fourthline.orca.kyc.internal.flow.poa.PoAFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (PoAFlow.kt:62)");
        }
        dn0 dn0Var = zm0Var.f35639b;
        if (dn0Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        t00.e(dn0Var, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public oy b() {
        return (oy) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new ss1(this, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(zm0 zm0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1373491815, i, -1, "com.fourthline.orca.kyc.internal.flow.poa.PoAFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (PoAFlow.kt:50)");
        }
        dn0 dn0Var = zm0Var.f35639b;
        if (dn0Var != null) {
            t00.c(dn0Var, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(zm0 zm0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2036739674, i, -1, "com.fourthline.orca.kyc.internal.flow.poa.PoAFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (PoAFlow.kt:54)");
        }
        dn0 dn0Var = zm0Var.f35639b;
        if (dn0Var != null) {
            t00.b(dn0Var, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof hy) {
            this.f35639b = ((hy) orcaSubcomponent).u().a(new hn0(d())).a(new ho0(d())).build();
        } else {
            wz.a("Proof of Address is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final zm0 zm0Var, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        final int i = 0;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.t.b.f32310b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(909546210, true, new oim.n(zm0Var) { // from class: com.fourthline.orca.internal.wt1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ zm0 f34793b;

            {
                this.f34793b = zm0Var;
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
                        return zm0.a(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return zm0.b(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return zm0.c(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return zm0.d(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return zm0.e(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i2 = 1;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.t.a.f32308b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1373491815, true, new oim.n(zm0Var) { // from class: com.fourthline.orca.internal.wt1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ zm0 f34793b;

            {
                this.f34793b = zm0Var;
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
                        return zm0.a(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return zm0.b(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return zm0.c(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return zm0.d(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return zm0.e(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i3 = 2;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.t.d(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2036739674, true, new oim.n(zm0Var) { // from class: com.fourthline.orca.internal.wt1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ zm0 f34793b;

            {
                this.f34793b = zm0Var;
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
                        return zm0.a(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return zm0.b(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return zm0.c(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return zm0.d(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return zm0.e(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i5 = 3;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.t.c(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1152003867, true, new oim.n(zm0Var) { // from class: com.fourthline.orca.internal.wt1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ zm0 f34793b;

            {
                this.f34793b = zm0Var;
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
                        return zm0.a(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return zm0.b(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return zm0.c(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return zm0.d(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return zm0.e(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i6 = 4;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.t.e(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(267268060, true, new oim.n(zm0Var) { // from class: com.fourthline.orca.internal.wt1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ zm0 f34793b;

            {
                this.f34793b = zm0Var;
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
                        return zm0.a(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return zm0.b(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return zm0.c(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return zm0.d(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return zm0.e(this.f34793b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zm0 zm0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(909546210, i, -1, "com.fourthline.orca.kyc.internal.flow.poa.PoAFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (PoAFlow.kt:46)");
        }
        dn0 dn0Var = zm0Var.f35639b;
        if (dn0Var != null) {
            t00.d(dn0Var, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
