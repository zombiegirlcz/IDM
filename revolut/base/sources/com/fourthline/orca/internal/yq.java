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
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.pq;
import com.fourthline.orca.internal.sq;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
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
public abstract class yq {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f35417b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f35417b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f35417b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f35416a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f35417b.invoke(pq.e.f32026a);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[sq.b.values().length];
            try {
                iArr[sq.b.f33102a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sq.b.f33103b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sq.b.f33104c.ordinal()] = 3;
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
    public static final Unit a(sq sqVar, Function1 function1, int i, Composer composer, int i2) {
        a(sqVar, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(sq sqVar, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(10090514, i, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.type.DocumentTypeScreen.<anonymous>.<anonymous> (DocumentTypeScreen.kt:78)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 8;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composer, 6);
            composer.startReplaceGroup(1107052289);
            sq.c cVarO = sqVar.o();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(a80.a(companion, 4.0f), BitmapDescriptorFactory.HUE_RED, 1, null);
            String strC = d81.c(cVarO.b(), composer, 0);
            String strC2 = d81.c(cVarO.a(), composer, 0);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ot1(4, function1);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final sq state, final Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(322776855);
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
                ComposerKt.traceEventStart(322776855, i2, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.type.DocumentTypeScreen (DocumentTypeScreen.kt:46)");
            }
            composerStartRestartGroup.startReplaceGroup(950917652);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            final int i5 = 0;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(437360243, true, new Function3() { // from class: com.fourthline.orca.internal.rt1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i6 = i5;
                    ColumnScope columnScope = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    switch (i6) {
                        case 0:
                            return yq.a(state, onEventSent, columnScope, composer2, iIntValue);
                        default:
                            return yq.b(state, onEventSent, columnScope, composer2, iIntValue);
                    }
                }
            }, composerStartRestartGroup, 54);
            final int i6 = 1;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(10090514, true, new Function3() { // from class: com.fourthline.orca.internal.rt1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i66 = i6;
                    ColumnScope columnScope = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    switch (i66) {
                        case 0:
                            return yq.a(state, onEventSent, columnScope, composer2, iIntValue);
                        default:
                            return yq.b(state, onEventSent, columnScope, composer2, iIntValue);
                    }
                }
            }, composerStartRestartGroup, 54);
            m80.b bVar = new m80.b(state.q());
            int i21 = i2 & 112;
            Object[] objArr = i21 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objArr != false || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jt1(8, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            l80 l80Var = new l80(bVar, (Function1) objRememberedValue);
            m80.a.C0250a c0250a = new m80.a.C0250a(null, i3, 0 == true ? 1 : 0);
            Object[] objArr2 = i21 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objArr2 != false || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new jt1(9, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ri0.a("document_type", strC, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, new n80(l80Var, new l80(c0250a, (Function1) objRememberedValue2), false, 4, null), null, false, null, composerStartRestartGroup, 27654, 452);
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.f186387a;
            boolean z = i21 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
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
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(state, onEventSent, i, 23));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(pq.a.f32022a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(sq sqVar, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(OrcaScreen) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(437360243, i2, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.type.DocumentTypeScreen.<anonymous>.<anonymous> (DocumentTypeScreen.kt:52)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 4;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m864paddingVpY3zN4$default(a80.a(a80.a(companion, "inputLabel", (String) null, 2, (Object) null), 1.0f), BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(f), 1, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            String strC = d81.c(sqVar.a(), composer, 0);
            int iM3228getStarte0LSkKk = TextAlign.INSTANCE.m3228getStarte0LSkKk();
            TextKt.m1420TextNvy7gAk(strC, modifierFillMaxWidth$default, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(iM3228getStarte0LSkKk), 0L, 0, false, 0, 0, null, fj0.f28535a.b(composer, 6).getAgreements().getLabel().a(null, composer, 0, 1), composer, 0, 0, 130044);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composer, 6);
            a(OrcaScreen, sqVar.p(), function1, composer, i2 & 14);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(16)), composer, 6);
            e10.a(a80.a(companion, BitmapDescriptorFactory.HUE_RED), d81.c(sqVar.n(), composer, 0), 0, 0L, (z10) null, composer, 0, 28);
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
        function1.invoke(pq.b.f32023a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(pq.c.f32024a);
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    private static final void a(ColumnScope columnScope, List list, Function1 function1, Composer composer, int i) {
        int i2;
        ?? StartRestartGroup = composer.startRestartGroup(847490650);
        int i3 = (i & 48) == 0 ? (StartRestartGroup.changedInstance(list) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i3 |= StartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = 1;
        ?? r72 = 0;
        if (StartRestartGroup.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(847490650, i3, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.type.DocumentTypeOptions (DocumentTypeScreen.kt:118)");
            }
            int i6 = 0;
            for (Object obj2 : list) {
                int i21 = i6 + 1;
                if (i6 >= 0) {
                    sq.a aVar = (sq.a) obj2;
                    StartRestartGroup.startReplaceGroup(-1605264366);
                    String strC = d81.c(aVar.c(), StartRestartGroup, r72);
                    c81.a aVar2 = c81.f27404a;
                    int i22 = b.$EnumSwitchMapping$0[aVar.b().ordinal()];
                    if (i22 == i5) {
                        i2 = R.string.shared_radio_selected_accessibility;
                    } else if (i22 == 2) {
                        i2 = R.string.shared_radio_unselected_accessibility;
                    } else {
                        if (i22 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R.string.step_document_type_not_accepted;
                    }
                    String strC2 = d81.c(c81.a.a(aVar2, i2, r72, 2, null), StartRestartGroup, r72);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zChangedInstance = StartRestartGroup.changedInstance(aVar) | StartRestartGroup.changed(strC2);
                    Object objRememberedValue = StartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new jn1(aVar, strC2, 26);
                        StartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierA = a80.a(SemanticsModifierKt.semantics$default(companion, r72, (Function1) objRememberedValue, i5, null), 2.0f);
                    sq.b bVarB = aVar.b();
                    z10 z10VarA = aVar.a();
                    ?? r132 = ((i3 & 896) == 256 ? 1 : r72) | (StartRestartGroup.changedInstance(aVar) ? 1 : 0);
                    Object objRememberedValue2 = StartRestartGroup.rememberedValue();
                    if (r132 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new vp1(function1, aVar, 12);
                        StartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    nq.a(modifierA, bVarB, strC, z10VarA, (Function0) objRememberedValue2, "listItem" + i6, StartRestartGroup, 0, 0);
                    StartRestartGroup.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl((float) 8)), StartRestartGroup, 6);
                    i6 = i21;
                    r72 = 0;
                    i5 = 1;
                } else {
                    zhm.v.s();
                    throw null;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            StartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = StartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pp1(columnScope, list, function1, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(sq.a aVar, String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setSelected(semantics, aVar.b() == sq.b.f33102a);
        SemanticsPropertiesKt.setStateDescription(semantics, str);
        SemanticsPropertiesKt.m2838setRolekuIjeqM(semantics, Role.INSTANCE.m2827getRadioButtono7Vup1c());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, sq.a aVar) {
        function1.invoke(new pq.d(aVar.d()));
        return Unit.f186387a;
    }
}
