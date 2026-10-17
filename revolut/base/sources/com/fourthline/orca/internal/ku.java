package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.view.compose.BackHandlerKt;
import com.fourthline.orca.internal.au;
import com.fourthline.orca.internal.fj0;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.zt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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

/* JADX INFO: loaded from: classes23.dex */
public abstract class ku {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f30394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SoftwareKeyboardController f30395c;
        final /* synthetic */ FocusManager d;
        final /* synthetic */ MutableIntState e;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ku$a$a, reason: collision with other inner class name */
        public static final class C0237a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f30396a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f30397b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SoftwareKeyboardController f30398c;
            final /* synthetic */ FocusManager d;
            final /* synthetic */ MutableIntState e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0237a(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, MutableIntState mutableIntState, Continuation continuation) {
                super(2, continuation);
                this.f30398c = softwareKeyboardController;
                this.d = focusManager;
                this.e = mutableIntState;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(zt ztVar, Continuation continuation) {
                return ((C0237a) create(ztVar, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0237a c0237a = new C0237a(this.f30398c, this.d, this.e, continuation);
                c0237a.f30397b = obj2;
                return c0237a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                zt ztVar = (zt) this.f30397b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f30396a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (!(ztVar instanceof zt.c)) {
                    if (ztVar instanceof zt.b) {
                        SoftwareKeyboardController softwareKeyboardController = this.f30398c;
                        if (softwareKeyboardController != null) {
                            softwareKeyboardController.hide();
                        }
                    } else {
                        if (!(ztVar instanceof zt.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int iA = ku.a(this.e);
                        ku.a(this.e, iA + 1);
                        mo3.a.b(iA);
                    }
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, MutableIntState mutableIntState, Continuation continuation) {
            super(2, continuation);
            this.f30394b = flow;
            this.f30395c = softwareKeyboardController;
            this.d = focusManager;
            this.e = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f30394b, this.f30395c, this.d, this.e, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f30393a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f30394b;
                if (flow != null) {
                    C0237a c0237a = new C0237a(this.f30395c, this.d, this.e, null);
                    this.f30393a = 1;
                    if (wz.a(flow, c0237a, this) == aVar) {
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
        int f30399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f30400b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f30400b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f30400b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f30399a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f30400b.invoke(au.g.f26911a);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bu buVar, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        a(buVar, flow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v22 */
    public static final void a(bu state, Flow flow, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-570407679);
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
        int i3 = i2;
        int i5 = 1;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-570407679, i3, -1, "com.fourthline.orca.kyc.internal.flow.eid.pin.EidPinScreen (EidPinScreen.kt:53)");
            }
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            Unit unit = Unit.f186387a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                a aVar = new a(flow, softwareKeyboardController, focusManager, mutableIntState, null);
                composerStartRestartGroup.updateRememberedValue(aVar);
                objRememberedValue2 = aVar;
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            int i6 = i3 & 896;
            ?? r4 = i6 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (r4 != false || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new lj1(28, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 1);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1319101650, true, new dk1(state, onEventSent, mutableIntState, 3), composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1591537937, true, new bk1(state, onEventSent, 2), composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(1594165877);
            m80.b bVar = new m80.b(state.q());
            ?? r112 = i6 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (r112 != false || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new mn1(24, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            l80 l80Var = new l80(bVar, (Function1) objRememberedValue4);
            m80.a.C0250a c0250a = new m80.a.C0250a(null, i5, 0 == true ? 1 : 0);
            ?? r162 = i6 == 256;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (r162 != false || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new mn1(25, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            n80 n80Var = new n80(l80Var, new l80(c0250a, (Function1) objRememberedValue5), false, 4, null);
            composerStartRestartGroup.endReplaceGroup();
            ri0.a("eid_pin", strC, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, n80Var, null, false, null, composerStartRestartGroup, 27654, 452);
            composerStartRestartGroup = composerStartRestartGroup;
            ?? r122 = i6 == 256;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (r122 != false || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new b(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(state, flow, onEventSent, i, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1) {
        function1.invoke(au.c.f26907a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new au.f(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1) {
        function1.invoke(au.b.f26906a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(au.a.f26905a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(au.a.f26905a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bu buVar, Function1 function1, MutableIntState mutableIntState, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1319101650, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.pin.EidPinScreen.<anonymous> (EidPinScreen.kt:79)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierA = a80.a(companion, "messageView", (String) null, 2, (Object) null);
            fj0 fj0Var = fj0.f28535a;
            TextKt.m1421TextZ58ophY(d81.b(buVar.a(), composer, 0), modifierA, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, fj0Var.b(composer, 6).getIb.b.Screen java.lang.String().getMessage().a(null, composer, 0, 1), composer, 0, 0, 262140);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(20)), composer, 6);
            float f = 4;
            TextKt.m1420TextNvy7gAk(d81.c(buVar.p(), composer, 0), SizeKt.fillMaxWidth$default(PaddingKt.m866paddingqDBjuR0$default(companion, BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(f), BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(f), 5, null), BitmapDescriptorFactory.HUE_RED, 1, null), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3228getStarte0LSkKk()), 0L, 0, false, 0, 0, null, fj0Var.b(composer, 6).getInput().getFocused().getLabel().a(TextUnit.m3364boximpl(fj0.a.f28536a.a()), composer, 6, 0), composer, 48, 0, 130044);
            int i2 = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            PasswordVisualTransformation passwordVisualTransformation = new PasswordVisualTransformation('*');
            Integer numValueOf = Integer.valueOf(a(mutableIntState));
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new mn1(26, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new mn1(27, function1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            z21.a(modifierFillMaxWidth$default, passwordVisualTransformation, numValueOf, function12, (Function1) objRememberedValue2, composer, 6, 0);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(48)), composer, 6);
            composer.startReplaceGroup(-641292245);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, i2, defaultConstructorMarker);
            String strC = d81.c(buVar.n().b(), composer, 0);
            long jA = fj0Var.b(composer, 6).getIb.b.Screen java.lang.String().getMessage().getColor().a(composer, 0);
            int iPushStyle = builder.pushStyle(new ParagraphStyle(0, 0, fj0Var.b(composer, 6).getLinkButton().getMessage().getTypography().getLineHeight(), null, null, null, 0, 0, null, 507, null));
            try {
                int iPushStyle2 = builder.pushStyle(new SpanStyle(jA, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    builder.append(strC);
                    Unit unit = Unit.f186387a;
                    builder.pop(iPushStyle);
                    builder.addStyle(new SpanStyle(fj0Var.b(composer, 6).getLinkButton().getDefault().getLink().getColor().a(composer, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getUnderline(), null, null, null, 61438, null), kotlin.text.d0.T(strC, buVar.n().a(), 0, false, 6), kotlin.text.d0.T(strC, buVar.n().a(), 0, false, 6) + buVar.n().a().length());
                    builder.addStringAnnotation("URL", buVar.n().a(), kotlin.text.d0.T(strC, buVar.n().a(), 0, false, 6), kotlin.text.d0.T(strC, buVar.n().a(), 0, false, 6) + buVar.n().a().length());
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composer.endReplaceGroup();
                    boolean zChanged3 = composer.changed(function1);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new lj1(29, function1);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    e10.a(annotatedString, 0, 0L, (z10) null, (Function0) objRememberedValue3, composer, 0, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } finally {
                    builder.pop(iPushStyle2);
                }
            } catch (Throwable th10) {
                builder.pop(iPushStyle);
                throw th10;
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new au.e(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bu buVar, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if ((i & 6) == 0) {
            i2 = (composer.changed(OrcaScreen) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1591537937, i2, -1, "com.fourthline.orca.kyc.internal.flow.eid.pin.EidPinScreen.<anonymous> (EidPinScreen.kt:141)");
            }
            Modifier modifierAlign = OrcaScreen.align(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getCenterHorizontally());
            String strC = d81.c(buVar.o().b(), composer, 0);
            String strC2 = d81.c(buVar.o().a(), composer, 0);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new lj1(27, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            u50.a(modifierAlign, strC, strC2, null, true, true, (Function0) objRememberedValue, composer, 221184, 8);
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
        function1.invoke(au.d.f26908a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }
}
