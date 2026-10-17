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
public final class bk0 implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dk0 f27148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bl0 f27149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27150c;
    private final Lazy d;

    public bk0(dk0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f27148a = flowConfig;
        this.f27150c = "NavigationDestination.PersonFlow::class.java";
        this.d = yhm.j.b(new gj1(this, 9));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dk0 d() {
        return this.f27148a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ek0 a(bk0 bk0Var) {
        bl0 bl0Var = bk0Var.f27149b;
        if (bl0Var != null) {
            return bl0Var.b();
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
        return new mp1(this, 2);
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f27150c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(bk0 bk0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(412257246, i, -1, "com.fourthline.orca.kyc.internal.flow.person.PersonFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (PersonFlow.kt:45)");
        }
        bl0 bl0Var = bk0Var.f27149b;
        if (bl0Var != null) {
            o00.a(bl0Var, it8, composer, i & 112);
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
            this.f27149b = ((hy) orcaSubcomponent).v().a(new fk0(d())).build();
        } else {
            wz.a("Person is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final bk0 bk0Var, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        final int i = 0;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.s.a(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(160499893, true, new oim.n(bk0Var) { // from class: com.fourthline.orca.internal.nj1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ bk0 f31431b;

            {
                this.f31431b = bk0Var;
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
                        return bk0.a(this.f31431b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return bk0.b(this.f31431b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i2 = 1;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.s.b.f32306b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(412257246, true, new oim.n(bk0Var) { // from class: com.fourthline.orca.internal.nj1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ bk0 f31431b;

            {
                this.f31431b = bk0Var;
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
                        return bk0.a(this.f31431b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return bk0.b(this.f31431b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bk0 bk0Var, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(160499893, i, -1, "com.fourthline.orca.kyc.internal.flow.person.PersonFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (PersonFlow.kt:41)");
        }
        bl0 bl0Var = bk0Var.f27149b;
        if (bl0Var != null) {
            o00.a(bl0Var, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
