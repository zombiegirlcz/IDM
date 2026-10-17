package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.AndroidTrace_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b#\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020\u0011J\b\u0010#\u001a\u00020 H\u0002J\n\u0010$\u001a\u00020 *\u00020!J\u0006\u0010%\u001a\u00020\u0005J\u0014\u0010&\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020\u0011H\u0002J\u0014\u0010'\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020\u0011H\u0002J\u0014\u0010(\u001a\u00020 *\u00020!2\u0006\u0010)\u001a\u00020\u0005H\u0002J\f\u0010*\u001a\u00020 *\u00020!H\u0002J\u0006\u0010+\u001a\u00020 JD\u0010,\u001a\u00020 *\u00020!2\u0006\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u0005H\u0002J@\u00104\u001a\u00020 2\u0006\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0013H\u0002J\u001c\u00106\u001a\u00020\u0013*\u00020!2\u0006\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u0005H\u0002J\u0018\u00109\u001a\u00020 2\u0006\u00107\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0013H\u0002J \u0010;\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u0001H\u0002J \u0010=\u001a\u00020 2\u0006\u00107\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0013H\u0002J\u0018\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u0013H\u0002J\u001c\u0010A\u001a\u00020 *\u00020!2\u0006\u00107\u001a\u00020\u00132\u0006\u0010B\u001a\u00020\u0013H\u0002J\f\u0010C\u001a\u00020 *\u00020!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Landroidx/compose/foundation/lazy/layout/CacheWindowLogic;", "", "cacheWindow", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "enableInitialPrefetch", "", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;Z)V", "prefetchWindowHandles", "Landroidx/collection/MutableIntObjectMap;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "indicesToRemove", "Landroidx/collection/MutableIntSet;", "windowCache", "Landroidx/compose/foundation/lazy/layout/CachedItem;", "previousPassDelta", "", "previousPassItemCount", "", "hasUpdatedVisibleItemsOnce", "value", "prefetchWindowStartLine", "getPrefetchWindowStartLine$foundation", "()I", "prefetchWindowEndLine", "getPrefetchWindowEndLine$foundation", "prefetchWindowStartExtraSpace", "prefetchWindowEndExtraSpace", "shouldRefillWindow", "itemsCount", "onScroll", "", "Landroidx/compose/foundation/lazy/layout/CacheWindowScope;", "delta", "traceWindowInfo", "onVisibleItemsUpdated", "hasValidBounds", "fillCacheWindowBackward", "fillCacheWindowForward", "refillWindow", "refillForward", "onDatasetChangedSize", "resetStrategy", "onPrefetchForward", "visibleWindowStart", "visibleWindowEnd", "prefetchForwardWindow", "mainAxisExtraSpaceEnd", "mainAxisExtraSpaceStart", "scrollDelta", "applyForwardPrefetch", "onKeepAround", "keepAroundWindow", "getItemSizeOrPrefetch", "index", "isUrgent", "cachePrefetchedItem", "size", "updateOrCreateCachedItem", "key", "cacheVisibleItemsInfo", "removeOutOfBoundsItems", "startLine", "endLine", "onItemPrefetched", "itemSize", "scheduleNextItemIfNeeded", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CacheWindowLogic {

    @NotNull
    private final LazyLayoutCacheWindow cacheWindow;
    private final boolean enableInitialPrefetch;
    private boolean hasUpdatedVisibleItemsOnce;
    private int itemsCount;
    private int prefetchWindowEndExtraSpace;
    private int prefetchWindowStartExtraSpace;
    private float previousPassDelta;
    private boolean shouldRefillWindow;

    @NotNull
    private final MutableIntObjectMap<List<LazyLayoutPrefetchState.PrefetchHandle>> prefetchWindowHandles = IntObjectMapKt.mutableIntObjectMapOf();

    @NotNull
    private final MutableIntSet indicesToRemove = IntSetKt.mutableIntSetOf();

    @NotNull
    private final MutableIntObjectMap<CachedItem> windowCache = IntObjectMapKt.mutableIntObjectMapOf();
    private int previousPassItemCount = -1;
    private int prefetchWindowStartLine = Integer.MAX_VALUE;
    private int prefetchWindowEndLine = Integer.MIN_VALUE;

    public CacheWindowLogic(@NotNull LazyLayoutCacheWindow lazyLayoutCacheWindow, boolean z) {
        this.cacheWindow = lazyLayoutCacheWindow;
        this.enableInitialPrefetch = z;
    }

    private final void cachePrefetchedItem(int index, int size) {
        this.windowCache.set(index, updateOrCreateCachedItem(index, size, CachedItem.INSTANCE));
        if (index > this.prefetchWindowEndLine) {
            this.prefetchWindowEndLine = index;
            this.prefetchWindowEndExtraSpace -= size;
        } else if (index < this.prefetchWindowStartLine) {
            this.prefetchWindowStartLine = index;
            this.prefetchWindowStartExtraSpace -= size;
        }
    }

    private final void cacheVisibleItemsInfo(int index, Object key, int size) {
        if (this.windowCache.containsKey(index)) {
            CachedItem cachedItem = this.windowCache.get(index);
            Intrinsics.h(cachedItem);
            int mainAxisSize = cachedItem.getMainAxisSize();
            CachedItem cachedItem2 = this.windowCache.get(index);
            Intrinsics.h(cachedItem2);
            Object key2 = cachedItem2.getKey();
            if (mainAxisSize != size || !Intrinsics.f(key2, key)) {
                this.shouldRefillWindow = true;
            }
        }
        this.windowCache.set(index, updateOrCreateCachedItem(index, size, key));
        this.prefetchWindowStartLine = Math.min(this.prefetchWindowStartLine, index);
        this.prefetchWindowEndLine = Math.max(this.prefetchWindowEndLine, index);
        List<LazyLayoutPrefetchState.PrefetchHandle> listRemove = this.prefetchWindowHandles.remove(index);
        if (listRemove != null) {
            int size2 = listRemove.size();
            for (int i = 0; i < size2; i++) {
                listRemove.get(i).cancel();
            }
        }
    }

    private final void fillCacheWindowBackward(CacheWindowScope cacheWindowScope, float f) {
        if (cacheWindowScope.getHasVisibleItems()) {
            int mainAxisViewportSize = cacheWindowScope.getMainAxisViewportSize();
            LazyLayoutCacheWindow lazyLayoutCacheWindow = this.cacheWindow;
            Density density = cacheWindowScope.getDensity();
            int iCalculateBehindWindow = density != null ? lazyLayoutCacheWindow.calculateBehindWindow(density, mainAxisViewportSize) : 0;
            this.itemsCount = cacheWindowScope.getTotalItemsCount();
            onKeepAround(cacheWindowScope.getFirstVisibleLineIndex(), cacheWindowScope.getLastVisibleLineIndex(), cacheWindowScope.getMainAxisExtraSpaceEnd(), cacheWindowScope.getMainAxisExtraSpaceStart(), iCalculateBehindWindow, f, cacheWindowScope.getTotalItemsCount());
        }
    }

    private final void fillCacheWindowForward(CacheWindowScope cacheWindowScope, float f) {
        if (cacheWindowScope.getHasVisibleItems()) {
            int mainAxisViewportSize = cacheWindowScope.getMainAxisViewportSize();
            LazyLayoutCacheWindow lazyLayoutCacheWindow = this.cacheWindow;
            Density density = cacheWindowScope.getDensity();
            int iCalculateAheadWindow = density != null ? lazyLayoutCacheWindow.calculateAheadWindow(density, mainAxisViewportSize) : 0;
            onPrefetchForward(cacheWindowScope, cacheWindowScope.getFirstVisibleLineIndex(), cacheWindowScope.getLastVisibleLineIndex(), iCalculateAheadWindow, cacheWindowScope.getMainAxisExtraSpaceEnd(), cacheWindowScope.getMainAxisExtraSpaceStart(), f, f <= BitmapDescriptorFactory.HUE_RED);
        }
    }

    private final int getItemSizeOrPrefetch(CacheWindowScope cacheWindowScope, int i, boolean z) {
        List<LazyLayoutPrefetchState.PrefetchHandle> list;
        List<LazyLayoutPrefetchState.PrefetchHandle> list2;
        if (this.windowCache.containsKey(i)) {
            CachedItem cachedItem = this.windowCache.get(i);
            Intrinsics.h(cachedItem);
            return cachedItem.getMainAxisSize();
        }
        int i2 = 0;
        if (this.prefetchWindowHandles.containsKey(i)) {
            if (!z || (list2 = this.prefetchWindowHandles.get(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                list2.get(i2).markAsUrgent();
                i2++;
            }
            return -1;
        }
        this.prefetchWindowHandles.set(i, cacheWindowScope.schedulePrefetch(i, new k1.b(this, cacheWindowScope, 0)));
        if (!z || (list = this.prefetchWindowHandles.get(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            list.get(i2).markAsUrgent();
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getItemSizeOrPrefetch$lambda$4(CacheWindowLogic cacheWindowLogic, CacheWindowScope cacheWindowScope, int i, int i2) {
        cacheWindowLogic.onItemPrefetched(cacheWindowScope, i, i2);
        return Unit.f186387a;
    }

    private final void onDatasetChangedSize(CacheWindowScope cacheWindowScope) {
        this.shouldRefillWindow = true;
        int i = this.prefetchWindowStartLine;
        if (i < 0) {
            i = 0;
        }
        this.prefetchWindowStartLine = i;
        int lastLineIndex = cacheWindowScope.getLastLineIndex();
        if (lastLineIndex != -1) {
            int i2 = this.prefetchWindowEndLine;
            if (i2 <= lastLineIndex) {
                lastLineIndex = i2;
            }
            this.prefetchWindowEndLine = lastLineIndex;
        }
        if (this.previousPassDelta <= BitmapDescriptorFactory.HUE_RED) {
            removeOutOfBoundsItems(cacheWindowScope.getLastVisibleLineIndex(), this.itemsCount - 1);
        } else {
            removeOutOfBoundsItems(0, cacheWindowScope.getFirstVisibleLineIndex());
        }
    }

    private final void onItemPrefetched(CacheWindowScope cacheWindowScope, int i, int i2) {
        cachePrefetchedItem(i, i2);
        scheduleNextItemIfNeeded(cacheWindowScope);
        traceWindowInfo();
    }

    private final void onKeepAround(int visibleWindowStart, int visibleWindowEnd, int mainAxisExtraSpaceEnd, int mainAxisExtraSpaceStart, int keepAroundWindow, float scrollDelta, int itemsCount) {
        int i;
        int i2;
        if (scrollDelta <= BitmapDescriptorFactory.HUE_RED) {
            this.prefetchWindowStartExtraSpace = keepAroundWindow - mainAxisExtraSpaceStart;
            this.prefetchWindowStartLine = visibleWindowStart;
            while (this.prefetchWindowStartExtraSpace > 0 && (i2 = this.prefetchWindowStartLine) > 0 && this.windowCache.containsKey(i2 - 1)) {
                CachedItem cachedItem = this.windowCache.get(this.prefetchWindowStartLine - 1);
                Intrinsics.h(cachedItem);
                this.prefetchWindowStartLine--;
                this.prefetchWindowStartExtraSpace -= cachedItem.getMainAxisSize();
            }
            removeOutOfBoundsItems(0, this.prefetchWindowStartLine - 1);
            return;
        }
        this.prefetchWindowEndExtraSpace = keepAroundWindow - mainAxisExtraSpaceEnd;
        this.prefetchWindowEndLine = visibleWindowEnd;
        while (this.prefetchWindowEndExtraSpace > 0 && (i = this.prefetchWindowEndLine) < itemsCount - 1 && this.windowCache.containsKey(i + 1)) {
            CachedItem cachedItem2 = this.windowCache.get(this.prefetchWindowEndLine + 1);
            Intrinsics.h(cachedItem2);
            int mainAxisSize = cachedItem2.getMainAxisSize();
            this.prefetchWindowEndLine++;
            this.prefetchWindowEndExtraSpace -= mainAxisSize;
        }
        removeOutOfBoundsItems(this.prefetchWindowEndLine + 1, itemsCount - 1);
    }

    private final void onPrefetchForward(CacheWindowScope cacheWindowScope, int i, int i2, int i3, int i5, int i6, float f, boolean z) {
        int i21;
        boolean z3 = Math.signum(f) == Math.signum(this.previousPassDelta);
        if (!z) {
            if (!z3 || this.shouldRefillWindow) {
                this.prefetchWindowStartExtraSpace = i3 - i6;
                this.prefetchWindowStartLine = i;
            } else {
                int iC = rim.d.c(Math.abs(f)) + this.prefetchWindowStartExtraSpace;
                int i22 = i3 - i6;
                if (iC > i22) {
                    iC = i22;
                }
                this.prefetchWindowStartExtraSpace = iC;
            }
            while (this.prefetchWindowStartExtraSpace > 0 && (i21 = this.prefetchWindowStartLine) > 0) {
                int itemSizeOrPrefetch = getItemSizeOrPrefetch(cacheWindowScope, this.prefetchWindowStartLine - 1, i21 + (-1) == i + (-1) && f != BitmapDescriptorFactory.HUE_RED && Math.abs(f) >= ((float) i6));
                if (itemSizeOrPrefetch == -1) {
                    return;
                }
                this.prefetchWindowStartLine--;
                this.prefetchWindowStartExtraSpace -= itemSizeOrPrefetch;
            }
            return;
        }
        if (!z3 || this.shouldRefillWindow) {
            this.prefetchWindowEndExtraSpace = i3 - i5;
            this.prefetchWindowEndLine = i2;
        } else {
            int iC2 = rim.d.c(Math.abs(f)) + this.prefetchWindowEndExtraSpace;
            int i32 = i3 - i5;
            if (iC2 > i32) {
                iC2 = i32;
            }
            this.prefetchWindowEndExtraSpace = iC2;
        }
        while (this.prefetchWindowEndExtraSpace > 0 && cacheWindowScope.getLastIndexInLine(this.prefetchWindowEndLine) != -1 && cacheWindowScope.getLastIndexInLine(this.prefetchWindowEndLine) < this.itemsCount - 1) {
            int itemSizeOrPrefetch2 = getItemSizeOrPrefetch(cacheWindowScope, this.prefetchWindowEndLine + 1, this.prefetchWindowEndLine + 1 == i2 + 1 && f != BitmapDescriptorFactory.HUE_RED && Math.abs(f) >= ((float) i5));
            if (itemSizeOrPrefetch2 == -1) {
                return;
            }
            this.prefetchWindowEndLine++;
            this.prefetchWindowEndExtraSpace -= itemSizeOrPrefetch2;
        }
    }

    private final void refillWindow(CacheWindowScope cacheWindowScope, boolean z) {
        if (cacheWindowScope.getHasVisibleItems()) {
            int mainAxisViewportSize = cacheWindowScope.getMainAxisViewportSize();
            LazyLayoutCacheWindow lazyLayoutCacheWindow = this.cacheWindow;
            Density density = cacheWindowScope.getDensity();
            onPrefetchForward(cacheWindowScope, cacheWindowScope.getFirstVisibleLineIndex(), cacheWindowScope.getLastVisibleLineIndex(), density != null ? lazyLayoutCacheWindow.calculateAheadWindow(density, mainAxisViewportSize) : 0, cacheWindowScope.getMainAxisExtraSpaceEnd(), cacheWindowScope.getMainAxisExtraSpaceStart(), BitmapDescriptorFactory.HUE_RED, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void removeOutOfBoundsItems(int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.CacheWindowLogic.removeOutOfBoundsItems(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void scheduleNextItemIfNeeded(androidx.compose.foundation.lazy.layout.CacheWindowScope r5) {
        /*
            r4 = this;
            float r0 = r4.previousPassDelta
            float r0 = java.lang.Math.signum(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = -1
            if (r0 > 0) goto L15
            int r0 = r4.prefetchWindowEndExtraSpace
            if (r0 <= 0) goto L28
            int r0 = r4.prefetchWindowEndLine
            int r0 = r0 + 1
            goto L29
        L15:
            float r0 = r4.previousPassDelta
            float r0 = java.lang.Math.signum(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L28
            int r0 = r4.prefetchWindowStartExtraSpace
            if (r0 <= 0) goto L28
            int r0 = r4.prefetchWindowStartLine
            int r0 = r0 + (-1)
            goto L29
        L28:
            r0 = r2
        L29:
            if (r0 <= 0) goto L48
            int r1 = r5.getLastIndexInLine(r0)
            if (r1 == r2) goto L48
            int r1 = r5.getLastIndexInLine(r0)
            int r2 = r4.itemsCount
            if (r1 >= r2) goto L48
            androidx.collection.MutableIntObjectMap<java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle>> r1 = r4.prefetchWindowHandles
            k1.b r2 = new k1.b
            r3 = 1
            r2.<init>(r4, r5, r3)
            java.util.List r5 = r5.schedulePrefetch(r0, r2)
            r1.set(r0, r5)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.CacheWindowLogic.scheduleNextItemIfNeeded(androidx.compose.foundation.lazy.layout.CacheWindowScope):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scheduleNextItemIfNeeded$lambda$1(CacheWindowLogic cacheWindowLogic, CacheWindowScope cacheWindowScope, int i, int i2) {
        cacheWindowLogic.onItemPrefetched(cacheWindowScope, i, i2);
        return Unit.f186387a;
    }

    private final void traceWindowInfo() {
        AndroidTrace_androidKt.traceValue("prefetchWindowStartExtraSpace", this.prefetchWindowStartExtraSpace);
        AndroidTrace_androidKt.traceValue("prefetchWindowEndExtraSpace", this.prefetchWindowEndExtraSpace);
        AndroidTrace_androidKt.traceValue("prefetchWindowStartIndex", this.prefetchWindowStartLine);
        AndroidTrace_androidKt.traceValue("prefetchWindowEndIndex", this.prefetchWindowEndLine);
    }

    private final CachedItem updateOrCreateCachedItem(int index, int size, Object key) {
        CachedItem cachedItem = this.windowCache.get(index);
        if (cachedItem == null) {
            return new CachedItem(CachedItem.INSTANCE, size);
        }
        cachedItem.setMainAxisSize(size);
        cachedItem.setKey(key);
        return cachedItem;
    }

    /* JADX INFO: renamed from: getPrefetchWindowEndLine$foundation, reason: from getter */
    public final int getPrefetchWindowEndLine() {
        return this.prefetchWindowEndLine;
    }

    /* JADX INFO: renamed from: getPrefetchWindowStartLine$foundation, reason: from getter */
    public final int getPrefetchWindowStartLine() {
        return this.prefetchWindowStartLine;
    }

    public final boolean hasValidBounds() {
        return (this.prefetchWindowStartLine == Integer.MAX_VALUE || this.prefetchWindowEndLine == Integer.MIN_VALUE) ? false : true;
    }

    public final void onScroll(@NotNull CacheWindowScope cacheWindowScope, float f) {
        traceWindowInfo();
        fillCacheWindowBackward(cacheWindowScope, f);
        fillCacheWindowForward(cacheWindowScope, f);
        this.previousPassDelta = f;
        traceWindowInfo();
    }

    public final void onVisibleItemsUpdated(@NotNull CacheWindowScope cacheWindowScope) {
        if (!this.hasUpdatedVisibleItemsOnce && this.enableInitialPrefetch) {
            LazyLayoutCacheWindow lazyLayoutCacheWindow = this.cacheWindow;
            Density density = cacheWindowScope.getDensity();
            if ((density != null ? lazyLayoutCacheWindow.calculateAheadWindow(density, cacheWindowScope.getMainAxisViewportSize()) : 0) != 0) {
                this.shouldRefillWindow = true;
            }
            this.hasUpdatedVisibleItemsOnce = true;
        }
        int i = this.previousPassItemCount;
        if (i != -1 && i != cacheWindowScope.getTotalItemsCount()) {
            onDatasetChangedSize(cacheWindowScope);
        }
        this.itemsCount = cacheWindowScope.getTotalItemsCount();
        if (cacheWindowScope.getHasVisibleItems()) {
            int visibleLineCount = cacheWindowScope.getVisibleLineCount();
            for (int i2 = 0; i2 < visibleLineCount; i2++) {
                int visibleItemLine = cacheWindowScope.getVisibleItemLine(i2);
                Object visibleLineKey = cacheWindowScope.getVisibleLineKey(i2);
                int visibleItemSize = cacheWindowScope.getVisibleItemSize(i2);
                if (visibleItemLine != -1) {
                    cacheVisibleItemsInfo(visibleItemLine, visibleLineKey, visibleItemSize);
                }
            }
            if (this.shouldRefillWindow) {
                refillWindow(cacheWindowScope, this.previousPassDelta <= BitmapDescriptorFactory.HUE_RED);
                this.shouldRefillWindow = false;
            }
        } else {
            resetStrategy();
        }
        this.previousPassItemCount = cacheWindowScope.getTotalItemsCount();
    }

    public final void resetStrategy() {
        this.prefetchWindowStartLine = Integer.MAX_VALUE;
        this.prefetchWindowEndLine = Integer.MIN_VALUE;
        this.prefetchWindowStartExtraSpace = 0;
        this.prefetchWindowEndExtraSpace = 0;
        this.shouldRefillWindow = false;
        this.windowCache.clear();
        MutableIntObjectMap<List<LazyLayoutPrefetchState.PrefetchHandle>> mutableIntObjectMap = this.prefetchWindowHandles;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j2 = jArr[i];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i << 3) + i3;
                        int i6 = mutableIntObjectMap.keys[i5];
                        List list = (List) mutableIntObjectMap.values[i5];
                        int size = list.size();
                        for (int i21 = 0; i21 < size; i21++) {
                            ((LazyLayoutPrefetchState.PrefetchHandle) list.get(i21)).cancel();
                        }
                        mutableIntObjectMap.removeValueAt(i5);
                    }
                    j2 >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
