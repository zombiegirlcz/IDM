package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
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
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import com.fourthline.core.Gender;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.pl0;
import com.fourthline.orca.internal.ql0;
import com.fourthline.orca.internal.sl0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes23.dex */
public abstract class vl0 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f34393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f34394c;
        final /* synthetic */ FocusManager d;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vl0$a$a, reason: collision with other inner class name */
        public static final class C0299a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34395a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34396b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FocusManager f34397c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0299a(FocusManager focusManager, Continuation continuation) {
                super(2, continuation);
                this.f34397c = focusManager;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(pl0 pl0Var, Continuation continuation) {
                return ((C0299a) create(pl0Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0299a c0299a = new C0299a(this.f34397c, continuation);
                c0299a.f34396b = obj2;
                return c0299a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                pl0 pl0Var = (pl0) this.f34396b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f34395a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (!(pl0Var instanceof pl0.a)) {
                    if (!(pl0Var instanceof pl0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FocusManager.clearFocus$default(this.f34397c, false, 1, null);
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Flow flow, FocusManager focusManager, Continuation continuation) {
            super(2, continuation);
            this.f34393b = function1;
            this.f34394c = flow;
            this.d = focusManager;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f34393b, this.f34394c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f34392a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f34393b.invoke(ql0.k.f32484a);
                Flow flow = this.f34394c;
                if (flow != null) {
                    C0299a c0299a = new C0299a(this.d, null);
                    this.f34392a = 1;
                    if (wz.a(flow, c0299a, this) == aVar) {
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

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(sl0 sl0Var, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        a(sl0Var, flow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, boolean z) {
        function1.invoke(new ql0.h(z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1, boolean z) {
        function1.invoke(new ql0.b(z));
        return Unit.f186387a;
    }

    public static final void a(sl0 state, Flow flow, Function1 onEventSent, Composer composer, int i) {
        int i2;
        String str;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1675270485);
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
                ComposerKt.traceEventStart(-1675270485, i2, -1, "com.fourthline.orca.kyc.internal.flow.person.screens.personal_details.PersonalDetailsScreen (PersonalDetailsScreen.kt:57)");
            }
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Unit unit = Unit.f186387a;
            int i3 = i2 & 896;
            boolean zChangedInstance = (i3 == 256) | composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(onEventSent, flow, focusManager, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            if (state.w().a().a()) {
                composerStartRestartGroup.startReplaceGroup(-462464900);
                composerStartRestartGroup.endReplaceGroup();
                str = strC;
            } else {
                composerStartRestartGroup.startReplaceGroup(-462428072);
                String str2 = strC + ", " + d81.c(c81.a.a(c81.f27404a, R.string.shared_fields_required_accessibility, 0, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                str = str2;
            }
            composerStartRestartGroup.startReplaceGroup(678056644);
            m80.b bVarW = state.w();
            boolean z = i3 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new us1(5, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            l80 l80Var = new l80(bVarW, (Function1) objRememberedValue2);
            m80.a aVarO = state.o();
            boolean z3 = i3 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new us1(6, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            n80 n80Var = new n80(l80Var, new l80(aVarO, (Function1) objRememberedValue3), false, 4, null);
            composerStartRestartGroup.endReplaceGroup();
            ri0.a("personal_details", strC, null, ComposableLambdaKt.rememberComposableLambda(-942001000, true, new dk1(state, 10, focusManager, onEventSent), composerStartRestartGroup, 54), null, n80Var, null, false, str, composerStartRestartGroup, 3078, Constants.TAG_PCI_PED_CHECKSUM);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(state, flow, onEventSent, i, 16));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, boolean z) {
        function1.invoke(new ql0.f(z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new ql0.i(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new ql0.c(it8));
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
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(ql0.a.f32474a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(sl0 sl0Var, FocusManager focusManager, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        int i2;
        Function1 function12;
        ComposableLambda composableLambdaRememberComposableLambda;
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        int i3 = 0;
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-942001000, i, -1, "com.fourthline.orca.kyc.internal.flow.person.screens.personal_details.PersonalDetailsScreen.<anonymous> (PersonalDetailsScreen.kt:83)");
            }
            composer.startReplaceGroup(975140139);
            s20 s20VarR = sl0Var.r();
            String strA = t20.a(s20VarR, composer, 0);
            String strB = t20.b(s20VarR, composer, 0);
            r20 format = s20VarR.getFormat();
            l20 state = s20VarR.getState();
            String text = s20VarR.getText();
            String strC = d81.c(s20VarR.getTitle(), composer, 0);
            String strC2 = d81.c(s20VarR.e(), composer, 0);
            String strC3 = d81.c(s20VarR.b(), composer, 0);
            z10 z10VarF = s20VarR.f();
            boolean zChangedInstance = composer.changedInstance(focusManager);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wr1(focusManager, 13);
                composer.updateRememberedValue(objRememberedValue);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue, null, null, null, null, null, 62, null);
            q20 q20Var = q20.i;
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            int i5 = 8;
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new us1(i5, function1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function13 = (Function1) objRememberedValue2;
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new us1(i3, function1);
                composer.updateRememberedValue(objRememberedValue3);
            }
            a30.a(null, "firstName", format, state, text, strC, null, strC2, false, function13, 0, strC3, z10VarF, (Function1) objRememberedValue3, false, null, keyboardActions, q20Var, null, strA, strB, Float.valueOf(1.0f), composer, 48, 12582912, 48, 312641);
            Unit unit = Unit.f186387a;
            composer.endReplaceGroup();
            composer.startReplaceGroup(975180070);
            s20 s20VarV = sl0Var.v();
            String strA2 = t20.a(s20VarV, composer, 0);
            String strB2 = t20.b(s20VarV, composer, 0);
            r20 format2 = s20VarV.getFormat();
            l20 state2 = s20VarV.getState();
            String text2 = s20VarV.getText();
            String strC4 = d81.c(s20VarV.getTitle(), composer, 0);
            String strC5 = d81.c(s20VarV.e(), composer, 0);
            String strC6 = d81.c(s20VarV.b(), composer, 0);
            z10 z10VarF2 = s20VarV.f();
            boolean zChangedInstance2 = composer.changedInstance(focusManager);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new wr1(focusManager, 11);
                composer.updateRememberedValue(objRememberedValue4);
            }
            KeyboardActions keyboardActions2 = new KeyboardActions((Function1) objRememberedValue4, null, null, null, null, null, 62, null);
            boolean zChanged3 = composer.changed(function1);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                i2 = 1;
                objRememberedValue5 = new us1(i2, function1);
                composer.updateRememberedValue(objRememberedValue5);
            } else {
                i2 = 1;
            }
            Function1 function14 = (Function1) objRememberedValue5;
            boolean zChanged4 = composer.changed(function1);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new us1(2, function1);
                composer.updateRememberedValue(objRememberedValue6);
            }
            a30.a(null, "lastName", format2, state2, text2, strC4, null, strC5, false, function14, 0, strC6, z10VarF2, (Function1) objRememberedValue6, false, null, keyboardActions2, q20Var, null, strA2, strB2, Float.valueOf(2.0f), composer, 48, 12582912, 48, 312641);
            Composer composer2 = composer;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(975220211);
            s20 s20VarP = sl0Var.p();
            if (s20VarP.g()) {
                composer2.startReplaceGroup(-970289106);
                String strA3 = t20.a(s20VarP, composer2, 0);
                String strB3 = t20.b(s20VarP, composer2, 0);
                r20 format3 = s20VarP.getFormat();
                l20 state3 = s20VarP.getState();
                String text3 = s20VarP.getText();
                String strC7 = d81.c(s20VarP.getTitle(), composer2, 0);
                String strC8 = d81.c(s20VarP.e(), composer2, 0);
                String strC9 = d81.c(s20VarP.b(), composer2, 0);
                z10 z10VarF3 = s20VarP.f();
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m3093getNumberPjHm6EE(), ImeAction.INSTANCE.m3059getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, (DefaultConstructorMarker) null);
                boolean zChangedInstance3 = composer2.changedInstance(focusManager);
                Object objRememberedValue7 = composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new wr1(focusManager, 12);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                KeyboardActions keyboardActions3 = new KeyboardActions((Function1) objRememberedValue7, null, null, null, null, null, 62, null);
                z10 z10VarQ = sl0Var.q();
                function12 = function1;
                boolean zChanged5 = composer2.changed(function12);
                Object objRememberedValue8 = composer2.rememberedValue();
                if (zChanged5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new us1(3, function12);
                    composer2.updateRememberedValue(objRememberedValue8);
                }
                Function1 function15 = (Function1) objRememberedValue8;
                boolean zChanged6 = composer2.changed(function12);
                Object objRememberedValue9 = composer2.rememberedValue();
                if (zChanged6 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new us1(4, function12);
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                g9.a(null, "birthDate", format3, state3, text3, strC7, strC8, strC9, z10VarF3, z10VarQ, function15, (Function1) objRememberedValue9, keyboardOptions, keyboardActions3, strA3, strB3, Float.valueOf(3.0f), composer, 48, 1572864, 1);
                composer2 = composer;
            } else {
                function12 = function1;
                composer2.startReplaceGroup(-976950386);
            }
            composer2.endReplaceGroup();
            composer2.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composer2);
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceGroup(1176177427);
            sl0.a aVarS = sl0Var.s();
            String strA4 = t20.a(aVarS, composer2, 0);
            String strB4 = t20.b(aVarS, composer2, 0);
            r20 r20VarA = aVarS.a();
            l20 l20VarC = aVarS.c();
            String strC10 = d81.c(aVarS.f(), composer2, 0);
            String strC11 = d81.c(aVarS.g(), composer2, 0);
            String strC12 = d81.c(aVarS.b(), composer2, 0);
            String strC13 = d81.c(aVarS.d(), composer2, 0);
            z10 z10VarE = aVarS.e();
            Map mapT = sl0Var.t();
            if (mapT == null) {
                composer2.startReplaceGroup(1489681919);
                composer2.endReplaceGroup();
                composableLambdaRememberComposableLambda = null;
            } else {
                composer2.startReplaceGroup(1489681920);
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1151924227, true, new cn1(mapT, function12, 8), composer2, 54);
                composer2.endReplaceGroup();
            }
            z10 z10VarN = sl0Var.n();
            boolean zChanged7 = composer2.changed(function12);
            Object objRememberedValue10 = composer2.rememberedValue();
            if (zChanged7 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new us1(7, function12);
                composer2.updateRememberedValue(objRememberedValue10);
            }
            a30.a((Modifier) null, "gender", r20VarA, l20VarC, strC10, strC11, strC12, strC13, z10VarE, composableLambdaRememberComposableLambda, z10VarN, (Function1) objRememberedValue10, (Function1) null, strA4, strB4, Float.valueOf(4.0f), composer, 48, 196608, 4097);
            composer.endReplaceGroup();
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(16)), composer, 6);
            c81 c81VarU = sl0Var.u();
            if (c81VarU == null) {
                composer.startReplaceGroup(171285761);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(171285762);
                e10.a(a80.a(companion, BitmapDescriptorFactory.HUE_RED), d81.c(c81VarU, composer, 0), 0, 0L, (z10) null, composer, 0, 28);
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
    public static final Unit a(Function1 function1, boolean z) {
        function1.invoke(new ql0.d(z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new ql0.e(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Map map, Function1 function1, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1151924227, i, -1, "com.fourthline.orca.kyc.internal.flow.person.screens.personal_details.PersonalDetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonalDetailsScreen.kt:182)");
            }
            boolean zChangedInstance = composer.changedInstance(map) | composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new vp1(map, function1, 7);
                composer.updateRememberedValue(objRememberedValue);
            }
            o2.a((Function0) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Map.Entry entry, Function1 function1, int i, Composer composer, int i2) {
        String str;
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1144504149, i2, -1, "com.fourthline.orca.kyc.internal.flow.person.screens.personal_details.PersonalDetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonalDetailsScreen.kt:186)");
            }
            int i3 = b.$EnumSwitchMapping$0[((Gender) entry.getKey()).ordinal()];
            if (i3 == 1) {
                str = "male";
            } else if (i3 == 2) {
                str = "female";
            } else if (i3 == 3) {
                str = "ratherNotSay";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String str2 = str;
            Modifier.Companion companion = Modifier.INSTANCE;
            String strC = d81.c((c81) entry.getValue(), composer, 0);
            boolean zChanged = composer.changed(function1) | composer.changedInstance(entry);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new vp1(function1, entry, 8);
                composer.updateRememberedValue(objRememberedValue);
            }
            o2.a(companion, str2, strC, null, (Function0) objRememberedValue, composer, 6, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, Map.Entry entry) {
        function1.invoke(new ql0.g(entry));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(ql0.j.f32483a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(Map map, Function1 function1) {
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it8 = map.entrySet().iterator();
        while (it8.hasNext()) {
            arrayList.add(ComposableLambdaKt.composableLambdaInstance(1144504149, true, new bk1((Map.Entry) it8.next(), function1, 7)));
        }
        return arrayList;
    }
}
