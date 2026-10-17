package gd3;

import com.revolut.feature.cashback.api.models.CashbackByCurrencies;
import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.feature.cashback.api.models.CashbackCurrency;
import com.revolut.feature.cashback.api.models.CashbackSource;
import com.revolut.feature.cashback.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f143050b;

    public /* synthetic */ d(g gVar, int i) {
        this.f143049a = i;
        this.f143050b = gVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f143049a;
        CashbackBySources cashbackBySources = null;
        xi0.b bVarA = null;
        g gVar = this.f143050b;
        switch (i) {
            case 0:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (Object obj3 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        v.s();
                        throw null;
                    }
                    fd3.a aVar = (fd3.a) obj3;
                    qsg.b walletsRepository = gVar.f143056c;
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    Intrinsics.checkNotNullParameter(walletsRepository, "walletsRepository");
                    io3.d dVarB = qsg.b.b(walletsRepository, aVar.getPocketId());
                    uc3.a aVar2 = dVarB != null ? new uc3.a(aVar.getId(), dVarB) : null;
                    if (aVar2 == null) {
                        aVar2 = null;
                    } else if (i2 == 0) {
                        io3.d dVar = aVar2.f278974b;
                        String string = gVar.f.getString(R$string.cashback_box_list_title);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        io3.d pocket = io3.d.a(dVar, string, null, 0L, null, 8388599);
                        String id10 = aVar2.f278973a;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(pocket, "pocket");
                        aVar2 = new uc3.a(id10, pocket);
                    }
                    if (aVar2 != null) {
                        arrayList.add(aVar2);
                    }
                    i2 = i3;
                }
                return arrayList;
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                wc3.c cVar = (wc3.c) gVar.d.T2("STORAGE_KEY_CASHBACK_BY_SOURCES", wc3.c.class);
                if (cVar != null) {
                    Object obj4 = cd3.a.f23165a;
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    dj0.d dVarV = hx7.a.v(cVar.getTotal());
                    List<wc3.e> sources = cVar.getSources();
                    ArrayList arrayList2 = new ArrayList(w.t(sources, 10));
                    for (wc3.e eVar : sources) {
                        arrayList2.add(new CashbackSource(hx7.a.v(eVar.getEarned()), (uc3.d) u1.t(eVar.getType(), uc3.d.UNKNOWN, cd3.a.f23165a), eVar.getAvailable()));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : arrayList2) {
                        if (((CashbackSource) obj5).f65689b != uc3.d.UNKNOWN) {
                            arrayList3.add(obj5);
                        }
                    }
                    cashbackBySources = new CashbackBySources(dVarV, arrayList3);
                }
                return cashbackBySources;
            case 2:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (CashbackByCurrencies) gVar.e.get("MEMORY_KEY_CASHBACK_BY_CURRENCIES");
            case 3:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                wc3.b bVar = (wc3.b) gVar.d.T2("STORAGE_KEY_CASHBACK_BY_CURRENCIES", wc3.b.class);
                if (bVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                List earned = bVar.getEarned();
                ArrayList arrayList4 = new ArrayList(w.t(earned, 10));
                Iterator it11 = earned.iterator();
                while (it11.hasNext()) {
                    arrayList4.add(hx7.a.v((jo3.b) it11.next()));
                }
                return new CashbackByCurrencies(arrayList4);
            case 4:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (CashbackCurrency) gVar.e.get("MEMORY_KEY_CASHBACK_CURRENCY");
            case 5:
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (List) gVar.e.get("MEMORY_KEY_CASHBACK");
            case 6:
                Unit it14 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                wc3.d dVar2 = (wc3.d) gVar.d.T2("STORAGE_KEY_CASHBACK_CURRENCY", wc3.d.class);
                if (dVar2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                String currency = dVar2.getCurrency();
                if (currency != null) {
                    xi0.b.Companion.getClass();
                    bVarA = xi0.a.a(currency);
                }
                return new CashbackCurrency(bVarA);
            case 7:
                Unit it15 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                List<wc3.a> list2 = (List) gVar.d.T2("STORAGE_KEY_CASHBACK_BOXES", g.f143053l);
                if (list2 == null) {
                    return null;
                }
                ArrayList arrayList5 = new ArrayList();
                for (wc3.a aVar3 : list2) {
                    qsg.b walletsRepository2 = gVar.f143056c;
                    Intrinsics.checkNotNullParameter(aVar3, "<this>");
                    Intrinsics.checkNotNullParameter(walletsRepository2, "walletsRepository");
                    io3.d dVarB2 = qsg.b.b(walletsRepository2, aVar3.getPocketId());
                    uc3.a aVar4 = dVarB2 != null ? new uc3.a(aVar3.getId(), dVarB2) : null;
                    if (aVar4 != null) {
                        arrayList5.add(aVar4);
                    }
                }
                return arrayList5;
            case 8:
                Unit it16 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (uc3.c) gVar.e.get("MEMORY_KEY_CASHBACK_LIMIT");
            default:
                Unit it17 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return (CashbackBySources) gVar.e.get("MEMORY_KEY_CASHBACK_BY_SOURCES");
        }
    }
}
