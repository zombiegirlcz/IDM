package l9c;

import com.revolut.recyclerkit.ScreenGridLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends ScreenGridLayoutManager.a {
    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        return (1 > i || i >= 3) ? 2 : 1;
    }
}
