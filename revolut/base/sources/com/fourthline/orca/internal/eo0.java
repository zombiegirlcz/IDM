package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.view.compose.BackHandlerKt;
import com.fourthline.orca.internal.bo0;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.ne1;
import com.fourthline.orca.internal.zn0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class eo0 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f28212b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f28212b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f28212b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f28211a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f28212b.invoke(zn0.f.f35650a);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bo0 bo0Var, Function1 function1, int i, Composer composer, int i2) {
        a(bo0Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1) {
        function1.invoke(zn0.c.f35647a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1) {
        function1.invoke(zn0.b.f35646a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1) {
        function1.invoke(zn0.d.f35648a);
        return Unit.f186387a;
    }

    public static final void a(bo0 state, Function1 onEventSent, Composer composer, int i) {
        int i2;
        ne1 aVar;
        boolean z;
        int i3;
        boolean z3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(356577287);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(356577287, i2, -1, "com.fourthline.orca.kyc.internal.flow.poa.confirmation.PoaConfirmationScreen (PoaConfirmationScreen.kt:23)");
            }
            int i5 = i2 & 112;
            boolean z4 = i5 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new lj1(7, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(-926603899);
            if (state.r() != null) {
                composerStartRestartGroup.startReplaceGroup(306323394);
                hw hwVarR = state.r();
                boolean z6 = i5 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new lj1(8, onEventSent);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                iw.a(hwVarR, false, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 32;
                z3 = true;
                z = false;
            } else {
                composerStartRestartGroup.startReplaceGroup(306572510);
                String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
                String strC2 = d81.c(c81.a.a(c81.f27404a, R.string.shared_document_confirmation_header_accessibility, 0, 2, null), composerStartRestartGroup, 0);
                bo0.a aVarU = state.u();
                if (aVarU instanceof bo0.a.b) {
                    aVar = new ne1.b(((bo0.a.b) state.u()).a());
                } else {
                    if (!(aVarU instanceof bo0.a.C0172a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new ne1.a(((bo0.a.C0172a) state.u()).a());
                }
                String strC3 = d81.c(state.n(), composerStartRestartGroup, 0);
                String strC4 = d81.c(state.p(), composerStartRestartGroup, 0);
                String strC5 = d81.c(state.o(), composerStartRestartGroup, 0);
                String strC6 = d81.c(state.t(), composerStartRestartGroup, 0);
                String strC7 = d81.c(state.s(), composerStartRestartGroup, 0);
                z10 z10VarQ = state.q();
                long jColor = ColorKt.Color(DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0) ? 4291022296L : 4283979864L);
                boolean z11 = i5 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z11 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new lj1(9, onEventSent);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                boolean z12 = i5 == 32;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z12 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new lj1(10, onEventSent);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function0 function02 = (Function0) objRememberedValue4;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(state) | (i5 == 32);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new jn1(state, onEventSent, 9);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                z = false;
                i3 = 32;
                z3 = true;
                oe1.a(strC, strC2, aVar, false, strC3, strC4, strC5, strC7, strC6, z10VarQ, false, function0, function02, (Function1) objRememberedValue5, Color.m1972boximpl(jColor), composerStartRestartGroup, 0, 0, 1032);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.f186387a;
            boolean z29 = i5 == i3 ? z3 : z;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z29 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new a(onEventSent, null);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(state, onEventSent, i, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(zn0.a.f35645a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bo0 bo0Var, Function1 function1, Bitmap it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        if (bo0Var.u() instanceof bo0.a.b) {
            function1.invoke(new zn0.e(((bo0.a.b) bo0Var.u()).a()));
        }
        return Unit.f186387a;
    }
}
