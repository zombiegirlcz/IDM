package tb;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class o {
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0371  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r27, androidx.compose.ui.Modifier r28, tb.a0 r29, float r30, androidx.compose.foundation.gestures.FlingBehavior r31, androidx.compose.foundation.layout.PaddingValues r32, boolean r33, androidx.compose.ui.Alignment.Vertical r34, androidx.compose.ui.Alignment.Horizontal r35, oim.n r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.o.a(int, androidx.compose.ui.Modifier, tb.a0, float, androidx.compose.foundation.gestures.FlingBehavior, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.ui.Alignment$Vertical, androidx.compose.ui.Alignment$Horizontal, oim.n, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(int i, Modifier modifier, a0 state, float f, PaddingValues paddingValues, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z, oim.n content, Composer composer, int i2, int i3) {
        int i5;
        PaddingValues paddingValues2;
        int i6;
        Alignment.Horizontal centerHorizontally;
        int i21;
        int i22;
        FlingBehavior flingBehavior2;
        boolean z3;
        int i32;
        float f4;
        boolean z4;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior3;
        float f5;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(323934645);
        if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(state) ? 256 : 128;
        }
        int i33 = i5 | 27648;
        if ((458752 & i2) == 0) {
            paddingValues2 = paddingValues;
            i33 |= composerStartRestartGroup.changed(paddingValues2) ? 131072 : 65536;
        } else {
            paddingValues2 = paddingValues;
        }
        int i43 = 1572864 | i33;
        if ((i2 & 29360128) == 0) {
            i43 = 5767168 | i33;
        }
        int i59 = 905969664 | i43;
        if ((i3 & 14) == 0) {
            i6 = i3 | (composerStartRestartGroup.changedInstance(content) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((1533916891 & i59) == 306783378 && (i6 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            f5 = f;
            horizontal2 = horizontal;
            flingBehavior3 = flingBehavior;
            z4 = z;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                float fM3297constructorimpl = Dp.m3297constructorimpl(0);
                centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Function3 function3 = q.f269402a;
                i21 = 29360128;
                float bottom = paddingValues2.getBottom();
                int i66 = ((i59 >> 6) & 14) | 24576;
                Intrinsics.checkNotNullParameter(state, "state");
                composerStartRestartGroup.startReplaceableGroup(132228799);
                DecayAnimationSpec decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composerStartRestartGroup, 0);
                SpringSpec springSpec = w9m.m.f295787a;
                if (ComposerKt.isTraceInProgress()) {
                    i22 = i59;
                    ComposerKt.traceEventStart(132228799, i66, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:220)");
                } else {
                    i22 = i59;
                }
                int i74 = (i66 & 14) | 197184;
                Intrinsics.checkNotNullParameter(state, "state");
                p snapIndex = p.f;
                Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
                composerStartRestartGroup.startReplaceableGroup(-776119664);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-776119664, i74, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:181)");
                }
                LazyListState lazyListState = state.f269374a;
                Function2 function2 = w9m.e.f295768a;
                w9m.d dVar = w9m.d.i;
                Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
                composerStartRestartGroup.startReplaceableGroup(-632875458);
                Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                composerStartRestartGroup.startReplaceableGroup(-1050829263);
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                boolean zChanged = composerStartRestartGroup.changed(lazyListState) | composerStartRestartGroup.changed(dVar);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new w9m.b(lazyListState, dVar);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                w9m.b layoutInfo = (w9m.b) objRememberedValue;
                layoutInfo.f295765c.setValue(Integer.valueOf(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo762roundToPx0680j_4(bottom)));
                composerStartRestartGroup.endReplaceableGroup();
                Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
                composerStartRestartGroup.startReplaceableGroup(-632874525);
                Object[] objArr = {layoutInfo, decayAnimationSpecRememberSplineBasedDecay, springSpec, snapIndex};
                composerStartRestartGroup.startReplaceableGroup(-3685570);
                int i92 = 0;
                boolean zChanged2 = false;
                while (i92 < 4) {
                    Object obj2 = objArr[i92];
                    i92++;
                    zChanged2 |= composerStartRestartGroup.changed(obj2);
                }
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new w9m.k(layoutInfo, decayAnimationSpecRememberSplineBasedDecay, springSpec);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                w9m.k kVar = (w9m.k) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                flingBehavior2 = kVar;
                z3 = true;
                i32 = i22 & (-29360129);
                f4 = fM3297constructorimpl;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                centerHorizontally = horizontal;
                flingBehavior2 = flingBehavior;
                z3 = z;
                i32 = i59 & (-29360129);
                i21 = 29360128;
                f4 = f;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(323934645, i32, i6, "com.google.accompanist.pager.VerticalPager (Pager.kt:346)");
            }
            int i96 = ((i32 >> 15) & 112) | ((i6 << 6) & 896);
            Alignment.Horizontal horizontal3 = centerHorizontally;
            a(i, modifier, state, f4, flingBehavior2, paddingValues, z3, null, horizontal3, content, composerStartRestartGroup, (i32 & 14) | 196608 | (i32 & 112) | (i32 & 896) | (i32 & 7168) | (57344 & i32) | ((i32 >> 3) & i21) | ((i32 << 9) & 234881024) | (1879048192 & i32), i96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z3;
            horizontal2 = horizontal3;
            flingBehavior3 = flingBehavior2;
            f5 = f4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new n(i, modifier, state, f5, paddingValues, horizontal2, flingBehavior3, z4, content, i2, i3));
        }
    }
}
