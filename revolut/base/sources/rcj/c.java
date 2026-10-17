package rcj;

import ddj.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import le.u1;
import org.joda.time.DateTime;
import uv5.d;
import uv5.f;
import uv5.g;
import uv5.h;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, bdj.a.class, "toDomain", "toDomain(Lcom/revolut/retail/feature/cryptocommoditydetails/impl/data/network/model/CryptoDetailsAboutDto;)Lcom/revolut/feature/cryptocommodity/domain/api/model/CryptoDetails;", 1);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        g gVar;
        ddj.b bVar;
        d dVar;
        uv5.a aVar;
        ArrayList arrayList;
        ddj.b p0 = (ddj.b) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = bdj.a.f14605a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        String symbol = p0.getSymbol();
        String description = p0.getDescription();
        String website = p0.getWebsite();
        String whitepaperLink = p0.getWhitepaperLink();
        e stats = p0.getStats();
        if (stats != null) {
            Intrinsics.checkNotNullParameter(stats, "<this>");
            jo3.a allTimeHigh = stats.getAllTimeHigh();
            dj0.d dVarO = allTimeHigh != null ? mo3.a.o(allTimeHigh) : null;
            Long circulatingSupply = stats.getCirculatingSupply();
            jo3.a marketCap = stats.getMarketCap();
            dj0.d dVarO2 = marketCap != null ? mo3.a.o(marketCap) : null;
            Long maxSupply = stats.getMaxSupply();
            Integer popularity = stats.getPopularity();
            jo3.a volume24Hour = stats.getVolume24Hour();
            gVar = new g(dVarO, circulatingSupply, dVarO2, maxSupply, popularity, volume24Hour != null ? mo3.a.o(volume24Hour) : null);
        } else {
            gVar = null;
        }
        ddj.c sentimentIndicator = p0.getSentimentIndicator();
        if (sentimentIndicator != null) {
            Intrinsics.checkNotNullParameter(sentimentIndicator, "<this>");
            int totalBullishSignals = sentimentIndicator.getTotalBullishSignals();
            int totalNeutralSignals = sentimentIndicator.getTotalNeutralSignals();
            int totalBearishSignals = sentimentIndicator.getTotalBearishSignals();
            String sentiment = sentimentIndicator.getSentiment();
            ?? r132 = bdj.a.f14605a;
            uv5.c cVar = (uv5.c) u1.t(sentiment, uv5.c.UNKNOWN, r132);
            List signals = sentimentIndicator.getSignals();
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = signals.iterator();
            while (it8.hasNext()) {
                ddj.d dVar2 = (ddj.d) it8.next();
                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                String id10 = dVar2.getId();
                ddj.b bVar2 = p0;
                ?? r06 = bdj.a.f14606b;
                Iterator it9 = it8;
                f fVar = f.UNKNOWN;
                f fVar2 = (f) u1.t(id10, fVar, r06);
                uv5.e eVar = fVar2 != fVar ? new uv5.e(fVar2, (uv5.c) u1.t(dVar2.getSentiment(), uv5.c.UNKNOWN, r132), dVar2.getTitle(), dVar2.getDescription(), DateTime.parse(dVar2.getUpdatedAt()).getMillis()) : null;
                if (eVar != null) {
                    arrayList2.add(eVar);
                }
                p0 = bVar2;
                it8 = it9;
            }
            bVar = p0;
            dVar = new d(totalBullishSignals, totalNeutralSignals, totalBearishSignals, cVar, arrayList2);
        } else {
            bVar = p0;
            dVar = null;
        }
        ddj.a airTip = bVar.getAirTip();
        if (airTip != null) {
            Intrinsics.checkNotNullParameter(airTip, "<this>");
            aVar = new uv5.a(airTip.getExpiresAt().toEpochMilli(), airTip.getId(), airTip.getTitle(), airTip.getBody(), airTip.getPrompt());
        } else {
            aVar = null;
        }
        List customLinks = bVar.getCustomLinks();
        if (customLinks != null) {
            List<ddj.f> list = customLinks;
            ArrayList arrayList3 = new ArrayList(w.t(list, 10));
            for (ddj.f fVar3 : list) {
                Intrinsics.checkNotNullParameter(fVar3, "<this>");
                arrayList3.add(new h(fVar3.getUrl(), fVar3.getIconId(), fVar3.getLabel()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        return new uv5.b(symbol, description, website, whitepaperLink, gVar, dVar, aVar, arrayList);
    }
}
