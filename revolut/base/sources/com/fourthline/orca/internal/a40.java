package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class a40 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, String str2, String str3, Function3 function3, Function3 function32, n80 n80Var, p70 p70Var, int i, boolean z, int i2, int i3, Composer composer, int i5) {
        a(str, str2, str3, function3, function32, n80Var, p70Var, i, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, String str2, List list, z10 z10Var, Function2 function2, Function0 function0, Function3 function3, Function3 function32, n80 n80Var, boolean z, int i, int i2, Composer composer, int i3) {
        a(str, str2, list, z10Var, function2, function0, function3, function32, n80Var, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097 A[PHI: r11
      0x0097: PHI (r11v22 int) = (r11v0 int), (r11v6 int), (r11v7 int) binds: [B:47:0x0095, B:57:0x00af, B:56:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r19, final java.lang.String r20, final java.lang.String r21, kotlin.jvm.functions.Function3 r22, kotlin.jvm.functions.Function3 r23, com.fourthline.orca.internal.n80 r24, final com.fourthline.orca.internal.p70 r25, int r26, boolean r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.a40.a(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, com.fourthline.orca.internal.n80, com.fourthline.orca.internal.p70, int, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(p70 p70Var, int i, String str, Function3 function3, ColumnScope OrcaScreen, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632727961, i2, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation.<anonymous> (IntroScreens.kt:50)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            j70.a(SizeKt.fillMaxWidth$default(a80.a(companion, "illustrationView", (String) null, 2, (Object) null), BitmapDescriptorFactory.HUE_RED, 1, null), 0L, p70Var, i, false, composer, 0, 18);
            float f = 16;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composer, 6);
            TextKt.m1280Text4IGK_g(str, a80.a(a80.a(companion, 4.0f), "messageView", (String) null, 2, (Object) null), 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3226getLefte0LSkKk()), 0L, TextOverflow.INSTANCE.m3263getEllipsisgIe3tQ8(), false, 0, 0, null, fj0.f28535a.b(composer, 6).getIb.b.Screen java.lang.String().getMessage().a(null, composer, 0, 1), composer, 0, 48, 62972);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composer, 6);
            if (function3 == null) {
                composer.startReplaceGroup(1013590209);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1013590210);
                Modifier modifierA = a80.a(a80.a(companion), 5.0f);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierA);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                    composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                    composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
                }
                Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                function3.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
                composer.endNode();
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea A[PHI: r17
      0x00ea: PHI (r17v16 int) = (r17v6 int), (r17v12 int), (r17v13 int) binds: [B:78:0x00e8, B:88:0x0105, B:87:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r20, java.lang.String r21, java.util.List r22, com.fourthline.orca.internal.z10 r23, kotlin.jvm.functions.Function2 r24, kotlin.jvm.functions.Function0 r25, kotlin.jvm.functions.Function3 r26, kotlin.jvm.functions.Function3 r27, com.fourthline.orca.internal.n80 r28, boolean r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.a40.a(java.lang.String, java.lang.String, java.util.List, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, com.fourthline.orca.internal.n80, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit a(java.util.List r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function3 r21, kotlin.jvm.functions.Function2 r22, com.fourthline.orca.internal.z10 r23, androidx.compose.foundation.layout.ColumnScope r24, androidx.compose.runtime.Composer r25, int r26) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.a40.a(java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, com.fourthline.orca.internal.z10, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function2 function2, int i, int i2) {
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
        return Unit.f186387a;
    }
}
