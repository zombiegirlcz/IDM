package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/foundation/pager/PagerCacheWindowLogic;", "Landroidx/compose/foundation/lazy/layout/CacheWindowLogic;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "cacheWindow", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "state", "Lkotlin/Function0;", "", "itemCount", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function0;)V", "", "delta", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "layoutInfo", "", "onScroll", "(FLandroidx/compose/foundation/pager/PagerMeasureResult;)V", "onVisibleItemsChanged", "(Landroidx/compose/foundation/pager/PagerMeasureResult;)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "getCacheWindow", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "Lkotlin/jvm/functions/Function0;", "getItemCount", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/foundation/pager/PagerCacheWindowScope;", "cacheWindowScope", "Landroidx/compose/foundation/pager/PagerCacheWindowScope;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PagerCacheWindowLogic extends CacheWindowLogic {

    @NotNull
    private final LazyLayoutCacheWindow cacheWindow;

    @NotNull
    private final PagerCacheWindowScope cacheWindowScope;

    @NotNull
    private final Function0<Integer> itemCount;

    @NotNull
    private final LazyLayoutPrefetchState state;

    public PagerCacheWindowLogic(@NotNull LazyLayoutCacheWindow lazyLayoutCacheWindow, @NotNull LazyLayoutPrefetchState lazyLayoutPrefetchState, @NotNull Function0<Integer> function0) {
        super(lazyLayoutCacheWindow, false);
        this.cacheWindow = lazyLayoutCacheWindow;
        this.state = lazyLayoutPrefetchState;
        this.itemCount = function0;
        this.cacheWindowScope = new PagerCacheWindowScope(function0);
    }

    public final void onScroll(float delta, @NotNull PagerMeasureResult layoutInfo) {
        this.cacheWindowScope.setLayoutInfo(layoutInfo);
        this.cacheWindowScope.setState(this.state);
        onScroll(this.cacheWindowScope, -delta);
    }

    public final void onVisibleItemsChanged(@NotNull PagerMeasureResult layoutInfo) {
        this.cacheWindowScope.setLayoutInfo(layoutInfo);
        this.cacheWindowScope.setState(this.state);
        onVisibleItemsUpdated(this.cacheWindowScope);
    }
}
