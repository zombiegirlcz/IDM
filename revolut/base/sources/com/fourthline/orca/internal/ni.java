package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActionScope;
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
import androidx.compose.ui.unit.Dp;
import androidx.view.compose.BackHandlerKt;
import com.fourthline.orca.internal.ii;
import com.fourthline.orca.internal.m80;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ni {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f31420b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f31420b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f31420b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f31419a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f31420b.invoke(ii.j.f29609a);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(li liVar, Function1 function1, int i, Composer composer, int i2) {
        a(liVar, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, boolean z) {
        function1.invoke(new ii.f(z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1, boolean z) {
        function1.invoke(new ii.c(z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, boolean z) {
        function1.invoke(new ii.a(z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(gi giVar, Function1 function1, int i, Composer composer, int i2) {
        a(giVar, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public static final void a(li state, Function1 onEventSent, Composer composer, int i) {
        int i2;
        l80 l80Var;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1687858542);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 32 : 16;
        }
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1687858542, i2, -1, "com.fourthline.orca.kyc.internal.flow.document.screens.details.DocumentDetailsScreen (DocumentDetailsScreen.kt:57)");
            }
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            boolean zA = ((za) composerStartRestartGroup.consume(z50.b())).a();
            int i5 = i2 & 112;
            ?? r72 = i5 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (r72 != false || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp1(1, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1945422117, true, new dk1(state, 4, focusManager, onEventSent), composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1243487524, true, new bk1(state, onEventSent, 3), composerStartRestartGroup, 54);
            m80.b bVarU = state.u();
            ?? r122 = i5 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (r122 != false || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new eq1(0, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            l80 l80Var2 = new l80(bVarU, (Function1) objRememberedValue2);
            a9 a9Var = null;
            ?? r112 = 0;
            if (zA) {
                composerStartRestartGroup.startReplaceGroup(1817263539);
                m80.a.C0250a c0250a = new m80.a.C0250a(a9Var, i3, r112 == true ? 1 : 0);
                ?? r142 = i5 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (r142 != false || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new eq1(1, onEventSent);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                l80Var = new l80(c0250a, (Function1) objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1817486832);
                composerStartRestartGroup.endReplaceGroup();
                l80Var = null;
            }
            ri0.a("document_details", strC, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, new n80(l80Var2, l80Var, true), null, false, null, composerStartRestartGroup, 27654, 452);
            Unit unit = Unit.f186387a;
            ?? r87 = i5 == 32;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (r87 != false || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new a(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(state, onEventSent, i, 10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new ii.g(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new ii.b(it8));
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
    public static final Unit b(Function1 function1) {
        function1.invoke(ii.i.f29608a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(ii.i.f29608a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(gi giVar, Function1 function1, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1604963328, i, -1, "com.fourthline.orca.kyc.internal.flow.document.screens.details.ExpiryDateCheckBox.<anonymous> (DocumentDetailsScreen.kt:215)");
            }
            c81 c81VarA = giVar.a();
            boolean zChanged = composer.changed(function1) | composer.changedInstance(giVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new dq1(function1, giVar, 0);
                composer.updateRememberedValue(objRememberedValue);
            }
            ah0.a(c81VarA, (Function1) objRememberedValue, composer, 0, 0);
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
        function1.invoke(ii.i.f29608a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0374  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit a(com.fourthline.orca.internal.li r42, androidx.compose.ui.focus.FocusManager r43, kotlin.jvm.functions.Function1 r44, androidx.compose.foundation.layout.ColumnScope r45, androidx.compose.runtime.Composer r46, int r47) {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ni.a(com.fourthline.orca.internal.li, androidx.compose.ui.focus.FocusManager, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, boolean z) {
        function1.invoke(new ii.d(z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new ii.e(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(li liVar, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1243487524, i, -1, "com.fourthline.orca.kyc.internal.flow.document.screens.details.DocumentDetailsScreen.<anonymous> (DocumentDetailsScreen.kt:170)");
            }
            ji jiVarN = liVar.n();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            String strC = d81.c(jiVarN.c(), composer, 0);
            String strC2 = d81.c(jiVarN.b(), composer, 0);
            boolean zA = jiVarN.a();
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp1(2, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            u50.a(modifierFillMaxWidth$default, strC, strC2, null, zA, false, (Function0) objRememberedValue, composer, 6, 40);
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
        function1.invoke(ii.h.f29607a);
        return Unit.f186387a;
    }

    private static final void a(gi giVar, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2020256536);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(giVar) : composerStartRestartGroup.changedInstance(giVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        boolean z = false;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2020256536, i2, -1, "com.fourthline.orca.kyc.internal.flow.document.screens.details.ExpiryDateCheckBox (DocumentDetailsScreen.kt:205)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierA = a80.a(SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion, null, false, 3, null), BitmapDescriptorFactory.HUE_RED, 1, null), "noExpiryCheckbox", (String) null, 2, (Object) null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            boolean zB = giVar.b();
            boolean z3 = (i2 & 112) == 32;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(giVar))) {
                z = true;
            }
            boolean z4 = z3 | z;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new dq1(function1, giVar, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ah0.a(modifierA, null, start, null, zB, false, (Function1) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(1604963328, true, new cn1(giVar, function1, 2), composerStartRestartGroup, 54), composerStartRestartGroup, 12583296, 42);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(8)), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(giVar, function1, i, 9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, gi giVar, boolean z) {
        function1.invoke(Boolean.valueOf(!giVar.b()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, gi giVar, int i) {
        function1.invoke(Boolean.valueOf(!giVar.b()));
        return Unit.f186387a;
    }
}
