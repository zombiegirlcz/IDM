package dtk;

import afl.a0;
import afl.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zvk.d f117458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f117459b;

    public a(zvk.d assetStatsUIMapper) {
        Intrinsics.checkNotNullParameter(assetStatsUIMapper, "assetStatsUIMapper");
        this.f117458a = assetStatsUIMapper;
        this.f117459b = new TextLocalisedClause(R$string.wealth_details_section_key_stats_not_available, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
    }

    public final List a(c widgetData) {
        ArrayList<AssetStatsId> arrayList;
        Intrinsics.checkNotNullParameter(widgetData, "widgetData");
        trk.a aVar = widgetData.f117460a;
        afl.a aVar2 = widgetData.f117461b;
        List list = widgetData.f117462c;
        if (aVar2 instanceof a0) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof AssetStatsId.Stocks) {
                    arrayList.add(obj2);
                }
            }
        } else if (aVar2 instanceof afl.f) {
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof AssetStatsId.Bonds) {
                    arrayList.add(obj3);
                }
            }
        } else {
            if (!(aVar2 instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof AssetStatsId.Etf) {
                    arrayList.add(obj4);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (AssetStatsId assetStatsId : arrayList) {
            Clause clauseD = this.f117458a.d(aVar2, assetStatsId);
            ResourceImage resourceImageC = zvk.d.c(assetStatsId);
            String string = assetStatsId.toString();
            Clause clause = clauseD;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(zvk.d.b(assetStatsId), null, null, 14);
            if (clause == null) {
                clause = this.f117459b;
            }
            arrayList2.add(new CellDetailsDelegate.Model(string, textLocalisedClause, clause, null, resourceImageC, resourceImageC != null, 0, null, assetStatsId, null, null, 0, null, false, null, 0, 0, 0, 0, 1048008));
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("stats.header", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_details_section_key_stats_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_controls, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, false, (Clause) new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), true, (Object) new e(aVar, widgetData.d), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259874);
        return !arrayList2.isEmpty() ? yp0.b.g(arrayList2, model, null, R$attr.uikit_dp0, R$attr.uikit_dp16, 114) : u.c(model);
    }
}
