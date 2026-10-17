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
public abstract class q00 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, f70.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/kyc/internal/flow/location/scanner/LocationScannerContract$Event;)V");
        }

        public final void a(z60 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((f70) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((z60) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(s60 s60Var, int i, Composer composer, int i2) {
        a(s60Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(s60 subcomponent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1152363970);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1152363970, i2, -1, "com.fourthline.orca.kyc.internal.flow.location.navigation.LocationScannerDestination (graph.kt:19)");
            }
            composerStartRestartGroup.startReplaceGroup(679791740);
            ViewModelStoreOwner viewModelStoreOwnerA = subcomponent.a();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ko1(subcomponent, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            f70 f70Var = (f70) ((vj0) new ViewModelProvider(viewModelStoreOwnerA).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(f70.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            b70 b70Var = (b70) nq0.a(f70Var.d(), composerStartRestartGroup, 0);
            Flow flowA = f70Var.c().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(f70Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(f70Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            d70.a(b70Var, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new al1(subcomponent, i, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f70 a(s60 s60Var) {
        return s60Var.b();
    }
}
