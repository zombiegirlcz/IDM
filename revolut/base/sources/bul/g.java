package bul;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.navigation.ExchangePriceDescriptionFeatureConfig;
import com.revolut.feature_market_data_api.navigation.TransactionUnitsType;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import grl.k9;
import java.math.BigDecimal;
import k4l.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class g {
    public static FeatureCommand a(bfl.g tradeSide, InstrumentTicker instrumentTicker, e0 orderLimits) {
        ej0.b bVar;
        BigDecimal bigDecimalX;
        xi0.b bVar2;
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        z zVar = instrumentTicker.d;
        dj0.d dVar = instrumentTicker.e;
        TransactionUnitsType lots = (io3.h.i(zVar) && orderLimits.a()) ? new TransactionUnitsType.Lots(orderLimits.b()) : TransactionUnitsType.Units.f97103a;
        int i = f.f18906a[tradeSide.ordinal()];
        if (i == 1) {
            bVar = instrumentTicker.u;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = instrumentTicker.f105124t;
        }
        if (bVar == null) {
            bVar = instrumentTicker.f;
        }
        c4i.a aVarA0 = u0.a0(instrumentTicker.d);
        f8l.c cVar = f8l.c.SECURITY;
        String str = instrumentTicker.f105113c;
        xi0.a aVar = xi0.b.Companion;
        String str2 = instrumentTicker.f105112b;
        aVar.getClass();
        Asset asset = new Asset(cVar, str, xi0.a.a(str2));
        if (bVar == null || (bigDecimalX = bVar.f126703a) == null) {
            bigDecimalX = pyd.c.x(dVar);
        }
        BigDecimal bigDecimal = bigDecimalX;
        if (bVar == null || (bVar2 = bVar.f126704b) == null) {
            bVar2 = dVar.f115083b;
        }
        Asset asset2 = new Asset(cp5.d.A(bVar2) ? f8l.c.FIAT : cp5.d.z(bVar2) ? f8l.c.CRYPTO : cp5.d.y(bVar2) ? f8l.c.COMMODITY : f8l.c.UNDEFINED, bVar2.f306286a, bVar2);
        k9 k9Var = k9.ProductUnspecified;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return gc0.c.f(new ExchangePriceDescriptionFeatureConfig(aVarA0, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), asset, bigDecimal, asset2, lots));
    }
}
