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
public abstract class m00 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, ci.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/core/internal/composable/base_selector/BaseSelectorContract$Event;)V");
        }

        public final void a(q2 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ci) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((q2) obj2);
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
            super(1, 0, ar.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/document_selection/screens/type/DocumentTypeContract$Event;)V");
        }

        public final void a(pq p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ar) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((pq) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
        public d(Object obj2) {
            super(1, 0, sr.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/document_selection/screens/version/DocumentVersionContract$Event;)V");
        }

        public final void a(ir p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((sr) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((ir) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(gq gqVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        a(gqVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(gq gqVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        b(gqVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(gq gqVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        c(gqVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(gq gqVar, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        d(gqVar, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(gq subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(1580467043);
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
                ComposerKt.traceEventStart(1580467043, i2, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.navigation.DocumentCountryDestination (graph.kt:41)");
            }
            composerStartRestartGroup.startReplaceGroup(-1589588388);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jp1(subcomponent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ci ciVar = (ci) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(ci.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            s2 s2Var = (s2) nq0.a(ciVar.c(), composerStartRestartGroup, 0);
            Flow flowA = ciVar.b().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(ciVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(ciVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ai.a(s2Var, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kp1(subcomponent, backStackEntry, i, 2));
        }
    }

    public static final void b(gq subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(1853049561);
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
                ComposerKt.traceEventStart(1853049561, i2, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.navigation.DocumentIntroductionDestination (graph.kt:26)");
            }
            composerStartRestartGroup.startReplaceGroup(-1630792539);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jp1(subcomponent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            e40 e40Var = (e40) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a("document".concat(e40.class.getName()), (Function0) objRememberedValue);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new kp1(subcomponent, backStackEntry, i, 0));
        }
    }

    public static final void c(gq subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(897127161);
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
                ComposerKt.traceEventStart(897127161, i2, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.navigation.DocumentTypeDestination (graph.kt:57)");
            }
            composerStartRestartGroup.startReplaceGroup(-1149218897);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jp1(subcomponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ar arVar = (ar) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(ar.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            sq sqVar = (sq) nq0.a(arVar.a(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(arVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new c(arVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            yq.a(sqVar, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kp1(subcomponent, backStackEntry, i, 1));
        }
    }

    public static final void d(gq subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-605177307);
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
                ComposerKt.traceEventStart(-605177307, i2, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.navigation.DocumentVersionDestination (graph.kt:72)");
            }
            composerStartRestartGroup.startReplaceGroup(-1754800994);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jp1(subcomponent, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            sr srVar = (sr) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(sr.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            kr krVar = (kr) nq0.a(srVar.a(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(srVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new d(srVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            qr.a(krVar, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kp1(subcomponent, backStackEntry, i, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e40 b(gq gqVar) {
        return gqVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ar c(gq gqVar) {
        return gqVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sr d(gq gqVar) {
        return gqVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ci a(gq gqVar) {
        return gqVar.d();
    }
}
