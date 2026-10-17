package zr5;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static RowDelegate.Model a(String listId, String symbol, String subtitle, long j2, String priceCurrency, double d, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(priceCurrency, "priceCurrency");
        xi0.b.Companion.getClass();
        MoneyClause moneyClause = new MoneyClause(new dj0.d(j2, xi0.a.a(priceCurrency)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return new RowDelegate.Model(listId, new RowDelegate.Model.MainImage.Image40(new CurrencyImage(symbol, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62), new CurrencyClause(xi0.a.a(symbol), CurrencyClause.Format.DisplayName.f57755a, null, 4), null, 0, new TextClause(subtitle, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new RowDelegate.Model.c.b(moneyClause, xqi.a.b(bigDecimalValueOf, false, 7), null, false, 124), true, null, false, null, null, null, null, null, null, parcelable, null, 0, 0, 0, 0, 532673496);
    }
}
