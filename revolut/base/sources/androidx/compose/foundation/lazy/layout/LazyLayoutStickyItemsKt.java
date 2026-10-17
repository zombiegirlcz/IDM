package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u001a\u007f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0015\u001a\u00020\u0003*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "T", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "", "firstVisibleItemIndex", "lastVisibleItemIndex", "", "positionedItems", "Landroidx/collection/IntList;", "stickyItems", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "Lkotlin/Function1;", "getAndMeasure", "", "applyStickyItems", "(Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;IILjava/util/List;Landroidx/collection/IntList;IIIILkotlin/jvm/functions/Function1;)Ljava/util/List;", "getMainAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "mainAxisOffset", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class LazyLayoutStickyItemsKt {
    @NotNull
    public static final <T extends LazyLayoutMeasuredItem> List<T> applyStickyItems(StickyItemsPlacement stickyItemsPlacement, int i, int i2, @NotNull List<T> list, @NotNull IntList intList, int i3, int i5, int i6, int i21, @NotNull Function1<? super Integer, ? extends T> function1) {
        StickyItemsPlacement stickyItemsPlacement2 = stickyItemsPlacement;
        if (stickyItemsPlacement2 == null || list.isEmpty() || intList._size == 0) {
            return f0.f322471a;
        }
        IntList stickingIndices = stickyItemsPlacement2.getStickingIndices(i, i2, intList);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i22 = 0; i22 < size; i22++) {
            T t2 = list.get(i22);
            if (intList.contains(t2.getIndex())) {
                arrayList2.add(t2);
            }
        }
        int[] iArr = stickingIndices.content;
        int i32 = stickingIndices._size;
        int i33 = 0;
        while (i33 < i32) {
            int i43 = iArr[i33];
            Iterator<T> it8 = list.iterator();
            int i59 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i59 = -1;
                    break;
                }
                if (it8.next().getIndex() == i43) {
                    break;
                }
                i59++;
            }
            T tRemove = i59 == -1 ? (LazyLayoutMeasuredItem) function1.invoke(Integer.valueOf(i43)) : list.remove(i59);
            ArrayList arrayList3 = arrayList2;
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = tRemove;
            int iCalculateStickingItemOffset = stickyItemsPlacement2.calculateStickingItemOffset(arrayList3, i43, tRemove.getMainAxisSizeWithSpacings(), i59 == -1 ? Integer.MIN_VALUE : getMainAxisOffset(tRemove), i3, i5, i6, i21);
            lazyLayoutMeasuredItem.setNonScrollableItem(true);
            lazyLayoutMeasuredItem.position(iCalculateStickingItemOffset, 0, i6, i21);
            arrayList.add(lazyLayoutMeasuredItem);
            i33++;
            stickyItemsPlacement2 = stickyItemsPlacement;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo906getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo906getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m3335getYimpl(jMo906getOffsetBjo55l4) : IntOffset.m3334getXimpl(jMo906getOffsetBjo55l4);
    }
}
