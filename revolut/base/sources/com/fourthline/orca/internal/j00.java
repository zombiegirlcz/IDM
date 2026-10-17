package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.content.NavBackStackEntry;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class j00 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, u3.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/bav/internal/screens/capture/BavCaptureSepaContract$Event;)V");
        }

        public final void a(o3 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((u3) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((o3) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public b(Object obj2) {
            super(1, 0, e40.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/intro/IntroContract$Event;)V");
        }

        public final void a(r30 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((e40) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((r30) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
        public c(Object obj2) {
            super(1, 0, t6.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/bav/internal/screens/status/BavStatusContract$Event;)V");
        }

        public final void a(m6 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((t6) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((m6) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
        public d(Object obj2) {
            super(1, 0, ob1.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/screen/type/TypeSelectContract$Event;)V");
        }

        public final void a(fb1 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ob1) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((fb1) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(d5 d5Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        a(d5Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(d5 d5Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        b(d5Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(d5 d5Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        c(d5Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(d5 d5Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        d(d5Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(d5 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1215759703);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(backStackEntry) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1215759703, i2, -1, "com.fourthline.orca.bav.internal.navigation.BavCaptureDestination (graph.kt:58)");
            }
            composerStartRestartGroup.startReplaceGroup(-113964639);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xn1(subcomponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            u3 u3Var = (u3) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(u3.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            p3 p3Var = (p3) nq0.a(u3Var.c(), composerStartRestartGroup, 0);
            Flow flowA = u3Var.b().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(u3Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(u3Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            s3.a(p3Var, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yn1(subcomponent, backStackEntry, i, 1));
        }
    }

    public static final void b(d5 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1939915633);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(backStackEntry) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1939915633, i2, -1, "com.fourthline.orca.bav.internal.navigation.BavIntroDestination (graph.kt:27)");
            }
            composerStartRestartGroup.startReplaceGroup(-243110959);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xn1(subcomponent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            e40 e40Var = (e40) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a("Bav".concat(e40.class.getName()), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            s30 s30Var = (s30) nq0.a(e40Var.b(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(e40Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new b(e40Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            z30.a(s30Var, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yn1(subcomponent, backStackEntry, i, 2));
        }
    }

    public static final void c(d5 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1382838457);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(backStackEntry) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1382838457, i2, -1, "com.fourthline.orca.bav.internal.navigation.BavStatusDestination (graph.kt:74)");
            }
            composerStartRestartGroup.startReplaceGroup(-1762857478);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xn1(subcomponent, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            t6 t6Var = (t6) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(t6.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            o6 o6Var = (o6) nq0.a(t6Var.d(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(t6Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new c(t6Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            r6.a(o6Var, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yn1(subcomponent, backStackEntry, i, 3));
        }
    }

    public static final void d(d5 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1321318193);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(backStackEntry) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1321318193, i2, -1, "com.fourthline.orca.bav.internal.navigation.BavTypeDestination (graph.kt:42)");
            }
            composerStartRestartGroup.startReplaceGroup(1523542742);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xn1(subcomponent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ob1 ob1Var = (ob1) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a("Bav".concat(ob1.class.getName()), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            gb1 gb1Var = (gb1) nq0.a(ob1Var.a(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(ob1Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new d(ob1Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mb1.a(gb1Var, (Function1) ((KFunction) objRememberedValue2), "bav_type", composerStartRestartGroup, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yn1(subcomponent, backStackEntry, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e40 b(d5 d5Var) {
        return d5Var.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t6 c(d5 d5Var) {
        return d5Var.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ob1 d(d5 d5Var) {
        return d5Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u3 a(d5 d5Var) {
        return d5Var.c();
    }
}
