package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.OutlinedTextFieldKt;
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
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e4k.m0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¥\u0001\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aW\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001aW\u0010'\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010\u001f\u001a\u0083\u0001\u00104\u001a\u00020\u0003*\u00020(2\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u00010+2\b\u00100\u001a\u0004\u0018\u00010+2\u0006\u00101\u001a\u00020+2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u00103\u001a\u0002022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b4\u00105\u001a#\u00109\u001a\u00020\u0000*\u00020\u00002\u0006\u00106\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b7\u00108\"\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\"\u001a\u0010>\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "textField", "Lkotlin/Function1;", "placeholder", "label", "leading", "trailing", "", "singleLine", "", "animationProgress", "Landroidx/compose/ui/geometry/Size;", "onLabelMeasured", "border", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "OutlinedTextFieldLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "density", "calculateWidth-O3s9Psw", "(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "calculateHeight-O3s9Psw", "calculateHeight", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;FZFLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/layout/PaddingValues;)V", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "outlineCutout", "Landroidx/compose/ui/unit/Dp;", "OutlinedTextFieldInnerPadding", "F", "Landroidx/compose/ui/unit/TextUnit;", "OutlinedTextFieldTopPadding", "J", "getOutlinedTextFieldTopPadding", "()J", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = Dp.m3297constructorimpl(4);
    private static final long OutlinedTextFieldTopPadding = TextUnitKt.getSp(8);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void OutlinedTextFieldLayout(@NotNull final Modifier modifier, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, final Function3 function3, Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final float f, @NotNull final Function1<? super Size, Unit> function1, @NotNull final Function2<? super Composer, ? super Integer, Unit> function25, @NotNull final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        Composer composerStartRestartGroup = composer.startRestartGroup(36320288);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? PKIFailureInfo.badCertTemplate : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function25) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerStartRestartGroup.changed(paddingValues) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if (composerStartRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(36320288, i3, i5, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:685)");
            }
            boolean z3 = ((i5 & 14) == 4) | ((3670016 & i3) == 1048576) | ((234881024 & i3) == 67108864) | ((29360128 & i3) == 8388608);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(function1, z, f, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m1665setimpl(composerM1662constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                v1.c.B(setCompositeKeyHash, currentCompositeKeyHash, composerM1662constructorimpl, currentCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            function25.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
            if (function23 != null) {
                composerStartRestartGroup.startReplaceGroup(1336978507);
                Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.INSTANCE, "Leading"));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierMinimumInteractiveComponentSize);
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1662constructorimpl2 = Updater.m1662constructorimpl(composerStartRestartGroup);
                Function2 function2T = t61.a.t(companion, composerM1662constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM1662constructorimpl2, currentCompositionLocalMap2);
                if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    v1.c.B(function2T, currentCompositeKeyHash2, composerM1662constructorimpl2, currentCompositeKeyHash2);
                }
                Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                composerStartRestartGroup.endNode();
            } else {
                composerStartRestartGroup.startReplaceGroup(1302508491);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (function24 != null) {
                composerStartRestartGroup.startReplaceGroup(1337267241);
                Modifier modifierMinimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.INSTANCE, "Trailing"));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierMinimumInteractiveComponentSize2);
                Function0<ComposeUiNode> constructor3 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1662constructorimpl3 = Updater.m1662constructorimpl(composerStartRestartGroup);
                Function2 function2T2 = t61.a.t(companion, composerM1662constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM1662constructorimpl3, currentCompositionLocalMap3);
                if (composerM1662constructorimpl3.getInserting() || !Intrinsics.f(composerM1662constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    v1.c.B(function2T2, currentCompositeKeyHash3, composerM1662constructorimpl3, currentCompositeKeyHash3);
                }
                Updater.m1665setimpl(composerM1662constructorimpl3, modifierMaterializeModifier3, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 15) & 14));
                composerStartRestartGroup.endNode();
            } else {
                composerStartRestartGroup.startReplaceGroup(1302508491);
            }
            composerStartRestartGroup.endReplaceGroup();
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (function23 != null) {
                float fM3297constructorimpl = Dp.m3297constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding());
                float fM3297constructorimpl2 = Dp.m3297constructorimpl(0);
                if (fM3297constructorimpl < fM3297constructorimpl2) {
                    fM3297constructorimpl = fM3297constructorimpl2;
                }
                fCalculateStartPadding = Dp.m3297constructorimpl(fM3297constructorimpl);
            }
            float f4 = fCalculateStartPadding;
            if (function24 != null) {
                float fM3297constructorimpl3 = Dp.m3297constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding());
                float fM3297constructorimpl4 = Dp.m3297constructorimpl(0);
                if (fM3297constructorimpl3 < fM3297constructorimpl4) {
                    fM3297constructorimpl3 = fM3297constructorimpl4;
                }
                fCalculateEndPadding = Dp.m3297constructorimpl(fM3297constructorimpl3);
            }
            Modifier modifierM866paddingqDBjuR0$default = PaddingKt.m866paddingqDBjuR0$default(companion2, f4, BitmapDescriptorFactory.HUE_RED, fCalculateEndPadding, BitmapDescriptorFactory.HUE_RED, 10, null);
            if (function3 != null) {
                composerStartRestartGroup.startReplaceGroup(1338367152);
                function3.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(modifierM866paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 112));
            } else {
                composerStartRestartGroup.startReplaceGroup(1302508491);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen = LayoutIdKt.layoutId(companion2, "TextField").then(modifierM866paddingqDBjuR0$default);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), true);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            Function0<ComposeUiNode> constructor4 = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl4 = Updater.m1662constructorimpl(composerStartRestartGroup);
            Function2 function2T3 = t61.a.t(companion, composerM1662constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM1662constructorimpl4, currentCompositionLocalMap4);
            if (composerM1662constructorimpl4.getInserting() || !Intrinsics.f(composerM1662constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                v1.c.B(function2T3, currentCompositeKeyHash4, composerM1662constructorimpl4, currentCompositeKeyHash4);
            }
            Updater.m1665setimpl(composerM1662constructorimpl4, modifierMaterializeModifier4, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            composerStartRestartGroup.endNode();
            if (function22 != null) {
                composerStartRestartGroup.startReplaceGroup(1338685429);
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion2, "Label");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
                Function0<ComposeUiNode> constructor5 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1662constructorimpl5 = Updater.m1662constructorimpl(composerStartRestartGroup);
                Function2 function2T4 = t61.a.t(companion, composerM1662constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM1662constructorimpl5, currentCompositionLocalMap5);
                if (composerM1662constructorimpl5.getInserting() || !Intrinsics.f(composerM1662constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    v1.c.B(function2T4, currentCompositeKeyHash5, composerM1662constructorimpl5, currentCompositeKeyHash5);
                }
                Updater.m1665setimpl(composerM1662constructorimpl5, modifierMaterializeModifier5, companion.getSetModifier());
                function26 = function22;
                function26.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 9) & 14));
                composerStartRestartGroup.endNode();
            } else {
                function26 = function22;
                composerStartRestartGroup.startReplaceGroup(1302508491);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function26 = function22;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v1.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return OutlinedTextFieldKt.OutlinedTextFieldLayout$lambda$2(modifier, function2, function3, function26, function23, function24, z, f, function1, function25, paddingValues, i, i2, (Composer) obj2, iIntValue);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextFieldLayout$lambda$2(Modifier modifier, Function2 function2, Function3 function3, Function2 function22, Function2 function23, Function2 function24, boolean z, float f, Function1 function1, Function2 function25, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        OutlinedTextFieldLayout(modifier, function2, function3, function22, function23, function24, z, f, function1, function25, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1228calculateHeightO3s9Psw(int i, int i2, int i3, int i5, int i6, float f, long j2, float f4, PaddingValues paddingValues) {
        int iMax = Math.max(i3, Math.max(i6, MathHelpersKt.lerp(i5, 0, f)));
        float fMo852calculateTopPaddingD9Ej5fM = paddingValues.getTop() * f4;
        return ConstraintsKt.m3291constrainHeightK40F9xA(j2, Math.max(i, Math.max(i2, rim.d.c(MathHelpersKt.lerp(fMo852calculateTopPaddingD9Ej5fM, Math.max(fMo852calculateTopPaddingD9Ej5fM, i5 / 2.0f), f) + iMax + (paddingValues.getBottom() * f4)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m1229calculateWidthO3s9Psw(int i, int i2, int i3, int i5, int i6, float f, long j2, float f4, PaddingValues paddingValues) {
        int iMax = Math.max(i3, Math.max(MathHelpersKt.lerp(i5, 0, f), i6)) + i + i2;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return ConstraintsKt.m3292constrainWidthK40F9xA(j2, Math.max(iMax, rim.d.c((i5 + (Dp.m3297constructorimpl(paddingValues.mo851calculateRightPaddingu2uoSUM(layoutDirection) + paddingValues.mo850calculateLeftPaddingu2uoSUM(layoutDirection)) * f4)) * f)));
    }

    @NotNull
    /* JADX INFO: renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m1230outlineCutout12SF9DM(@NotNull Modifier modifier, long j2, @NotNull PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new m0(j2, paddingValues, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit outlineCutout_12SF9DM$lambda$0(long j2, PaddingValues paddingValues, ContentDrawScope contentDrawScope) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float f = BitmapDescriptorFactory.HUE_RED;
        if (fIntBitsToFloat > BitmapDescriptorFactory.HUE_RED) {
            float fMo768toPx0680j_4 = contentDrawScope.mo768toPx0680j_4(OutlinedTextFieldInnerPadding);
            float fMo768toPx0680j_42 = contentDrawScope.mo768toPx0680j_4(paddingValues.mo850calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - fMo768toPx0680j_4;
            float f4 = 2;
            float f5 = (fMo768toPx0680j_4 * f4) + fIntBitsToFloat + fMo768toPx0680j_42;
            LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            float fIntBitsToFloat2 = iArr[layoutDirection.ordinal()] == 1 ? Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() >> 32)) - f5 : fMo768toPx0680j_42 < BitmapDescriptorFactory.HUE_RED ? 0.0f : fMo768toPx0680j_42;
            if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() >> 32));
                if (fMo768toPx0680j_42 >= BitmapDescriptorFactory.HUE_RED) {
                    f = fMo768toPx0680j_42;
                }
                f5 = fIntBitsToFloat3 - f;
            }
            float f6 = f5;
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j2));
            float f32 = (-fIntBitsToFloat4) / f4;
            float f35 = fIntBitsToFloat4 / f4;
            int iM1970getDifferencertfAjoo = ClipOp.INSTANCE.m1970getDifferencertfAjoo();
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long jMo2190getSizeNHjbRc = drawContext.mo2190getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo2193clipRectN_I0leg(fIntBitsToFloat2, f32, f6, f35, iM1970getDifferencertfAjoo);
                contentDrawScope.drawContent();
            } finally {
                com.revolut.data.database.models.openbanking.d.B(drawContext, jMo2190getSizeNHjbRc);
            }
        } else {
            contentDrawScope.drawContent();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f, boolean z, float f4, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int iC = rim.d.c(paddingValues.getTop() * f4);
        int iC2 = rim.d.c(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f4);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f4;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, rim.d.c(placeable == null ? BitmapDescriptorFactory.HUE_RED : (1 - f) * (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding)) + iC2, MathHelpersKt.lerp(z ? Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i) : iC, -(placeable4.getHeight() / 2), f), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z ? Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i) : iC, TextFieldImplKt.heightOrZero(placeable4) / 2), BitmapDescriptorFactory.HUE_RED, 4, null);
        if (placeable5 != null) {
            if (z) {
                iC = Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), Math.max(iC, TextFieldImplKt.heightOrZero(placeable4) / 2), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        Placeable.PlacementScope.m2556place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m3343getZeronOccac(), BitmapDescriptorFactory.HUE_RED, 2, null);
    }
}
