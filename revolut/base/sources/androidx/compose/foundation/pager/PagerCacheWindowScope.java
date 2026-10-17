package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import androidx.compose.foundation.lazy.layout.CachedItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0018R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0018R\u0014\u00103\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0018R\u0014\u00105\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0018R\u0014\u00107\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0018R\u0014\u00109\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0018R\u0016\u0010=\u001a\u0004\u0018\u00010:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0018¨\u0006@"}, d2 = {"Landroidx/compose/foundation/pager/PagerCacheWindowScope;", "Landroidx/compose/foundation/lazy/layout/CacheWindowScope;", "Lkotlin/Function0;", "", "itemCount", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "lineIndex", "Lkotlin/Function2;", "", "onItemPrefetched", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch", "(ILkotlin/jvm/functions/Function2;)Ljava/util/List;", "indexInVisibleLines", "getVisibleItemSize", "(I)I", "getVisibleItemLine", "", "getVisibleLineKey", "(I)Ljava/lang/Object;", "getLastIndexInLine", "getLastLineIndex", "()I", "Lkotlin/jvm/functions/Function0;", "getItemCount", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "layoutInfo", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "getLayoutInfo", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "setLayoutInfo", "(Landroidx/compose/foundation/pager/PagerMeasureResult;)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "setState", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;)V", "getTotalItemsCount", "totalItemsCount", "", "getHasVisibleItems", "()Z", "hasVisibleItems", "getMainAxisExtraSpaceStart", "mainAxisExtraSpaceStart", "getMainAxisExtraSpaceEnd", "mainAxisExtraSpaceEnd", "getFirstVisibleLineIndex", "firstVisibleLineIndex", "getLastVisibleLineIndex", "lastVisibleLineIndex", "getMainAxisViewportSize", "mainAxisViewportSize", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "getVisibleLineCount", "visibleLineCount", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PagerCacheWindowScope implements CacheWindowScope {

    @NotNull
    private final Function0<Integer> itemCount;
    public PagerMeasureResult layoutInfo;
    public LazyLayoutPrefetchState state;

    public PagerCacheWindowScope(@NotNull Function0<Integer> function0) {
        this.itemCount = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit schedulePrefetch$lambda$0(Function2 function2, PagerCacheWindowScope pagerCacheWindowScope, LazyLayoutPrefetchState.PrefetchResultScope prefetchResultScope) {
        function2.invoke(Integer.valueOf(prefetchResultScope.getIndex()), Integer.valueOf(pagerCacheWindowScope.getLayoutInfo().getPageSize()));
        return Unit.f186387a;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Density getDensity() {
        return getLayoutInfo().getDensity();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getFirstVisibleLineIndex() {
        long index = ((long) ((MeasuredPage) d0.b0(getLayoutInfo().getVisiblePagesInfo())).getIndex()) - ((long) getLayoutInfo().getBeyondViewportPageCount());
        if (index < 0) {
            index = 0;
        }
        return (int) index;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public boolean getHasVisibleItems() {
        return !getLayoutInfo().getVisiblePagesInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastIndexInLine(int lineIndex) {
        return lineIndex;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastLineIndex() {
        if (getTotalItemsCount() == 0) {
            return -1;
        }
        return getTotalItemsCount() - 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastVisibleLineIndex() {
        long index = ((long) ((MeasuredPage) d0.m0(getLayoutInfo().getVisiblePagesInfo())).getIndex()) + ((long) getLayoutInfo().getBeyondViewportPageCount());
        long totalItemsCount = ((long) getTotalItemsCount()) - 1;
        if (index > totalItemsCount) {
            index = totalItemsCount;
        }
        return (int) index;
    }

    @NotNull
    public final PagerMeasureResult getLayoutInfo() {
        PagerMeasureResult pagerMeasureResult = this.layoutInfo;
        if (pagerMeasureResult != null) {
            return pagerMeasureResult;
        }
        Intrinsics.r("layoutInfo");
        throw null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceEnd() {
        return Math.abs((getLayoutInfo().getPageSpacing() + (getLayoutInfo().getPageSize() + ((MeasuredPage) d0.m0(getLayoutInfo().getVisiblePagesInfo())).getOffset())) - getLayoutInfo().getViewportEndOffset());
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceStart() {
        int beforeContentPadding = getLayoutInfo().getBeforeContentPadding() + ((MeasuredPage) d0.b0(getLayoutInfo().getVisiblePagesInfo())).getOffset();
        if (beforeContentPadding > 0) {
            beforeContentPadding = 0;
        }
        return Math.abs(beforeContentPadding);
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisViewportSize() {
        return PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo());
    }

    @NotNull
    public final LazyLayoutPrefetchState getState() {
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.state;
        if (lazyLayoutPrefetchState != null) {
            return lazyLayoutPrefetchState;
        }
        Intrinsics.r("state");
        throw null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getTotalItemsCount() {
        return ((Number) this.itemCount.invoke()).intValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleItemLine(int indexInVisibleLines) {
        int size = getLayoutInfo().getExtraPagesBefore().size();
        int size2 = getLayoutInfo().getVisiblePagesInfo().size();
        if (indexInVisibleLines < size) {
            return getLayoutInfo().getExtraPagesBefore().get(indexInVisibleLines).getIndex();
        }
        if (indexInVisibleLines >= size && indexInVisibleLines < size + size2) {
            return getLayoutInfo().getVisiblePagesInfo().get(indexInVisibleLines - size).getIndex();
        }
        if (indexInVisibleLines >= size + size2) {
            return getLayoutInfo().getExtraPagesAfter().get((indexInVisibleLines - size) - size2).getIndex();
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleItemSize(int indexInVisibleLines) {
        return getLayoutInfo().getPageSize();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleLineCount() {
        return getLayoutInfo().getExtraPagesAfter().size() + getLayoutInfo().getVisiblePagesInfo().size() + getLayoutInfo().getExtraPagesBefore().size();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    @NotNull
    public Object getVisibleLineKey(int indexInVisibleLines) {
        int size = getLayoutInfo().getExtraPagesBefore().size();
        int size2 = getLayoutInfo().getVisiblePagesInfo().size();
        return indexInVisibleLines < size ? getLayoutInfo().getExtraPagesBefore().get(indexInVisibleLines).getKey() : (indexInVisibleLines < size || indexInVisibleLines >= size + size2) ? indexInVisibleLines >= size + size2 ? getLayoutInfo().getExtraPagesAfter().get((indexInVisibleLines - size) - size2).getKey() : CachedItem.INSTANCE : getLayoutInfo().getVisiblePagesInfo().get(indexInVisibleLines - size).getKey();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    @NotNull
    public List<LazyLayoutPrefetchState.PrefetchHandle> schedulePrefetch(int lineIndex, @NotNull Function2<? super Integer, ? super Integer, Unit> onItemPrefetched) {
        return u.c(getState().m934schedulePrecompositionAndPremeasure_EkL_Y$foundation(lineIndex, getLayoutInfo().getChildConstraints(), true, new d(onItemPrefetched, this, 0)));
    }

    public final void setLayoutInfo(@NotNull PagerMeasureResult pagerMeasureResult) {
        this.layoutInfo = pagerMeasureResult;
    }

    public final void setState(@NotNull LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.state = lazyLayoutPrefetchState;
    }
}
