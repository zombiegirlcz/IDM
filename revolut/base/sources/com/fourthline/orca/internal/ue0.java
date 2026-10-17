package com.fourthline.orca.internal;

import android.content.Intent;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.view.compose.ActivityResultRegistryKt;
import androidx.view.compose.ManagedActivityResultLauncher;
import androidx.view.result.ActivityResult;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.fourthline.orca.internal.le0;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.me0;
import com.fourthline.orca.internal.qe0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ue0 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f34060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ManagedActivityResultLauncher f34061c;
        final /* synthetic */ Lazy d;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ue0$a$a, reason: collision with other inner class name */
        public static final class C0293a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34062a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34063b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ManagedActivityResultLauncher f34064c;
            final /* synthetic */ Lazy d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0293a(ManagedActivityResultLauncher managedActivityResultLauncher, Lazy lazy, Continuation continuation) {
                super(2, continuation);
                this.f34064c = managedActivityResultLauncher;
                this.d = lazy;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(le0 le0Var, Continuation continuation) {
                return ((C0293a) create(le0Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0293a c0293a = new C0293a(this.f34064c, this.d, continuation);
                c0293a.f34063b = obj2;
                return c0293a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                le0 le0Var = (le0) this.f34063b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f34062a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (!(le0Var instanceof le0.a)) {
                    if (!(le0Var instanceof le0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f34064c.launch(ue0.a(this.d));
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, ManagedActivityResultLauncher managedActivityResultLauncher, Lazy lazy, Continuation continuation) {
            super(2, continuation);
            this.f34060b = flow;
            this.f34061c = managedActivityResultLauncher;
            this.d = lazy;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f34060b, this.f34061c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f34059a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f34060b;
                if (flow != null) {
                    C0293a c0293a = new C0293a(this.f34061c, this.d, null);
                    this.f34059a = 1;
                    if (wz.a(flow, c0293a, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }
    }

    public static final class b implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f34065a;

        public b(Function1 function1) {
            this.f34065a = function1;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f34065a.invoke(me0.c.f31169a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(qe0 qe0Var, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        a(qe0Var, flow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(qe0 state, Flow flow, Function1 onEventSent, Composer composer, int i) {
        int i2;
        ComposableLambda composableLambda;
        boolean z;
        int i3;
        Unit unit;
        int i5;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-608812158);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(flow) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-608812158, i2, -1, "com.fourthline.orca.kyc.internal.flow.nfc.screens.nfc_intro.NfcIntroScreen (NfcIntroScreen.kt:66)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new nr1(22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Lazy lazyB = yhm.j.b((Function0) objRememberedValue);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            int i6 = i2 & 896;
            boolean z3 = i6 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new eq1(27, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            Unit unit2 = Unit.f186387a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(lazyB);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new a(flow, managedActivityResultLauncherRememberLauncherForActivityResult, lazyB, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(-952907022);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1681405802, true, new bk1(state, onEventSent, 6), composerStartRestartGroup, 54);
            if (state.q() != null) {
                composerStartRestartGroup.startReplaceGroup(-91304165);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(175042755, true, new dk1(state, 9, state, onEventSent), composerStartRestartGroup, 54);
                composerStartRestartGroup.endReplaceGroup();
                composableLambda = composableLambdaRememberComposableLambda2;
            } else {
                composerStartRestartGroup.startReplaceGroup(-90761107);
                composerStartRestartGroup.endReplaceGroup();
                composableLambda = null;
            }
            m80.b bVarR = state.r();
            boolean z4 = i6 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new eq1(28, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            l80 l80Var = new l80(bVarR, (Function1) objRememberedValue4);
            m80.a aVarN = state.n();
            boolean z6 = i6 == 256;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new eq1(29, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            n80 n80Var = new n80(l80Var, new l80(aVarN, (Function1) objRememberedValue5), false, 4, null);
            qe0.a aVarO = state.o();
            if (aVarO instanceof qe0.a.C0273a) {
                composerStartRestartGroup.startReplaceGroup(-90213926);
                qe0.a.C0273a c0273a = (qe0.a.C0273a) aVarO;
                z = true;
                a40.a("nfc_intro", d81.c(state.getTitle(), composerStartRestartGroup, 0), d81.c(c0273a.a(), composerStartRestartGroup, 0), composableLambdaRememberComposableLambda, composableLambda, n80Var, c0273a.b(), 0, true, composerStartRestartGroup, 100666374, 128);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 256;
                i5 = i6;
                unit = unit2;
            } else {
                ComposableLambda composableLambda2 = composableLambda;
                z = true;
                if (!(aVarO instanceof qe0.a.b)) {
                    composerStartRestartGroup.startReplaceGroup(-1388383608);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-89670465);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                MutableState mutableState = (MutableState) objRememberedValue6;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composerStartRestartGroup);
                Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                    composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                    composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
                }
                Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
                qe0.a.b bVar = (qe0.a.b) aVarO;
                List listB = bVar.b();
                z10 z10VarA = bVar.a();
                boolean z11 = i6 == 256;
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (z11 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new ci1(onEventSent, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Function2 function2 = (Function2) objRememberedValue7;
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new qo1(mutableState, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                i3 = 256;
                unit = unit2;
                i5 = i6;
                a40.a("nfc_intro", strC, listB, z10VarA, function2, (Function0) objRememberedValue8, (Function3) null, (Function3) composableLambda2, n80Var, true, composerStartRestartGroup, 807075846, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(2090928930);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean z12 = i5 == i3 ? z : false;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new eq1(26, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue9, composerStartRestartGroup, 6);
            je0.a(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(state, flow, onEventSent, i, 13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1) {
        function1.invoke(me0.h.f31176a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(me0.a.f31167a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a() {
        return new Intent("android.settings.NFC_SETTINGS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Lazy lazy) {
        return (Intent) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, ActivityResult it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(me0.b.f31168a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(qe0 qe0Var, Function1 function1, ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1681405802, i, -1, "com.fourthline.orca.kyc.internal.flow.nfc.screens.nfc_intro.NfcIntroScreen.<anonymous>.<anonymous> (NfcIntroScreen.kt:85)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(a80.a(companion, 2.0f), BitmapDescriptorFactory.HUE_RED, 1, null);
            z10 z10VarA = qe0Var.p().a();
            String strC = d81.c(qe0Var.p().b(), composer, 0);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp1(18, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            c30.a(modifierFillMaxWidth$default, strC, z10VarA, (Function0) objRememberedValue, composer, 0, 0);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(28)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(me0.e.f31173a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(qe0 qe0Var, qe0 qe0Var2, Function1 function1, ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(175042755, i, -1, "com.fourthline.orca.kyc.internal.flow.nfc.screens.nfc_intro.NfcIntroScreen.<anonymous>.<anonymous> (NfcIntroScreen.kt:99)");
            }
            String strC = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(a80.a(Modifier.INSTANCE, 3.0f), BitmapDescriptorFactory.HUE_RED, 1, null);
            if (qe0Var.o() instanceof qe0.a.b) {
                composer.startReplaceGroup(608701690);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(712373901);
                strC = d81.c(qe0Var2.q().b(), composer, 0);
                composer.endReplaceGroup();
            }
            String strC2 = d81.c(qe0Var2.q().a(), composer, 0);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp1(17, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            u50.a(modifierFillMaxWidth$default, strC, strC2, null, false, false, (Function0) objRememberedValue, composer, 0, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(me0.f.f31174a);
        return Unit.f186387a;
    }

    private static final void a(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, int i, int i2) {
        function1.invoke(new me0.d(ib.b.Screen, i, i2));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableState mutableState) {
        a(mutableState, true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult a(Function1 function1, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        function1.invoke(me0.g.f31175a);
        return new b(function1);
    }
}
