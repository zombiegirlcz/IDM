package cv6;

import com.revolut.recyclerkit.ScreenGridLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ScreenGridLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f109285a;

    public c(ScreenGridLayoutManager screenGridLayoutManager) {
        this.f109285a = screenGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        return this.f109285a.getSpanCount();
    }
}
