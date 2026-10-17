package mhl;

import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.screener.MetricValue;
import com.revolut.shared.feature.wealth.models.screener.ScreenerBrand;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.revolut.shared.feature.wealth.models.screener.ScreenerExtraMetric;
import com.revolut.shared.feature.wealth.models.screener.ScreenerInstrument;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.serialization.SerializationException;
import nhl.a0;
import nhl.c;
import nhl.e;
import nhl.e0;
import nhl.f;
import nhl.g;
import nhl.h0;
import nhl.k;
import nhl.q;
import nhl.r;
import nhl.w0;
import nhl.x;
import nhl.z;
import xi0.b;
import yhm.m;
import yhm.n;
import yhm.o;
import zel.d;
import zel.i;
import zel.j;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final MetricValue a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (!(gVar instanceof e)) {
            if (!(gVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((f) gVar).f215521a;
            BigDecimal bigDecimalI = y.i(str);
            return bigDecimalI != null ? new MetricValue.Decimal(bigDecimalI) : new MetricValue.PlainString(str);
        }
        e eVar = (e) gVar;
        long j2 = eVar.f215515a;
        xi0.a aVar = b.Companion;
        String str2 = eVar.f215516b;
        aVar.getClass();
        return new MetricValue.Money(j2, xi0.a.a(str2));
    }

    public static final ScreenerCollection b(q qVar) {
        ArrayList arrayList;
        ScreenerSelectedSorting screenerSelectedSorting;
        ArrayList arrayList2;
        Parcelable options;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        String str = qVar.f215545a;
        String str2 = qVar.f215546b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        String str4 = qVar.f215547c;
        String str5 = qVar.d;
        int i = qVar.e;
        Integer num = qVar.f;
        List list = qVar.f215548g;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList3.add(tbl.a.a((String) it8.next()));
        }
        d dVar = qVar.f215549h;
        List list2 = qVar.f215550j;
        if (list2 != null) {
            List<h0> list3 = list2;
            ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
            for (h0 h0Var : list3) {
                Intrinsics.checkNotNullParameter(h0Var, "<this>");
                a0 a0Var = h0Var.f215527b;
                String str6 = h0Var.f215526a;
                if (a0Var instanceof nhl.y) {
                    zel.g gVarValueOf = zel.g.valueOf(str6);
                    nhl.y yVar = (nhl.y) a0Var;
                    String str7 = yVar.f215580a;
                    BigDecimal bigDecimal = str7 != null ? new BigDecimal(str7) : null;
                    String str8 = yVar.f215581b;
                    options = new ScreenerSelectedFilter.Range(gVarValueOf, bigDecimal, str8 != null ? new BigDecimal(str8) : null);
                } else {
                    if (!(a0Var instanceof x)) {
                        if (Intrinsics.f(a0Var, z.INSTANCE)) {
                            throw new SerializationException("Unknown ScreenerFilterDto format");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    options = new ScreenerSelectedFilter.Options(zel.g.valueOf(str6), ((x) a0Var).f215578a);
                }
                arrayList4.add(options);
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        k kVar = qVar.k;
        if (kVar != null) {
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            screenerSelectedSorting = new ScreenerSelectedSorting(zel.g.valueOf(kVar.f215531a), kVar.f215532b);
        } else {
            screenerSelectedSorting = null;
        }
        List list4 = qVar.f215551l;
        if (list4 != null) {
            List list5 = list4;
            ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
            Iterator it9 = list5.iterator();
            while (it9.hasNext()) {
                arrayList5.add(c((e0) it9.next()));
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        return new ScreenerCollection(str, str3, str4, str5, i, num, arrayList3, dVar, arrayList, screenerSelectedSorting, arrayList2);
    }

    public static final ScreenerInstrument c(e0 e0Var) {
        zel.g gVar;
        zel.g gVar2;
        ScreenerExtraMetric screenerExtraMetric;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        String str = e0Var.f215518a;
        String str2 = e0Var.f215519b;
        ArrayList arrayList = null;
        if (str2 != null) {
            zel.g[] gVarArrValues = zel.g.values();
            int length = gVarArrValues.length;
            for (int i = 0; i < length; i++) {
                gVar = gVarArrValues[i];
                if (kotlin.text.a0.z(gVar.name(), str2, true)) {
                    break;
                }
            }
            gVar = null;
        } else {
            gVar = null;
        }
        g gVar3 = e0Var.f215520c;
        MetricValue metricValueA = gVar3 != null ? a(gVar3) : null;
        List<c> list = e0Var.d;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (c cVar : list) {
                String str3 = cVar.f215511a;
                zel.g[] gVarArrValues2 = zel.g.values();
                int length2 = gVarArrValues2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        gVar2 = null;
                        break;
                    }
                    gVar2 = gVarArrValues2[i2];
                    if (kotlin.text.a0.z(gVar2.name(), str3, true)) {
                        break;
                    }
                    i2++;
                }
                if (gVar2 != null) {
                    g gVar4 = cVar.f215512b;
                    screenerExtraMetric = new ScreenerExtraMetric(gVar2, gVar4 != null ? a(gVar4) : null);
                } else {
                    screenerExtraMetric = null;
                }
                if (screenerExtraMetric != null) {
                    arrayList2.add(screenerExtraMetric);
                }
            }
            arrayList = arrayList2;
        }
        return new ScreenerInstrument(str, gVar, metricValueA, arrayList);
    }

    public static final ScreenerSortingOptions d(w0 w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        List list = w0Var.f215574a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(zel.g.valueOf((String) it8.next()));
        }
        return new ScreenerSortingOptions(arrayList, zel.g.valueOf(w0Var.f215575b), i.valueOf(w0Var.f215576c));
    }

    public static final zel.e e(r rVar) throws Throwable {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Object objA;
        Object objA2;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        List list = rVar.f215558a;
        ArrayList arrayList6 = null;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList7 = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                kii.e.B(wi0.b.Companion, (String) it8.next(), arrayList7);
            }
            arrayList = arrayList7;
        } else {
            arrayList = null;
        }
        List<String> list3 = rVar.f215559b;
        if (list3 != null) {
            ArrayList arrayList8 = new ArrayList();
            for (String str : list3) {
                try {
                    m.Companion companion = m.INSTANCE;
                    objA2 = zel.g.valueOf(str);
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA2 = o.a(th10);
                }
                if (objA2 instanceof n) {
                    objA2 = null;
                }
                zel.g gVar = (zel.g) objA2;
                if (gVar != null) {
                    arrayList8.add(gVar);
                }
            }
            arrayList2 = arrayList8;
        } else {
            arrayList2 = null;
        }
        List list4 = rVar.f215560c;
        List list5 = rVar.d;
        if (list5 != null) {
            List list6 = list5;
            ArrayList arrayList9 = new ArrayList(w.t(list6, 10));
            Iterator it9 = list6.iterator();
            while (it9.hasNext()) {
                kii.e.B(wi0.b.Companion, (String) it9.next(), arrayList9);
            }
            arrayList3 = arrayList9;
        } else {
            arrayList3 = null;
        }
        List list7 = rVar.e;
        if (list7 != null) {
            List<nhl.n> list8 = list7;
            ArrayList arrayList10 = new ArrayList(w.t(list8, 10));
            for (nhl.n nVar : list8) {
                Intrinsics.checkNotNullParameter(nVar, "<this>");
                arrayList10.add(new ScreenerBrand(nVar.f215536a, nVar.f215537b, nVar.f215538c));
            }
            arrayList4 = arrayList10;
        } else {
            arrayList4 = null;
        }
        List<String> list9 = rVar.f;
        if (list9 != null) {
            ArrayList arrayList11 = new ArrayList();
            for (String str2 : list9) {
                try {
                    m.Companion companion3 = m.INSTANCE;
                    objA = j.valueOf(str2);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th11) {
                    m.Companion companion4 = m.INSTANCE;
                    objA = o.a(th11);
                }
                Throwable thA = m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                if (objA instanceof n) {
                    objA = null;
                }
                j jVar = (j) objA;
                if (jVar != null) {
                    arrayList11.add(jVar);
                }
            }
            arrayList5 = arrayList11;
        } else {
            arrayList5 = null;
        }
        List list10 = rVar.f215561g;
        if (list10 != null) {
            List list11 = list10;
            arrayList6 = new ArrayList(w.t(list11, 10));
            Iterator it10 = list11.iterator();
            while (it10.hasNext()) {
                kii.e.B(wi0.b.Companion, (String) it10.next(), arrayList6);
            }
        }
        return new zel.e(arrayList, arrayList2, list4, arrayList3, arrayList4, arrayList5, arrayList6);
    }

    public static final ScreenerCollection f(q qVar) {
        Object objA;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        try {
            m.Companion companion = m.INSTANCE;
            objA = b(qVar);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        return (ScreenerCollection) objA;
    }

    public static final ArrayList g(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(k((ScreenerSelectedFilter) it8.next()));
        }
        return arrayList;
    }

    public static final g h(MetricValue metricValue) {
        Intrinsics.checkNotNullParameter(metricValue, "<this>");
        if (metricValue instanceof MetricValue.Money) {
            MetricValue.Money money = (MetricValue.Money) metricValue;
            return new e(money.f105148a, money.f105149b.f306286a);
        }
        if (metricValue instanceof MetricValue.Decimal) {
            String plainString = ((MetricValue.Decimal) metricValue).f105147a.toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            return new f(plainString);
        }
        if (metricValue instanceof MetricValue.PlainString) {
            return new f(((MetricValue.PlainString) metricValue).f105150a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final q i(ScreenerCollection screenerCollection) {
        ArrayList arrayList;
        k kVar;
        Intrinsics.checkNotNullParameter(screenerCollection, "<this>");
        String str = screenerCollection.f105154a;
        String str2 = screenerCollection.f105155b;
        String str3 = screenerCollection.f105156c;
        String str4 = screenerCollection.d;
        int i = screenerCollection.e;
        Integer num = screenerCollection.f;
        ArrayList arrayList2 = screenerCollection.f105157g;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(tbl.a.b((nel.z) it8.next()));
        }
        d dVar = screenerCollection.f105158h;
        List list = screenerCollection.i;
        ArrayList arrayList4 = null;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList5.add(k((ScreenerSelectedFilter) it9.next()));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        ScreenerSelectedSorting screenerSelectedSorting = screenerCollection.f105159j;
        if (screenerSelectedSorting != null) {
            Intrinsics.checkNotNullParameter(screenerSelectedSorting, "<this>");
            kVar = new k(screenerSelectedSorting.f105170a.name(), screenerSelectedSorting.f105171b);
        } else {
            kVar = null;
        }
        List list3 = screenerCollection.k;
        if (list3 != null) {
            List list4 = list3;
            arrayList4 = new ArrayList(w.t(list4, 10));
            Iterator it10 = list4.iterator();
            while (it10.hasNext()) {
                arrayList4.add(j((ScreenerInstrument) it10.next()));
            }
        }
        return new q(str, str2, str3, str4, i, num, arrayList3, dVar, arrayList, kVar, arrayList4);
    }

    public static final e0 j(ScreenerInstrument screenerInstrument) {
        Intrinsics.checkNotNullParameter(screenerInstrument, "<this>");
        String str = screenerInstrument.f105162a;
        zel.g gVar = screenerInstrument.f105163b;
        ArrayList arrayList = null;
        String strName = gVar != null ? gVar.name() : null;
        MetricValue metricValue = screenerInstrument.f105164c;
        g gVarH = metricValue != null ? h(metricValue) : null;
        List list = screenerInstrument.d;
        if (list != null) {
            List<ScreenerExtraMetric> list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (ScreenerExtraMetric screenerExtraMetric : list2) {
                String strName2 = screenerExtraMetric.f105160a.name();
                MetricValue metricValue2 = screenerExtraMetric.f105161b;
                arrayList2.add(new c(strName2, metricValue2 != null ? h(metricValue2) : null));
            }
            arrayList = arrayList2;
        }
        return new e0(str, strName, gVarH, arrayList);
    }

    public static final h0 k(ScreenerSelectedFilter screenerSelectedFilter) {
        a0 yVar;
        Intrinsics.checkNotNullParameter(screenerSelectedFilter, "<this>");
        String strName = screenerSelectedFilter.getF105167a().name();
        if (screenerSelectedFilter instanceof ScreenerSelectedFilter.Options) {
            yVar = new x(((ScreenerSelectedFilter.Options) screenerSelectedFilter).f105166b);
        } else {
            if (!(screenerSelectedFilter instanceof ScreenerSelectedFilter.Range)) {
                throw new NoWhenBranchMatchedException();
            }
            ScreenerSelectedFilter.Range range = (ScreenerSelectedFilter.Range) screenerSelectedFilter;
            BigDecimal bigDecimal = range.f105168b;
            String string = bigDecimal != null ? bigDecimal.toString() : null;
            BigDecimal bigDecimal2 = range.f105169c;
            yVar = new nhl.y(string, bigDecimal2 != null ? bigDecimal2.toString() : null);
        }
        return new h0(strName, yVar);
    }

    public static final ArrayList l(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((nel.z) it8.next()).name());
        }
        return arrayList;
    }
}
