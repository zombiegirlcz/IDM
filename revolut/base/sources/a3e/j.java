package a3e;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.revolut.feature.store.impl.ui.deals.StoreDealsScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import ip0.ah0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends ScreenGridLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StoreDealsScreen f1113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f1114b;

    public j(StoreDealsScreen storeDealsScreen, ScreenGridLayoutManager screenGridLayoutManager) {
        this.f1113a = storeDealsScreen;
        this.f1114b = screenGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        List listB;
        KProperty[] kPropertyArr = StoreDealsScreen.f88691a0;
        StoreDealsScreen storeDealsScreen = this.f1113a;
        ViewBinding value = storeDealsScreen.U.getValue(storeDealsScreen, StoreDealsScreen.f88691a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        RecyclerView.Adapter adapter = ((h2e.g) value).f148810b.getAdapter();
        koi.h hVar = adapter instanceof koi.h ? (koi.h) adapter : null;
        ScreenGridLayoutManager screenGridLayoutManager = this.f1114b;
        if (hVar == null || (listB = hVar.b()) == null) {
            return screenGridLayoutManager.getSpanCount();
        }
        koi.j jVar = (koi.j) d0.e0(i, listB);
        if (jVar != null && (jVar instanceof ah0)) {
            return 1;
        }
        return screenGridLayoutManager.getSpanCount();
    }
}
