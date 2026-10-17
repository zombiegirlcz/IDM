package kch;

import adh.d;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.BondsCollectionFilterId;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    public static final C1043a Companion = new C1043a();

    /* JADX INFO: renamed from: kch.a$a, reason: collision with other inner class name */
    public static final class C1043a {
        private C1043a() {
        }
    }

    public static ListSubheaderDelegate.Model a(InstrumentsCollectionFilter.ListFilter listFilter) {
        TextLocalisedClause textLocalisedClause;
        Clause clauseF;
        List list = listFilter.f95291c;
        InstrumentsCollectionFilterId instrumentsCollectionFilterId = listFilter.f95289a;
        boolean z = list.size() > listFilter.d;
        if (listFilter.a().isEmpty()) {
            clauseF = v1.c.f(v.k(d.b(instrumentsCollectionFilterId), new TextClause(String.valueOf(list.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null);
        } else {
            int size = listFilter.a().size();
            int size2 = list.size();
            Intrinsics.checkNotNullParameter(instrumentsCollectionFilterId, "<this>");
            if (instrumentsCollectionFilterId == BondsCollectionFilterId.ISSUER) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_issuer_title_selected, v.k(Integer.valueOf(size), Integer.valueOf(size2)), null, 12);
            } else if (instrumentsCollectionFilterId == BondsCollectionFilterId.CREDIT_QUALITY) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_credit_quality_title_selected, v.k(Integer.valueOf(size), Integer.valueOf(size2)), null, 12);
            } else if (instrumentsCollectionFilterId == BondsCollectionFilterId.MATURITY_TYPE) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_maturity_type_title_selected, v.k(Integer.valueOf(size), Integer.valueOf(size2)), null, 12);
            } else if (instrumentsCollectionFilterId == BondsCollectionFilterId.COUPON_TYPE) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_coupon_type_title_selected, v.k(Integer.valueOf(size), Integer.valueOf(size2)), null, 12);
            } else {
                if (instrumentsCollectionFilterId != BondsCollectionFilterId.ISSUER_COUNTRY) {
                    throw new NotImplementedError(null, 1, null);
                }
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_issuer_country_title_selected, v.k(Integer.valueOf(size), Integer.valueOf(size2)), null, 12);
            }
            clauseF = textLocalisedClause;
        }
        return new ListSubheaderDelegate.Model("INSTRUMENTS_COLLECTION_LIST_SUBHEADER_LIST_ID_" + instrumentsCollectionFilterId, (Image) null, clauseF, listFilter.f95290b ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, listFilter.f95290b, false, (Clause) (z ? new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_action_see_all, null, null, 14) : null), z, (Object) listFilter, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259874);
    }
}
