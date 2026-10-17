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
public final class z3 implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c4 f35515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d5 f35516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35517c;
    private final Lazy d;

    public z3(c4 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f35515a = flowConfig;
        this.f35517c = "NavigationDestination.BavFlow::class.java";
        this.d = yhm.j.b(new ht1(this, 12));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c4 d() {
        return this.f35515a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new ss1(this, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d4 a(z3 z3Var) {
        d5 d5Var = z3Var.f35516b;
        if (d5Var != null) {
            return d5Var.b();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(z3 z3Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1176414332, i, -1, "com.fourthline.orca.bav.internal.BavFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (BavFlow.kt:52)");
        }
        d5 d5Var = z3Var.f35516b;
        if (d5Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        j00.a(d5Var, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(z3 z3Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(514824859, i, -1, "com.fourthline.orca.bav.internal.BavFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (BavFlow.kt:56)");
        }
        d5 d5Var = z3Var.f35516b;
        if (d5Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        j00.c(d5Var, it8, composer, i & 112);
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
    public String e() {
        return this.f35517c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(z3 z3Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838003805, i, -1, "com.fourthline.orca.bav.internal.BavFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (BavFlow.kt:48)");
        }
        d5 d5Var = z3Var.f35516b;
        if (d5Var != null) {
            j00.d(d5Var, it8, composer, i & 112);
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
            this.f35516b = iy.a((hy) orcaSubcomponent).a(new e4(d())).build();
        } else {
            wz.a("Bav is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final z3 z3Var, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        final int i = 0;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.c.b.f32236b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1831236876, true, new oim.n(z3Var) { // from class: com.fourthline.orca.internal.ut1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z3 f34184b;

            {
                this.f34184b = z3Var;
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
                        return z3.a(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return z3.b(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return z3.c(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return z3.d(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i2 = 1;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.c.d.f32240b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1838003805, true, new oim.n(z3Var) { // from class: com.fourthline.orca.internal.ut1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z3 f34184b;

            {
                this.f34184b = z3Var;
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
                        return z3.a(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return z3.b(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return z3.c(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return z3.d(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i3 = 2;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.c.a.f32234b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1176414332, true, new oim.n(z3Var) { // from class: com.fourthline.orca.internal.ut1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z3 f34184b;

            {
                this.f34184b = z3Var;
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
                        return z3.a(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return z3.b(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return z3.c(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return z3.d(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i5 = 3;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.c.C0271c.f32238b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(514824859, true, new oim.n(z3Var) { // from class: com.fourthline.orca.internal.ut1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z3 f34184b;

            {
                this.f34184b = z3Var;
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
                        return z3.a(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return z3.b(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return z3.c(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return z3.d(this.f34184b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(z3 z3Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1831236876, i, -1, "com.fourthline.orca.bav.internal.BavFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (BavFlow.kt:44)");
        }
        d5 d5Var = z3Var.f35516b;
        if (d5Var != null) {
            j00.b(d5Var, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
