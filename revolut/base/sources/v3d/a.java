package v3d;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public interface a {
    FavouritesAssetTypeKey a();

    Image b(AlertItem alertItem);

    TextLocalisedClause c();

    Clause d(String str, String str2, BigDecimal bigDecimal);

    Clause e(AlertItem.TargetPrice targetPrice);

    TextLocalisedClause f();
}
