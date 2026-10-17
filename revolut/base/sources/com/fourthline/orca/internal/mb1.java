package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.fb1;
import com.fourthline.orca.internal.gb1;
import com.fourthline.orca.internal.m80;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class mb1 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f31155b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f31155b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f31155b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f31154a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f31155b.invoke(new fb1.d());
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[gb1.d.values().length];
            try {
                iArr[gb1.d.f28840a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gb1.d.f28841b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gb1.d.f28842c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ColumnScope columnScope, List list, Function1 function1, int i, Composer composer, int i2) {
        a(columnScope, list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(gb1 gb1Var, Function1 function1, String str, int i, Composer composer, int i2) {
        a(gb1Var, function1, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(gb1 gb1Var, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1898777010, i, -1, "com.fourthline.orca.core.internal.screen.type.TypeSelectScreen.<anonymous>.<anonymous> (TypeSelectScreen.kt:80)");
            }
            gb1.a aVarO = gb1Var.o();
            if (aVarO == null) {
                composer.startReplaceGroup(1746668578);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1746668579);
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 8;
                SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composer, 6);
                composer.startReplaceGroup(-636389276);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(a80.a(companion, 4.0f), BitmapDescriptorFactory.HUE_RED, 1, null);
                String strC = d81.c(aVarO.b(), composer, 0);
                String strC2 = d81.c(aVarO.a(), composer, 0);
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new qp1(0, function1);
                    composer.updateRememberedValue(objRememberedValue);
                }
                u50.a(modifierFillMaxWidth$default, strC, strC2, null, false, true, (Function0) objRememberedValue, composer, 196608, 24);
                composer.endReplaceGroup();
                SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composer, 6);
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

    public static final void a(final gb1 state, final Function1 onEventSent, String screenName, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Composer composerStartRestartGroup = composer.startRestartGroup(-887629427);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(screenName) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-887629427, i2, -1, "com.fourthline.orca.core.internal.screen.type.TypeSelectScreen (TypeSelectScreen.kt:46)");
            }
            composerStartRestartGroup.startReplaceGroup(1686618948);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            final int i3 = 0;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-244707151, true, new Function3() { // from class: com.fourthline.orca.internal.rp1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i5 = i3;
                    ColumnScope columnScope = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    switch (i5) {
                        case 0:
                            return mb1.a(state, onEventSent, columnScope, composer2, iIntValue);
                        default:
                            return mb1.b(state, onEventSent, columnScope, composer2, iIntValue);
                    }
                }
            }, composerStartRestartGroup, 54);
            final int i5 = 1;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1898777010, true, new Function3() { // from class: com.fourthline.orca.internal.rp1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i59 = i5;
                    ColumnScope columnScope = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    switch (i59) {
                        case 0:
                            return mb1.a(state, onEventSent, columnScope, composer2, iIntValue);
                        default:
                            return mb1.b(state, onEventSent, columnScope, composer2, iIntValue);
                    }
                }
            }, composerStartRestartGroup, 54);
            m80.b bVarQ = state.q();
            int i6 = i2 & 112;
            boolean z = i6 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new mn1(28, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            l80 l80Var = new l80(bVarQ, (Function1) objRememberedValue);
            m80.a aVarR = state.r();
            boolean z3 = i6 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new mn1(29, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ri0.a(screenName, strC, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, new n80(l80Var, new l80(aVarR, (Function1) objRememberedValue2), false, 4, null), null, false, null, composerStartRestartGroup, ((i2 >> 6) & 14) | 27648, 452);
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.f186387a;
            boolean z4 = i6 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new a(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1((Object) state, onEventSent, (Object) screenName, i, 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new fb1.a());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(gb1 gb1Var, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(OrcaScreen) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-244707151, i2, -1, "com.fourthline.orca.core.internal.screen.type.TypeSelectScreen.<anonymous>.<anonymous> (TypeSelectScreen.kt:52)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 4;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m864paddingVpY3zN4$default(a80.a(a80.a(companion, "messageView", (String) null, 2, (Object) null), 1.0f), BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(f), 1, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            String strC = d81.c(gb1Var.a(), composer, 0);
            int iM3228getStarte0LSkKk = TextAlign.INSTANCE.m3228getStarte0LSkKk();
            TextKt.m1420TextNvy7gAk(strC, modifierFillMaxWidth$default, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(iM3228getStarte0LSkKk), 0L, 0, false, 0, 0, null, fj0.f28535a.b(composer, 6).getAgreements().getLabel().a(null, composer, 0, 1), composer, 0, 0, 130044);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composer, 6);
            a(OrcaScreen, gb1Var.p(), function1, composer, i2 & 14);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(16)), composer, 6);
            c81 c81VarN = gb1Var.n();
            if (c81VarN == null) {
                composer.startReplaceGroup(-1510453827);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1510453826);
                e10.a(a80.a(companion, BitmapDescriptorFactory.HUE_RED), d81.c(c81VarN, composer, 0), 0, 0L, (z10) null, composer, 0, 28);
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
    public static final Unit a(Function1 function1) {
        function1.invoke(new fb1.b());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new fb1.c());
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    private static final void a(ColumnScope columnScope, List list, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(-761062337);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = 1;
        ?? r92 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 145) != 144, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-761062337, i2, -1, "com.fourthline.orca.core.internal.screen.type.TypeSelectOptions (TypeSelectScreen.kt:120)");
            }
            Iterator it8 = list.iterator();
            int i6 = 0;
            while (it8.hasNext()) {
                Object next = it8.next();
                int i21 = i6 + 1;
                if (i6 >= 0) {
                    gb1.b bVar = (gb1.b) next;
                    composerStartRestartGroup.startReplaceGroup(-1236458085);
                    String strC2 = d81.c(bVar.f(), composerStartRestartGroup, r92);
                    c81.a aVar = c81.f27404a;
                    int i22 = b.$EnumSwitchMapping$0[bVar.e().ordinal()];
                    if (i22 == i5) {
                        i3 = R.string.shared_radio_selected_accessibility;
                    } else if (i22 == 2) {
                        i3 = R.string.shared_radio_unselected_accessibility;
                    } else {
                        if (i22 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = R.string.step_document_type_not_accepted;
                    }
                    String strC3 = d81.c(c81.a.a(aVar, i3, r92, 2, null), composerStartRestartGroup, r92);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(bVar) | composerStartRestartGroup.changed(strC3);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new jn1(bVar, strC3, 15);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierA = a80.a(a80.a(SemanticsModifierKt.semantics$default(companion, r92, (Function1) objRememberedValue, i5, null), 2.0f), "listItem" + i6, (String) null, 2, (Object) null);
                    gb1.d dVarE = bVar.e();
                    gb1.c cVarD = bVar.d();
                    z10 z10VarC = bVar.c();
                    c81 c81VarA = bVar.a();
                    if (c81VarA == null) {
                        composerStartRestartGroup.startReplaceGroup(1048684977);
                        composerStartRestartGroup.endReplaceGroup();
                        strC = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(449470544);
                        strC = d81.c(c81VarA, composerStartRestartGroup, r92);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    c81 c81VarB = bVar.b();
                    Iterator it9 = it8;
                    boolean zChangedInstance2 = ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(bVar);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new rj1(function1, bVar, 29);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    kb1.a(modifierA, dVarE, cVarD, strC2, strC, c81VarB, z10VarC, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(8)), composerStartRestartGroup, 6);
                    i6 = i21;
                    i5 = 1;
                    it8 = it9;
                    r92 = 0;
                } else {
                    zhm.v.s();
                    throw null;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pp1(columnScope, list, function1, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(gb1.b bVar, String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setSelected(semantics, bVar.e() == gb1.d.f28840a);
        SemanticsPropertiesKt.setStateDescription(semantics, str);
        SemanticsPropertiesKt.m2838setRolekuIjeqM(semantics, Role.INSTANCE.m2827getRadioButtono7Vup1c());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, gb1.b bVar) {
        function1.invoke(new fb1.e(bVar.g()));
        return Unit.f186387a;
    }
}
