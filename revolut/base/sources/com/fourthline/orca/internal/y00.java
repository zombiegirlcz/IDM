package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: classes23.dex */
public abstract class y00 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, dg1.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/workflow/internal/screens/loading/WorkflowLoadingContract$Event;)V");
        }

        public final void a(wf1 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((dg1) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((wf1) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(rf1 rf1Var, int i, Composer composer, int i2) {
        a(rf1Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(rf1 subcomponent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1583037201);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1583037201, i2, -1, "com.fourthline.orca.workflow.internal.navigation.WorkflowLoadingDestination (graph.kt:33)");
            }
            composerStartRestartGroup.startReplaceGroup(880331695);
            ViewModelStoreOwner viewModelStoreOwnerA = subcomponent.a();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ht1(subcomponent, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            dg1 dg1Var = (dg1) ((vj0) new ViewModelProvider(viewModelStoreOwnerA).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(dg1.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(dg1Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(dg1Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            bg1.a((Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new al1(subcomponent, i, 13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dg1 a(rf1 rf1Var) {
        return rf1Var.b();
    }
}
