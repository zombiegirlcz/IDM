package tb;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes23.dex */
public abstract class v {
    public static final void a(u uVar, int i, Modifier modifier, Function1 function1, long j2, long j3, float f, float f4, float f5, Shape shape, Composer composer, int i2) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1511110220);
        int i3 = (i2 & 14) == 0 ? (composerStartRestartGroup.changed(uVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
        }
        if ((i2 & 458752) == 0) {
            i3 |= composerStartRestartGroup.changed(j3) ? 131072 : 65536;
        }
        if ((i2 & 3670016) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? PKIFailureInfo.badCertTemplate : 524288;
        }
        if ((i2 & 29360128) == 0) {
            i3 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
        }
        if ((i2 & 234881024) == 0) {
            i3 |= composerStartRestartGroup.changed(f5) ? 67108864 : 33554432;
        }
        if ((i2 & 1879048192) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i3 & 1533916891) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1511110220, i3, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:395)");
            }
            int iMo762roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo762roundToPx0680j_4(f);
            int iMo762roundToPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo762roundToPx0680j_4(f5);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM1662constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM835spacedBy0680j_4 = Arrangement.INSTANCE.m835spacedBy0680j_4(f5);
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM835spacedBy0680j_4, centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM1662constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM612backgroundbw27NRU = BackgroundKt.m612backgroundbw27NRU(SizeKt.m884sizeVpY3zN4(companion3, f4, f), j3, shape);
            composerStartRestartGroup.startReplaceableGroup(25775080);
            for (int i5 = 0; i5 < i; i5++) {
                BoxKt.Box(modifierM612backgroundbw27NRU, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            Modifier modifierM612backgroundbw27NRU2 = Modifier.INSTANCE;
            composer2 = composerStartRestartGroup;
            Modifier modifierM884sizeVpY3zN4 = SizeKt.m884sizeVpY3zN4(OffsetKt.offset(modifierM612backgroundbw27NRU2, new t(function1, uVar, i, iMo762roundToPx0680j_42, iMo762roundToPx0680j_4)), f4, f);
            if (i > 0) {
                modifierM612backgroundbw27NRU2 = BackgroundKt.m612backgroundbw27NRU(modifierM612backgroundbw27NRU2, j2, shape);
            }
            BoxKt.Box(modifierM884sizeVpY3zN4.then(modifierM612backgroundbw27NRU2), composer2, 0);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s(uVar, i, modifier, function1, j2, j3, f, f4, f5, shape, i2));
        }
    }

    public static final void b(a0 pagerState, Modifier modifier, int i, Function1 function1, long j2, long j3, float f, float f4, float f5, Shape shape, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        int i5;
        Function1 function12;
        long jM1976copywmQWz5c$default;
        long j5;
        float fM3297constructorimpl;
        float f6;
        float f32;
        Shape circleShape;
        int i6;
        Composer composer2;
        int i21;
        Function1 function13;
        long j16;
        long j22;
        float f35;
        float f36;
        float f37;
        Shape shape2;
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Composer composerStartRestartGroup = composer.startRestartGroup(51399291);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            modifier2 = modifier;
            i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if ((i2 & 896) == 0) {
            i3 |= 128;
        }
        int i22 = i3 | 3072;
        if ((57344 & i2) == 0) {
            i22 = i3 | 11264;
        }
        if ((458752 & i2) == 0) {
            i22 |= 65536;
        }
        int i32 = 1572864 | i22;
        if ((29360128 & i2) == 0) {
            i32 = 5767168 | i22;
        }
        if ((234881024 & i2) == 0) {
            i32 |= 33554432;
        }
        if ((1879048192 & i2) == 0) {
            i32 |= 268435456;
        }
        if ((1533916891 & i32) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            i21 = i;
            function13 = function1;
            j16 = j2;
            j22 = j3;
            f35 = f;
            f36 = f4;
            f37 = f5;
            shape2 = shape;
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                int iIntValue = ((Number) pagerState.d.getValue()).intValue();
                r rVar = r.f269403h;
                long jM1976copywmQWz5c$default2 = Color.m1976copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).getValue(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                i5 = i32 & (-2143806337);
                function12 = rVar;
                jM1976copywmQWz5c$default = Color.m1976copywmQWz5c$default(jM1976copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                j5 = jM1976copywmQWz5c$default2;
                fM3297constructorimpl = Dp.m3297constructorimpl(8);
                f6 = fM3297constructorimpl;
                f32 = f6;
                circleShape = RoundedCornerShapeKt.getCircleShape();
                i6 = iIntValue;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i5 = i32 & (-2143806337);
                i6 = i;
                function12 = function1;
                j5 = j2;
                jM1976copywmQWz5c$default = j3;
                fM3297constructorimpl = f;
                f6 = f4;
                f32 = f5;
                circleShape = shape;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(51399291, i5, -1, "com.google.accompanist.pager.VerticalPagerIndicator (PagerIndicator.kt:290)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1599583166);
            boolean z = (i5 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new u(pagerState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            a((u) objRememberedValue, i6, modifier2, function12, j5, jM1976copywmQWz5c$default, fM3297constructorimpl, f6, f32, circleShape, composer2, ((i5 << 3) & 896) | (i5 & 7168) | (i5 & 3670016));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i21 = i6;
            function13 = function12;
            j16 = j5;
            j22 = jM1976copywmQWz5c$default;
            f35 = fM3297constructorimpl;
            f36 = f6;
            f37 = f32;
            shape2 = circleShape;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s(pagerState, modifier, i21, function13, j16, j22, f35, f36, f37, shape2, i2));
        }
    }
}
