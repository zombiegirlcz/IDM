package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.view.compose.BackHandlerKt;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.sc0;
import com.fourthline.orca.internal.vc0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class wc0 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f34590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f34590b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f34590b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f34589a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f34590b.invoke(sc0.e.f32976a);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(s20 s20Var, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        a(s20Var, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, boolean z) {
        function1.invoke(new sc0.b(tc0.f33272a, z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(vc0 vc0Var, Function1 function1, int i, Composer composer, int i2) {
        a(vc0Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final vc0 state, final Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2072286713);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 32 : 16;
        }
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2072286713, i2, -1, "com.fourthline.orca.kyc.internal.flow.nfc_can.screens.can_number.NfcCanNumberScreen (NfcCanNumberScreen.kt:46)");
            }
            int i5 = i2 & 112;
            Object[] objArr = i5 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objArr != false || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp1(23, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            Unit unit = Unit.f186387a;
            Object[] objArr2 = i5 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            a9 a9Var = null;
            Object[] objArr3 = 0;
            if (objArr2 != false || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            final int i6 = 0;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1503940108, true, new Function3() { // from class: com.fourthline.orca.internal.vs1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i21 = i6;
                    ColumnScope columnScope = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    switch (i21) {
                        case 0:
                            return wc0.a(state, onEventSent, columnScope, composer2, iIntValue);
                        default:
                            return wc0.b(state, onEventSent, columnScope, composer2, iIntValue);
                    }
                }
            }, composerStartRestartGroup, 54);
            final int i21 = 1;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1331526027, true, new Function3() { // from class: com.fourthline.orca.internal.vs1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i212 = i21;
                    ColumnScope columnScope = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    switch (i212) {
                        case 0:
                            return wc0.a(state, onEventSent, columnScope, composer2, iIntValue);
                        default:
                            return wc0.b(state, onEventSent, columnScope, composer2, iIntValue);
                    }
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(1397338524);
            m80.b bVar = new m80.b(state.r().a());
            Object[] objArr4 = i5 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objArr4 != false || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new us1(13, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            l80 l80Var = new l80(bVar, (Function1) objRememberedValue3);
            m80.a.C0250a c0250a = new m80.a.C0250a(a9Var, i3, objArr3 == true ? 1 : 0);
            boolean z = i5 == 32;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new us1(14, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            n80 n80Var = new n80(l80Var, new l80(c0250a, (Function1) objRememberedValue4), false, 4, null);
            composerStartRestartGroup.endReplaceGroup();
            ri0.a("document_can", strC, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, n80Var, null, false, null, composerStartRestartGroup, 27654, 452);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(state, onEventSent, i, 18));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        function1.invoke(new sc0.f(tc0.f33272a, value));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(vc0 vc0Var, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1331526027, i, -1, "com.fourthline.orca.kyc.internal.flow.nfc_can.screens.can_number.NfcCanNumberScreen.<anonymous> (NfcCanNumberScreen.kt:77)");
            }
            vc0.a aVarQ = vc0Var.q();
            if (aVarQ == null) {
                composer.startReplaceGroup(826122341);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(826122342);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                String strC = d81.c(aVarQ.b(), composer, 0);
                String strC2 = d81.c(aVarQ.a(), composer, 0);
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new qp1(22, function1);
                    composer.updateRememberedValue(objRememberedValue);
                }
                u50.a(modifierFillMaxWidth$default, strC, strC2, null, false, false, (Function0) objRememberedValue, composer, 6, 56);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1) {
        function1.invoke(sc0.c.f32974a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(sc0.a.f32971a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(sc0.a.f32971a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(vc0 vc0Var, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1503940108, i, -1, "com.fourthline.orca.kyc.internal.flow.nfc_can.screens.can_number.NfcCanNumberScreen.<anonymous> (NfcCanNumberScreen.kt:59)");
            }
            s20 s20VarP = vc0Var.p();
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new us1(11, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new us1(12, function1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            a(s20VarP, function12, (Function1) objRememberedValue2, composer, 0);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(Modifier.INSTANCE, Dp.m3297constructorimpl(16)), composer, 6);
            e10.a((Modifier) null, d81.c(vc0Var.o(), composer, 0), 0, 0L, vc0Var.n(), composer, 0, 13);
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
        function1.invoke(sc0.d.f32975a);
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void a(s20 s20Var, Function1 function1, Function1 function12, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(178797277);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(s20Var) : composerStartRestartGroup.changedInstance(s20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(178797277, i2, -1, "com.fourthline.orca.kyc.internal.flow.nfc_can.screens.can_number.Input (NfcCanNumberScreen.kt:110)");
            }
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            String strA = t20.a(s20Var, composerStartRestartGroup, 0);
            String strB = t20.b(s20Var, composerStartRestartGroup, 0);
            r20 format = s20Var.getFormat();
            l20 state = s20Var.getState();
            String text = s20Var.getText();
            String strC = d81.c(s20Var.getTitle(), composerStartRestartGroup, 0);
            String strC2 = d81.c(s20Var.e(), composerStartRestartGroup, 0);
            String strC3 = d81.c(s20Var.b(), composerStartRestartGroup, 0);
            z10 z10VarF = s20Var.f();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wr1(focusManager, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue, null, null, null, null, null, 62, null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) (0 == true ? 1 : 0), KeyboardType.INSTANCE.m3093getNumberPjHm6EE(), 0, (PlatformImeOptions) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (LocaleList) null, 123, (DefaultConstructorMarker) null);
            q20 q20Var = q20.d;
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new us1(15, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function13 = (Function1) objRememberedValue2;
            boolean z3 = (i2 & 896) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new us1(16, function12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composer2 = composerStartRestartGroup;
            a30.a(null, null, format, state, text, strC, null, strC2, false, function13, 0, strC3, z10VarF, (Function1) objRememberedValue3, false, keyboardOptions, keyboardActions, q20Var, null, strA, strB, null, composer2, 0, 12779520, 0, 2377027);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1((Object) s20Var, function1, (Object) function12, i, 17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(it8);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        return Unit.f186387a;
    }
}
