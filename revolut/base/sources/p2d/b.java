package p2d;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import mgd.d;
import org.joda.time.DateTime;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements ffd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f232230a;

    public b(Set mappers) {
        Intrinsics.checkNotNullParameter(mappers, "mappers");
        Set set = mappers;
        int iB = q0.b(w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(((v3d.a) obj2).a(), obj2);
        }
        this.f232230a = linkedHashMap;
    }

    public static TextLocalisedClause c(AlertItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DateTime f86874h = item.getF86874h();
        if (f86874h == null) {
            return null;
        }
        long millis = f86874h.getMillis();
        return new TextLocalisedClause(R$string.shared_alerts_alert_notified, v.k(new TimeClause(millis, new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12), new TimeClause(millis, TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, 12);
    }

    public final v3d.a a(FavouritesAssetTypeKey favouritesAssetTypeKey) {
        v3d.a aVar = (v3d.a) this.f232230a.get(favouritesAssetTypeKey);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(j6.a.q("Unable to resolve mapper for typeKey=", favouritesAssetTypeKey.f86866a));
    }

    public final RowDelegate.Model b(FavouritesAssetTypeKey typeKey, AlertItem alertItem) {
        char c2;
        int i;
        Clause clauseM;
        char c3;
        Clause textClause;
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        Intrinsics.checkNotNullParameter(alertItem, "item");
        String strQ = j6.a.q("ALERTS_ITEM_", alertItem.getF86876a());
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        Intrinsics.checkNotNullParameter(alertItem, "alertItem");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(a(typeKey).b(alertItem), null, null, false, null, false, 60);
        TextLocalisedClause textLocalisedClauseD = d(typeKey, alertItem);
        Clause[] elements = new Clause[2];
        if (alertItem instanceof AlertItem.TargetPrice) {
            AlertItem.TargetPrice targetPrice = (AlertItem.TargetPrice) alertItem;
            if (targetPrice.f86875j == d.ACTIVE) {
                int i2 = R$string.shared_alerts_alert_current_rate;
                BigDecimal currentRate = targetPrice.f;
                if (currentRate != null) {
                    c2 = 0;
                    String currencyId = targetPrice.f86872c;
                    c3 = 1;
                    FavouritesAssetDetails favouritesAssetDetails = targetPrice.f86871b;
                    FavouritesAssetTypeKey typeKey2 = favouritesAssetDetails.d;
                    String referencedCurrencyId = favouritesAssetDetails.f86863a;
                    Intrinsics.checkNotNullParameter(typeKey2, "typeKey");
                    Intrinsics.checkNotNullParameter(currentRate, "currentRate");
                    Intrinsics.checkNotNullParameter(currencyId, "currencyId");
                    Intrinsics.checkNotNullParameter(referencedCurrencyId, "referencedCurrencyId");
                    textClause = a(typeKey2).d(currencyId, referencedCurrencyId, currentRate);
                } else {
                    c2 = 0;
                    c3 = 1;
                    textClause = null;
                }
                if (textClause == null) {
                    textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, u.c(textClause), null, 12);
                ImageClause imageClause = targetPrice.i == mgd.b.RECURRING ? new ImageClause(R$drawable.uikit_icn_20_reccuring, Integer.valueOf(R$attr.uikit_colorGreyTone20), (Float) null, (Float) null, 28) : null;
                Clause[] elements2 = new Clause[2];
                elements2[c2] = textLocalisedClause;
                elements2[c3] = imageClause;
                Intrinsics.checkNotNullParameter(elements2, "elements");
                clauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements2));
            } else {
                c2 = 0;
                clauseM = c(targetPrice);
            }
        } else {
            c2 = 0;
            if (!(alertItem instanceof AlertItem.Volatility)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = a.f232229a[((AlertItem.Volatility) alertItem).f86879g.ordinal()];
            if (i3 == 1) {
                i = R$string.shared_alerts_alert_price_change_time_range_one_hour;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.shared_alerts_alert_price_change_time_range_one_day;
            }
            clauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(i, null, null, 14), new ImageClause(R$drawable.uikit_icn_20_reccuring, Integer.valueOf(R$attr.uikit_colorGreyTone20), (Float) null, (Float) null, 28)));
        }
        elements[c2] = clauseM;
        String f = alertItem.getF();
        elements[1] = !d0.W(f) ? new TextClause(f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        return new RowDelegate.Model(strQ, image40, textLocalisedClauseD, null, 0, listL.isEmpty() ? null : new CompositeClause(listL, new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, alertItem, null, 0, 0, 0, 0, 532676568);
    }

    public final TextLocalisedClause d(FavouritesAssetTypeKey typeKey, AlertItem item) {
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof AlertItem.TargetPrice) {
            AlertItem.TargetPrice targetPrice = (AlertItem.TargetPrice) item;
            return new TextLocalisedClause(R$string.shared_alerts_alert_target_rate, v.k(targetPrice.f86871b.f86864b, a(typeKey).e(targetPrice)), null, 12);
        }
        if (!(item instanceof AlertItem.Volatility)) {
            throw new NoWhenBranchMatchedException();
        }
        AlertItem.Volatility volatility = (AlertItem.Volatility) item;
        return new TextLocalisedClause(R$string.shared_alerts_alert_price_change_title, v.k(volatility.f86877b.f86864b, volatility.d.toPlainString()), null, 12);
    }
}
