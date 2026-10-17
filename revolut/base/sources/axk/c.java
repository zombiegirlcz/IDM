package axk;

import com.revolut.retail.feature.trading_hours.impl.data.network.TradingHoursService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c implements e {
    public static TradingHoursService a(ek.a jsonConverterFactory, ik0.b retrofitFactory) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(jsonConverterFactory, "jsonConverterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, jsonConverterFactory, null, 27).create(TradingHoursService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TradingHoursService tradingHoursService = (TradingHoursService) objCreate;
        s.k(tradingHoursService);
        return tradingHoursService;
    }
}
