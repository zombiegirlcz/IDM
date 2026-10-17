package r3e;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.feature.store.impl.ui.search.StoreSearchScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import java.util.List;
import kotlin.reflect.KProperty;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends ScreenGridLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StoreSearchScreen f251278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f251279b;

    public b(StoreSearchScreen storeSearchScreen, ScreenGridLayoutManager screenGridLayoutManager) {
        this.f251278a = storeSearchScreen;
        this.f251279b = screenGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        List listB;
        KProperty[] kPropertyArr = StoreSearchScreen.W;
        RecyclerView.Adapter adapter = this.f251278a.d3().f174540c.getAdapter();
        koi.h hVar = adapter instanceof koi.h ? (koi.h) adapter : null;
        ScreenGridLayoutManager screenGridLayoutManager = this.f251279b;
        if (hVar == null || (listB = hVar.b()) == null) {
            return screenGridLayoutManager.getSpanCount();
        }
        koi.j jVar = (koi.j) d0.e0(i, listB);
        if (jVar != null && (jVar instanceof NewsDelegate.Model)) {
            return 1;
        }
        return screenGridLayoutManager.getSpanCount();
    }
}
