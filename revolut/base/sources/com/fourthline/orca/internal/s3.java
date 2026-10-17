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
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.view.compose.BackHandlerKt;
import com.fourthline.orca.internal.k3;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.o3;
import com.fourthline.orca.internal.p3;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes23.dex */
public abstract class s3 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f32889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f32890c;
        final /* synthetic */ SoftwareKeyboardController d;
        final /* synthetic */ FocusManager e;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.s3$a$a, reason: collision with other inner class name */
        public static final class C0278a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f32891a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f32892b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SoftwareKeyboardController f32893c;
            final /* synthetic */ FocusManager d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0278a(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Continuation continuation) {
                super(2, continuation);
                this.f32893c = softwareKeyboardController;
                this.d = focusManager;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(k3 k3Var, Continuation continuation) {
                return ((C0278a) create(k3Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0278a c0278a = new C0278a(this.f32893c, this.d, continuation);
                c0278a.f32892b = obj2;
                return c0278a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                k3 k3Var = (k3) this.f32892b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f32891a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (k3Var instanceof k3.b) {
                    SoftwareKeyboardController softwareKeyboardController = this.f32893c;
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                    }
                } else if (k3Var instanceof k3.c) {
                    SoftwareKeyboardController softwareKeyboardController2 = this.f32893c;
                    if (softwareKeyboardController2 != null) {
                        softwareKeyboardController2.show();
                    }
                } else if (k3Var instanceof k3.a) {
                    a30.a(this.d);
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Flow flow, SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Continuation continuation) {
            super(2, continuation);
            this.f32889b = function1;
            this.f32890c = flow;
            this.d = softwareKeyboardController;
            this.e = focusManager;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f32889b, this.f32890c, this.d, this.e, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f32888a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f32889b.invoke(o3.e.f31555a);
                Flow flow = this.f32890c;
                if (flow != null) {
                    C0278a c0278a = new C0278a(this.d, this.e, null);
                    this.f32888a = 1;
                    if (wz.a(flow, c0278a, this) == aVar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(p3 p3Var, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        a(p3Var, flow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1) {
        function1.invoke(o3.c.f31553a);
        return Unit.f186387a;
    }

    public static final void a(p3 state, Flow flow, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2121919168);
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
                ComposerKt.traceEventStart(-2121919168, i2, -1, "com.fourthline.orca.bav.internal.screens.capture.BavCaptureScreen (BavCaptureSepaScreen.kt:44)");
            }
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp1(16, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Unit unit = Unit.f186387a;
            boolean zChangedInstance = (i3 == 256) | composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                a aVar = new a(onEventSent, flow, softwareKeyboardController, focusManager, null);
                composerStartRestartGroup.updateRememberedValue(aVar);
                objRememberedValue2 = aVar;
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(979599219, true, new dk1(state, 6, focusManager, onEventSent), composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(318009746, true, new bk1(state, onEventSent, 5), composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(945249953);
            m80.b bVarQ = state.q();
            boolean z3 = i3 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new eq1(24, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            l80 l80Var = new l80(bVarQ, (Function1) objRememberedValue3);
            m80.a aVarR = state.r();
            boolean z4 = i3 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new eq1(25, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            n80 n80Var = new n80(l80Var, new l80(aVarR, (Function1) objRememberedValue4), false, 4, null);
            composerStartRestartGroup.endReplaceGroup();
            ri0.a("bav_capture", strC, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, n80Var, null, false, null, composerStartRestartGroup, 27654, 452);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(state, flow, onEventSent, i, 10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(o3.a.f31551a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(o3.a.f31551a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(p3 p3Var, FocusManager focusManager, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(979599219, i, -1, "com.fourthline.orca.bav.internal.screens.capture.BavCaptureScreen.<anonymous> (BavCaptureSepaScreen.kt:69)");
            }
            composer.startReplaceGroup(797013541);
            s20 s20VarO = p3Var.o();
            Modifier.Companion companion = Modifier.INSTANCE;
            String strA = t20.a(s20VarO, composer, 0);
            String strB = t20.b(s20VarO, composer, 0);
            r20 format = s20VarO.getFormat();
            l20 state = s20VarO.getState();
            String text = s20VarO.getText();
            String strC = d81.c(s20VarO.getTitle(), composer, 0);
            b bVarC = s20VarO.c();
            String strC2 = d81.c(s20VarO.e(), composer, 0);
            int iD = s20VarO.d();
            String strC3 = d81.c(s20VarO.b(), composer, 0);
            z10 z10VarF = s20VarO.f();
            k5 k5Var = new k5();
            KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m3078getCharactersIUNYP9k(), (Boolean) null, 0, ImeAction.INSTANCE.m3059getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, LDSFile.EF_DG4_TAG, (DefaultConstructorMarker) null);
            boolean zChangedInstance = composer.changedInstance(focusManager);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wr1(focusManager, 10);
                composer.updateRememberedValue(objRememberedValue);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue, null, null, null, null, null, 62, null);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new eq1(22, function1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new eq1(23, function1);
                composer.updateRememberedValue(objRememberedValue3);
            }
            a30.a(companion, null, format, state, text, strC, bVarC, strC2, false, function12, iD, strC3, z10VarF, (Function1) objRememberedValue3, false, keyboardOptions, keyboardActions, null, k5Var, strA, strB, Float.valueOf(1.0f), composer, 6, 196608, 48, 147714);
            composer.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(16)), composer, 6);
            e10.a(a80.a(companion, BitmapDescriptorFactory.HUE_RED), d81.c(p3Var.n(), composer, 0), 0, 0L, (z10) null, composer, 0, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, boolean z) {
        function1.invoke(new o3.b(z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new o3.f(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(p3 p3Var, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(318009746, i, -1, "com.fourthline.orca.bav.internal.screens.capture.BavCaptureScreen.<anonymous> (BavCaptureSepaScreen.kt:109)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 8;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composer, 6);
            composer.startReplaceGroup(664690559);
            p3.a aVarP = p3Var.p();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(a80.a(companion, 2.0f), BitmapDescriptorFactory.HUE_RED, 1, null);
            String strC = d81.c(aVarP.b(), composer, 0);
            String strC2 = d81.c(aVarP.a(), composer, 0);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp1(15, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            u50.a(modifierFillMaxWidth$default, strC, strC2, null, false, true, (Function0) objRememberedValue, composer, 196608, 24);
            composer.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composer, 6);
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
        function1.invoke(o3.d.f31554a);
        return Unit.f186387a;
    }
}
