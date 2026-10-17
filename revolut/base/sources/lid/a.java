package lid;

import com.revolut.feature.shops.api.model.ShopsAuction;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final ShopsAuction.Offer a(eid.f fVar) {
        ZonedDateTime zonedDateTime;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String currentBid = fVar.getCurrentBid();
        Double dK = currentBid != null ? y.k(currentBid) : null;
        String productArticleId = fVar.getProductArticleId();
        try {
            zonedDateTime = ZonedDateTime.parse(fVar.getEndTime());
        } catch (DateTimeParseException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            zonedDateTime = null;
        }
        if (dK == null || zonedDateTime == null) {
            return null;
        }
        return new ShopsAuction.Offer(fVar.getId(), zonedDateTime, dK.doubleValue(), productArticleId, fVar.getAnalyticsRef());
    }

    public static final ShopsAuction.Offer b(sid.b bVar) {
        ZonedDateTime zonedDateTime;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String currentBid = bVar.getCurrentBid();
        Double dK = currentBid != null ? y.k(currentBid) : null;
        String productArticleId = bVar.getProductArticleId();
        try {
            zonedDateTime = ZonedDateTime.parse(bVar.getEndTime());
        } catch (DateTimeParseException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            zonedDateTime = null;
        }
        if (dK == null || zonedDateTime == null) {
            return null;
        }
        return new ShopsAuction.Offer(bVar.getId(), zonedDateTime, dK.doubleValue(), productArticleId, bVar.getAnalyticsRef());
    }
}
