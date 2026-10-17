package kfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesFlightFilters$FilterOption;
import kotlin.jvm.internal.Intrinsics;
import xfg.m;
import yfg.d;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final TravelMilesFlightFilters$FilterOption a(m.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new TravelMilesFlightFilters$FilterOption(aVar.getCode(), aVar.getLabel(), aVar.getSubtitle(), aVar.getIconUrl());
    }

    public static final TravelMilesFlightFilters$FilterOption b(d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new TravelMilesFlightFilters$FilterOption(aVar.getCode(), aVar.getLabel(), aVar.getSubtitle(), aVar.getIconUrl());
    }

    public static final d.a c(TravelMilesFlightFilters$FilterOption travelMilesFlightFilters$FilterOption) {
        Intrinsics.checkNotNullParameter(travelMilesFlightFilters$FilterOption, "<this>");
        return new d.a(travelMilesFlightFilters$FilterOption.f94096a, travelMilesFlightFilters$FilterOption.f94097b, travelMilesFlightFilters$FilterOption.f94098c, travelMilesFlightFilters$FilterOption.d);
    }
}
