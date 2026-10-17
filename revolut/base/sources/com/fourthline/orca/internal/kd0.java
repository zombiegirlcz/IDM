package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.content.NavBackStackEntry;
import androidx.content.NavGraphBuilder;
import com.fourthline.orca.internal.q80;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class kd0 implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nd0 f30204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ge0 f30205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30206c;
    private final Lazy d;

    public kd0(nd0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f30204a = flowConfig;
        this.f30206c = "NavigationDestination.NfcFlow::class.java";
        this.d = yhm.j.b(new ko1(this, 7));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public nd0 d() {
        return this.f30204a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final od0 a(kd0 kd0Var) {
        ge0 ge0Var = kd0Var.f30205b;
        if (ge0Var != null) {
            return ge0Var.d();
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
        return new mp1(this, 17);
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f30206c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(kd0 kd0Var, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1261124333, i, -1, "com.fourthline.orca.kyc.internal.flow.nfc.NfcFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (NfcFlow.kt:47)");
        }
        ge0 ge0Var = kd0Var.f30205b;
        if (ge0Var != null) {
            s00.b(ge0Var, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(kd0 kd0Var, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(376388526, i, -1, "com.fourthline.orca.kyc.internal.flow.nfc.NfcFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (NfcFlow.kt:51)");
        }
        ge0 ge0Var = kd0Var.f30205b;
        if (ge0Var != null) {
            s00.c(ge0Var, it8, composer, i & 112);
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
            this.f30205b = ((hy) orcaSubcomponent).i().a(new pd0(d())).build();
        } else {
            wz.a("Nfc is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final kd0 kd0Var, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        final int i = 0;
        r80.a(navGraphBuilder, new q80.r.a(null, 1, null).c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1151617290, true, new oim.n(kd0Var) { // from class: com.fourthline.orca.internal.yo1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kd0 f35406b;

            {
                this.f35406b = kd0Var;
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
                        return kd0.a(this.f35406b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return kd0.b(this.f35406b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return kd0.c(this.f35406b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        final int i2 = 1;
        r80.a(navGraphBuilder, new q80.r.b(null, 1, null).c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1261124333, true, new oim.n(kd0Var) { // from class: com.fourthline.orca.internal.yo1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kd0 f35406b;

            {
                this.f35406b = kd0Var;
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
                        return kd0.a(this.f35406b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return kd0.b(this.f35406b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return kd0.c(this.f35406b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        final int i3 = 2;
        r80.a(navGraphBuilder, new q80.r.c(null, 1, null).c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(376388526, true, new oim.n(kd0Var) { // from class: com.fourthline.orca.internal.yo1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kd0 f35406b;

            {
                this.f35406b = kd0Var;
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
                        return kd0.a(this.f35406b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return kd0.b(this.f35406b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return kd0.c(this.f35406b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(kd0 kd0Var, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1151617290, i, -1, "com.fourthline.orca.kyc.internal.flow.nfc.NfcFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (NfcFlow.kt:43)");
        }
        ge0 ge0Var = kd0Var.f30205b;
        if (ge0Var != null) {
            s00.a(ge0Var, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
