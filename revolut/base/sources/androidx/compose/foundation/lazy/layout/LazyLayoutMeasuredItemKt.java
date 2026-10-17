package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.z;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00000\nj\b\u0012\u0004\u0012\u00020\u0000`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "T", "", "firstVisibleIndex", "lastVisibleIndex", "", "positionedItems", "stickingItems", "updatedVisibleItems", "(IILjava/util/List;Ljava/util/List;)Ljava/util/List;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "LazyLayoutMeasuredItemIndexComparator", "Ljava/util/Comparator;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class LazyLayoutMeasuredItemKt {

    @NotNull
    private static final Comparator<LazyLayoutMeasuredItem> LazyLayoutMeasuredItemIndexComparator = new com.google.android.material.color.utilities.g(4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LazyLayoutMeasuredItemIndexComparator$lambda$0(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, LazyLayoutMeasuredItem lazyLayoutMeasuredItem2) {
        return Intrinsics.k(lazyLayoutMeasuredItem.getIndex(), lazyLayoutMeasuredItem2.getIndex());
    }

    @NotNull
    public static final <T extends LazyLayoutMeasuredItem> List<T> updatedVisibleItems(int i, int i2, @NotNull List<? extends T> list, @NotNull List<? extends T> list2) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        ArrayList arrayListF1 = d0.f1(list2);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            T t2 = list.get(i3);
            int index = t2.getIndex();
            if (i <= index && index <= i2) {
                arrayListF1.add(t2);
            }
        }
        z.w(arrayListF1, LazyLayoutMeasuredItemIndexComparator);
        return arrayListF1;
    }
}
