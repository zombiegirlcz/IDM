package ko4;

import cl4.i;
import cl4.j;
import cl4.k;
import cl4.l;
import cl4.m;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import ko4.a;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {
    public static final m a(a aVar) {
        k kVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Period period = Period.parse(aVar.getInterestFree().getPeriod());
        Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
        l lVar = new l(period);
        a.C1055a cashback = aVar.getCashback();
        if (cashback != null) {
            String defaultRate = cashback.getDefaultRate();
            a.C1055a.C1056a promo = cashback.getPromo();
            i iVar = new i(mo3.a.o(promo.getSpendsThreshold()), promo.getLowerRate(), promo.getHigherRate(), promo.getPeriod());
            List<a.C1055a.b> promotions = cashback.getPromotions();
            ArrayList arrayList = new ArrayList(w.t(promotions, 10));
            for (a.C1055a.b bVar : promotions) {
                arrayList.add(new j(mo3.a.o(bVar.getSpendsCap()), bVar.getRate(), bVar.getPeriod()));
            }
            kVar = new k(defaultRate, iVar, arrayList);
        } else {
            kVar = null;
        }
        return new m(lVar, kVar);
    }

    public static final a b(m mVar) {
        a.C1055a c1055a;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        String string = mVar.f24954a.f24953a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        a.b bVar = new a.b(string);
        k kVar = mVar.f24955b;
        if (kVar != null) {
            String str = kVar.f24950a;
            i iVar = kVar.f24951b;
            a.C1055a.C1056a c1056a = new a.C1055a.C1056a(iVar.f24944a, iVar.f24945b, iVar.d, mo3.a.p(iVar.f24946c));
            ArrayList<j> arrayList = kVar.f24952c;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (j jVar : arrayList) {
                arrayList2.add(new a.C1055a.b(jVar.f24947a, jVar.f24949c, mo3.a.p(jVar.f24948b)));
            }
            c1055a = new a.C1055a(str, c1056a, arrayList2);
        } else {
            c1055a = null;
        }
        return new a(bVar, c1055a);
    }
}
