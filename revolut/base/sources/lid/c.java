package lid;

import com.revolut.feature.rev_points.models.EarningBadge;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsCategory;
import com.revolut.feature.shops.api.model.ShopsEarningRate;
import com.revolut.feature.shops.api.model.ShopsInstalmentOption;
import com.revolut.feature.shops.api.model.ShopsOutlet;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import sid.n;
import sid.s;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f195475a = r0.k(new Pair("CARD", shd.a.CARD), new Pair("REVPAY", shd.a.REVPAY));

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.shops.api.model.ShopsCampaignOffer a(eid.j r32, java.lang.String r33, java.lang.Integer r34, com.revolut.feature.rev_points.models.EarningBadge r35) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lid.c.a(eid.j, java.lang.String, java.lang.Integer, com.revolut.feature.rev_points.models.EarningBadge):com.revolut.feature.shops.api.model.ShopsCampaignOffer");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.shops.api.model.ShopsCampaignOffer b(sid.f r32, java.lang.String r33, java.lang.Integer r34, com.revolut.feature.rev_points.models.EarningBadge r35) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lid.c.b(sid.f, java.lang.String, java.lang.Integer, com.revolut.feature.rev_points.models.EarningBadge):com.revolut.feature.shops.api.model.ShopsCampaignOffer");
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.Map] */
    public static final sid.f c(ShopsCampaignOffer shopsCampaignOffer) {
        String strName;
        Double d;
        String str;
        sid.j jVar;
        boolean z;
        String str2;
        sid.g gVar;
        sid.g gVar2;
        String str3;
        List list;
        String str4;
        List list2;
        s sVar;
        n nVar;
        Intrinsics.checkNotNullParameter(shopsCampaignOffer, "<this>");
        String str5 = shopsCampaignOffer.f87023a;
        String str6 = shopsCampaignOffer.f87024b;
        String str7 = shopsCampaignOffer.f87025c;
        String str8 = shopsCampaignOffer.d;
        String str9 = shopsCampaignOffer.e;
        String str10 = shopsCampaignOffer.f;
        boolean zF = Intrinsics.f(shopsCampaignOffer.f87026g, Boolean.TRUE);
        ekc.a aVar = shopsCampaignOffer.f87027h;
        if (aVar == null || (strName = aVar.name()) == null) {
            strName = "ACTIVATED";
        }
        String str11 = strName;
        String str12 = shopsCampaignOffer.i;
        String str13 = shopsCampaignOffer.f87028j;
        BigDecimal bigDecimal = shopsCampaignOffer.k;
        Double dValueOf = bigDecimal != null ? Double.valueOf(bigDecimal.doubleValue()) : null;
        Double d5 = shopsCampaignOffer.f87029l;
        ShopsEarningRate shopsEarningRate = shopsCampaignOffer.f87030m;
        if (shopsEarningRate != null) {
            Intrinsics.checkNotNullParameter(shopsEarningRate, "<this>");
            d = dValueOf;
            str = str5;
            jVar = new sid.j(String.valueOf(shopsEarningRate.f87045a), boh.f.H(shopsEarningRate.f87046b));
        } else {
            d = dValueOf;
            str = str5;
            jVar = null;
        }
        EarningBadge earningBadge = shopsCampaignOffer.f87031n;
        sid.d dVarC = earningBadge != null ? b.c(earningBadge) : null;
        boolean z3 = shopsCampaignOffer.o;
        boolean z4 = shopsCampaignOffer.f87032p;
        sid.d dVar = dVarC;
        boolean z6 = shopsCampaignOffer.f87033q;
        ShopsCategory shopsCategory = shopsCampaignOffer.f87034r;
        if (shopsCategory != null) {
            Intrinsics.checkNotNullParameter(shopsCategory, "<this>");
            z = z3;
            str2 = str6;
            gVar = new sid.g(shopsCategory.f87040a, shopsCategory.f87041b);
        } else {
            z = z3;
            str2 = str6;
            gVar = null;
        }
        String str14 = shopsCampaignOffer.f87035s;
        String str15 = shopsCampaignOffer.f87036t;
        if (str15 == null) {
            str15 = "";
        }
        List list3 = shopsCampaignOffer.v;
        if (list3 != null) {
            List list4 = list3;
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                sid.g gVar3 = gVar;
                String str16 = str15;
                String strH = u1.h((shd.a) it8.next(), f195475a);
                if (strH != null) {
                    arrayList.add(strH);
                }
                str15 = str16;
                gVar = gVar3;
            }
            gVar2 = gVar;
            str3 = str15;
            list = arrayList;
        } else {
            gVar2 = gVar;
            str3 = str15;
            list = f0.f322471a;
        }
        List list5 = shopsCampaignOffer.f87037w;
        ShopsOutlet shopsOutlet = shopsCampaignOffer.f87038x;
        s sVarN = shopsOutlet != null ? yoj.b.N(shopsOutlet) : null;
        List list6 = list;
        String str17 = shopsCampaignOffer.f87039y;
        ShopsInstalmentOption shopsInstalmentOption = shopsCampaignOffer.A;
        if (shopsInstalmentOption != null) {
            Intrinsics.checkNotNullParameter(shopsInstalmentOption, "<this>");
            str4 = str17;
            list2 = list5;
            sVar = sVarN;
            nVar = new n(shopsInstalmentOption.f87050a.name(), shopsInstalmentOption.f87051b, shopsInstalmentOption.f87052c, hx7.a.A(shopsInstalmentOption.d));
        } else {
            str4 = str17;
            list2 = list5;
            sVar = sVarN;
            nVar = null;
        }
        return new sid.f(str, str2, str7, str8, str9, str10, zF, str11, str12, str13, d, d5, jVar, dVar, z, z4, z6, gVar2, str14, str3, list6, list2, sVar, str4, nVar);
    }
}
