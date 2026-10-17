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
public final class rs implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final us f32819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nt f32820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32821c;
    private final Lazy d;

    public rs(us flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f32819a = flowConfig;
        this.f32821c = "NavigationDestination.EidFlow::class.java";
        this.d = yhm.j.b(new xr1(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(rs rsVar, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1730687653, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.EidFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (EidFlow.kt:60)");
        }
        nt ntVar = rsVar.f32820b;
        if (ntVar == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        p00.f(ntVar, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public us d() {
        return this.f32819a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public oy b() {
        return (oy) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new mp1(this, 25);
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f32821c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ws a(rs rsVar) {
        nt ntVar = rsVar.f32820b;
        if (ntVar != null) {
            return ntVar.a();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(rs rsVar, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1808255575, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.EidFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (EidFlow.kt:48)");
        }
        nt ntVar = rsVar.f32820b;
        if (ntVar == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        p00.b(ntVar, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(rs rsVar, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(923519768, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.EidFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (EidFlow.kt:51)");
        }
        nt ntVar = rsVar.f32820b;
        if (ntVar == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        p00.e(ntVar, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(rs rsVar, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(38783961, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.EidFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (EidFlow.kt:54)");
        }
        nt ntVar = rsVar.f32820b;
        if (ntVar == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        p00.a(ntVar, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(rs rsVar, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-845951846, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.EidFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (EidFlow.kt:57)");
        }
        nt ntVar = rsVar.f32820b;
        if (ntVar == null) {
            Intrinsics.r("subComponent");
            throw null;
        }
        p00.d(ntVar, it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof hy) {
            this.f32820b = ((hy) orcaSubcomponent).n().a(new xs(d())).build();
        } else {
            wz.a("Eid is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final rs rsVar, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        final int i = 0;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.j.c.f32272b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-203673696, true, new oim.n(rsVar) { // from class: com.fourthline.orca.internal.zr1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ rs f35702b;

            {
                this.f35702b = rsVar;
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
                        return rs.a(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return rs.b(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return rs.c(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return rs.d(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return rs.e(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return rs.f(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i2 = 1;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.j.b(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1808255575, true, new oim.n(rsVar) { // from class: com.fourthline.orca.internal.zr1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ rs f35702b;

            {
                this.f35702b = rsVar;
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
                        return rs.a(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return rs.b(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return rs.c(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return rs.d(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return rs.e(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return rs.f(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i3 = 2;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.j.e(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(923519768, true, new oim.n(rsVar) { // from class: com.fourthline.orca.internal.zr1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ rs f35702b;

            {
                this.f35702b = rsVar;
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
                        return rs.a(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return rs.b(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return rs.c(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return rs.d(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return rs.e(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return rs.f(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i5 = 3;
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.j.a(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(38783961, true, new oim.n(rsVar) { // from class: com.fourthline.orca.internal.zr1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ rs f35702b;

            {
                this.f35702b = rsVar;
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
                        return rs.a(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return rs.b(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return rs.c(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return rs.d(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return rs.e(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return rs.f(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i6 = 4;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.j.d.f32274b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-845951846, true, new oim.n(rsVar) { // from class: com.fourthline.orca.internal.zr1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ rs f35702b;

            {
                this.f35702b = rsVar;
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
                        return rs.a(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return rs.b(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return rs.c(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return rs.d(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return rs.e(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return rs.f(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        final int i21 = 5;
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.j.f.f32278b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1730687653, true, new oim.n(rsVar) { // from class: com.fourthline.orca.internal.zr1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ rs f35702b;

            {
                this.f35702b = rsVar;
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
                        return rs.a(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 1:
                        return rs.b(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 2:
                        return rs.c(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 3:
                        return rs.d(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    case 4:
                        return rs.e(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                    default:
                        return rs.f(this.f35702b, animatedContentScope, navBackStackEntry, composer, iIntValue);
                }
            }
        }), 254, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(rs rsVar, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-203673696, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.EidFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (EidFlow.kt:45)");
        }
        nt ntVar = rsVar.f32820b;
        if (ntVar != null) {
            p00.c(ntVar, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
