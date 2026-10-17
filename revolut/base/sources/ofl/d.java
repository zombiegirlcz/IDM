package ofl;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import e4m.e;
import mfl.g;
import od0.i;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements e {
    public static g a() {
        c.Companion.getClass();
        Data data = new Data(f0.f322471a, null, false, 6, null);
        TradingLegalEntityInformation tradingLegalEntityInformation = new TradingLegalEntityInformation(null);
        i.Companion.getClass();
        return new g(data, tradingLegalEntityInformation, new Data(i.f224256b, null, false, 6, null));
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
