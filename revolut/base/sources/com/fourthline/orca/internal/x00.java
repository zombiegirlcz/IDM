package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.content.NavBackStackEntry;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.fourthline.vision.document.DocumentScannerConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class x00 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, e91.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/tin/details/TinDetailsContract$Event;)V");
        }

        public final void a(t81 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((e91) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((t81) obj2);
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
            super(1, 0, dp.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/documentrecognition/screens/scanner/DocumentScannerContract$Event;)V");
        }

        public final void a(jo p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((dp) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((jo) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
        public d(Object obj2) {
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
    public static final Unit a(n91 n91Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        a(n91Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(n91 n91Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        b(n91Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(n91 n91Var, int i, Composer composer, int i2) {
        a(n91Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e40 b(n91 n91Var) {
        return n91Var.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(n91 n91Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        c(n91Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(n91 subcomponent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-520916862);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-520916862, i2, -1, "com.fourthline.orca.kyc.internal.flow.tin.navigation.TinIntroDestination (graph.kt:24)");
            }
            composerStartRestartGroup.startReplaceGroup(1910073897);
            ViewModelStoreOwner viewModelStoreOwnerA = subcomponent.a();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new et1(subcomponent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            e40 e40Var = (e40) ((vj0) new ViewModelProvider(viewModelStoreOwnerA).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a("Tin".concat(e40.class.getName()), (Function0) objRememberedValue);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new al1(subcomponent, i, 12));
        }
    }

    public static final void b(n91 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(269993848);
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
                ComposerKt.traceEventStart(269993848, i2, -1, "com.fourthline.orca.kyc.internal.flow.tin.navigation.TinScannerDestination (graph.kt:39)");
            }
            composerStartRestartGroup.startReplaceGroup(1766057153);
            eo eoVarBuild = subcomponent.c().build();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(eoVarBuild);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new dp1(eoVarBuild, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            dp dpVar = (dp) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a("Tin".concat(dp.class.getName()), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            lo loVar = (lo) nq0.a(dpVar.h(), composerStartRestartGroup, 0);
            Flow flowA = dpVar.g().a();
            DocumentScannerConfig documentScannerConfigD = dpVar.d();
            Flow flowI = dpVar.i();
            Function1 function1K = dpVar.k();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(dpVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new c(dpVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            xo.a(loVar, flowA, documentScannerConfigD, flowI, function1K, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, DocumentScannerConfig.$stable << 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ft1(subcomponent, backStackEntry, i, 2));
        }
    }

    public static final void c(n91 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1120346350);
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
                ComposerKt.traceEventStart(-1120346350, i2, -1, "com.fourthline.orca.kyc.internal.flow.tin.navigation.UploadDataDestination (graph.kt:74)");
            }
            hc1 hc1VarBuild = subcomponent.b().build();
            composerStartRestartGroup.startReplaceGroup(1383957244);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(hc1VarBuild);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new aq1(hc1VarBuild, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            lc1 lc1Var = (lc1) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(lc1.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            yb1 yb1Var = (yb1) nq0.a(lc1Var.a(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(lc1Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new d(lc1Var);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ft1(subcomponent, backStackEntry, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dp a(eo eoVar) {
        return eoVar.a();
    }

    public static final void a(n91 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(1271730612);
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
                ComposerKt.traceEventStart(1271730612, i2, -1, "com.fourthline.orca.kyc.internal.flow.tin.navigation.TinDetailsDestination (graph.kt:58)");
            }
            composerStartRestartGroup.startReplaceGroup(-1932555928);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new et1(subcomponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            e91 e91Var = (e91) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(e91.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            v81 v81Var = (v81) nq0.a(e91Var.b(), composerStartRestartGroup, 0);
            Flow flowA = e91Var.a().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(e91Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(e91Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            c91.a(v81Var, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ft1(subcomponent, backStackEntry, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e91 a(n91 n91Var) {
        return n91Var.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lc1 a(hc1 hc1Var) {
        return hc1Var.a();
    }
}
