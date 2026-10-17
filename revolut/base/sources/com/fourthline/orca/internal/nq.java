package com.fourthline.orca.internal;

import androidx.compose.foundation.CanvasKt;
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
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.fj0;
import com.fourthline.orca.internal.sq;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes23.dex */
public abstract class nq {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, sq.b bVar, String str, z10 z10Var, Function0 function0, String str2, int i, int i2, Composer composer, int i3) {
        a(modifier, bVar, str, z10Var, function0, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a() {
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r36, com.fourthline.orca.internal.sq.b r37, final java.lang.String r38, final com.fourthline.orca.internal.z10 r39, kotlin.jvm.functions.Function0 r40, java.lang.String r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.nq.a(androidx.compose.ui.Modifier, com.fourthline.orca.internal.sq$b, java.lang.String, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(p41 p41Var, sq.b bVar, boolean z, float f, z10 z10Var, String str, String str2, ColumnScope Card, Composer composer, int i) {
        float fA;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968335932, i, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.type.ui.DocumentTypeOption.<anonymous>.<anonymous> (DocumentTypeComposables.kt:76)");
            }
            long jA = p41Var.getDefault().getIcon().a(composer, 0);
            sq.b bVar2 = sq.b.f33102a;
            if (bVar == bVar2) {
                composer.startReplaceGroup(-1785217014);
                fA = zi0.a(6, composer, 6);
            } else {
                composer.startReplaceGroup(-1785216566);
                fA = zi0.a(2, composer, 6);
            }
            composer.endReplaceGroup();
            float f4 = fA;
            composer.startReplaceGroup(bVar == bVar2 ? -1785214518 : -1785214070);
            float fA2 = zi0.a(6, composer, 6);
            composer.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM873defaultMinSizeVpY3zN4$default = SizeKt.m873defaultMinSizeVpY3zN4$default(AlphaKt.alpha(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), z ? 0.5f : 1.0f), BitmapDescriptorFactory.HUE_RED, f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM873defaultMinSizeVpY3zN4$default);
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
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
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
            float f5 = 12;
            SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion, Dp.m3297constructorimpl(f5)), composer, 6);
            Modifier modifierM882size3ABfNKs = SizeKt.m882size3ABfNKs(companion, Dp.m3297constructorimpl(16));
            boolean zChanged = composer.changed(jA) | composer.changed(fA2) | composer.changed(f4);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                yi1 yi1Var = new yi1(fA2, f4, jA, 5);
                composer.updateRememberedValue(yi1Var);
                objRememberedValue = yi1Var;
            }
            CanvasKt.Canvas(modifierM882size3ABfNKs, (Function1) objRememberedValue, composer, 6);
            SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion, Dp.m3297constructorimpl(f5)), composer, 6);
            Modifier modifierM866paddingqDBjuR0$default = PaddingKt.m866paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(2), 7, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer, 6);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM866paddingqDBjuR0$default);
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
            Updater.m1665setimpl(composerM1662constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl3.getInserting() || !Intrinsics.f(composerM1662constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM1662constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM1662constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m1665setimpl(composerM1662constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            pq0.a(false, ComposableLambdaKt.rememberComposableLambda(337631350, true, new gq1(str, p41Var, str2, z), composer, 54), composer, 48, 1);
            composer.endNode();
            th0 th0Var = th0.f33777a;
            IconKt.m1371Iconww6aTOc(a20.a(z10Var, composer, 0), null, PaddingKt.m862padding3ABfNKs(SizeKt.m884sizeVpY3zN4(companion, th0Var.a(), th0Var.a()), Dp.m3297constructorimpl(f5)), fj0.f28535a.b(composer, 6).getRadio().getDefault().getIcon().a(composer, 0), composer, 432, 0);
            composer.endNode();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, p41 p41Var, String str2, boolean z, Composer composer, int i) {
        Modifier modifierA;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(337631350, i, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.type.ui.DocumentTypeOption.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentTypeComposables.kt:108)");
            }
            if (str == null || (modifierA = a80.a(Modifier.INSTANCE, str, (String) null, 2, (Object) null)) == null) {
                modifierA = Modifier.INSTANCE;
            }
            a81 a81VarJ = p41Var.getDefault().getText();
            fj0.a aVar = fj0.a.f28536a;
            TextKt.m1420TextNvy7gAk(str2, modifierA, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a81VarJ.a(TextUnit.m3364boximpl(aVar.d()), composer, 6, 0), composer, 0, 0, 131068);
            Composer composer2 = composer;
            if (z) {
                composer2.startReplaceGroup(-437455915);
                TextKt.m1420TextNvy7gAk(d81.c(c81.a.a(c81.f27404a, R.string.step_document_type_not_accepted, 0, 2, null), composer2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p41Var.getDefault().getSubtitle().a(TextUnit.m3364boximpl(aVar.a()), composer2, 6, 0), composer, 0, 0, 131070);
                composer2 = composer;
            } else {
                composer2.startReplaceGroup(-442823348);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
