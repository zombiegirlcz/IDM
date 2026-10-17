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
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class w00 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(d8 d8Var, int i, Composer composer, int i2) {
        a(d8Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(d8 subcomponent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-868987469);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-868987469, i2, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.navigation.SelfieScannerDestination (graph.kt:18)");
            }
            composerStartRestartGroup.startReplaceGroup(-1873297937);
            ViewModelStoreOwner viewModelStoreOwnerA = subcomponent.a();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ps1(subcomponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            m21 m21Var = (m21) ((vj0) new ViewModelProvider(viewModelStoreOwnerA).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(m21.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            c21 c21Var = (c21) nq0.a(m21Var.g(), composerStartRestartGroup, 0);
            Flow flowA = m21Var.f().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(m21Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(m21Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            k21.a(m21Var, c21Var, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new al1(subcomponent, i, 11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m21 a(d8 d8Var) {
        return d8Var.d();
    }
}
