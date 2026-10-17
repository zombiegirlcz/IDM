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
public final class vb0 implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xb0 f34288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pc0 f34289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34290c;
    private final Lazy d;

    public vb0(xb0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f34288a = flowConfig;
        this.f34290c = "NavigationDestination.NfcCanFlow::class.java";
        this.d = yhm.j.b(new xr1(this, 18));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xb0 d() {
        return this.f34288a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public oy b() {
        return (oy) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new ss1(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yb0 a(vb0 vb0Var) {
        pc0 pc0Var = vb0Var.f34289b;
        if (pc0Var != null) {
            return pc0Var.d();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(vb0 vb0Var, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(961052320, i, -1, "com.fourthline.orca.kyc.internal.flow.nfc_can.NfcCanFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (NfcCanFlow.kt:46)");
        }
        pc0 pc0Var = vb0Var.f34289b;
        if (pc0Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        r00.b(pc0Var, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(vb0 vb0Var, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-572895, i, -1, "com.fourthline.orca.kyc.internal.flow.nfc_can.NfcCanFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (NfcCanFlow.kt:49)");
        }
        pc0 pc0Var = vb0Var.f34289b;
        if (pc0Var == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        r00.c(pc0Var, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f34290c;
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof hy) {
            this.f34289b = ((hy) orcaSubcomponent).z().a(new zb0(d())).build();
        } else {
            wz.a("NfcCan is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final vb0 vb0Var, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        final int i = 0;
        r80.a(navGraphBuilder, q80.q.a.f32292b.c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(806896489, true, new oim.n(vb0Var) { // from class: com.fourthline.orca.internal.ts1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ vb0 f33864b;

            {
                this.f33864b = vb0Var;
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
                        return vb0.a(this.f33864b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return vb0.b(this.f33864b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return vb0.c(this.f33864b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        final int i2 = 1;
        r80.a(navGraphBuilder, new q80.q.b(null, 1, null).c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(961052320, true, new oim.n(vb0Var) { // from class: com.fourthline.orca.internal.ts1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ vb0 f33864b;

            {
                this.f33864b = vb0Var;
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
                        return vb0.a(this.f33864b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return vb0.b(this.f33864b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return vb0.c(this.f33864b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        final int i3 = 2;
        r80.a(navGraphBuilder, new q80.q.c(null, 1, null).c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-572895, true, new oim.n(vb0Var) { // from class: com.fourthline.orca.internal.ts1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ vb0 f33864b;

            {
                this.f33864b = vb0Var;
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
                        return vb0.a(this.f33864b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return vb0.b(this.f33864b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return vb0.c(this.f33864b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(vb0 vb0Var, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(806896489, i, -1, "com.fourthline.orca.kyc.internal.flow.nfc_can.NfcCanFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (NfcCanFlow.kt:43)");
        }
        pc0 pc0Var = vb0Var.f34289b;
        if (pc0Var != null) {
            r00.a(pc0Var, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
