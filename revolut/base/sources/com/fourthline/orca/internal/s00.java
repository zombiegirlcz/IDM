package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.content.NavBackStackEntry;
import androidx.lifecycle.ViewModelProvider;
import com.fourthline.nfc.ExtraNfcScannerConfig;
import com.fourthline.nfc.NfcScannerConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class s00 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, we0.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/nfc/screens/nfc_intro/NfcIntroContract$Event;)V");
        }

        public final void a(me0 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((we0) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((me0) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public b(Object obj2) {
            super(1, 0, qf0.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/nfc/scanner/NfcScannerContract$Event;)V");
        }

        public final void a(cf0 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((qf0) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((cf0) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
        public c(Object obj2) {
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
    public static final Unit a(ge0 ge0Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        a(ge0Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(ge0 ge0Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        b(ge0Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(ge0 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(774363612);
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
                ComposerKt.traceEventStart(774363612, i2, -1, "com.fourthline.orca.kyc.internal.flow.nfc.navigation.NfcIntroDestination (graph.kt:24)");
            }
            composerStartRestartGroup.startReplaceGroup(1134094094);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new bs1(subcomponent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            we0 we0Var = (we0) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(we0.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            qe0 qe0Var = (qe0) nq0.a(we0Var.d(), composerStartRestartGroup, 0);
            Flow flowA = we0Var.b().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(we0Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(we0Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ue0.a(qe0Var, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new as1(subcomponent, backStackEntry, i, 1));
        }
    }

    public static final void b(ge0 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(122097738);
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
                ComposerKt.traceEventStart(122097738, i2, -1, "com.fourthline.orca.kyc.internal.flow.nfc.navigation.NfcScannerDestination (graph.kt:40)");
            }
            composerStartRestartGroup.startReplaceGroup(1371814526);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new bs1(subcomponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            qf0 qf0Var = (qf0) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(qf0.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            NfcScannerConfig config = qf0Var.getConfig();
            ExtraNfcScannerConfig extraNfcScannerConfigC = qf0Var.c();
            ff0 ff0Var = (ff0) nq0.a(qf0Var.d(), composerStartRestartGroup, 0);
            Flow flowA = qf0Var.b().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(qf0Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new b(qf0Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            jf0.a(ff0Var, config, extraNfcScannerConfigC, qf0Var, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, (NfcScannerConfig.$stable << 3) | (ExtraNfcScannerConfig.$stable << 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new as1(subcomponent, backStackEntry, i, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(ge0 ge0Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        c(ge0Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void c(ge0 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(354039762);
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
                ComposerKt.traceEventStart(354039762, i2, -1, "com.fourthline.orca.kyc.internal.flow.nfc.navigation.UploadDataDestination (graph.kt:61)");
            }
            hc1 hc1VarBuild = subcomponent.b().build();
            composerStartRestartGroup.startReplaceGroup(929803196);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(hc1VarBuild);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new aq1(hc1VarBuild, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            lc1 lc1Var = (lc1) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(lc1.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            yb1 yb1Var = (yb1) nq0.a(lc1Var.a(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(lc1Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new c(lc1Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            jc1.a(yb1Var, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new as1(subcomponent, backStackEntry, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final we0 a(ge0 ge0Var) {
        return ge0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lc1 a(hc1 hc1Var) {
        return hc1Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qf0 b(ge0 ge0Var) {
        return ge0Var.a();
    }
}
