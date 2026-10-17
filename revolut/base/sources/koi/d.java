package koi;

import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import java.util.List;
import koi.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsyncListDiffer f186370a;

    public d(h adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f186370a = new AsyncListDiffer(new AdapterListUpdateCallback(adapter), new AsyncDifferConfig.Builder(new h.a()).build());
    }

    @Override // koi.f
    public final List getItems() {
        List currentList = this.f186370a.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        return currentList;
    }

    @Override // koi.f
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f186370a.submitList(items);
    }
}
