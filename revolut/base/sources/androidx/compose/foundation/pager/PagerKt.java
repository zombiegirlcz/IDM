package androidx.compose.foundation.pager;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import oim.n;
import org.jetbrains.annotations.NotNull;
import skm.e0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÃ\u0001\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001e0\u001cH\u0007¢\u0006\u0004\b \u0010!\u001aS\u0010+\u001a\u00020\b*\u00020\u00182\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\bH\u0000¢\u0006\u0004\b+\u0010,\u001a3\u00100\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "", "beyondViewportPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "flingBehavior", "", "userScrollEnabled", "reverseLayout", "Lkotlin/Function1;", "", "key", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "", "pageContent", "HorizontalPager--8jOkeI", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/foundation/OverscrollEffect;Loim/n;Landroidx/compose/runtime/Composer;III)V", "HorizontalPager", "layoutSize", "spaceBetweenPages", "beforeContentPadding", "afterContentPadding", "currentPage", "", "currentPageOffsetFraction", "pageCount", "currentPageOffset", "(Landroidx/compose/foundation/gestures/snapping/SnapPosition;IIIIIIFI)I", "isVertical", "Lkotlinx/coroutines/CoroutineScope;", "scope", "pagerSemantics", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLkotlinx/coroutines/CoroutineScope;Z)Landroidx/compose/ui/Modifier;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PagerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: HorizontalPager--8jOkeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m949HorizontalPager8jOkeI(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.pager.PagerState r36, androidx.compose.ui.Modifier r37, androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.foundation.pager.PageSize r39, int r40, float r41, androidx.compose.ui.Alignment.Vertical r42, androidx.compose.foundation.gestures.TargetedFlingBehavior r43, boolean r44, boolean r45, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r46, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r47, androidx.compose.foundation.gestures.snapping.SnapPosition r48, androidx.compose.foundation.OverscrollEffect r49, @org.jetbrains.annotations.NotNull final oim.n r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m949HorizontalPager8jOkeI(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, androidx.compose.foundation.OverscrollEffect, oim.n, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalPager__8jOkeI$lambda$0(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z3, Function1 function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, OverscrollEffect overscrollEffect, n nVar, int i2, int i3, int i5, Composer composer, int i6) {
        m949HorizontalPager8jOkeI(pagerState, modifier, paddingValues, pageSize, i, f, vertical, targetedFlingBehavior, z, z3, function1, nestedScrollConnection, snapPosition, overscrollEffect, nVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i5);
        return Unit.f186387a;
    }

    public static final int currentPageOffset(@NotNull SnapPosition snapPosition, int i, int i2, int i3, int i5, int i6, int i21, float f, int i22) {
        return rim.d.c(snapPosition.position(i, i2, i5, i6, i21, i22) - (f * (i2 + i3)));
    }

    @NotNull
    public static final Modifier pagerSemantics(@NotNull Modifier modifier, @NotNull PagerState pagerState, boolean z, @NotNull CoroutineScope coroutineScope, boolean z3) {
        return z3 ? modifier.then(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new l1.e(z, pagerState, coroutineScope, 0), 1, null)) : modifier.then(Modifier.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pagerSemantics$lambda$0(boolean z, final PagerState pagerState, final CoroutineScope coroutineScope, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (z) {
            final int i = 0;
            SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new Function0() { // from class: l1.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean zPagerSemantics$performBackwardPaging;
                    switch (i) {
                        case 0:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope);
                            break;
                        case 1:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope);
                            break;
                        case 2:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope);
                            break;
                        default:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope);
                            break;
                    }
                    return Boolean.valueOf(zPagerSemantics$performBackwardPaging);
                }
            }, 1, null);
            final int i2 = 1;
            SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new Function0() { // from class: l1.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean zPagerSemantics$performBackwardPaging;
                    switch (i2) {
                        case 0:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope);
                            break;
                        case 1:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope);
                            break;
                        case 2:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope);
                            break;
                        default:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope);
                            break;
                    }
                    return Boolean.valueOf(zPagerSemantics$performBackwardPaging);
                }
            }, 1, null);
        } else {
            final int i3 = 2;
            SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new Function0() { // from class: l1.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean zPagerSemantics$performBackwardPaging;
                    switch (i3) {
                        case 0:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope);
                            break;
                        case 1:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope);
                            break;
                        case 2:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope);
                            break;
                        default:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope);
                            break;
                    }
                    return Boolean.valueOf(zPagerSemantics$performBackwardPaging);
                }
            }, 1, null);
            final int i5 = 3;
            SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new Function0() { // from class: l1.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean zPagerSemantics$performBackwardPaging;
                    switch (i5) {
                        case 0:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope);
                            break;
                        case 1:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope);
                            break;
                        case 2:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope);
                            break;
                        default:
                            zPagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope);
                            break;
                    }
                    return Boolean.valueOf(zPagerSemantics$performBackwardPaging);
                }
            }, 1, null);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        e0.C(coroutineScope, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        e0.C(coroutineScope, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3);
        return true;
    }
}
