package h2d;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.separate_favourites.currency_providers.impl.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements v3d.a {
    @Override // v3d.a
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.e;
    }

    @Override // v3d.a
    public final Image b(AlertItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new InstrumentImage(item.getF86877b().f86863a, 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGrey5));
    }

    @Override // v3d.a
    public final TextLocalisedClause c() {
        return new TextLocalisedClause(R$string.alerts_widget_securities_empty_title, null, null, 14);
    }

    @Override // v3d.a
    public final Clause d(String currencyId, String referencedCurrencyId, BigDecimal currentRate) {
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(currencyId, "currencyId");
        Intrinsics.checkNotNullParameter(referencedCurrencyId, "referencedCurrencyId");
        xi0.b.Companion.getClass();
        return new MoneyClause(pyd.c.V(cp5.d.d0(xi0.b.a(xi0.a.a(currencyId), Integer.valueOf(currentRate.scale()))), currentRate), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
    }

    @Override // v3d.a
    public final Clause e(AlertItem.TargetPrice item) {
        Intrinsics.checkNotNullParameter(item, "item");
        xi0.a aVar = xi0.b.Companion;
        String str = item.f86872c;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        BigDecimal bigDecimal = item.d;
        return new MoneyClause(pyd.c.V(cp5.d.d0(xi0.b.a(bVarA, Integer.valueOf(bigDecimal.scale()))), bigDecimal), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    @Override // v3d.a
    public final TextLocalisedClause f() {
        return new TextLocalisedClause(R$string.alerts_securities_empty_section_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorActionPhotoHeaderText), false, null, false, null, 254), 10);
    }
}
