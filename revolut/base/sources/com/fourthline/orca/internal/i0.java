package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.view.compose.BackHandlerKt;
import com.fourthline.orca.internal.c0;
import com.fourthline.orca.internal.d0;
import com.fourthline.orca.internal.m80;
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

/* JADX INFO: loaded from: classes23.dex */
public abstract class i0 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f29455b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f29455b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f29455b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f29454a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f29455b.invoke(d0.i.f27607a);
            return Unit.f186387a;
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f29457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SoftwareKeyboardController f29458c;
        final /* synthetic */ FocusManager d;

        public static final class a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f29459a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f29460b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SoftwareKeyboardController f29461c;
            final /* synthetic */ FocusManager d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Continuation continuation) {
                super(2, continuation);
                this.f29461c = softwareKeyboardController;
                this.d = focusManager;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(c0 c0Var, Continuation continuation) {
                return ((a) create(c0Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                a aVar = new a(this.f29461c, this.d, continuation);
                aVar.f29460b = obj2;
                return aVar;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                c0 c0Var = (c0) this.f29460b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f29459a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (c0Var instanceof c0.b) {
                    SoftwareKeyboardController softwareKeyboardController = this.f29461c;
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                    }
                } else if (c0Var instanceof c0.d) {
                    SoftwareKeyboardController softwareKeyboardController2 = this.f29461c;
                    if (softwareKeyboardController2 != null) {
                        softwareKeyboardController2.show();
                    }
                } else if (c0Var instanceof c0.a) {
                    a30.a(this.d);
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Flow flow, SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Continuation continuation) {
            super(2, continuation);
            this.f29457b = flow;
            this.f29458c = softwareKeyboardController;
            this.d = focusManager;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f29457b, this.f29458c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f29456a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f29457b;
                if (flow != null) {
                    a aVar2 = new a(this.f29458c, this.d, null);
                    this.f29456a = 1;
                    if (wz.a(flow, aVar2, this) == aVar) {
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
    public static final Unit a(f0 f0Var, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        a(f0Var, flow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, boolean z) {
        function1.invoke(new d0.c(b0.f26948a, z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1, boolean z) {
        function1.invoke(new d0.c(b0.f26949b, z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, boolean z) {
        function1.invoke(new d0.c(b0.f26950c, z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function1 function1, boolean z) {
        function1.invoke(new d0.c(b0.d, z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1, boolean z) {
        function1.invoke(new d0.c(b0.e, z));
        return Unit.f186387a;
    }

    public static final void a(f0 state, Flow flow, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(354360142);
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
                ComposerKt.traceEventStart(354360142, i2, -1, "com.fourthline.orca.kyc.internal.flow.address.details.AddressDetailsScreen (AddressDetailsScreen.kt:61)");
            }
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Unit unit = Unit.f186387a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new b(flow, softwareKeyboardController, focusManager, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            boolean z3 = i3 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new lj1(14, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 1);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(408582779, true, new dk1(state, onEventSent, focusManager, 2), composerStartRestartGroup, 54);
            m80.b bVarP = state.p();
            boolean z4 = i3 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new mn1(10, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            l80 l80Var = new l80(bVarP, (Function1) objRememberedValue4);
            m80.a aVarN = state.n();
            boolean z6 = i3 == 256;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new mn1(11, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ri0.a("address", strC, null, composableLambdaRememberComposableLambda, null, new n80(l80Var, new l80(aVarN, (Function1) objRememberedValue5), false, 4, null), null, false, null, composerStartRestartGroup, 3078, 468);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(state, flow, onEventSent, i, 6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new d0.j(b0.f26948a, it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new d0.j(b0.f26949b, it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new d0.j(b0.f26950c, it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new d0.j(b0.d, it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new d0.j(b0.e, it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(d0.a.f27598a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(d0.a.f27598a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(f0 f0Var, Function1 function1, FocusManager focusManager, ColumnScope OrcaScreen, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        int i3 = 1;
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(408582779, i, -1, "com.fourthline.orca.kyc.internal.flow.address.details.AddressDetailsScreen.<anonymous> (AddressDetailsScreen.kt:86)");
            }
            r2 r2VarR = f0Var.r();
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            int i5 = 3;
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new mn1(i5, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            int i6 = 4;
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new mn1(i6, function1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function13 = (Function1) objRememberedValue2;
            boolean zChanged3 = composer.changed(function1);
            Object objRememberedValue3 = composer.rememberedValue();
            int i21 = 5;
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new mn1(i21, function1);
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function14 = (Function1) objRememberedValue3;
            boolean zChanged4 = composer.changed(function1) | composer.changedInstance(focusManager);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new ln1(function1, focusManager, i3);
                composer.updateRememberedValue(objRememberedValue4);
            }
            o2.a(r2VarR, (String) null, function12, function13, function14, (Function0) objRememberedValue4, composer, 0, 2);
            composer.startReplaceGroup(1806052029);
            s20 s20VarQ = f0Var.q();
            String strA = t20.a(s20VarQ, composer, 0);
            String strB = t20.b(s20VarQ, composer, 0);
            r20 format = s20VarQ.getFormat();
            l20 state = s20VarQ.getState();
            String text = s20VarQ.getText();
            String strC = d81.c(s20VarQ.getTitle(), composer, 0);
            String strC2 = d81.c(s20VarQ.e(), composer, 0);
            String strC3 = d81.c(s20VarQ.b(), composer, 0);
            z10 z10VarF = s20VarQ.f();
            boolean zChangedInstance = composer.changedInstance(focusManager);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new wr1(focusManager, 2);
                composer.updateRememberedValue(objRememberedValue5);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue5, null, null, null, null, null, 62, null);
            q20 q20Var = q20.f;
            boolean zChanged5 = composer.changed(function1);
            Object objRememberedValue6 = composer.rememberedValue();
            int i22 = 6;
            if (zChanged5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new mn1(i22, function1);
                composer.updateRememberedValue(objRememberedValue6);
            }
            Function1 function15 = (Function1) objRememberedValue6;
            boolean zChanged6 = composer.changed(function1);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new mn1(7, function1);
                composer.updateRememberedValue(objRememberedValue7);
            }
            a30.a(null, "postalCode", format, state, text, strC, null, strC2, false, function15, 0, strC3, z10VarF, (Function1) objRememberedValue7, false, null, keyboardActions, q20Var, null, strA, strB, null, composer, 48, 12582912, 0, 2409793);
            Unit unit = Unit.f186387a;
            composer.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            float f = 16;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM835spacedBy0680j_4 = Arrangement.INSTANCE.m835spacedBy0680j_4(Dp.m3297constructorimpl(f));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM835spacedBy0680j_4, companion2.getTop(), composer, 6);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composer);
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion, 0.5f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM1662constructorimpl2 = Updater.m1662constructorimpl(composer);
            Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceGroup(811263704);
            s20 s20VarT = f0Var.t();
            String strA2 = t20.a(s20VarT, composer, 0);
            String strB2 = t20.b(s20VarT, composer, 0);
            r20 format2 = s20VarT.getFormat();
            l20 state2 = s20VarT.getState();
            String text2 = s20VarT.getText();
            String strC4 = d81.c(s20VarT.getTitle(), composer, 0);
            String strC5 = d81.c(s20VarT.e(), composer, 0);
            String strC6 = d81.c(s20VarT.b(), composer, 0);
            z10 z10VarF2 = s20VarT.f();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m3093getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null);
            boolean zChangedInstance2 = composer.changedInstance(focusManager);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new wr1(focusManager, 3);
                composer.updateRememberedValue(objRememberedValue8);
            }
            KeyboardActions keyboardActions2 = new KeyboardActions((Function1) objRememberedValue8, null, null, null, null, null, 62, null);
            q20 q20Var2 = q20.d;
            boolean zChanged7 = composer.changed(function1);
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChanged7 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new mn1(8, function1);
                composer.updateRememberedValue(objRememberedValue9);
            }
            Function1 function16 = (Function1) objRememberedValue9;
            boolean zChanged8 = composer.changed(function1);
            Object objRememberedValue10 = composer.rememberedValue();
            if (zChanged8 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new mn1(9, function1);
                composer.updateRememberedValue(objRememberedValue10);
            }
            a30.a(null, "houseNumber", format2, state2, text2, strC4, null, strC5, false, function16, 0, strC6, z10VarF2, (Function1) objRememberedValue10, false, keyboardOptions, keyboardActions2, q20Var2, null, strA2, strB2, null, composer, 48, 12779520, 0, 2377025);
            composer.endReplaceGroup();
            composer.endNode();
            Modifier modifierFillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth2);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM1662constructorimpl3 = Updater.m1662constructorimpl(composer);
            Updater.m1665setimpl(composerM1662constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl3.getInserting() || !Intrinsics.f(composerM1662constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM1662constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM1662constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m1665setimpl(composerM1662constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            composer.startReplaceGroup(66414732);
            s20 s20VarU = f0Var.u();
            String strA3 = t20.a(s20VarU, composer, 0);
            String strB3 = t20.b(s20VarU, composer, 0);
            r20 format3 = s20VarU.getFormat();
            l20 state3 = s20VarU.getState();
            String text3 = s20VarU.getText();
            String strC7 = d81.c(s20VarU.getTitle(), composer, 0);
            String strC8 = d81.c(s20VarU.e(), composer, 0);
            String strC9 = d81.c(s20VarU.b(), composer, 0);
            z10 z10VarF3 = s20VarU.f();
            boolean zChangedInstance3 = composer.changedInstance(focusManager);
            Object objRememberedValue11 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue11 = new wr1(focusManager, 4);
                composer.updateRememberedValue(objRememberedValue11);
            }
            KeyboardActions keyboardActions3 = new KeyboardActions((Function1) objRememberedValue11, null, null, null, null, null, 62, null);
            q20 q20Var3 = q20.f32171g;
            boolean zChanged9 = composer.changed(function1);
            Object objRememberedValue12 = composer.rememberedValue();
            if (zChanged9 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue12 = new mn1(12, function1);
                composer.updateRememberedValue(objRememberedValue12);
            }
            Function1 function17 = (Function1) objRememberedValue12;
            boolean zChanged10 = composer.changed(function1);
            Object objRememberedValue13 = composer.rememberedValue();
            if (zChanged10 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue13 = new mn1(13, function1);
                composer.updateRememberedValue(objRememberedValue13);
            }
            a30.a(null, "suffix", format3, state3, text3, strC7, null, strC8, false, function17, 0, strC9, z10VarF3, (Function1) objRememberedValue13, false, null, keyboardActions3, q20Var3, null, strA3, strB3, null, composer, 48, 12582912, 0, 2409793);
            composer.endReplaceGroup();
            composer.endNode();
            composer.endNode();
            composer.startReplaceGroup(1806196174);
            s20 s20VarS = f0Var.s();
            String strA4 = t20.a(s20VarS, composer, 0);
            String strB4 = t20.b(s20VarS, composer, 0);
            r20 format4 = s20VarS.getFormat();
            l20 state4 = s20VarS.getState();
            String text4 = s20VarS.getText();
            String strC10 = d81.c(s20VarS.getTitle(), composer, 0);
            String strC11 = d81.c(s20VarS.e(), composer, 0);
            String strC12 = d81.c(s20VarS.b(), composer, 0);
            z10 z10VarF4 = s20VarS.f();
            boolean zChangedInstance4 = composer.changedInstance(focusManager);
            Object objRememberedValue14 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue14 = new wr1(focusManager, 5);
                composer.updateRememberedValue(objRememberedValue14);
            }
            KeyboardActions keyboardActions4 = new KeyboardActions((Function1) objRememberedValue14, null, null, null, null, null, 62, null);
            q20 q20Var4 = q20.i;
            boolean zChanged11 = composer.changed(function1);
            Object objRememberedValue15 = composer.rememberedValue();
            if (zChanged11 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue15 = new mn1(14, function1);
                composer.updateRememberedValue(objRememberedValue15);
            }
            Function1 function18 = (Function1) objRememberedValue15;
            boolean zChanged12 = composer.changed(function1);
            Object objRememberedValue16 = composer.rememberedValue();
            if (zChanged12 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue16 = new mn1(15, function1);
                composer.updateRememberedValue(objRememberedValue16);
            }
            a30.a(null, "street", format4, state4, text4, strC10, null, strC11, false, function18, 0, strC12, z10VarF4, (Function1) objRememberedValue16, false, null, keyboardActions4, q20Var4, null, strA4, strB4, null, composer, 48, 12582912, 0, 2409793);
            composer.endReplaceGroup();
            composer.startReplaceGroup(1806234054);
            s20 s20VarO = f0Var.o();
            String strA5 = t20.a(s20VarO, composer, 0);
            String strB5 = t20.b(s20VarO, composer, 0);
            r20 format5 = s20VarO.getFormat();
            l20 state5 = s20VarO.getState();
            String text5 = s20VarO.getText();
            String strC13 = d81.c(s20VarO.getTitle(), composer, 0);
            String strC14 = d81.c(s20VarO.e(), composer, 0);
            String strC15 = d81.c(s20VarO.b(), composer, 0);
            z10 z10VarF5 = s20VarO.f();
            boolean zChangedInstance5 = composer.changedInstance(focusManager);
            Object objRememberedValue17 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                i2 = 6;
                objRememberedValue17 = new wr1(focusManager, i2);
                composer.updateRememberedValue(objRememberedValue17);
            } else {
                i2 = 6;
            }
            KeyboardActions keyboardActions5 = new KeyboardActions((Function1) objRememberedValue17, null, null, null, null, null, 62, null);
            boolean zChanged13 = composer.changed(function1);
            Object objRememberedValue18 = composer.rememberedValue();
            if (zChanged13 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue18 = new mn1(16, function1);
                composer.updateRememberedValue(objRememberedValue18);
            }
            Function1 function19 = (Function1) objRememberedValue18;
            boolean zChanged14 = composer.changed(function1);
            Object objRememberedValue19 = composer.rememberedValue();
            if (zChanged14 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue19 = new mn1(17, function1);
                composer.updateRememberedValue(objRememberedValue19);
            }
            a30.a(null, "city", format5, state5, text5, strC13, null, strC14, false, function19, 0, strC15, z10VarF5, (Function1) objRememberedValue19, false, null, keyboardActions5, q20Var4, null, strA5, strB5, null, composer, 48, 12582912, 0, 2409793);
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
    public static final Unit a(Function1 function1, boolean z) {
        if (z) {
            function1.invoke(d0.e.f27603a);
        } else {
            function1.invoke(d0.f.f27604a);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        function1.invoke(new d0.d(value));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, a01 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        function1.invoke(new d0.g(item));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, FocusManager focusManager) {
        function1.invoke(d0.b.f27599a);
        focusManager.clearFocus(true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(d0.h.f27606a);
        return Unit.f186387a;
    }
}
