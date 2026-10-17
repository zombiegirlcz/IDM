package w9m;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyListItemInfo f295766a;

    public c(LazyListItemInfo lazyListItem) {
        Intrinsics.checkNotNullParameter(lazyListItem, "lazyListItem");
        this.f295766a = lazyListItem;
    }

    public final String toString() {
        LazyListItemInfo lazyListItemInfo = this.f295766a;
        return "SnapperLayoutItemInfo(index=" + lazyListItemInfo.getIndex() + ", offset=" + lazyListItemInfo.getOffset() + ", size=" + lazyListItemInfo.getSize() + ")";
    }
}
