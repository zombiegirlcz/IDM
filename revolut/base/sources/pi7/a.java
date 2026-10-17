package pi7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import j1h.b;
import java.math.BigDecimal;
import java.util.concurrent.CopyOnWriteArrayList;
import jbh.e;
import kotlin.jvm.internal.Intrinsics;
import qi7.g;
import qi7.h;
import rd0.c;
import rd0.d;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f236458a;

    public a(e performanceAssetsMapper) {
        Intrinsics.checkNotNullParameter(performanceAssetsMapper, "performanceAssetsMapper");
        this.f236458a = performanceAssetsMapper;
    }

    public final RowDelegate.Model a(h collectionInstrument) {
        Intrinsics.checkNotNullParameter(collectionInstrument, "collectionInstrument");
        g gVar = collectionInstrument.f246672b;
        qi7.e eVar = gVar instanceof qi7.e ? (qi7.e) gVar : null;
        if (eVar == null) {
            g gVar2 = collectionInstrument.f246672b;
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Expected MostTraded custom attributes but got ", gVar2 != null ? gVar2.getClass().getSimpleName() : null));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, illegalStateException, h0Var);
        }
        RowDelegate.Model modelA = b.a(this.f236458a, collectionInstrument.f246671a, new oh7.b(collectionInstrument), 4);
        if (eVar == null) {
            return modelA;
        }
        int i = (int) (eVar.f246667b * 100);
        int i2 = 100 - i;
        int i3 = R$string.wealth_most_traded_tag_buys_percentage;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i3, u.c(new PercentageClause(bigDecimalValueOf, (PercentageClause.Format) null, (Style) null, 6)), null, 12);
        int i5 = R$string.wealth_most_traded_tag_sells_percentage;
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(i2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        return RowDelegate.Model.x(modelA, null, null, null, null, v1.c.f(v.k(textLocalisedClause, new TextLocalisedClause(i5, u.c(new PercentageClause(bigDecimalValueOf2, (PercentageClause.Format) null, (Style) null, 6)), null, 12)), null), 0, null, false, null, null, 0, 0, 0, 0, null, -129, 15);
    }
}
