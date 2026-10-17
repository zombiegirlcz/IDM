package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.content.NavBackStackEntry;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class o00 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, jm.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/person/screens/nationality/DocumentNationalityContract$Event;)V");
        }

        public final void a(cm p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((jm) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((cm) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public b(Object obj2) {
            super(1, 0, xl0.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/person/screens/personal_details/PersonalDetailsContract$Event;)V");
        }

        public final void a(ql0 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((xl0) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((ql0) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bl0 bl0Var, int i, Composer composer, int i2) {
        a(bl0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xl0 b(bl0 bl0Var) {
        return bl0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bl0 bl0Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        a(bl0Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(bl0 subcomponent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1247439398);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1247439398, i2, -1, "com.fourthline.orca.kyc.internal.flow.person.navigation.DocumentNationalityDestination (graph.kt:21)");
            }
            composerStartRestartGroup.startReplaceGroup(493390632);
            ViewModelStoreOwner viewModelStoreOwnerA = subcomponent.a();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new hq1(subcomponent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            jm jmVar = (jm) ((vj0) new ViewModelProvider(viewModelStoreOwnerA).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(jm.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            fm fmVar = (fm) nq0.a(jmVar.b(), composerStartRestartGroup, 0);
            Flow flowA = jmVar.a().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(jmVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(jmVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            hm.a(fmVar, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new al1(subcomponent, i, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jm a(bl0 bl0Var) {
        return bl0Var.d();
    }

    public static final void a(bl0 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-166863043);
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
                ComposerKt.traceEventStart(-166863043, i2, -1, "com.fourthline.orca.kyc.internal.flow.person.navigation.PersonalDetailsDestination (graph.kt:37)");
            }
            composerStartRestartGroup.startReplaceGroup(-1441588650);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new hq1(subcomponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            xl0 xl0Var = (xl0) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(xl0.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            sl0 sl0Var = (sl0) nq0.a(xl0Var.b(), composerStartRestartGroup, 0);
            Flow flowA = xl0Var.a().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(xl0Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new b(xl0Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            vl0.a(sl0Var, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(subcomponent, backStackEntry, i, 11));
        }
    }
}
