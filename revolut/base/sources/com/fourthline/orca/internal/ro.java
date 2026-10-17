package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.lo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ro {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(lo.c cVar, Modifier modifier, long j2, z10 z10Var, Function2 function2, Function2 function22, Function2 function23, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(cVar, modifier, j2, z10Var, function2, function22, function23, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(z10 z10Var, Function0 function0, int i, Composer composer, int i2) {
        a(z10Var, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    private static final boolean b(lo loVar) {
        lo.c.a aVar = loVar instanceof lo.c.a ? (lo.c.a) loVar : null;
        return ((aVar != null ? aVar.n() : null) == null && loVar.e()) ? false : true;
    }

    private static final boolean c(lo loVar) {
        boolean z = loVar instanceof lo.c.b;
        lo.c.a aVar = loVar instanceof lo.c.a ? (lo.c.a) loVar : null;
        return z || ((aVar != null ? aVar.n() : null) != null) || !loVar.e();
    }

    private static final boolean d(lo loVar) {
        boolean z = loVar instanceof lo.c.b;
        lo.c.a aVar = loVar instanceof lo.c.a ? (lo.c.a) loVar : null;
        return z || ((aVar != null ? aVar.n() : null) != null) || !loVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.fourthline.orca.internal.lo.c r28, androidx.compose.ui.Modifier r29, long r30, final com.fourthline.orca.internal.z10 r32, final kotlin.jvm.functions.Function2 r33, final kotlin.jvm.functions.Function2 r34, final kotlin.jvm.functions.Function2 r35, kotlin.jvm.functions.Function0 r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 1217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ro.a(com.fourthline.orca.internal.lo$c, androidx.compose.ui.Modifier, long, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.f186387a;
    }

    private static final boolean a(lo loVar) {
        if (loVar instanceof lo.c.b) {
            return ((lo.c.b) loVar).n();
        }
        if (!(loVar instanceof lo.c.a)) {
            return !loVar.e();
        }
        lo.c.a aVar = (lo.c.a) loVar;
        return aVar.n() == null && !aVar.e();
    }

    private static final void a(z10 z10Var, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1219257324);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(z10Var) : composerStartRestartGroup.changedInstance(z10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1219257324, i2, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ScannerCloseButton (DocumentScannerOverlayScaffold.kt:150)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM866paddingqDBjuR0$default = PaddingKt.m866paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopEnd(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM866paddingqDBjuR0$default);
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierA = a80.a(a80.a(a80.a(companion, "closeButton", (String) null, 2, (Object) null), 199.0f), d81.c(c81.a.a(c81.f27404a, R.string.shared_button_close_acessibility, 0, 2, null), composerStartRestartGroup, 0), false, 2, (Object) null);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xj1(9, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            IconButtonKt.IconButton(i81.a(0L, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1), modifierA, false, null, ComposableLambdaKt.rememberComposableLambda(-485836106, true, new ei1(z10Var, 5), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pq1(z10Var, function0, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(z10 z10Var, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-485836106, i, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ScannerCloseButton.<anonymous>.<anonymous> (DocumentScannerOverlayScaffold.kt:166)");
            }
            IconKt.m1223Iconww6aTOc(a20.a(z10Var, composer, 0), (String) null, (Modifier) null, Color.m1976copywmQWz5c$default(Color.INSTANCE.m1995getWhite0d7_KjU(), 0.7f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
