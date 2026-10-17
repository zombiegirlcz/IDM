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
public abstract class u00 {

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, fs0.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/qes/internal/screens/agreements/QesAgreementsContract$Event;)V");
        }

        public final void a(rr0 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((fs0) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((rr0) obj2);
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

    public static final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
        public d(Object obj2) {
            super(1, 0, xv0.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/qes/internal/screens/pdf/QesPdfRendererContract$Event;)V");
        }

        public final void a(rv0 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((xv0) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((rv0) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function1 {
        public e(Object obj2) {
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

    public static final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function1 {
        public f(Object obj2) {
            super(1, 0, bx0.class, obj2, "handleEvents", "handleEvents(Lcom/fourthline/orca/qes/internal/screens/sign/QesSignContract$Event;)V");
        }

        public final void a(pw0 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((bx0) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((pw0) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class g extends kotlin.jvm.internal.q implements Function1 {
        public g(Object obj2) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(dv0 dv0Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        a(dv0Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(dv0 dv0Var, int i, Composer composer, int i2) {
        b(dv0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(dv0 dv0Var, int i, Composer composer, int i2) {
        c(dv0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(dv0 dv0Var, int i, Composer composer, int i2) {
        d(dv0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(dv0 dv0Var, int i, Composer composer, int i2) {
        e(dv0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(dv0 dv0Var, int i, Composer composer, int i2) {
        a(dv0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(dv0 dv0Var, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        b(dv0Var, navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f70 c(dv0 dv0Var) {
        return dv0Var.b();
    }

    public static final void d(dv0 subcomponent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1773422247);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1773422247, i2, -1, "com.fourthline.orca.qes.internal.navigation.QesSelfieScannerDestination (graph.kt:75)");
            }
            composerStartRestartGroup.startReplaceGroup(843241493);
            ViewModelStoreOwner viewModelStoreOwnerA = subcomponent.a();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new is1(subcomponent, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            m21 m21Var = (m21) ((vj0) new ViewModelProvider(viewModelStoreOwnerA).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(m21.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            c21 c21Var = (c21) nq0.a(m21Var.g(), composerStartRestartGroup, 0);
            Flow flowA = m21Var.f().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(m21Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new e(m21Var);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new js1(subcomponent, i, 2));
        }
    }

    public static final void e(dv0 subcomponent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-609822748);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-609822748, i2, -1, "com.fourthline.orca.qes.internal.navigation.SelfieIntroductionDestination (graph.kt:61)");
            }
            composerStartRestartGroup.startReplaceGroup(-1924104226);
            ViewModelStoreOwner viewModelStoreOwnerA = subcomponent.a();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new is1(subcomponent, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            m11 m11Var = (m11) ((vj0) new ViewModelProvider(viewModelStoreOwnerA).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(m11.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            i11 i11Var = (i11) nq0.a(m11Var.a(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(m11Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new g(m11Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            k11.a(i11Var, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new js1(subcomponent, i, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bx0 f(dv0 dv0Var) {
        return dv0Var.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m11 g(dv0 dv0Var) {
        return dv0Var.c();
    }

    public static final void a(dv0 subcomponent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-640712241);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-640712241, i2, -1, "com.fourthline.orca.qes.internal.navigation.QesIntroDestination (graph.kt:32)");
            }
            composerStartRestartGroup.startReplaceGroup(-1544135722);
            ViewModelStoreOwner viewModelStoreOwnerA = subcomponent.a();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new is1(subcomponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            e40 e40Var = (e40) ((vj0) new ViewModelProvider(viewModelStoreOwnerA).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a("qes".concat(e40.class.getName()), (Function0) objRememberedValue);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new js1(subcomponent, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e40 b(dv0 dv0Var) {
        return dv0Var.g();
    }

    public static final void c(dv0 subcomponent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1035208120);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035208120, i2, -1, "com.fourthline.orca.qes.internal.navigation.QesPdfRendererDestination (graph.kt:106)");
            }
            composerStartRestartGroup.startReplaceGroup(-1597405035);
            ViewModelStoreOwner viewModelStoreOwnerA = subcomponent.a();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new is1(subcomponent, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            xv0 xv0Var = (xv0) ((vj0) new ViewModelProvider(viewModelStoreOwnerA).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(xv0.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            sv0 sv0Var = (sv0) nq0.a(xv0Var.b(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(xv0Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new d(xv0Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            vv0.a(sv0Var, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new js1(subcomponent, i, 3));
        }
    }

    public static final void b(dv0 subcomponent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-597615124);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-597615124, i2, -1, "com.fourthline.orca.qes.internal.navigation.QesLocationScannerDestination (graph.kt:46)");
            }
            composerStartRestartGroup.startReplaceGroup(1217487978);
            ViewModelStoreOwner viewModelStoreOwnerA = subcomponent.a();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new is1(subcomponent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            f70 f70Var = (f70) ((vj0) new ViewModelProvider(viewModelStoreOwnerA).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(f70.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            b70 b70Var = (b70) nq0.a(f70Var.d(), composerStartRestartGroup, 0);
            Flow flowA = f70Var.c().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(f70Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new c(f70Var);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new js1(subcomponent, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m21 e(dv0 dv0Var) {
        return dv0Var.d();
    }

    public static final void a(dv0 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(287548102);
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
                ComposerKt.traceEventStart(287548102, i2, -1, "com.fourthline.orca.qes.internal.navigation.QesAgreementsDestination (graph.kt:92)");
            }
            composerStartRestartGroup.startReplaceGroup(1455824573);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new is1(subcomponent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            fs0 fs0Var = (fs0) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(fs0.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            tr0 tr0Var = (tr0) nq0.a(fs0Var.b(), composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(fs0Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(fs0Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ds0.b(tr0Var, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ks1(subcomponent, backStackEntry, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xv0 d(dv0 dv0Var) {
        return dv0Var.i();
    }

    public static final void b(dv0 subcomponent, NavBackStackEntry backStackEntry, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1685176422);
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
                ComposerKt.traceEventStart(-1685176422, i2, -1, "com.fourthline.orca.qes.internal.navigation.QesSignDestination (graph.kt:121)");
            }
            composerStartRestartGroup.startReplaceGroup(-251865845);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new is1(subcomponent, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            bx0 bx0Var = (bx0) ((vj0) new ViewModelProvider(backStackEntry).get(kotlin.jvm.internal.o0.f186429a.b(vj0.class))).a(bx0.class.getName(), (Function0) objRememberedValue);
            composerStartRestartGroup.endReplaceGroup();
            rw0 rw0Var = (rw0) nq0.a(bx0Var.c(), composerStartRestartGroup, 0);
            Flow flowA = bx0Var.b().a();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(bx0Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new f(bx0Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            zw0.a(rw0Var, flowA, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ks1(subcomponent, backStackEntry, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 a(dv0 dv0Var) {
        return dv0Var.f();
    }
}
