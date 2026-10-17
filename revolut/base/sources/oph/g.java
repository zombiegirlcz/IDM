package oph;

import android.content.Context;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.ScreenerAllCollectionsRedesignContract$CollectionsPagerItem;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page.ScreenerCollectionsPageScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewGridLayoutManager;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Context p0 = (Context) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ScreenerCollectionsPageScreen screenerCollectionsPageScreen = (ScreenerCollectionsPageScreen) this.receiver;
        if (!(screenerCollectionsPageScreen.K.f96205a instanceof ScreenerAllCollectionsRedesignContract$CollectionsPagerItem.Custom)) {
            UIKitLinearLayoutManager uIKitLinearLayoutManager = new UIKitLinearLayoutManager(p0);
            uIKitLinearLayoutManager.f98539c = true;
            return uIKitLinearLayoutManager;
        }
        BaseRecyclerViewGridLayoutManager baseRecyclerViewGridLayoutManager = new BaseRecyclerViewGridLayoutManager(p0, 2);
        baseRecyclerViewGridLayoutManager.f98433a = true;
        baseRecyclerViewGridLayoutManager.setSpanSizeLookup(new f(screenerCollectionsPageScreen, baseRecyclerViewGridLayoutManager));
        return baseRecyclerViewGridLayoutManager;
    }
}
