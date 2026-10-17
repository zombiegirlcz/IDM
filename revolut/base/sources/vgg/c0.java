package vgg;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsHeadlineDelegate;
import com.revolut.core.ui_kit.delegates.n2;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesCampaign;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f289157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xgg.e f289158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xgg.c f289159c;

    public c0(f01.c uiKitResources, agg.d travelMilesFormatter, xgg.e redeemOptionsMapper, xgg.c howItWorksMapper, xgg.f userVouchersMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(travelMilesFormatter, "travelMilesFormatter");
        Intrinsics.checkNotNullParameter(redeemOptionsMapper, "redeemOptionsMapper");
        Intrinsics.checkNotNullParameter(howItWorksMapper, "howItWorksMapper");
        Intrinsics.checkNotNullParameter(userVouchersMapper, "userVouchersMapper");
        this.f289157a = uiKitResources;
        this.f289158b = redeemOptionsMapper;
        this.f289159c = howItWorksMapper;
    }

    public final List a(hfg.e eVar) {
        String str;
        TravelMilesProvider travelMilesProvider = eVar.f151827j;
        TravelMilesRate travelMilesRate = travelMilesProvider.f94106g;
        CellDetailsHeadlineDelegate.Model model = null;
        n2Var = null;
        n2 n2Var = null;
        if (travelMilesRate != null) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_airline_details_rate_info_title, null, null, 14);
            CompositeClause compositeClauseB = agg.d.b(travelMilesRate, travelMilesProvider.f94107h, agg.b.REV_POINTS, null);
            TravelMilesCampaign travelMilesCampaign = travelMilesProvider.i;
            if (travelMilesCampaign != null && (str = travelMilesCampaign.f94095b) != null) {
                n2Var = new n2(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
            CellDetailsHeadlineDelegate.Model model2 = new CellDetailsHeadlineDelegate.Model(textLocalisedClause, compositeClauseB, n2Var);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            model = model2;
        }
        return zhm.v.l(model);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (u) iii.c.f(domainState.f289161a, new vdl.a(this, 28), new vea.b(29), new tvh.e(this, domainState, 29));
    }
}
