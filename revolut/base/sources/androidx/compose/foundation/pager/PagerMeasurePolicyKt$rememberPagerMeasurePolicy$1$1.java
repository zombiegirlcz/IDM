package androidx.compose.foundation.pager;

import androidx.collection.IntObjectMapKt;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 implements LazyLayoutMeasurePolicy {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-unit-Dp$-pageSpacing$0, reason: not valid java name */
    final /* synthetic */ float f37$$v$c$androidxcomposeuiunitDp$pageSpacing$0;
    final /* synthetic */ int $beyondViewportPageCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Function0<PagerLazyLayoutItemProvider> $itemProviderLambda;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ Function0<Integer> $pageCount;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ SnapPosition $snapPosition;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    public PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(PagerState pagerState, Orientation orientation, PaddingValues paddingValues, boolean z, float f, PageSize pageSize, Function0<PagerLazyLayoutItemProvider> function0, Function0<Integer> function02, Alignment.Vertical vertical, Alignment.Horizontal horizontal, int i, SnapPosition snapPosition, CoroutineScope coroutineScope) {
        this.$state = pagerState;
        this.$orientation = orientation;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z;
        this.f37$$v$c$androidxcomposeuiunitDp$pageSpacing$0 = f;
        this.$pageSize = pageSize;
        this.$itemProviderLambda = function0;
        this.$pageCount = function02;
        this.$verticalAlignment = vertical;
        this.$horizontalAlignment = horizontal;
        this.$beyondViewportPageCount = i;
        this.$snapPosition = snapPosition;
        this.$coroutineScope = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult measure_0kLqBqw$lambda$2(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2, int i, int i2, int i3, int i5, Function1 function1) {
        return lazyLayoutMeasureScope.layout(ConstraintsKt.m3292constrainWidthK40F9xA(j2, i3 + i), ConstraintsKt.m3291constrainHeightK40F9xA(j2, i5 + i2), r0.g(), function1);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
    /* JADX INFO: renamed from: measure-0kLqBqw */
    public final MeasureResult mo899measure0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j2) {
        long jM3329constructorimpl;
        ObservableScopeInvalidator.m936attachToScopeimpl(this.$state.m955getMeasurementScopeInvalidatorzYiylxw$foundation());
        Orientation orientation = this.$orientation;
        Orientation orientation2 = Orientation.Vertical;
        boolean z = orientation == orientation2;
        CheckScrollableContainerConstraintsKt.m625checkScrollableContainerConstraintsK40F9xA(j2, z ? orientation2 : Orientation.Horizontal);
        int iMo762roundToPx0680j_4 = z ? lazyLayoutMeasureScope.mo762roundToPx0680j_4(this.$contentPadding.mo850calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo762roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        int iMo762roundToPx0680j_42 = z ? lazyLayoutMeasureScope.mo762roundToPx0680j_4(this.$contentPadding.mo851calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo762roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        int iMo762roundToPx0680j_43 = lazyLayoutMeasureScope.mo762roundToPx0680j_4(this.$contentPadding.getTop());
        int iMo762roundToPx0680j_44 = lazyLayoutMeasureScope.mo762roundToPx0680j_4(this.$contentPadding.getBottom());
        final int i = iMo762roundToPx0680j_43 + iMo762roundToPx0680j_44;
        final int i2 = iMo762roundToPx0680j_4 + iMo762roundToPx0680j_42;
        int i3 = z ? i : i2;
        int i5 = (!z || this.$reverseLayout) ? (z && this.$reverseLayout) ? iMo762roundToPx0680j_44 : (z || this.$reverseLayout) ? iMo762roundToPx0680j_42 : iMo762roundToPx0680j_4 : iMo762roundToPx0680j_43;
        int i6 = i3 - i5;
        long jM3293offsetNN6EwU = ConstraintsKt.m3293offsetNN6EwU(j2, -i2, -i);
        this.$state.setDensity$foundation(lazyLayoutMeasureScope);
        int iMo762roundToPx0680j_45 = lazyLayoutMeasureScope.mo762roundToPx0680j_4(this.f37$$v$c$androidxcomposeuiunitDp$pageSpacing$0);
        int iM3278getMaxHeightimpl = z ? Constraints.m3278getMaxHeightimpl(j2) - i : Constraints.m3279getMaxWidthimpl(j2) - i2;
        if (!this.$reverseLayout || iM3278getMaxHeightimpl > 0) {
            jM3329constructorimpl = IntOffset.m3329constructorimpl((((long) iMo762roundToPx0680j_4) << 32) | (((long) iMo762roundToPx0680j_43) & BodyPartID.bodyIdMax));
        } else {
            if (!z) {
                iMo762roundToPx0680j_4 += iM3278getMaxHeightimpl;
            }
            if (z) {
                iMo762roundToPx0680j_43 += iM3278getMaxHeightimpl;
            }
            jM3329constructorimpl = IntOffset.m3329constructorimpl((((long) iMo762roundToPx0680j_4) << 32) | (((long) iMo762roundToPx0680j_43) & BodyPartID.bodyIdMax));
        }
        int iCalculateMainAxisPageSize = this.$pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope, iM3278getMaxHeightimpl, iMo762roundToPx0680j_45);
        int i21 = iCalculateMainAxisPageSize < 0 ? 0 : iCalculateMainAxisPageSize;
        this.$state.m958setPremeasureConstraintsBRTryo0$foundation(ConstraintsKt.Constraints$default(0, this.$orientation == orientation2 ? Constraints.m3279getMaxWidthimpl(jM3293offsetNN6EwU) : i21, 0, this.$orientation != orientation2 ? Constraints.m3278getMaxHeightimpl(jM3293offsetNN6EwU) : i21, 5, null));
        PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = (PagerLazyLayoutItemProvider) this.$itemProviderLambda.invoke();
        int i22 = iM3278getMaxHeightimpl + i5 + i6;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        PagerState pagerState = this.$state;
        SnapPosition snapPosition = this.$snapPosition;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int iMatchScrollPositionWithKey$foundation = pagerState.matchScrollPositionWithKey$foundation(pagerLazyLayoutItemProvider, pagerState.getCurrentPage());
            int iCurrentPageOffset = PagerKt.currentPageOffset(snapPosition, i22, i21, iMo762roundToPx0680j_45, i5, i6, pagerState.getCurrentPage(), pagerState.getCurrentPageOffsetFraction(), pagerState.getPageCount());
            Unit unit = Unit.f186387a;
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            PagerMeasureResult pagerMeasureResultM952measurePager7L1iB3k = PagerMeasureKt.m952measurePager7L1iB3k(lazyLayoutMeasureScope, ((Number) this.$pageCount.invoke()).intValue(), pagerLazyLayoutItemProvider, iM3278getMaxHeightimpl, i5, i6, iMo762roundToPx0680j_45, iMatchScrollPositionWithKey$foundation, iCurrentPageOffset, jM3293offsetNN6EwU, this.$orientation, this.$verticalAlignment, this.$horizontalAlignment, this.$reverseLayout, jM3329constructorimpl, i21, this.$beyondViewportPageCount, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProvider, this.$state.getPinnedPages(), this.$state.getBeyondBoundsInfo()), this.$snapPosition, this.$state.m956getPlacementScopeInvalidatorzYiylxw$foundation(), this.$coroutineScope, lazyLayoutMeasureScope, new Function3() { // from class: androidx.compose.foundation.pager.e
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1.measure_0kLqBqw$lambda$2(lazyLayoutMeasureScope, j2, i2, i, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), (Function1) obj4);
                }
            }, IntObjectMapKt.mutableIntObjectMapOf());
            PagerState.applyMeasureResult$foundation$default(this.$state, pagerMeasureResultM952measurePager7L1iB3k, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
            PagerMeasurePolicyKt.keepAroundItems(lazyLayoutMeasureScope, this.$state.getCacheWindowLogic(), pagerMeasureResultM952measurePager7L1iB3k.getVisiblePagesInfo());
            return pagerMeasureResultM952measurePager7L1iB3k;
        } catch (Throwable th10) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th10;
        }
    }
}
