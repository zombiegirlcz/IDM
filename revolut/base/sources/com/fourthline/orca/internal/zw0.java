package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.view.compose.BackHandlerKt;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.ow0;
import com.fourthline.orca.internal.pw0;
import com.fourthline.orca.internal.rw0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
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
public abstract class zw0 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f35738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SoftwareKeyboardController f35739c;
        final /* synthetic */ FocusManager d;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.zw0$a$a, reason: collision with other inner class name */
        public static final class C0323a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f35740a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f35741b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SoftwareKeyboardController f35742c;
            final /* synthetic */ FocusManager d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0323a(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Continuation continuation) {
                super(2, continuation);
                this.f35742c = softwareKeyboardController;
                this.d = focusManager;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ow0 ow0Var, Continuation continuation) {
                return ((C0323a) create(ow0Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0323a c0323a = new C0323a(this.f35742c, this.d, continuation);
                c0323a.f35741b = obj2;
                return c0323a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                ow0 ow0Var = (ow0) this.f35741b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f35740a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (!(ow0Var instanceof ow0.c)) {
                    if (ow0Var instanceof ow0.b) {
                        SoftwareKeyboardController softwareKeyboardController = this.f35742c;
                        if (softwareKeyboardController != null) {
                            softwareKeyboardController.hide();
                        }
                    } else if (ow0Var instanceof ow0.d) {
                        SoftwareKeyboardController softwareKeyboardController2 = this.f35742c;
                        if (softwareKeyboardController2 != null) {
                            softwareKeyboardController2.show();
                        }
                    } else {
                        if (!(ow0Var instanceof ow0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a30.a(this.d);
                    }
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Continuation continuation) {
            super(2, continuation);
            this.f35738b = flow;
            this.f35739c = softwareKeyboardController;
            this.d = focusManager;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f35738b, this.f35739c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f35737a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f35738b;
                if (flow != null) {
                    C0323a c0323a = new C0323a(this.f35739c, this.d, null);
                    this.f35737a = 1;
                    if (wz.a(flow, c0323a, this) == aVar) {
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

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f35744b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f35744b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f35744b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f35743a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f35744b.invoke(pw0.e.f32068a);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(rw0 rw0Var, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        a(rw0Var, flow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(final rw0 state, Flow flow, final Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1542206614);
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
                ComposerKt.traceEventStart(1542206614, i2, -1, "com.fourthline.orca.qes.internal.screens.sign.QesSignScreen (QesSignScreen.kt:59)");
            }
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Unit unit = Unit.f186387a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(flow, softwareKeyboardController, focusManager, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ot1(6, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 1);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            final int i5 = 0;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-693161085, true, new Function3() { // from class: com.fourthline.orca.internal.xt1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i6 = i5;
                    ColumnScope columnScope = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    switch (i6) {
                        case 0:
                            return zw0.a(state, onEventSent, columnScope, composer2, iIntValue);
                        default:
                            return zw0.b(state, onEventSent, columnScope, composer2, iIntValue);
                    }
                }
            }, composerStartRestartGroup, 54);
            final int i6 = 1;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-511427836, true, new Function3() { // from class: com.fourthline.orca.internal.xt1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i66 = i6;
                    ColumnScope columnScope = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    switch (i66) {
                        case 0:
                            return zw0.a(state, onEventSent, columnScope, composer2, iIntValue);
                        default:
                            return zw0.b(state, onEventSent, columnScope, composer2, iIntValue);
                    }
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(297001574);
            m80.b bVar = new m80.b(state.q(), state.r());
            boolean z3 = i3 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new jt1(15, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            l80 l80Var = new l80(bVar, (Function1) objRememberedValue3);
            m80.a.b bVar2 = new m80.a.b(state.s());
            boolean z4 = i3 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new jt1(16, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            n80 n80Var = new n80(l80Var, new l80(bVar2, (Function1) objRememberedValue4), false, 4, null);
            composerStartRestartGroup.endReplaceGroup();
            ri0.a("qes_sign", strC, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, n80Var, null, false, null, composerStartRestartGroup, 27654, 452);
            boolean z6 = i3 == 256;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new b(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(state, flow, onEventSent, i, 19));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(rw0 rw0Var, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        int i2;
        String strC;
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(OrcaScreen) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-511427836, i2, -1, "com.fourthline.orca.qes.internal.screens.sign.QesSignScreen.<anonymous> (QesSignScreen.kt:131)");
            }
            composer.startReplaceGroup(-1855875255);
            rw0.a aVarP = rw0Var.p();
            float f = rw0Var.r() ? 0.5f : 1.0f;
            boolean zE = rw0Var.r() ? false : aVarP.e();
            Integer numB = aVarP.b();
            String str = null;
            if (numB == null) {
                composer.startReplaceGroup(-132489796);
                composer.endReplaceGroup();
                strC = null;
            } else {
                composer.startReplaceGroup(-132489795);
                strC = d81.c(c81.f27404a.a(R.string.shared_timer_sign_accessibility, String.valueOf(numB.intValue())), composer, 0);
                composer.endReplaceGroup();
            }
            Modifier modifierA = a80.a(a80.a(Modifier.INSTANCE, 3.0f), strC);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new nt1(3);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierAlpha = AlphaKt.alpha(OrcaScreen.align(SizeKt.wrapContentWidth$default(SemanticsModifierKt.semantics$default(modifierA, false, (Function1) objRememberedValue, 1, null), null, false, 3, null), Alignment.INSTANCE.getCenterHorizontally()), f);
            String strC2 = d81.c(aVarP.d(), composer, 0);
            String strC3 = d81.c(aVarP.a(), composer, 0);
            Integer numB2 = aVarP.b();
            if (numB2 != null) {
                str = "(" + numB2.intValue() + ")";
            }
            boolean zChangedInstance = composer.changedInstance(rw0Var) | composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new vp1(rw0Var, function1, 13);
                composer.updateRememberedValue(objRememberedValue2);
            }
            u50.a(modifierAlpha, strC2, strC3, str, zE, false, (Function0) objRememberedValue2, composer, 0, 32);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(pw0.f.f32069a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(pw0.f.f32069a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(rw0 rw0Var, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-693161085, i, -1, "com.fourthline.orca.qes.internal.screens.sign.QesSignScreen.<anonymous> (QesSignScreen.kt:82)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            TextKt.m1281TextIbK3jfQ(d81.b(rw0Var.a(), composer, 0), a80.a(a80.a(companion, 1.0f), "messageView", (String) null, 2, (Object) null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, fj0.f28535a.b(composer, 6).getIb.b.Screen java.lang.String().getMessage().a(null, composer, 0, 1), composer, 0, 0, 131068);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(20)), composer, 6);
            composer.startReplaceGroup(-407857169);
            s20 s20VarN = rw0Var.n();
            String strA = t20.a(s20VarN, composer, 0);
            String strB = t20.b(s20VarN, composer, 0);
            r20 format = s20VarN.getFormat();
            l20 state = rw0Var.n().getState();
            String text = s20VarN.getText();
            String strC = d81.c(s20VarN.getTitle(), composer, 0);
            String strC2 = d81.c(s20VarN.e(), composer, 0);
            boolean z = kotlin.text.d0.W(s20VarN.getText()) && rw0Var.n().getState() != l20.f30509c;
            String strC3 = d81.c(rw0Var.n().b(), composer, 0);
            z10 z10VarF = s20VarN.f();
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jt1(12, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue, null, null, null, null, null, 62, null);
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new jt1(13, function1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            boolean zChanged3 = composer.changed(function1);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new jt1(14, function1);
                composer.updateRememberedValue(objRememberedValue3);
            }
            a30.a(companion, null, format, state, text, strC, null, strC2, false, function12, 0, strC3, z10VarF, (Function1) objRememberedValue3, z, null, keyboardActions, null, null, strA, strB, Float.valueOf(2.0f), composer, 100663302, 0, 48, 427074);
            composer.endReplaceGroup();
            e10.a(a80.a(companion, BitmapDescriptorFactory.HUE_RED), d81.c(rw0Var.o(), composer, 0), 0, 0L, (z10) null, composer, 0, 28);
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
        if (z) {
            function1.invoke(pw0.b.f32065a);
        } else {
            function1.invoke(pw0.c.f32066a);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new pw0.a(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        function1.invoke(pw0.c.f32066a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m2837setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m2814getPolite0phEisY());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(rw0 rw0Var, Function1 function1) {
        if (!rw0Var.r()) {
            function1.invoke(pw0.g.f32070a);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(pw0.d.f32067a);
        return Unit.f186387a;
    }
}
