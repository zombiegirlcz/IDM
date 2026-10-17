package gdg;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.property.OverallPrice;
import com.revolut.feature_travel_hotels_models.property.PriceFee;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import h9g.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jul.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.d0;
import nkm.i;
import nkm.j;
import nkm.t;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f143178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8g.c f143179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f143180c;

    public d(o decimalFormat, p8g.c featureInteractor, g revPointsListItemsMapper, fcg.b breakdownItemsFactory) {
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        Intrinsics.checkNotNullParameter(revPointsListItemsMapper, "revPointsListItemsMapper");
        Intrinsics.checkNotNullParameter(breakdownItemsFactory, "breakdownItemsFactory");
        this.f143178a = decimalFormat;
        this.f143179b = featureInteractor;
        this.f143180c = revPointsListItemsMapper;
    }

    public final String a(double d) {
        return this.f143178a.g(lzl.a.TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING_ZEROES_ABSENT, Double.valueOf(d)) + "%";
    }

    public final TextDelegate.Model b(ArrayList arrayList, cgi.e eVar) {
        dj0.d.Companion.getClass();
        dj0.d dVarF = dj0.d.e;
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarF = i == 0 ? m.f((Pricing) obj2, eVar) : pyd.c.O(dVarF, m.f((Pricing) obj2, eVar));
            i = i2;
        }
        return fcg.b.g(dVarF);
    }

    public final CellDetailsDelegate.Model c(ArrayList arrayList, cgi.e eVar) {
        dj0.d.Companion.getClass();
        dj0.d dVarE = dj0.d.e;
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarE = i == 0 ? m.e((Pricing) obj2, eVar) : pyd.c.O(dVarE, m.e((Pricing) obj2, eVar));
            i = i2;
        }
        return fcg.b.l(dVarE);
    }

    public final CellDetailsDelegate.Model d(ArrayList arrayList, cgi.e eVar) {
        dj0.d.Companion.getClass();
        dj0.d money = dj0.d.e;
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            money = i == 0 ? m.g((Pricing) obj2, eVar) : pyd.c.O(money, m.g((Pricing) obj2, eVar));
            i = i2;
        }
        Intrinsics.checkNotNullParameter(money, "money");
        return fcg.b.m(R$string.hotels_price_breakdown_pay_now, money, "PAY_NOW_ITEM_ID");
    }

    public final CellDetailsDelegate.Model e(int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (true) {
            dj0.d dVar = null;
            if (!it8.hasNext()) {
                break;
            }
            OverallPrice overallPrice = ((Pricing) it8.next()).d;
            if (overallPrice != null) {
                dVar = overallPrice.f98057a;
            }
            arrayList2.add(dVar);
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i2 = 0;
        for (Object obj2 : arrayList2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            if (i2 == 0) {
                dj0.d dVar2 = (dj0.d) obj2;
                if (dVar2 == null) {
                    dj0.d.Companion.getClass();
                    dVar2 = dj0.d.e;
                }
                dVarO = dVar2;
            } else {
                dj0.d dVar3 = (dj0.d) obj2;
                if (dVar3 == null) {
                    dj0.d.Companion.getClass();
                    dVar3 = dj0.d.e;
                }
                dVarO = pyd.c.O(dVarO, dVar3);
            }
            i2 = i3;
        }
        return fcg.b.o(i, dVarO);
    }

    public final List f(ArrayList arrayList, Function1 function1) {
        boolean z;
        d0 d0VarX = y.x(zhm.d0.Q(arrayList), function1);
        Intrinsics.checkNotNullParameter(d0VarX, "<this>");
        j jVarF = t.f(d0VarX, new njf.d(20));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i iVar = new i(jVarF);
        while (iVar.hasNext()) {
            Object next = iVar.next();
            ufi.b bVar = ((PriceFee) next).f98063a;
            Object arrayList2 = linkedHashMap.get(bVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(bVar, arrayList2);
            }
            ((List) arrayList2).add(next);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ufi.b bVar2 = (ufi.b) entry.getKey();
            String str = ((PriceFee) zhm.d0.b0((List) entry.getValue())).f98064b;
            Iterable iterable = (Iterable) entry.getValue();
            int i = 0;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                z = false;
            } else {
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    if (((PriceFee) it8.next()).f98065c) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            Iterable iterable2 = (Iterable) entry.getValue();
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            for (Object obj2 : iterable2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i == 0 ? ((PriceFee) obj2).d : pyd.c.O(dVarO, ((PriceFee) obj2).d);
                i = i2;
            }
            arrayList3.add(new PriceFee(bVar2, str, z, dVarO));
        }
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            arrayList4.add(fcg.b.n((PriceFee) it9.next()));
        }
        return zhm.d0.d1(arrayList4);
    }
}
