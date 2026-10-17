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
public final class po implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qo f32008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xk f32009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32010c;
    private final Lazy d;

    public po(qo flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f32008a = flowConfig;
        this.f32010c = "NavigationDestination.DocumentFlow::class.java";
        this.d = yhm.j.b(new er1(this, 1));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qo d() {
        return this.f32008a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public oy b() {
        return (oy) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fj b(po poVar) {
        xk xkVar = poVar.f32009b;
        if (xkVar != null) {
            return xkVar.e();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof hy) {
            this.f32009b = ((hy) orcaSubcomponent).e().a(new rj(d())).build();
        } else {
            wz.a("DocumentScanner is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new mp1(this, 20);
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f32010c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Lazy lazy, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(156216968, i, -1, "com.fourthline.orca.kyc.internal.flow.document.DocumentScannerFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentScannerFlow.kt:56)");
        }
        l00.b(a(lazy), it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(po poVar, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1679979590, i, -1, "com.fourthline.orca.kyc.internal.flow.document.DocumentScannerFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentScannerFlow.kt:64)");
        }
        xk xkVar = poVar.f32009b;
        if (xkVar != null) {
            n00.c(xkVar, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(po poVar, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(918098279, i, -1, "com.fourthline.orca.kyc.internal.flow.document.DocumentScannerFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentScannerFlow.kt:60)");
        }
        xk xkVar = poVar.f32009b;
        if (xkVar != null) {
            n00.b(xkVar, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final po poVar, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Lazy lazyB = yhm.j.b(new er1(poVar, 0));
        r80.a(navGraphBuilder, new q80.h.b(null, 1, null).c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1122588736, true, new qk1(lazyB, 3)), 126, null);
        final int i = 0;
        r80.a(navGraphBuilder, new q80.h.a(null, 1, null).c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-605664343, true, new oim.n(poVar) { // from class: com.fourthline.orca.internal.fr1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ po f28624b;

            {
                this.f28624b = poVar;
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
                        return po.a(this.f28624b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return po.b(this.f28624b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return po.c(this.f28624b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        r80.a(navGraphBuilder, new q80.h.d(null, 1, null).c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(156216968, true, new qk1(lazyB, 4)), 126, null);
        final int i2 = 1;
        r80.a(navGraphBuilder, q80.h.c.f32254b.c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(918098279, true, new oim.n(poVar) { // from class: com.fourthline.orca.internal.fr1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ po f28624b;

            {
                this.f28624b = poVar;
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
                        return po.a(this.f28624b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return po.b(this.f28624b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return po.c(this.f28624b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        final int i3 = 2;
        r80.a(navGraphBuilder, new q80.h.e(null, 1, null).c(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1679979590, true, new oim.n(poVar) { // from class: com.fourthline.orca.internal.fr1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ po f28624b;

            {
                this.f28624b = poVar;
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
                        return po.a(this.f28624b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return po.b(this.f28624b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return po.c(this.f28624b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 126, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eo a(po poVar) {
        xk xkVar = poVar.f32009b;
        if (xkVar != null) {
            return xkVar.c().build();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    private static final eo a(Lazy lazy) {
        return (eo) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Lazy lazy, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1122588736, i, -1, "com.fourthline.orca.kyc.internal.flow.document.DocumentScannerFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentScannerFlow.kt:48)");
        }
        l00.a(a(lazy), it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(po poVar, AnimatedContentScope screenComposable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenComposable, "$this$screenComposable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-605664343, i, -1, "com.fourthline.orca.kyc.internal.flow.document.DocumentScannerFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentScannerFlow.kt:52)");
        }
        xk xkVar = poVar.f32009b;
        if (xkVar != null) {
            n00.a(xkVar, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
