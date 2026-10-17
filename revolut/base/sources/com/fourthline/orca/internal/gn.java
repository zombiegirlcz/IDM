package com.fourthline.orca.internal;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.view.compose.BackHandlerKt;
import com.fourthline.orca.internal.cn;
import com.fourthline.orca.internal.dn;
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
public abstract class gn {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f28939b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f28939b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f28939b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f28938a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f28939b.invoke(cn.c.f27524a);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(dn dnVar, Function1 function1, int i, Composer composer, int i2) {
        a(dnVar, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(dn state, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-874055779);
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
                ComposerKt.traceEventStart(-874055779, i2, -1, "com.fourthline.orca.kyc.internal.flow.document.screens.document_ready.DocumentReadyScreen (DocumentReadyScreen.kt:41)");
            }
            int i5 = i2 & 112;
            Object[] objArr = i5 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objArr != false || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new lj1(11, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            Unit unit = Unit.f186387a;
            Object[] objArr2 = i5 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            a9 a9Var = null;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (objArr2 != false || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            String strC = d81.c(state.o(), composerStartRestartGroup, 0);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1866397689, true, new bk1(state, state, 1), composerStartRestartGroup, 54);
            m80.b bVar = new m80.b(a9Var, i3, objArr5 == true ? 1 : 0);
            Object[] objArr6 = i5 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objArr6 != false || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new li1(21, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            l80 l80Var = new l80(bVar, (Function1) objRememberedValue3);
            m80.a.C0250a c0250a = new m80.a.C0250a(objArr4 == true ? 1 : 0, i3, objArr3 == true ? 1 : 0);
            boolean z = i5 == 32;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new li1(22, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ri0.a("document_ready", strC, null, composableLambdaRememberComposableLambda, null, new n80(l80Var, new l80(c0250a, (Function1) objRememberedValue4), false, 4, null), null, false, null, composerStartRestartGroup, 3078, 468);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(state, onEventSent, i, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(cn.a.f27522a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(cn.a.f27522a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.unit.TextUnit, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v37, types: [com.fourthline.orca.internal.a81] */
    /* JADX WARN: Type inference failed for: r33v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r33v3 */
    public static final Unit a(dn dnVar, dn dnVar2, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1866397689, i, -1, "com.fourthline.orca.kyc.internal.flow.document.screens.document_ready.DocumentReadyScreen.<anonymous>.<anonymous> (DocumentReadyScreen.kt:53)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            g81.a(ColumnScopeInstance.INSTANCE.align(companion, companion2.getCenterHorizontally()), false, false, 0L, 0L, 0L, 0L, 0, BitmapDescriptorFactory.HUE_RED, null, dnVar.p(), null, null, null, composer, 48, 0, 15356);
            float f = 24;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composer, 6);
            String strC = d81.c(dnVar2.getTitle(), composer, 0);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            TextAlign textAlignM3216boximpl = TextAlign.m3216boximpl(companion4.m3223getCentere0LSkKk());
            fj0 fj0Var = fj0.f28535a;
            TextKt.m1420TextNvy7gAk(strC, null, 0L, null, 0L, null, null, null, 0L, null, textAlignM3216boximpl, 0L, 0, false, 0, 0, null, fj0Var.b(composer, 6).getDialog().getDefault().getTitle().a(null, composer, 0, 1), composer, 0, 0, 130046);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composer, 6);
            TextKt.m1421TextZ58ophY(d81.b(dnVar.a(), composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(companion4.m3223getCentere0LSkKk()), TextUnitKt.getSp(24), 0, false, 0, 0, null, null, fj0Var.b(composer, 6).getDialog().getDefault().getMessage().a(null, composer, 0, 1), composer, 0, 48, 259070);
            Composer composer2 = composer;
            int i2 = 6;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composer2, 6);
            b30 b30VarB = fj0Var.b(composer2, 6).getDialog().getDefault().getInstruction();
            float f4 = BitmapDescriptorFactory.HUE_RED;
            ?? r102 = 0;
            int i3 = 1;
            int i5 = 0;
            Modifier modifierM864paddingVpY3zN4$default = PaddingKt.m864paddingVpY3zN4$default(BackgroundKt.m612backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), b30VarB.getBackground().a(composer2, 0), RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(b30VarB.getRadius()))), BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(8), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM864paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM1662constructorimpl2 = Updater.m1662constructorimpl(composer2);
            Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            composer2.startReplaceGroup(183223683);
            int i6 = 0;
            for (Object obj2 : dnVar.n()) {
                int i21 = i6 + 1;
                if (i6 >= 0) {
                    dn.a aVar = (dn.a) obj2;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM863paddingVpY3zN4 = PaddingKt.m863paddingVpY3zN4(SizeKt.fillMaxWidth$default(a80.a(companion5, "listItem" + i6, (String) r102, 2, (Object) r102), f4, i3, r102), Dp.m3297constructorimpl(18), Dp.m3297constructorimpl(i2));
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                    int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i5));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM863paddingVpY3zN4);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1662constructorimpl3 = Updater.m1662constructorimpl(composer2);
                    Updater.m1665setimpl(composerM1662constructorimpl3, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m1665setimpl(composerM1662constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                    if (composerM1662constructorimpl3.getInserting() || !Intrinsics.f(composerM1662constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                        composerM1662constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                        composerM1662constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                    }
                    Updater.m1665setimpl(composerM1662constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    IconKt.m1371Iconww6aTOc(a20.a(aVar.a(), composer2, i5), null, null, b30VarB.getBullet().a(composer2, i5), composer2, 48, 4);
                    SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion5, Dp.m3297constructorimpl(14)), composer2, i2);
                    TextKt.m1420TextNvy7gAk(d81.c(aVar.b(), composer2, i5), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b30VarB.getText().a(r102, composer2, i5, i3), composer, 0, 0, 131070);
                    composer2 = composer;
                    composer2.endNode();
                    i6 = i21;
                    i5 = i5;
                    f4 = f4;
                    r102 = r102;
                    i3 = i3;
                    i2 = 6;
                } else {
                    ?? r332 = r102;
                    zhm.v.s();
                    throw r332;
                }
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(Modifier.INSTANCE, Dp.m3297constructorimpl(16)), composer2, 6);
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
        function1.invoke(cn.b.f27523a);
        return Unit.f186387a;
    }
}
