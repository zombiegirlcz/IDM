package rcg;

import androidx.recyclerview.widget.GridLayoutManager;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreen;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsFavoritesGridScreen f253254a;

    public f(TravelHotelsFavoritesGridScreen travelHotelsFavoritesGridScreen) {
        this.f253254a = travelHotelsFavoritesGridScreen;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        return ((dli.c) this.f253254a.Q.getValue()).w().a(i) instanceof VoucherSmallTileDelegate.Model ? 1 : 2;
    }
}
