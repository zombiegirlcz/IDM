package mjh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2b.a f206046a;

    public f(d2b.a holdingMapper) {
        Intrinsics.checkNotNullParameter(holdingMapper, "holdingMapper");
        this.f206046a = holdingMapper;
    }

    public final RowDelegate.Model a(kel.b holding, dj0.d available) {
        Intrinsics.checkNotNullParameter(holding, "holding");
        Intrinsics.checkNotNullParameter(available, "available");
        String strQ = j6.a.q("PRODUCT_WIDGET_ITEM_", holding.f183148a.f183145a);
        kel.a aVar = holding.f183148a;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(aVar.e, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 60);
        Intrinsics.checkNotNullParameter(holding, "holding");
        xi0.a aVar2 = xi0.b.Companion;
        String str = aVar.e;
        aVar2.getClass();
        CurrencyClause currencyClause = new CurrencyClause(xi0.a.a(str), CurrencyClause.Format.DisplayName.f57755a, null, 4);
        Intrinsics.checkNotNullParameter(holding, "holding");
        String str2 = aVar.e;
        aVar2.getClass();
        return new RowDelegate.Model(strQ, image40, currencyClause, null, 0, new CurrencyClause(xi0.a.a(str2), CurrencyClause.Format.Ticker.f57756a, null, 4), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(available, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, new c(holding), null, 0, 0, 0, 0, 532675544);
    }
}
