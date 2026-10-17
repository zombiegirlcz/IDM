package ni7;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.instruments.trend.collections.impl.R$string;
import d9.e1;
import java.math.BigDecimal;
import jbh.e;
import kotlin.jvm.internal.Intrinsics;
import qi7.b;
import qi7.g;
import qi7.h;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f215659a;

    public a(e performanceAssetsMapper) {
        Intrinsics.checkNotNullParameter(performanceAssetsMapper, "performanceAssetsMapper");
        this.f215659a = performanceAssetsMapper;
    }

    public final RowDelegate.Model a(h collectionInstrument) {
        Intrinsics.checkNotNullParameter(collectionInstrument, "collectionInstrument");
        g gVar = collectionInstrument.f246672b;
        b bVar = gVar instanceof b ? (b) gVar : null;
        if (bVar == null) {
            return null;
        }
        Float f = bVar.f246661b;
        float fFloatValue = f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED;
        return RowDelegate.Model.x(j1h.b.a(this.f215659a, collectionInstrument.f246671a, new oh7.b(collectionInstrument), 4), null, null, null, new TextLocalisedClause(R$string.wealth_collections_cfds_most_shorted_long_short_ratio, v.k(new PercentageClause(e1.Z(new BigDecimal(String.valueOf(fFloatValue))), (PercentageClause.Format) null, (Style) null, 6), new PercentageClause(e1.Z(new BigDecimal(String.valueOf(1.0f - fFloatValue))), (PercentageClause.Format) null, (Style) null, 6)), null, 12), null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15);
    }
}
