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
public abstract class p00 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, os.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/nfc_can/screens/can_number/NfcCanNumberContract$Event;)V");
        }

        public final void a(sc0 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((os) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((sc0) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public b(Object obj2) {
            super(1, 0, hz.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/eid/flow/FlowSelectionContract$Event;)V");
        }

        public final void a(yy p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((hz) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((yy) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
        public c(Object obj2) {
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

    public static final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
        public d(Object obj2) {
            super(1, 0, jv.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/nfc/scanner/NfcScannerContract$Event;)V");
        }

        public final void a(cf0 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((jv) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((cf0) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function1 {
        public e(Object obj2) {
            super(1, 0, mu.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/eid/pin/EidPinContract$Event;)V");
        }

        public final void a(au p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((mu) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((au) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function1 {
        public f(Object obj2) {
            super(1, 0, aw.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/capabilities/upload/screens/upload/UploadDataContract$Event;)V");
        }

        public final void a(wb1 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((aw) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((wb1) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(nt ntVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        a(ntVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(nt ntVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        b(ntVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(nt ntVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        c(ntVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(nt ntVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        d(ntVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(nt ntVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        e(ntVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(nt ntVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        f(ntVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(nt subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(1275089252);
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
                ComposerKt.traceEventStart(1275089252, i2, -1, "com.fourthline.orca.kyc.internal.flow.eid.navigation.EidCanNumberDestination (graph.kt:59)");
            }
            composerStartRestartGroup.startReplaceGroup(1295097242);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xq1(subcomponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            os osVar = (os) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(os.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            vc0 vc0Var = (vc0) nq0.a(osVar.a(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(osVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(osVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            wc0.a(vc0Var, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yq1(subcomponent, backStackEntry, i, 0));
        }
    }

    public static final void b(nt subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-794362433);
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
                ComposerKt.traceEventStart(-794362433, i2, -1, "com.fourthline.orca.kyc.internal.flow.eid.navigation.EidFlowSelectionDestination (graph.kt:44)");
            }
            composerStartRestartGroup.startReplaceGroup(1121886166);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xq1(subcomponent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            hz hzVar = (hz) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(hz.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            az azVar = (az) nq0.a(hzVar.a(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(hzVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new b(hzVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            fz.a(azVar, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yq1(subcomponent, backStackEntry, i, 2));
        }
    }

    public static final void c(nt subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1233267695);
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
                ComposerKt.traceEventStart(-1233267695, i2, -1, "com.fourthline.orca.kyc.internal.flow.eid.navigation.EidIntroDestination (graph.kt:29)");
            }
            composerStartRestartGroup.startReplaceGroup(240724691);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xq1(subcomponent, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            e40 e40Var = (e40) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a("eid".concat(e40.class.getName()), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            s30 s30Var = (s30) nq0.a(e40Var.b(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(e40Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new c(e40Var);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new yq1(subcomponent, backStackEntry, i, 5));
        }
    }

    public static final void d(nt subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-297904718);
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
                ComposerKt.traceEventStart(-297904718, i2, -1, "com.fourthline.orca.kyc.internal.flow.eid.navigation.EidNfcDestination (graph.kt:90)");
            }
            composerStartRestartGroup.startReplaceGroup(1476380002);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xq1(subcomponent, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            jv jvVar = (jv) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(jv.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            ff0 ff0Var = (ff0) nq0.a(jvVar.c(), composerStartRestartGroup, 0);
            Flow flowA = jvVar.b().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(jvVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new d(jvVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            hv.a(ff0Var, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yq1(subcomponent, backStackEntry, i, 3));
        }
    }

    public static final void e(nt subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1750071800);
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
                ComposerKt.traceEventStart(-1750071800, i2, -1, "com.fourthline.orca.kyc.internal.flow.eid.navigation.EidPinDestination (graph.kt:74)");
            }
            composerStartRestartGroup.startReplaceGroup(1808185272);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xq1(subcomponent, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mu muVar = (mu) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(mu.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            bu buVar = (bu) nq0.a(muVar.b(), composerStartRestartGroup, 0);
            Flow flowA = muVar.a().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(muVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new e(muVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ku.a(buVar, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yq1(subcomponent, backStackEntry, i, 4));
        }
    }

    public static final void f(nt subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(1588962808);
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
                ComposerKt.traceEventStart(1588962808, i2, -1, "com.fourthline.orca.kyc.internal.flow.eid.navigation.EidUploadDestination (graph.kt:106)");
            }
            composerStartRestartGroup.startReplaceGroup(-2015093653);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xq1(subcomponent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            aw awVar = (aw) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(aw.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            yb1 yb1Var = (yb1) nq0.a(awVar.c(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(awVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new f(awVar);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new yq1(subcomponent, backStackEntry, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final os a(nt ntVar) {
        return ntVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hz b(nt ntVar) {
        return ntVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e40 c(nt ntVar) {
        return ntVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aw f(nt ntVar) {
        return ntVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jv d(nt ntVar) {
        return ntVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu e(nt ntVar) {
        return ntVar.b();
    }
}
