package mi7;

import aw0.wa;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import qi7.g;
import qi7.h;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbh.e f205618a;

    public a(jbh.e performanceAssetsMapper) {
        Intrinsics.checkNotNullParameter(performanceAssetsMapper, "performanceAssetsMapper");
        this.f205618a = performanceAssetsMapper;
    }

    public final RowDelegate.Model a(h collectionInstrument) {
        Intrinsics.checkNotNullParameter(collectionInstrument, "collectionInstrument");
        g gVar = collectionInstrument.f246672b;
        qi7.d dVar = gVar instanceof qi7.d ? (qi7.d) gVar : null;
        if (dVar == null) {
            return null;
        }
        BigDecimal bigDecimalMultiply = dVar.f246665a.multiply(new BigDecimal(100));
        RowDelegate.Model modelA = j1h.b.a(this.f205618a, collectionInstrument.f246671a, new oh7.b(collectionInstrument), 4);
        int i = R$string.dividend_leaders_cell_subtitle_yield;
        Intrinsics.h(bigDecimalMultiply);
        return RowDelegate.Model.x(modelA, null, null, null, new TextLocalisedClause(i, u.c(new PercentageClause(bigDecimalMultiply, new PercentageClause.Format.Custom(2, 4, null, wa.SHOW_ALL_ZEROES, RoundingMode.HALF_EVEN), (Style) null, 4)), null, 12), null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15);
    }
}
