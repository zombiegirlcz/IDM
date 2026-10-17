package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import com.fourthline.orca.internal.fj0;
import com.fourthline.orca.internal.gb1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes23.dex */
public abstract class kb1 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[gb1.c.values().length];
            try {
                iArr[gb1.c.f28837a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gb1.c.f28838b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(p41 p41Var, gb1.d dVar, String str, String str2, z10 z10Var, boolean z, int i, int i2, Composer composer, int i3) {
        a(p41Var, dVar, str, str2, z10Var, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, gb1.d dVar, gb1.c cVar, String str, String str2, c81 c81Var, z10 z10Var, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(modifier, dVar, cVar, str, str2, c81Var, z10Var, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(p41 p41Var, gb1.d dVar, String str, String str2, z10 z10Var, boolean z, int i, int i2, Composer composer, int i3) {
        b(p41Var, dVar, str, str2, z10Var, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a() {
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void b(com.fourthline.orca.internal.p41 r25, com.fourthline.orca.internal.gb1.d r26, java.lang.String r27, java.lang.String r28, com.fourthline.orca.internal.z10 r29, boolean r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.kb1.b(com.fourthline.orca.internal.p41, com.fourthline.orca.internal.gb1$d, java.lang.String, java.lang.String, com.fourthline.orca.internal.z10, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2 A[PHI: r17
      0x00a2: PHI (r17v18 int) = (r17v0 int), (r17v6 int), (r17v7 int) binds: [B:52:0x00a0, B:62:0x00bd, B:61:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6 A[PHI: r18
      0x00c6: PHI (r18v12 int) = (r18v0 int), (r18v6 int), (r18v7 int) binds: [B:64:0x00c4, B:74:0x00e1, B:73:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r35, com.fourthline.orca.internal.gb1.d r36, final com.fourthline.orca.internal.gb1.c r37, final java.lang.String r38, java.lang.String r39, com.fourthline.orca.internal.c81 r40, com.fourthline.orca.internal.z10 r41, kotlin.jvm.functions.Function0 r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.kb1.a(androidx.compose.ui.Modifier, com.fourthline.orca.internal.gb1$d, com.fourthline.orca.internal.gb1$c, java.lang.String, java.lang.String, com.fourthline.orca.internal.c81, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(gb1.c cVar, p41 p41Var, gb1.d dVar, String str, String str2, z10 z10Var, boolean z, ColumnScope Card, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1776662796, i, -1, "com.fourthline.orca.core.internal.screen.type.ui.TypeSelectOption.<anonymous>.<anonymous>.<anonymous> (TypeSelectOption.kt:82)");
            }
            int i2 = a.$EnumSwitchMapping$0[cVar.ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(-2024034471);
                a(p41Var, dVar, str, str2, z10Var, z, composer, 0, 0);
                composer.endReplaceGroup();
            } else if (i2 == 2) {
                composer.startReplaceGroup(-2024023683);
                b(p41Var, dVar, str, str2, z10Var, z, composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2024035569);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void a(com.fourthline.orca.internal.p41 r33, com.fourthline.orca.internal.gb1.d r34, java.lang.String r35, java.lang.String r36, com.fourthline.orca.internal.z10 r37, boolean r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.kb1.a(com.fourthline.orca.internal.p41, com.fourthline.orca.internal.gb1$d, java.lang.String, java.lang.String, com.fourthline.orca.internal.z10, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(long j2, float f, float f4, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m2199drawCircleVaOC9Bg$default(Canvas, j2, f, 0L, BitmapDescriptorFactory.HUE_RED, new Stroke(f4, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), null, 0, LDSFile.EF_DG12_TAG, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(long j2, float f, float f4, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m2199drawCircleVaOC9Bg$default(Canvas, j2, f, 0L, BitmapDescriptorFactory.HUE_RED, new Stroke(f4, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), null, 0, LDSFile.EF_DG12_TAG, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(p41 p41Var, String str, String str2, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(156754746, i, -1, "com.fourthline.orca.core.internal.screen.type.ui.TypeSelectContentDefault.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypeSelectOption.kt:157)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            a81 a81VarJ = p41Var.getDefault().getText();
            fj0.a aVar = fj0.a.f28536a;
            TextKt.m1420TextNvy7gAk(str, companion, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a81VarJ.a(TextUnit.m3364boximpl(aVar.d()), composer, 6, 0), composer, 48, 0, 131068);
            Composer composer2 = composer;
            SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion, Dp.m3297constructorimpl(8)), composer2, 6);
            if (str2 != null) {
                composer2.startReplaceGroup(1251554345);
                TextKt.m1420TextNvy7gAk(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p41Var.getDefault().getSubtitle().a(TextUnit.m3364boximpl(aVar.a()), composer2, 6, 0), composer2, 0, 0, 131070);
                composer2 = composer2;
            } else {
                composer2.startReplaceGroup(1244803816);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(RowScope rowScope, p41 p41Var, String str, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2142714309, i, -1, "com.fourthline.orca.core.internal.screen.type.ui.TypeSelectContentDescriptive.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypeSelectOption.kt:227)");
            }
            TextKt.m1420TextNvy7gAk(str, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p41Var.getDefault().getText().a(TextUnit.m3364boximpl(fj0.a.f28536a.d()), composer, 6, 0), composer, 0, 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(p41 p41Var, String str, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1080560110, i, -1, "com.fourthline.orca.core.internal.screen.type.ui.TypeSelectContentDescriptive.<anonymous>.<anonymous>.<anonymous> (TypeSelectOption.kt:248)");
            }
            TextKt.m1420TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p41Var.getDefault().getSubtitle().a(TextUnit.m3364boximpl(fj0.a.f28536a.a()), composer, 6, 0), composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
