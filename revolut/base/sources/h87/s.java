package h87;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n87.v;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    @NotNull
    private static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f149965a;

    public s(b titleMapper, v performanceAssetMapper) {
        Intrinsics.checkNotNullParameter(titleMapper, "titleMapper");
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        this.f149965a = performanceAssetMapper;
    }

    public final ListSubheaderDelegate.Model a(f key, boolean z) {
        int i;
        String str;
        String str2;
        String str3 = "GM_COLLECTION_HEADER_KEY_" + key.a();
        Intrinsics.checkNotNullParameter(key, "key");
        switch (a.f149947a[key.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                i = R$string.invest_markets_indexes_title;
                break;
            case 5:
                i = R$string.invest_markets_commodities_title;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                i = R$string.invest_markets_currency_pairs_title;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = z ? new TextLocalisedClause(R$string.wealth_invest_common_see_all, null, null, 14) : null;
        if (z) {
            switch (r.f149964a[key.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    str2 = "indexes.markets.section.see_all";
                    break;
                case 5:
                    str2 = "commodities.markets.section.see_all";
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    str2 = "currencies.markets.section.see_all";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            str = str2;
        } else {
            str = null;
        }
        return new ListSubheaderDelegate.Model(str3, (Image) null, (Clause) textLocalisedClause, (ResourceImage) null, false, false, (Clause) textLocalisedClause2, z, (Object) (z ? new h(key) : null), (AnalyticsContext) null, 0, 0, 0, 0, str, 128826);
    }

    public final List b(i iVar) {
        List list = iVar != null ? (List) iii.c.f(iVar.f149956b, new gvi.s(this, iVar, 29), new fb.c(this, iVar, 11), new fyg.b(this, iVar, 29)) : null;
        return list == null ? f0.f322471a : list;
    }
}
