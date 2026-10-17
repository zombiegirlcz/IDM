package com.fourthline.orca.internal;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class c30 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, z10 z10Var, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(modifier, str, z10Var, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    public static final void a(Modifier modifier, String text, z10 z10Var, Function0 onClick, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        z10 z10Var2;
        Modifier modifier3;
        Modifier modifier4;
        z10 z10Var3 = z10Var;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1728544529);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(z10Var3) : composerStartRestartGroup.changedInstance(z10Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        int i21 = i3;
        int i22 = 0;
        if (composerStartRestartGroup.shouldExecute((i21 & 1171) != 1170, i21 & 1)) {
            Modifier modifier5 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (i6 != 0) {
                z10Var3 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1728544529, i21, -1, "com.fourthline.orca.kyc.internal.flow.nfc.screens.nfc_intro.composable.InstructionalLink (InstructionalLink.kt:38)");
            }
            fj0 fj0Var = fj0.f28535a;
            float fM3297constructorimpl = Dp.m3297constructorimpl(fj0Var.b(composerStartRestartGroup, 6).getHint().getDefault().getRadius());
            Modifier modifierM612backgroundbw27NRU = BackgroundKt.m612backgroundbw27NRU(ClipKt.clip(SizeKt.m873defaultMinSizeVpY3zN4$default(SizeKt.wrapContentHeight$default(a80.a(a80.a(modifier5, "instructionView", (String) null, 2, (Object) null)), null, false, 3, null), BitmapDescriptorFactory.HUE_RED, th0.f33777a.a(), 1, null), RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(fM3297constructorimpl)), fj0Var.b(composerStartRestartGroup, 6).getHint().getDefault().getBackground().a(composerStartRestartGroup, 0), RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(fM3297constructorimpl));
            boolean z = (i21 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xj1(i22, onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM633clickableoSLSa3U$default = ClickableKt.m633clickableoSLSa3U$default(modifierM612backgroundbw27NRU, false, null, null, null, i81.a(0L, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1), 15, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM633clickableoSLSa3U$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion2, Dp.m3297constructorimpl(20)), composerStartRestartGroup, 6);
            if (z10Var3 == null) {
                composerStartRestartGroup.startReplaceGroup(1627779235);
                composerStartRestartGroup.endReplaceGroup();
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.startReplaceGroup(1627779236);
                modifier4 = modifier5;
                IconKt.m1223Iconww6aTOc(a20.a(z10Var3, composerStartRestartGroup, 0), (String) null, SizeKt.m882size3ABfNKs(companion2, Dp.m3297constructorimpl(16)), zi0.b(fj0Var.a(composerStartRestartGroup, 6)).a(composerStartRestartGroup, 0), composerStartRestartGroup, 432, 0);
                SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion2, Dp.m3297constructorimpl(8)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            z10 z10Var4 = z10Var3;
            TextKt.m1280Text4IGK_g(text, null, 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3223getCentere0LSkKk()), 0L, 0, false, 0, 0, null, fj0Var.b(composerStartRestartGroup, 6).getLinkButton().getDefault().getLink().a(null, composerStartRestartGroup, 0, 1), composerStartRestartGroup, (i21 >> 3) & 14, 0, 65022);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            z10Var2 = z10Var4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z10Var2 = z10Var3;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yj1(modifier3, text, z10Var2, onClick, i, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.f186387a;
    }
}
