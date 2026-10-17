package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.KotlinNothingValueException;
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
public final class LazyListKt$rememberLazyListMeasurePolicy$1$1 implements LazyLayoutMeasurePolicy {
    final /* synthetic */ int $beyondBoundsItemCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ GraphicsContext $graphicsContext;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Function0<LazyListItemProvider> $itemProviderLambda;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ StickyItemsPlacement $stickyItemsPlacement;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1(LazyListState lazyListState, boolean z, PaddingValues paddingValues, boolean z3, Function0<? extends LazyListItemProvider> function0, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, CoroutineScope coroutineScope, GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement, Alignment.Horizontal horizontal2, Alignment.Vertical vertical2) {
        this.$state = lazyListState;
        this.$isVertical = z;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z3;
        this.$itemProviderLambda = function0;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$beyondBoundsItemCount = i;
        this.$coroutineScope = coroutineScope;
        this.$graphicsContext = graphicsContext;
        this.$stickyItemsPlacement = stickyItemsPlacement;
        this.$horizontalAlignment = horizontal2;
        this.$verticalAlignment = vertical2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult measure_0kLqBqw$lambda$3(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2, int i, int i2, int i3, int i5, Function1 function1) {
        return lazyLayoutMeasureScope.layout(ConstraintsKt.m3292constrainWidthK40F9xA(j2, i3 + i), ConstraintsKt.m3291constrainHeightK40F9xA(j2, i5 + i2), r0.g(), function1);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
    /* JADX INFO: renamed from: measure-0kLqBqw, reason: not valid java name */
    public final MeasureResult mo899measure0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j2) {
        float spacing;
        LazyListItemProvider lazyListItemProvider;
        long jM3329constructorimpl;
        ObservableScopeInvalidator.m936attachToScopeimpl(this.$state.m911getMeasurementScopeInvalidatorzYiylxw$foundation());
        boolean z = this.$state.getHasLookaheadOccurred() || lazyLayoutMeasureScope.isLookingAhead();
        CheckScrollableContainerConstraintsKt.m625checkScrollableContainerConstraintsK40F9xA(j2, this.$isVertical ? Orientation.Vertical : Orientation.Horizontal);
        int iMo762roundToPx0680j_4 = this.$isVertical ? lazyLayoutMeasureScope.mo762roundToPx0680j_4(this.$contentPadding.mo850calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo762roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        int iMo762roundToPx0680j_42 = this.$isVertical ? lazyLayoutMeasureScope.mo762roundToPx0680j_4(this.$contentPadding.mo851calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo762roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        int iMo762roundToPx0680j_43 = lazyLayoutMeasureScope.mo762roundToPx0680j_4(this.$contentPadding.getTop());
        int iMo762roundToPx0680j_44 = lazyLayoutMeasureScope.mo762roundToPx0680j_4(this.$contentPadding.getBottom());
        final int i = iMo762roundToPx0680j_43 + iMo762roundToPx0680j_44;
        final int i2 = iMo762roundToPx0680j_4 + iMo762roundToPx0680j_42;
        boolean z3 = this.$isVertical;
        int i3 = z3 ? i : i2;
        final int i5 = (!z3 || this.$reverseLayout) ? (z3 && this.$reverseLayout) ? iMo762roundToPx0680j_44 : (z3 || this.$reverseLayout) ? iMo762roundToPx0680j_42 : iMo762roundToPx0680j_4 : iMo762roundToPx0680j_43;
        final int i6 = i3 - i5;
        final long jM3293offsetNN6EwU = ConstraintsKt.m3293offsetNN6EwU(j2, -i2, -i);
        LazyListItemProvider lazyListItemProvider2 = (LazyListItemProvider) this.$itemProviderLambda.invoke();
        lazyListItemProvider2.getItemScope().setMaxSize(Constraints.m3279getMaxWidthimpl(jM3293offsetNN6EwU), Constraints.m3278getMaxHeightimpl(jM3293offsetNN6EwU));
        if (this.$isVertical) {
            Arrangement.Vertical vertical = this.$verticalArrangement;
            if (vertical == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                throw new KotlinNothingValueException();
            }
            spacing = vertical.getSpacing();
        } else {
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            if (horizontal == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment when isVertical == false");
                throw new KotlinNothingValueException();
            }
            spacing = horizontal.getSpacing();
        }
        final int iMo762roundToPx0680j_45 = lazyLayoutMeasureScope.mo762roundToPx0680j_4(spacing);
        final int itemCount = lazyListItemProvider2.getItemCount();
        int iM3278getMaxHeightimpl = this.$isVertical ? Constraints.m3278getMaxHeightimpl(j2) - i : Constraints.m3279getMaxWidthimpl(j2) - i2;
        if (!this.$reverseLayout || iM3278getMaxHeightimpl > 0) {
            lazyListItemProvider = lazyListItemProvider2;
            jM3329constructorimpl = IntOffset.m3329constructorimpl((((long) iMo762roundToPx0680j_4) << 32) | (((long) iMo762roundToPx0680j_43) & BodyPartID.bodyIdMax));
        } else {
            boolean z4 = this.$isVertical;
            if (!z4) {
                iMo762roundToPx0680j_4 += iM3278getMaxHeightimpl;
            }
            if (z4) {
                iMo762roundToPx0680j_43 += iM3278getMaxHeightimpl;
            }
            lazyListItemProvider = lazyListItemProvider2;
            jM3329constructorimpl = IntOffset.m3329constructorimpl((((long) iMo762roundToPx0680j_4) << 32) | (((long) iMo762roundToPx0680j_43) & BodyPartID.bodyIdMax));
        }
        final boolean z6 = this.$isVertical;
        final Alignment.Horizontal horizontal2 = this.$horizontalAlignment;
        final long j3 = jM3329constructorimpl;
        final LazyListItemProvider lazyListItemProvider3 = lazyListItemProvider;
        final Alignment.Vertical vertical2 = this.$verticalAlignment;
        final boolean z11 = this.$reverseLayout;
        final LazyListState lazyListState = this.$state;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(jM3293offsetNN6EwU, z6, lazyListItemProvider3, lazyLayoutMeasureScope, itemCount, iMo762roundToPx0680j_45, horizontal2, vertical2, z11, i5, i6, j3, lazyListState) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
            final /* synthetic */ int $afterContentPadding;
            final /* synthetic */ int $beforeContentPadding;
            final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ int $itemsCount;
            final /* synthetic */ boolean $reverseLayout;
            final /* synthetic */ int $spaceBetweenItems;
            final /* synthetic */ LazyListState $state;
            final /* synthetic */ LazyLayoutMeasureScope $this_LazyLayoutMeasurePolicy;
            final /* synthetic */ Alignment.Vertical $verticalAlignment;
            final /* synthetic */ long $visualItemOffset;

            {
                this.$isVertical = z6;
                this.$this_LazyLayoutMeasurePolicy = lazyLayoutMeasureScope;
                this.$itemsCount = itemCount;
                this.$spaceBetweenItems = iMo762roundToPx0680j_45;
                this.$horizontalAlignment = horizontal2;
                this.$verticalAlignment = vertical2;
                this.$reverseLayout = z11;
                this.$beforeContentPadding = i5;
                this.$afterContentPadding = i6;
                this.$visualItemOffset = j3;
                this.$state = lazyListState;
            }

            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
            /* JADX INFO: renamed from: createItem-X9ElhV4, reason: not valid java name */
            public LazyListMeasuredItem mo900createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
                return new LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_LazyLayoutMeasurePolicy.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, this.$state.getItemAnimator$foundation(), constraints, null);
            }
        };
        Snapshot.Companion companion = Snapshot.INSTANCE;
        LazyListState lazyListState2 = this.$state;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation = lazyListState2.updateScrollPositionIfTheFirstItemWasMoved$foundation(lazyListItemProvider3, lazyListState2.getFirstVisibleItemIndex());
            int firstVisibleItemScrollOffset = lazyListState2.getFirstVisibleItemScrollOffset();
            Unit unit = Unit.f186387a;
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            LazyListMeasureResult lazyListMeasureResultM902measureLazyList_s_dbAc = LazyListMeasureKt.m902measureLazyList_s_dbAc(itemCount, lazyListMeasuredItemProvider, iM3278getMaxHeightimpl, i5, i6, iMo762roundToPx0680j_45, iUpdateScrollPositionIfTheFirstItemWasMoved$foundation, firstVisibleItemScrollOffset, (lazyLayoutMeasureScope.isLookingAhead() || !z) ? this.$state.getScrollToBeConsumed() : this.$state.getScrollDeltaBetweenPasses$foundation(), jM3293offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getItemAnimator$foundation(), this.$beyondBoundsItemCount, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyListItemProvider3, this.$state.getPinnedItems(), this.$state.getBeyondBoundsInfo()), z, lazyLayoutMeasureScope.isLookingAhead(), this.$coroutineScope, this.$state.m912getPlacementScopeInvalidatorzYiylxw$foundation(), this.$graphicsContext, this.$stickyItemsPlacement, new Function3() { // from class: androidx.compose.foundation.lazy.c
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return LazyListKt$rememberLazyListMeasurePolicy$1$1.measure_0kLqBqw$lambda$3(lazyLayoutMeasureScope, j2, i2, i, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), (Function1) obj4);
                }
            });
            LazyListState.applyMeasureResult$foundation$default(this.$state, lazyListMeasureResultM902measureLazyList_s_dbAc, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
            Object prefetchStrategy = this.$state.getPrefetchStrategy();
            CacheWindowLogic cacheWindowLogic = prefetchStrategy instanceof CacheWindowLogic ? (CacheWindowLogic) prefetchStrategy : null;
            if (cacheWindowLogic != null) {
                LazyListKt.keepAroundItems(cacheWindowLogic, lazyListMeasureResultM902measureLazyList_s_dbAc.getVisibleItemsInfo(), lazyListMeasuredItemProvider);
            }
            return lazyListMeasureResultM902measureLazyList_s_dbAc;
        } catch (Throwable th10) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th10;
        }
    }
}
