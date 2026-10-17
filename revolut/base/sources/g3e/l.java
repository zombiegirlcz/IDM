package g3e;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.feature.store.impl.ui.exclusives.StoreExclusivesScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends ScreenGridLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StoreExclusivesScreen f140281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f140282b;

    public l(StoreExclusivesScreen storeExclusivesScreen, ScreenGridLayoutManager screenGridLayoutManager) {
        this.f140281a = storeExclusivesScreen;
        this.f140282b = screenGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        List listB;
        KProperty[] kPropertyArr = StoreExclusivesScreen.W;
        StoreExclusivesScreen storeExclusivesScreen = this.f140281a;
        ViewBinding value = storeExclusivesScreen.Q.getValue(storeExclusivesScreen, StoreExclusivesScreen.W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        RecyclerView.Adapter adapter = ((h2e.h) value).f148812b.getAdapter();
        koi.h hVar = adapter instanceof koi.h ? (koi.h) adapter : null;
        ScreenGridLayoutManager screenGridLayoutManager = this.f140282b;
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
