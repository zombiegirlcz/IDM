package ooa;

import a71.e;
import a71.g;
import a71.h;
import a71.i;
import a71.j;
import com.samskivert.mustache.Mustache;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f227019b;

    public /* synthetic */ c(d dVar, int i) {
        this.f227018a = i;
        this.f227019b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227018a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                j model = (j) pair.f186385a;
                c71.a aVar = (c71.a) pair.f186386b;
                zxd.b bVar = this.f227019b.f227021b;
                String template = aVar.f21826b;
                Intrinsics.h(model);
                ryd.c cVar = (ryd.c) bVar;
                Intrinsics.checkNotNullParameter(template, "template");
                Intrinsics.checkNotNullParameter(model, "model");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(ryd.c.c(model.f1742a));
                ArrayList<a71.c> arrayList = model.f1743b;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (a71.c cVar2 : arrayList) {
                    arrayList2.add(r0.k(new Pair("maskedPan", cVar2.f1721a), new Pair("expiry", cVar2.f1722b), new Pair("deliveryAddress", cVar2.f1723c)));
                }
                linkedHashMap.put("cards", arrayList2);
                ArrayList<i> arrayList3 = model.f1744c;
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                for (i iVar : arrayList3) {
                    arrayList4.add(r0.k(new Pair("lastFour", iVar.f1739a), new Pair("expiry", iVar.f1740b), new Pair("address", iVar.f1741c)));
                }
                linkedHashMap.put("topups", arrayList4);
                ArrayList<e> arrayList5 = model.d;
                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                for (e eVar : arrayList5) {
                    arrayList6.add(r0.k(new Pair("id", eVar.f1727a), new Pair("lastIpAddress", eVar.f1728b), new Pair("lastOpen", eVar.f1729c)));
                }
                linkedHashMap.put("devices", arrayList6);
                linkedHashMap.putAll(ryd.c.b(model.e));
                linkedHashMap.put("date", model.f);
                List<a71.b> list = model.f1745g;
                ArrayList arrayList7 = new ArrayList(w.t(list, 10));
                for (a71.b bVar2 : list) {
                    arrayList7.add(r0.k(new Pair("walletRef", bVar2.f1718a), new Pair("accountState", bVar2.f1719b), new Pair("accountOpeningDate", bVar2.f1720c), new Pair("accountTerminatedDate", bVar2.d)));
                }
                linkedHashMap.put("jointAccounts", arrayList7);
                return new j7a.b(zxd.b.a(cVar, template, linkedHashMap), "subject_confirmation.pdf");
            case 1:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                a71.d model2 = (a71.d) pair2.f186385a;
                c71.a aVar2 = (c71.a) pair2.f186386b;
                zxd.b bVar3 = this.f227019b.f227021b;
                String template2 = aVar2.f21826b;
                Intrinsics.h(model2);
                ryd.c cVar3 = (ryd.c) bVar3;
                Intrinsics.checkNotNullParameter(template2, "template");
                Intrinsics.checkNotNullParameter(model2, "model");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(ryd.c.c(model2.f1724a));
                ArrayList<a71.c> arrayList8 = model2.f1725b;
                ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                for (a71.c cVar4 : arrayList8) {
                    arrayList9.add(r0.k(new Pair("maskedPan", cVar4.f1721a), new Pair("expiry", cVar4.f1722b), new Pair("deliveryAddress", cVar4.f1723c)));
                }
                linkedHashMap2.put("cards", arrayList9);
                linkedHashMap2.putAll(ryd.c.b(model2.f1726c));
                linkedHashMap2.put("date", model2.d);
                List<a71.b> list2 = model2.e;
                ArrayList arrayList10 = new ArrayList(w.t(list2, 10));
                for (a71.b bVar4 : list2) {
                    arrayList10.add(r0.k(new Pair("walletRef", bVar4.f1718a), new Pair("accountState", bVar4.f1719b), new Pair("accountOpeningDate", bVar4.f1720c), new Pair("accountTerminatedDate", bVar4.d)));
                }
                linkedHashMap2.put("jointAccounts", arrayList10);
                return new j7a.b(zxd.b.a(cVar3, template2, linkedHashMap2), "card_confirmation.pdf");
            default:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                g model3 = (g) pair3.f186385a;
                c71.a aVar3 = (c71.a) pair3.f186386b;
                zxd.b bVar5 = this.f227019b.f227021b;
                String template3 = aVar3.f21826b;
                Intrinsics.h(model3);
                Intrinsics.checkNotNullParameter(template3, "template");
                Intrinsics.checkNotNullParameter(model3, "model");
                LinkedHashMap model4 = new LinkedHashMap();
                model4.putAll(ryd.c.c(model3.f1733a));
                ArrayList<h> arrayList11 = model3.f1734b;
                ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                for (h hVar : arrayList11) {
                    arrayList12.add(r0.k(new Pair("sortCode", hVar.f1736a), new Pair("accountNumber", hVar.f1737b), new Pair("mcbLocal", Boolean.valueOf(hVar.f1738c)), new Pair("cfsbLocal", Boolean.valueOf(hVar.d)), new Pair("leadBank", Boolean.valueOf(hVar.e))));
                    arrayList11 = arrayList11;
                }
                model4.put("representations", arrayList12);
                model4.put("representations.count", Integer.valueOf(arrayList11.size()));
                model4.putAll(ryd.c.b(model3.f1735c));
                model4.put("date", model3.d);
                model4.put("jointAccount", Boolean.valueOf(model3.e));
                List<a71.a> list3 = model3.f;
                ArrayList arrayList13 = new ArrayList(w.t(list3, 10));
                for (a71.a aVar4 : list3) {
                    arrayList13.add(r0.k(new Pair("firstName", aVar4.f1715a), new Pair("lastName", aVar4.f1716b), new Pair("phone", aVar4.f1717c), new Pair("birthDate", aVar4.d), new Pair("email", aVar4.e), new Pair("address", aVar4.f)));
                }
                model4.put("coOwners", arrayList13);
                Intrinsics.checkNotNullParameter(template3, "template");
                Intrinsics.checkNotNullParameter(model4, "model");
                String strExecute = Mustache.compiler().escapeHTML(false).compile(template3).execute(model4);
                Intrinsics.checkNotNullExpressionValue(strExecute, "execute(...)");
                return new j7a.b(strExecute, "account_confirmation.pdf");
        }
    }
}
