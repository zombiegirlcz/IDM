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

/* JADX INFO: loaded from: classes23.dex */
public abstract class n00 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, qi.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/document/screens/details/DocumentDetailsContract$Event;)V");
        }

        public final void a(ii p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((qi) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((ii) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public b(Object obj2) {
            super(1, 0, in.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/document/screens/document_ready/DocumentReadyContract$Event;)V");
        }

        public final void a(cn p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((in) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((cn) obj2);
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
    public static final Unit a(xk xkVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        a(xkVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(xk xkVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        b(xkVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(xk xkVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        c(xkVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(xk subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-296881524);
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
                ComposerKt.traceEventStart(-296881524, i2, -1, "com.fourthline.orca.kyc.internal.flow.document.navigation.DocumentDetailsDestination (graph.kt:23)");
            }
            composerStartRestartGroup.startReplaceGroup(-1835297243);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new cq1(subcomponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            qi qiVar = (qi) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(qi.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            li liVar = (li) nq0.a(qiVar.c(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(qiVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(qiVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ni.a(liVar, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bq1(subcomponent, backStackEntry, i, 2));
        }
    }

    public static final void b(xk subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(1935323723);
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
                ComposerKt.traceEventStart(1935323723, i2, -1, "com.fourthline.orca.kyc.internal.flow.document.navigation.DocumentReadyDestination (graph.kt:38)");
            }
            composerStartRestartGroup.startReplaceGroup(125264290);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new cq1(subcomponent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            in inVar = (in) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(in.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            dn dnVar = (dn) nq0.a(inVar.a(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(inVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new b(inVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            gn.a(dnVar, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bq1(subcomponent, backStackEntry, i, 1));
        }
    }

    public static final void c(xk subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1755482036);
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
                ComposerKt.traceEventStart(-1755482036, i2, -1, "com.fourthline.orca.kyc.internal.flow.document.navigation.UploadDataDestination (graph.kt:52)");
            }
            hc1 hc1VarBuild = subcomponent.b().build();
            composerStartRestartGroup.startReplaceGroup(903919190);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(hc1VarBuild);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new aq1(hc1VarBuild, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new bq1(subcomponent, backStackEntry, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qi a(xk xkVar) {
        return xkVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final in b(xk xkVar) {
        return xkVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lc1 a(hc1 hc1Var) {
        return hc1Var.a();
    }
}
