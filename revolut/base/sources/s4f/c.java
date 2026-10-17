package s4f;

import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import ip0.nf0;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends ScreenGridLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CollectionScreen f259845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f259846b;

    public c(CollectionScreen collectionScreen, ScreenGridLayoutManager screenGridLayoutManager) {
        this.f259845a = collectionScreen;
        this.f259846b = screenGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        koi.j jVar = (koi.j) d0.e0(i, this.f259845a.W.f186375h.getItems());
        ScreenGridLayoutManager screenGridLayoutManager = this.f259846b;
        if (jVar == null) {
            return screenGridLayoutManager.getSpanCount();
        }
        Integer numValueOf = Integer.valueOf(screenGridLayoutManager.getSpanCount());
        koi.j item = jVar;
        Intrinsics.checkNotNullParameter(item, "item");
        if ((item instanceof SmallCardDelegate.Model) || (item instanceof nf0)) {
            numValueOf = 1;
        }
        return numValueOf.intValue();
    }
}
