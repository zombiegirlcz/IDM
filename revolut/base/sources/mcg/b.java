package mcg;

import androidx.recyclerview.widget.GridLayoutManager;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.TravelHotelsHomeFavoritesScreen;
import ip0.bo0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsHomeFavoritesScreen f204350a;

    public b(TravelHotelsHomeFavoritesScreen travelHotelsHomeFavoritesScreen) {
        this.f204350a = travelHotelsHomeFavoritesScreen;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        koi.j jVarA = this.f204350a.k().w().a(i);
        return ((jVarA instanceof VoucherSmallTileDelegate.Model) || (jVarA instanceof bo0)) ? 1 : 2;
    }
}
