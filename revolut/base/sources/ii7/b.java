package ii7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsCollectionAssetsTypeFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionTimeframeFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.cfdspnldrivers.InstrumentsCfdsPnlDriversCollectionKeyFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.mosttraded.InstrumentsMostTradedCollectionKeyFilterValue;
import com.revolut.feature.instruments.trend.collections.impl.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class b {
    public static ActionsView.Item a(int i, ph7.b bVar, InstrumentsTrendCollectionFilterValue instrumentsTrendCollectionFilterValue) {
        return new ActionsView.Item("INSTRUMENTS_TREND_COLLECTION_FILTER_" + bVar, mx0.d.SEMIBLACK, false, null, null, b(instrumentsTrendCollectionFilterValue), new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, bVar, null, 24476);
    }

    public static TextLocalisedClause b(InstrumentsTrendCollectionFilterValue instrumentsTrendCollectionFilterValue) {
        int i;
        if (instrumentsTrendCollectionFilterValue == InstrumentsCollectionAssetsTypeFilterValue.ALL) {
            i = R$string.instruments_trend_collections_asset_type_all;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsCollectionAssetsTypeFilterValue.CFDS) {
            i = R$string.instruments_trend_collections_asset_type_cfds;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsCollectionAssetsTypeFilterValue.STOCKS) {
            i = R$string.instruments_trend_collections_asset_type_stocks;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsCollectionAssetsTypeFilterValue.BONDS) {
            i = R$string.instruments_trend_collections_asset_type_bonds;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsCollectionAssetsTypeFilterValue.ETFS) {
            i = R$string.instruments_trend_collections_asset_type_etfs;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsMostTradedCollectionKeyFilterValue.MOST_TRADED) {
            i = R$string.instruments_trend_collections_most_traded_filter_all;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsMostTradedCollectionKeyFilterValue.MOST_BOUGHT) {
            i = R$string.instruments_trend_collections_most_traded_filter_most_bought;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsMostTradedCollectionKeyFilterValue.MOST_SOLD) {
            i = R$string.instruments_trend_collections_most_traded_filter_most_sold;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsCfdsPnlDriversCollectionKeyFilterValue.PNL_DRIVERS_CFDS) {
            i = R$string.wealth_margin_cfds_pnl_drivers_key_all;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsCfdsPnlDriversCollectionKeyFilterValue.PNL_DRIVERS_PROFIT_CFDS) {
            i = R$string.wealth_margin_cfds_pnl_drivers_key_profit_drivers;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsCfdsPnlDriversCollectionKeyFilterValue.PNL_DRIVERS_LOSS_CFDS) {
            i = R$string.wealth_margin_cfds_pnl_drivers_key_loss_drivers;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsTrendCollectionTimeframeFilterValue.ONE_DAY) {
            i = R$string.instruments_trend_collections_timeframe_one_day;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsTrendCollectionTimeframeFilterValue.ONE_WEEK) {
            i = R$string.instruments_trend_collections_timeframe_one_week;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsTrendCollectionTimeframeFilterValue.ONE_MONTH) {
            i = R$string.instruments_trend_collections_timeframe_one_month;
        } else if (instrumentsTrendCollectionFilterValue == InstrumentsTrendCollectionTimeframeFilterValue.ONE_YEAR) {
            i = R$string.instruments_trend_collections_timeframe_one_year;
        } else {
            if (instrumentsTrendCollectionFilterValue != InstrumentsTrendCollectionTimeframeFilterValue.FIVE_YEAR) {
                throw new IllegalArgumentException("Unsupported filter value " + instrumentsTrendCollectionFilterValue);
            }
            i = R$string.instruments_trend_collections_timeframe_five_year;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
