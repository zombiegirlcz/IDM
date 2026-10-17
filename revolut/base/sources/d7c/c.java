package d7c;

import e7c.g;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static final Map a() {
        return r0.k(new Pair("ACTIVE", r7c.b.ACTIVE), new Pair("INACTIVE", r7c.b.INACTIVE), new Pair("BLOCKED", r7c.b.BLOCKED), new Pair("PENDING", r7c.b.PENDING), new Pair("CONFIRMED", r7c.b.CONFIRMED), new Pair("DISCONFIRMED", r7c.b.DISCONFIRMED));
    }

    public static final Map b() {
        return r0.k(new Pair("ACQUIRING_SUBSCRIPTION", r7c.c.SUBSCRIPTION), new Pair("ACQUIRING_ONE_OFF", r7c.c.ONE_OFF));
    }

    public static final Map c() {
        return r0.k(new Pair("HEALTH", d6c.a.HEALTH), new Pair("GENERAL", d6c.a.GENERAL), new Pair("SERVICES", d6c.a.SERVICES), new Pair("AIRLINES", d6c.a.AIRLINES), new Pair("TRANSPORT", d6c.a.TRANSPORT), new Pair("ACCOMMODATION", d6c.a.ACCOMMODATION), new Pair("UTILITIES", d6c.a.UTILITIES), new Pair("SHOPPING", d6c.a.SHOPPING), new Pair("FINANCIAL", d6c.a.FINANCIAL), new Pair("FURNITURE", d6c.a.FURNITURE), new Pair("HARDWARE", d6c.a.HARDWARE), new Pair("GROCERIES", d6c.a.GROCERIES), new Pair("FUEL", d6c.a.FUEL), new Pair("ENTERTAINMENT", d6c.a.ENTERTAINMENT), new Pair("SOFTWARE", d6c.a.SOFTWARE), new Pair("RESTAURANTS", d6c.a.RESTAURANTS), new Pair("ADVERTISING", d6c.a.ADVERTISING), new Pair("CASH", d6c.a.CASH), new Pair("EDUCATION", d6c.a.EDUCATION), new Pair("GOVERNMENT", d6c.a.GOVERNMENT));
    }

    public static final ArrayList d(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(e((e7c.g) it8.next()));
        }
        return arrayList;
    }

    public static final r7c.a e(e7c.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String id10 = gVar.getId();
        r7c.c cVar = (r7c.c) u1.t(gVar.getType(), r7c.c.UNKNOWN, b());
        r7c.b bVar = (r7c.b) u1.t(gVar.getState(), r7c.b.UNKNOWN, a());
        String title = gVar.getTitle();
        long amount = gVar.getAmount();
        xi0.a aVar = xi0.b.Companion;
        String currency = gVar.getCurrency();
        aVar.getClass();
        dj0.d dVar = new dj0.d(amount, xi0.a.a(currency));
        LocalDate localDate = LocalDate.parse(gVar.getNextDate());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        boolean recurring = gVar.getRecurring();
        g.a receiverInfo = gVar.getReceiverInfo();
        Intrinsics.checkNotNullParameter(receiverInfo, "<this>");
        return new r7c.a(id10, cVar, bVar, title, dVar, localDate, recurring, new d6c.c(receiverInfo.getTitle(), (d6c.a) u1.t(receiverInfo.getCategory(), d6c.a.UNKNOWN, c()), receiverInfo.getLogoUrl()));
    }
}
