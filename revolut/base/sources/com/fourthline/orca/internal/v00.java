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
public abstract class v00 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, m11.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/selfie/intro/SelfieIntroContract$Event;)V");
        }

        public final void a(h11 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((m11) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((h11) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public b(Object obj2) {
            super(1, 0, m11.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/selfie/intro/SelfieIntroContract$Event;)V");
        }

        public final void a(h11 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((m11) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((h11) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
        public c(Object obj2) {
            super(1, 0, m21.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/biometrics/screens/scanner/SelfieScannerContract$Event;)V");
        }

        public final void a(a21 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((m21) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((a21) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
        public d(Object obj2) {
            super(1, 0, m21.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/biometrics/screens/scanner/SelfieScannerContract$Event;)V");
        }

        public final void a(a21 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((m21) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((a21) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function1 {
        public e(Object obj2) {
            super(1, 0, p7.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/upload/screens/upload/UploadDataContract$Event;)V");
        }

        public final void a(wb1 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((p7) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((wb1) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function1 {
        public f(Object obj2) {
            super(1, 0, lc1.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/upload/screens/upload/UploadDataContract$Event;)V");
        }

        public final void a(wb1 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((lc1) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((wb1) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(c11 c11Var, NavBackStackEntry navBackStackEntry, n01 n01Var, int i, Composer composer, int i2) {
        a(c11Var, navBackStackEntry, n01Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(d8 d8Var, NavBackStackEntry navBackStackEntry, n01 n01Var, int i, Composer composer, int i2) {
        a(d8Var, navBackStackEntry, n01Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(c11 c11Var, NavBackStackEntry navBackStackEntry, n01 n01Var, int i, Composer composer, int i2) {
        b(c11Var, navBackStackEntry, n01Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(c11 subcomponent, NavBackStackEntry backStackEntry, n01 flowConfig, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Composer composerStartRestartGroup = composer.startRestartGroup(1986466023);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(backStackEntry) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(flowConfig) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1986466023, i2, -1, "com.fourthline.orca.kyc.internal.flow.selfie.navigation.SelfieIntroDestination (graph.kt:32)");
            }
            composerStartRestartGroup.startReplaceGroup(2028375228);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qs1(subcomponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            m11 m11Var = (m11) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(m11.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            if (o01.a(flowConfig)) {
                composerStartRestartGroup.startReplaceGroup(-1544751634);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(m11Var);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new a(m11Var);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                r7.a((Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1544666942);
                i11 i11Var = (i11) nq0.a(m11Var.a(), composerStartRestartGroup, 0);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(m11Var);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new b(m11Var);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                k11.a(i11Var, (Function1) ((KFunction) objRememberedValue3), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rs1(subcomponent, backStackEntry, flowConfig, i, 1));
        }
    }

    public static final void b(c11 subcomponent, NavBackStackEntry backStackEntry, n01 flowConfig, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Composer composerStartRestartGroup = composer.startRestartGroup(221122922);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(backStackEntry) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(flowConfig) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(221122922, i2, -1, "com.fourthline.orca.kyc.internal.flow.selfie.navigation.UploadDataDestination (graph.kt:79)");
            }
            if (o01.a(flowConfig)) {
                composerStartRestartGroup.startReplaceGroup(-1006667429);
                composerStartRestartGroup.startReplaceGroup(2045738997);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new qs1(subcomponent, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                p7 p7Var = (p7) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(p7.class.getName(), (Function0) objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                yb1 yb1Var = (yb1) nq0.a(p7Var.a(), composerStartRestartGroup, 0);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(p7Var);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new e(p7Var);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                o7.a(yb1Var, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1006313936);
                hc1 hc1VarBuild = subcomponent.b().build();
                composerStartRestartGroup.startReplaceGroup(2045752988);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(hc1VarBuild);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new aq1(hc1VarBuild, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                lc1 lc1Var = (lc1) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(lc1.class.getName(), (Function0) objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                yb1 yb1Var2 = (yb1) nq0.a(lc1Var.a(), composerStartRestartGroup, 0);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(lc1Var);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new f(lc1Var);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                jc1.a(yb1Var2, (Function1) ((KFunction) objRememberedValue4), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rs1(subcomponent, backStackEntry, flowConfig, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m11 a(c11 c11Var) {
        return c11Var.c();
    }

    public static final void a(d8 subcomponent, NavBackStackEntry backStackEntry, n01 flowConfig, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Composer composerStartRestartGroup = composer.startRestartGroup(1214228030);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(backStackEntry) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(flowConfig) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1214228030, i2, -1, "com.fourthline.orca.kyc.internal.flow.selfie.navigation.SelfieScannerDestination (graph.kt:52)");
            }
            composerStartRestartGroup.startReplaceGroup(-1357961003);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ps1(subcomponent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            m21 m21Var = (m21) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(m21.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            if (o01.a(flowConfig)) {
                composerStartRestartGroup.startReplaceGroup(853014921);
                c21 c21Var = (c21) nq0.a(m21Var.g(), composerStartRestartGroup, 0);
                Flow flowA = m21Var.f().a();
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(m21Var);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new c(m21Var);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                q7.a(m21Var, c21Var, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(853269741);
                c21 c21Var2 = (c21) nq0.a(m21Var.g(), composerStartRestartGroup, 0);
                Flow flowA2 = m21Var.f().a();
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(m21Var);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new d(m21Var);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                k21.a(m21Var, c21Var2, flowA2, (Function1) ((KFunction) objRememberedValue3), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(subcomponent, backStackEntry, flowConfig, i, 14));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p7 b(c11 c11Var) {
        return c11Var.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m21 a(d8 d8Var) {
        return d8Var.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lc1 a(hc1 hc1Var) {
        return hc1Var.a();
    }
}
