package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.kd1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class oe1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, int i, int i2, Composer composer, int i3) {
        a(modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, String str2, List list, int i, Composer composer, int i2) {
        a(str, str2, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b() {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(z10 z10Var, Function0 function0, int i, Composer composer, int i2) {
        a(z10Var, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function0 function0, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function0.invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ColumnScope columnScope, Bitmap bitmap, boolean z, Color color, z10 z10Var, Function1 function1, int i, int i2, Composer composer, int i3) {
        a(columnScope, bitmap, z, color, z10Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, boolean z, Function0 function0, int i, Composer composer, int i2) {
        a(str, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, boolean z, boolean z3, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(str, z, z3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, String str2, ne1 ne1Var, boolean z, String str3, String str4, String str5, String str6, String str7, z10 z10Var, boolean z3, Function0 function0, Function0 function02, Function1 function1, Color color, int i, int i2, int i3, Composer composer, int i5) {
        a(str, str2, ne1Var, z, str3, str4, str5, str6, str7, z10Var, z3, function0, function02, function1, color, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a() {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Bitmap it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r33, final java.lang.String r34, final com.fourthline.orca.internal.ne1 r35, boolean r36, final java.lang.String r37, final java.lang.String r38, final java.lang.String r39, final java.lang.String r40, final java.lang.String r41, final com.fourthline.orca.internal.z10 r42, boolean r43, kotlin.jvm.functions.Function0 r44, kotlin.jvm.functions.Function0 r45, kotlin.jvm.functions.Function1 r46, androidx.compose.ui.graphics.Color r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 1479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.oe1.a(java.lang.String, java.lang.String, com.fourthline.orca.internal.ne1, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.fourthline.orca.internal.z10, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.graphics.Color, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void a(androidx.compose.foundation.layout.ColumnScope r27, android.graphics.Bitmap r28, boolean r29, androidx.compose.ui.graphics.Color r30, com.fourthline.orca.internal.z10 r31, kotlin.jvm.functions.Function1 r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.oe1.a(androidx.compose.foundation.layout.ColumnScope, android.graphics.Bitmap, boolean, androidx.compose.ui.graphics.Color, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, Bitmap bitmap) {
        function1.invoke(bitmap);
        return Unit.f186387a;
    }

    private static final void a(z10 z10Var, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-856229932);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(z10Var) : composerStartRestartGroup.changedInstance(z10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2;
        if (composerStartRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-856229932, i5, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.EnlargeButton (VisionScannerResultScreen.kt:217)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 8;
            Modifier modifierM862padding3ABfNKs = PaddingKt.m862padding3ABfNKs(ClickableKt.m633clickableoSLSa3U$default(BackgroundKt.m613backgroundbw27NRU$default(ClipKt.clip(a80.a(companion, "enlargeImageButton", (String) null, 2, (Object) null), RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(f))), ColorKt.Color(3003121664L), null, 2, null), false, null, null, null, function0, 15, null), Dp.m3297constructorimpl(12));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM862padding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composerStartRestartGroup);
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            i3 = 0;
            ImageKt.Image(a20.a(z10Var, composerStartRestartGroup, i5 & 14), null, SizeKt.m882size3ABfNKs(companion, Dp.m3297constructorimpl(16)), null, ContentScale.INSTANCE.getFillBounds(), BitmapDescriptorFactory.HUE_RED, null, composerStartRestartGroup, 25008, 104);
            SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion, Dp.m3297constructorimpl(f)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m1280Text4IGK_g(d81.c(c81.a.a(c81.f27404a, R.string.shared_button_enlarge, 0, 2, null), composerStartRestartGroup, 0), null, Color.INSTANCE.m1995getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fj0.f28535a.b(composerStartRestartGroup, 6).getHint().getDefault().getText().a(null, composerStartRestartGroup, 0, 1), composer2, 384, 0, 65530);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i3 = 0;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pq1(z10Var, function0, i, i3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void a(final java.lang.String r17, boolean r18, boolean r19, final kotlin.jvm.functions.Function0 r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.oe1.a(java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void a(final String str, final boolean z, final Function0 function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1057464528);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1057464528, i2, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.NegativeButton (VisionScannerResultScreen.kt:265)");
            }
            kd1.h hVar = new kd1.h(str, null, 2, null);
            k41 secondary = fj0.f28535a.b(composerStartRestartGroup, 6).getIb.b.Scanner java.lang.String().getConfirmation().getSecondary();
            boolean z3 = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new in1(5, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            wg0.a(null, "secondaryButton", secondary, hVar, z, false, false, (Function1) objRememberedValue, composerStartRestartGroup, ((i2 << 9) & 57344) | 48, 97);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.fourthline.orca.internal.rq1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return oe1.a(str, z, function0, i, (Composer) obj2, iIntValue);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function0 function0, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function0.invoke();
        return Unit.f186387a;
    }

    private static final void a(String str, String str2, List list, Composer composer, int i) {
        String str3;
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(700930317);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(700930317, i2, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.Checkpoints (VisionScannerResultScreen.kt:280)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierA = a80.a((Modifier) companion, str2, true);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composerStartRestartGroup);
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m1280Text4IGK_g(str3, PaddingKt.m866paddingqDBjuR0$default(a80.a(companion, "titleView", (String) null, 2, (Object) null), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(24), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fj0.f28535a.b(composerStartRestartGroup, 6).getIb.b.Scanner java.lang.String().getConfirmation().getHeader().a(null, composerStartRestartGroup, 0, 1), composerStartRestartGroup, i2 & 14, 0, 65532);
            composer2 = composerStartRestartGroup;
            Modifier modifierA2 = a80.a(companion, "messageViewList", (String) null, 2, (Object) null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierA2);
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
            composer2.startReplaceGroup(462444917);
            int i3 = 0;
            for (Object obj2 : list) {
                int i5 = i3 + 1;
                if (i3 >= 0) {
                    a(a80.a(Modifier.INSTANCE, "listItem" + i3, (String) null, 2, (Object) null), (String) obj2, composer2, 0, 0);
                    i3 = i5;
                } else {
                    zhm.v.s();
                    throw null;
                }
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(str, str2, list, i, 9));
        }
    }

    private static final void a(Modifier modifier, String str, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-36639432);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i6 = 0;
        int i21 = 1;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-36639432, i3, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.Checkpoint (VisionScannerResultScreen.kt:308)");
            }
            b30 instructions = fj0.f28535a.b(composerStartRestartGroup, 6).getIb.b.Scanner java.lang.String().getConfirmation().getInstructions();
            TextStyle textStyleA = instructions.getMessage().a(null, composerStartRestartGroup, 0, 1);
            Modifier modifierM866paddingqDBjuR0$default = PaddingKt.m866paddingqDBjuR0$default(modifier4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(4), 7, null);
            Modifier modifier5 = modifier4;
            composerStartRestartGroup.startReplaceGroup(-850745868);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(i6, i21, null);
            composerStartRestartGroup.startReplaceGroup(-850744793);
            int iPushStyle = builder.pushStyle(new SpanStyle(instructions.getBullet().a(composerStartRestartGroup, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            try {
                builder.append("• ");
                Unit unit = Unit.f186387a;
                builder.pop(iPushStyle);
                iPushStyle = builder.pushStyle(new SpanStyle(textStyleA.m2972getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    builder.append(str);
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.endReplaceGroup();
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    TextKt.m1281TextIbK3jfQ(annotatedString, modifierM866paddingqDBjuR0$default, 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3226getLefte0LSkKk()), 0L, 0, false, 0, 0, null, null, instructions.getMessage().a(null, composerStartRestartGroup, 0, 1), composer2, 0, 0, 130556);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } finally {
                }
            } finally {
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tq1(modifier3, str, i, i2, 0));
        }
    }
}
