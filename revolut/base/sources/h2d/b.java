package h2d;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.separate_favourites.currency_providers.impl.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements v3d.a {
    @Override // v3d.a
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310359c;
    }

    @Override // v3d.a
    public final Image b(AlertItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new CurrencyImage(item.getF86877b().f86863a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
    }

    @Override // v3d.a
    public final TextLocalisedClause c() {
        return new TextLocalisedClause(R$string.alerts_widget_crypto_empty_title, null, null, 14);
    }

    @Override // v3d.a
    public final Clause d(String currencyId, String referencedCurrencyId, BigDecimal currentRate) {
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(currencyId, "currencyId");
        Intrinsics.checkNotNullParameter(referencedCurrencyId, "referencedCurrencyId");
        return d.a(currencyId, referencedCurrencyId, currentRate);
    }

    @Override // v3d.a
    public final Clause e(AlertItem.TargetPrice item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return d.b(item);
    }

    @Override // v3d.a
    public final TextLocalisedClause f() {
        return new TextLocalisedClause(R$string.alerts_crypto_empty_section_title, null, null, 14);
    }
}
