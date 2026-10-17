package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
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
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.yi0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class iw {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(hw hwVar, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(hwVar, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.fourthline.orca.internal.hw r23, boolean r24, final kotlin.jvm.functions.Function0 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.iw.a(com.fourthline.orca.internal.hw, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(hw hwVar, long j2, boolean z, yi0.h hVar, Function0 function0, PaddingValues scaffoldPadding, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(scaffoldPadding, "scaffoldPadding");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(scaffoldPadding) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(195518307, i2, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.EnlargedState.<anonymous> (EnlargedState.kt:37)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer, 6)), scaffoldPadding);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
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
            jh0.a(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, a80.a(companion, "enlargeImageView", (String) null, 2, (Object) null), 1.0f, false, 2, null), zhm.u.c(hwVar.a()), j2, (Function1) null, z, composer, 0, 8);
            k41 tertiary = fj0.f28535a.b(composer, 6).getButton().getTertiary();
            String strC = d81.c(c81.a.a(c81.f27404a, R.string.shared_button_close, 0, 2, null), composer, 0);
            k41 k41VarA = k41.a(tertiary, 0, null, z8.a(tertiary.getDefault(), a81.a(tertiary.getDefault().getText(), null, hVar.getHeader().getColor(), 1, null), null, null, BitmapDescriptorFactory.HUE_RED, 14, null), null, 11, null);
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new in1(2, function0);
                composer.updateRememberedValue(objRememberedValue);
            }
            p9.a((Modifier) null, "closeButton", strC, (String) null, false, k41VarA, (Function1) objRememberedValue, composer, 48, 25);
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
    public static final Unit a(Function0 function0, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function0.invoke();
        return Unit.f186387a;
    }
}
