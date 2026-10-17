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
public final class h91 implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j91 f29187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n91 f29188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29189c;
    private final Lazy d;

    public h91(j91 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f29187a = flowConfig;
        this.f29189c = "NavigationDestination.TinFlow::class.java";
        this.d = yhm.j.b(new ul1(this, 17));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j91 d() {
        return this.f29187a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public oy b() {
        return (oy) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new mp1(this, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k91 a(h91 h91Var) {
        n91 n91Var = h91Var.f29188b;
        if (n91Var != null) {
            return n91Var.f();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(h91 h91Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210724272, i, -1, "com.fourthline.orca.kyc.internal.flow.tin.TinFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (TinFlow.kt:47)");
        }
        n91 n91Var = h91Var.f29188b;
        if (n91Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        x00.b(n91Var, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(h91 h91Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2095460079, i, -1, "com.fourthline.orca.kyc.internal.flow.tin.TinFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (TinFlow.kt:51)");
        }
        n91 n91Var = h91Var.f29188b;
        if (n91Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        x00.a(n91Var, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(h91 h91Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1314771410, i, -1, "com.fourthline.orca.kyc.internal.flow.tin.TinFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (TinFlow.kt:55)");
        }
        n91 n91Var = h91Var.f29188b;
        if (n91Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        x00.c(n91Var, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f29189c;
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof hy) {
            this.f29188b = ((hy) orcaSubcomponent).d().a(new r91(d())).build();
        } else {
            wz.a("Tin is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final h91 h91Var, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        final int i = 0;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.x.b.f32342b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1072313753, true, new oim.n(h91Var) { // from class: com.fourthline.orca.internal.xm1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h91 f35047b;

            {
                this.f35047b = h91Var;
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
                        return h91.a(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return h91.b(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return h91.c(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return h91.d(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i2 = 1;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.x.c(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1210724272, true, new oim.n(h91Var) { // from class: com.fourthline.orca.internal.xm1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h91 f35047b;

            {
                this.f35047b = h91Var;
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
                        return h91.a(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return h91.b(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return h91.c(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return h91.d(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i3 = 2;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.x.a(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-2095460079, true, new oim.n(h91Var) { // from class: com.fourthline.orca.internal.xm1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h91 f35047b;

            {
                this.f35047b = h91Var;
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
                        return h91.a(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return h91.b(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return h91.c(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return h91.d(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i5 = 3;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.x.d(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1314771410, true, new oim.n(h91Var) { // from class: com.fourthline.orca.internal.xm1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h91 f35047b;

            {
                this.f35047b = h91Var;
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
                        return h91.a(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return h91.b(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return h91.c(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return h91.d(this.f35047b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(h91 h91Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1072313753, i, -1, "com.fourthline.orca.kyc.internal.flow.tin.TinFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (TinFlow.kt:43)");
        }
        n91 n91Var = h91Var.f29188b;
        if (n91Var != null) {
            x00.a(n91Var, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
