package m2d;

import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.AddSharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.AddSharedAlertsDestination;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends l1d.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q2d.a f201953l;

    public b(q2d.a mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f201953l = mapper;
    }

    @Override // l1d.a
    public final IconNavBarMenuItem Z2() {
        this.f201953l.getClass();
        return q2d.a.a();
    }

    @Override // l1d.a
    public final Unit b3(String str, FavouritesAssetTypeKey favouritesAssetTypeKey, AssetIdWithSymbol assetIdWithSymbol, xi0.b bVar) {
        if (Intrinsics.f(str, "SHARED_FAVOURITES_PRICE_ALERTS_MENU_ITEM_ID")) {
            A2(new AddSharedAlertsDestination(new AddSharedAlertsConfiguration(u.c(favouritesAssetTypeKey), bVar, assetIdWithSymbol, false)));
        }
        return Unit.f186387a;
    }
}
