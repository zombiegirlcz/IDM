package com.fourthline.orca.internal;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import com.fourthline.orca.internal.az;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.yy;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes23.dex */
public abstract class fz {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f28699b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f28699b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f28699b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f28698a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f28699b.invoke(yy.d.f35456a);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, c81 c81Var, c81 c81Var2, z10 z10Var, boolean z, boolean z3, Function0 function0, int i2, int i3, Composer composer, int i5) {
        a(i, c81Var, c81Var2, z10Var, z, z3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(az azVar, Function1 function1, int i, Composer composer, int i2) {
        a(azVar, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(yy.a.f35453a);
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(az state, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(772131746);
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
                ComposerKt.traceEventStart(772131746, i2, -1, "com.fourthline.orca.kyc.internal.flow.eid.flow.FlowSelectionScreen (FlowSelectionScreen.kt:65)");
            }
            float fM3297constructorimpl = Dp.m3297constructorimpl(4);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-263877233, true, new cm1(fM3297constructorimpl, state, onEventSent, 0), composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(-1010690659);
            m80.b bVarO = state.o();
            int i5 = i2 & 112;
            Object[] objArr = i5 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objArr != false || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new li1(18, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            l80 l80Var = new l80(bVarO, (Function1) objRememberedValue);
            m80.a.C0250a c0250a = new m80.a.C0250a(null, i3, 0 == true ? 1 : 0);
            Object[] objArr2 = i5 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objArr2 != false || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new li1(19, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            n80 n80Var = new n80(l80Var, new l80(c0250a, (Function1) objRememberedValue2), false, 4, null);
            composerStartRestartGroup.endReplaceGroup();
            ri0.a("verification_type", strC, null, composableLambdaRememberComposableLambda, null, n80Var, null, false, null, composerStartRestartGroup, 3078, 468);
            Unit unit = Unit.f186387a;
            Object[] objArr3 = i5 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objArr3 != false || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
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
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(state, onEventSent, i, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f, az azVar, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-263877233, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.flow.FlowSelectionScreen.<anonymous> (FlowSelectionScreen.kt:72)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            TextKt.m1280Text4IGK_g(d81.c(azVar.p(), composer, 0), SizeKt.fillMaxWidth$default(PaddingKt.m866paddingqDBjuR0$default(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f, 5, null), BitmapDescriptorFactory.HUE_RED, 1, null), 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3228getStarte0LSkKk()), 0L, 0, false, 0, 0, null, fj0.f28535a.b(composer, 6).getAgreements().getLabel().a(null, composer, 0, 1), composer, 48, 0, 65020);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(4)), composer, 6);
            int i2 = 0;
            for (Object obj2 : azVar.n()) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    az.a aVar = (az.a) obj2;
                    composer.startReplaceGroup(-182934214);
                    c81 c81VarC = aVar.c();
                    c81 c81VarA = aVar.a();
                    z10 z10VarB = aVar.b();
                    boolean zF = aVar.f();
                    boolean zE = aVar.e();
                    boolean zChanged = composer.changed(function1) | composer.changedInstance(aVar);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new rj1(function1, aVar, 20);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    a(i2, c81VarC, c81VarA, z10VarB, zF, zE, (Function0) objRememberedValue, composer, 0, 0);
                    composer.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m874height3ABfNKs(Modifier.INSTANCE, Dp.m3297constructorimpl(12)), composer, 6);
                    i2 = i3;
                } else {
                    zhm.v.s();
                    throw null;
                }
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
    public static final Unit a(Function1 function1, az.a aVar) {
        function1.invoke(new yy.c(aVar.d()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(yy.b.f35454a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a() {
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final int r28, final com.fourthline.orca.internal.c81 r29, final com.fourthline.orca.internal.c81 r30, final com.fourthline.orca.internal.z10 r31, final boolean r32, boolean r33, kotlin.jvm.functions.Function0 r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.fz.a(int, com.fourthline.orca.internal.c81, com.fourthline.orca.internal.c81, com.fourthline.orca.internal.z10, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(boolean z, String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setSelected(semantics, z);
        SemanticsPropertiesKt.setStateDescription(semantics, str);
        SemanticsPropertiesKt.m2838setRolekuIjeqM(semantics, Role.INSTANCE.m2827getRadioButtono7Vup1c());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(boolean z, float f, float f4, p41 p41Var, c81 c81Var, c81 c81Var2, z10 z10Var, Composer composer, int i) {
        int i2;
        TextUnit textUnit;
        int i3;
        char c2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1653129004, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.flow.FlowSelectionOption.<anonymous>.<anonymous> (FlowSelectionScreen.kt:159)");
            }
            long jA = zi0.b(fj0.f28535a.a(composer, 6)).a(composer, 0);
            float fMo768toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo768toPx0680j_4(Dp.m3297constructorimpl(z ? 4 : 1));
            float fMo768toPx0680j_42 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo768toPx0680j_4(Dp.m3297constructorimpl(z ? 5 : 6));
            Modifier.Companion companion = Modifier.INSTANCE;
            float f5 = 12;
            Modifier modifierM864paddingVpY3zN4$default = PaddingKt.m864paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), Dp.m3297constructorimpl(f5), BitmapDescriptorFactory.HUE_RED, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM864paddingVpY3zN4$default);
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM873defaultMinSizeVpY3zN4$default = SizeKt.m873defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM873defaultMinSizeVpY3zN4$default);
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
            Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierAlpha = AlphaKt.alpha(SizeKt.m882size3ABfNKs(companion, Dp.m3297constructorimpl(16)), f4);
            boolean zChanged = composer.changed(jA) | composer.changed(fMo768toPx0680j_42) | composer.changed(fMo768toPx0680j_4);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                yi1 yi1Var = new yi1(fMo768toPx0680j_42, fMo768toPx0680j_4, jA, 1);
                composer.updateRememberedValue(yi1Var);
                objRememberedValue = yi1Var;
            }
            CanvasKt.Canvas(modifierAlpha, (Function1) objRememberedValue, composer, 0);
            SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion, Dp.m3297constructorimpl(f5)), composer, 6);
            TextKt.m1281TextIbK3jfQ(d81.b(c81Var2, composer, 0), AlphaKt.alpha(companion, f4), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, p41Var.getDefault().getText().a(null, composer, 0, 1), composer, 0, 0, 131068);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
            if (z10Var == null) {
                composer.startReplaceGroup(-172178662);
                composer.endReplaceGroup();
                i2 = 0;
                textUnit = null;
                i3 = 1;
                c2 = 6;
            } else {
                composer.startReplaceGroup(-172178661);
                i2 = 0;
                textUnit = null;
                i3 = 1;
                c2 = 6;
                ImageKt.Image(a20.a(z10Var, composer, 0), d81.c(c81.a.a(c81.f27404a, R.string.shared_label_eid_fast_accessibility, 0, 2, null), composer, 0), SizeKt.m874height3ABfNKs(companion, th0.f33777a.a()), null, null, f4, null, composer, 384, 88);
                Unit unit = Unit.f186387a;
                composer.endReplaceGroup();
            }
            composer.endNode();
            int i5 = i2;
            TextKt.m1281TextIbK3jfQ(d81.b(c81Var, composer, i5), AlphaKt.alpha(PaddingKt.m866paddingqDBjuR0$default(companion, Dp.m3297constructorimpl(28), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), f4), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, p41Var.getDefault().getSubtitle().a(textUnit, composer, i5, i3), composer, 0, 0, 131068);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(8)), composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(long j2, float f, float f4, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m2199drawCircleVaOC9Bg$default(Canvas, j2, f, 0L, BitmapDescriptorFactory.HUE_RED, new Stroke(f4, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), null, 0, LDSFile.EF_DG12_TAG, null);
        return Unit.f186387a;
    }
}
