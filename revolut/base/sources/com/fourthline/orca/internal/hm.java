package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.view.compose.BackHandlerKt;
import com.fourthline.orca.internal.bm;
import com.fourthline.orca.internal.cm;
import com.fourthline.orca.internal.m80;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class hm {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f29330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SoftwareKeyboardController f29331c;
        final /* synthetic */ FocusManager d;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.hm$a$a, reason: collision with other inner class name */
        public static final class C0211a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f29332a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f29333b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SoftwareKeyboardController f29334c;
            final /* synthetic */ FocusManager d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0211a(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Continuation continuation) {
                super(2, continuation);
                this.f29334c = softwareKeyboardController;
                this.d = focusManager;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(bm bmVar, Continuation continuation) {
                return ((C0211a) create(bmVar, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0211a c0211a = new C0211a(this.f29334c, this.d, continuation);
                c0211a.f29333b = obj2;
                return c0211a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                bm bmVar = (bm) this.f29333b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f29332a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (bmVar instanceof bm.b) {
                    SoftwareKeyboardController softwareKeyboardController = this.f29334c;
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                    }
                } else if (bmVar instanceof bm.d) {
                    SoftwareKeyboardController softwareKeyboardController2 = this.f29334c;
                    if (softwareKeyboardController2 != null) {
                        softwareKeyboardController2.show();
                    }
                } else {
                    if (!(bmVar instanceof bm.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a30.a(this.d);
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Continuation continuation) {
            super(2, continuation);
            this.f29330b = flow;
            this.f29331c = softwareKeyboardController;
            this.d = focusManager;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f29330b, this.f29331c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f29329a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f29330b;
                if (flow != null) {
                    C0211a c0211a = new C0211a(this.f29331c, this.d, null);
                    this.f29329a = 1;
                    if (wz.a(flow, c0211a, this) == aVar) {
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
        int f29335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f29336b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f29336b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f29336b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f29335a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f29336b.invoke(cm.i.f27513a);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(fm fmVar, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        a(fmVar, flow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, boolean z) {
        function1.invoke(new cm.c(dm.f27818a, z));
        return Unit.f186387a;
    }

    public static final void a(fm state, Flow flow, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1683271988);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-1683271988, i2, -1, "com.fourthline.orca.kyc.internal.flow.person.screens.nationality.DocumentNationalityScreen (DocumentNationalityScreen.kt:45)");
            }
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new lj1(12, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            Unit unit = Unit.f186387a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(flow, softwareKeyboardController, focusManager, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1055711809, true, new dk1(state, onEventSent, focusManager, 1), composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(1578376961);
            m80.b bVarP = state.p();
            boolean z3 = i3 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new li1(29, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            l80 l80Var = new l80(bVarP, (Function1) objRememberedValue3);
            m80.a aVarQ = state.q();
            boolean z4 = i3 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new mn1(0, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            n80 n80Var = new n80(l80Var, new l80(aVarQ, (Function1) objRememberedValue4), false, 4, null);
            composerStartRestartGroup.endReplaceGroup();
            ri0.a("nationality", strC, null, composableLambdaRememberComposableLambda, null, n80Var, null, false, null, composerStartRestartGroup, 3078, 468);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(state, flow, onEventSent, i, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        function1.invoke(new cm.j(dm.f27818a, value));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(cm.a.f27504a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(cm.a.f27504a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(fm fmVar, Function1 function1, FocusManager focusManager, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1055711809, i, -1, "com.fourthline.orca.kyc.internal.flow.person.screens.nationality.DocumentNationalityScreen.<anonymous> (DocumentNationalityScreen.kt:67)");
            }
            r2 r2VarO = fmVar.o();
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new li1(24, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new li1(25, function1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function13 = (Function1) objRememberedValue2;
            boolean zChanged3 = composer.changed(function1);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new li1(26, function1);
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function14 = (Function1) objRememberedValue3;
            boolean zChanged4 = composer.changed(function1) | composer.changedInstance(focusManager);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new ln1(function1, focusManager, 0);
                composer.updateRememberedValue(objRememberedValue4);
            }
            o2.a(r2VarO, "nationality", function12, function13, function14, (Function0) objRememberedValue4, composer, 48, 0);
            s20 s20VarN = fmVar.n();
            l20 state = s20VarN.getState();
            r20 format = s20VarN.getFormat();
            String text = s20VarN.getText();
            String strC = d81.c(s20VarN.getTitle(), composer, 0);
            String strC2 = d81.c(s20VarN.e(), composer, 0);
            String strC3 = d81.c(s20VarN.b(), composer, 0);
            z10 z10VarF = s20VarN.f();
            String strA = t20.a(s20VarN, composer, 0);
            String strB = t20.b(s20VarN, composer, 0);
            q20 q20Var = q20.i;
            boolean zChanged5 = composer.changed(function1);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new li1(27, function1);
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function1 function15 = (Function1) objRememberedValue5;
            boolean zChanged6 = composer.changed(function1);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new li1(28, function1);
                composer.updateRememberedValue(objRememberedValue6);
            }
            a30.a(null, "birthplace", format, state, text, strC, null, strC2, false, function15, 0, strC3, z10VarF, (Function1) objRememberedValue6, false, null, null, q20Var, null, strA, strB, null, composer, 48, 12582912, 0, 2475329);
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
            function1.invoke(cm.e.f27509a);
        } else {
            function1.invoke(cm.f.f27510a);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        function1.invoke(new cm.d(value));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, a01 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        function1.invoke(new cm.g(item));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, FocusManager focusManager) {
        function1.invoke(cm.b.f27505a);
        focusManager.clearFocus(true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(cm.h.f27512a);
        return Unit.f186387a;
    }
}
