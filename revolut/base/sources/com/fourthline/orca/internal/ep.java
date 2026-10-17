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
public final class ep implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dj f28216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gq f28217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28218c;
    private final Lazy d;

    public ep(dj flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f28216a = flowConfig;
        this.f28218c = "NavigationDestination.DocumentSelectionFlow::class.java";
        this.d = yhm.j.b(new gj1(this, 24));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dj d() {
        return this.f28216a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public oy b() {
        return (oy) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new mp1(this, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gp a(ep epVar) {
        gq gqVar = epVar.f28217b;
        if (gqVar != null) {
            return gqVar.b();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(ep epVar, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-840937062, i, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.DocumentSelectionFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentSelectionFlow.kt:50)");
        }
        gq gqVar = epVar.f28217b;
        if (gqVar == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        m00.a(gqVar, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(ep epVar, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(341295673, i, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.DocumentSelectionFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentSelectionFlow.kt:54)");
        }
        gq gqVar = epVar.f28217b;
        if (gqVar == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        m00.c(gqVar, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(ep epVar, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1523528408, i, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.DocumentSelectionFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentSelectionFlow.kt:58)");
        }
        gq gqVar = epVar.f28217b;
        if (gqVar == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        m00.d(gqVar, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f28218c;
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof hy) {
            this.f28217b = ((hy) orcaSubcomponent).B().a(new hp(d())).build();
        } else {
            wz.a("DocumentSelection is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final ep epVar, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        final int i = 0;
        r80.a(navGraphBuilder, q80.i.b.f32262b.c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2097809905, true, new oim.n(epVar) { // from class: com.fourthline.orca.internal.pl1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ep f31996b;

            {
                this.f31996b = epVar;
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
                        return ep.a(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return ep.b(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return ep.c(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return ep.d(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        final int i2 = 1;
        r80.a(navGraphBuilder, new q80.i.a(null, 1, null).c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-840937062, true, new oim.n(epVar) { // from class: com.fourthline.orca.internal.pl1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ep f31996b;

            {
                this.f31996b = epVar;
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
                        return ep.a(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return ep.b(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return ep.c(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return ep.d(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        final int i3 = 2;
        r80.a(navGraphBuilder, new q80.i.c(null, 1, null).c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(341295673, true, new oim.n(epVar) { // from class: com.fourthline.orca.internal.pl1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ep f31996b;

            {
                this.f31996b = epVar;
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
                        return ep.a(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return ep.b(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return ep.c(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return ep.d(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        final int i5 = 3;
        r80.a(navGraphBuilder, q80.i.d.f32266b.c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1523528408, true, new oim.n(epVar) { // from class: com.fourthline.orca.internal.pl1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ep f31996b;

            {
                this.f31996b = epVar;
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
                        return ep.a(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return ep.b(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return ep.c(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return ep.d(this.f31996b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ep epVar, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2097809905, i, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.DocumentSelectionFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentSelectionFlow.kt:46)");
        }
        gq gqVar = epVar.f28217b;
        if (gqVar != null) {
            m00.b(gqVar, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
