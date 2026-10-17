package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.SurfaceKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class i51 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h51.values().length];
            try {
                iArr[h51.f29146a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h51.f29147b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h51.f29148c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(RowScope rowScope, h51 h51Var, int i, Composer composer, int i2) {
        a(rowScope, h51Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Pair pair, int i, Composer composer, int i2) {
        a(pair, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final int b(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return ((Number) pair.f186386b).intValue();
    }

    public static final void a(Pair progress, Composer composer, int i) {
        int i2;
        h51 h51Var;
        Intrinsics.checkNotNullParameter(progress, "progress");
        Composer composerStartRestartGroup = composer.startRestartGroup(397532579);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(progress) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(397532579, i2, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.StepsProgressWidget (StepsProgressWidget.kt:29)");
            }
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m874height3ABfNKs(Modifier.INSTANCE, th0.f33777a.a()), 0.7f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth);
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
            composerStartRestartGroup.startReplaceGroup(961548890);
            int iB = b(progress);
            while (i3 < iB) {
                if (Intrinsics.k(i3, a(progress)) < 0) {
                    h51Var = h51.f29147b;
                } else {
                    h51Var = i3 == a(progress) ? h51.f29146a : h51.f29148c;
                }
                a(rowScopeInstance, h51Var, composerStartRestartGroup, 6);
                i3++;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new al1(progress, i, 2));
        }
    }

    public static final int a(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return ((Number) pair.f186385a).intValue();
    }

    private static final void a(RowScope rowScope, h51 h51Var, Composer composer, int i) {
        int i2;
        Composer composer2;
        long jA;
        Composer composerStartRestartGroup = composer.startRestartGroup(735552604);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(h51Var.ordinal()) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(735552604, i2, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.StepsProgressItem (StepsProgressWidget.kt:49)");
            }
            int i3 = a.$EnumSwitchMapping$0[h51Var.ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(-1803546335);
                jA = fj0.f28535a.b(composerStartRestartGroup, 6).getGraphic().getSpinner().getHighlight().a(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 2) {
                composerStartRestartGroup.startReplaceGroup(-1803545279);
                composerStartRestartGroup.endReplaceGroup();
                jA = Color.INSTANCE.m1995getWhite0d7_KjU();
            } else if (i3 == 3) {
                composerStartRestartGroup.startReplaceGroup(-1803544050);
                composerStartRestartGroup.endReplaceGroup();
                jA = Color.m1976copywmQWz5c$default(Color.INSTANCE.m1995getWhite0d7_KjU(), 0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1803548663);
                composerStartRestartGroup.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            long j2 = jA;
            float f = 2;
            Modifier modifierM864paddingVpY3zN4$default = PaddingKt.m864paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3297constructorimpl(f), BitmapDescriptorFactory.HUE_RED, 2, null);
            if (h51Var == h51.f29146a) {
                f = 4;
            }
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1257SurfaceFjzlyU(RowScope.weight$default(rowScope, rowScope.align(SizeKt.m874height3ABfNKs(modifierM864paddingVpY3zN4$default, Dp.m3297constructorimpl(f)), Alignment.INSTANCE.getCenterVertically()), 1.0f, false, 2, null), null, j2, ColorsKt.m1197contentColorForek8zF_U(j2, composerStartRestartGroup, 0), null, Dp.m3297constructorimpl(0), xa.f34928a.a(), composer2, 1794048, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(rowScope, h51Var, i, 0));
        }
    }
}
