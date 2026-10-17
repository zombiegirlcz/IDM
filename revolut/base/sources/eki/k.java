package eki;

import androidx.recyclerview.widget.DiffUtil;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends DiffUtil.ItemCallback {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areContentsTheSame(Object obj2, Object obj3) {
        PagerItem oldItem = (PagerItem) obj2;
        PagerItem newItem = (PagerItem) obj3;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.equals(newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areItemsTheSame(Object obj2, Object obj3) {
        PagerItem oldItem = (PagerItem) obj2;
        PagerItem newItem = (PagerItem) obj3;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.f(oldItem.getId(), newItem.getId());
    }
}
