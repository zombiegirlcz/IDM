package n0k;

import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import rzj.i;
import tof.a3;
import tof.p6;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211046a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f211047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f211048c;

    public /* synthetic */ b(List list, Set set) {
        this.f211047b = set;
        this.f211048c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        String str;
        List performances = (List) obj2;
        switch (this.f211046a) {
            case 0:
                Intrinsics.checkNotNullParameter(performances, "performances");
                List<WealthNewsArticle> list = this.f211048c;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (WealthNewsArticle wealthNewsArticle : list) {
                    List<String> listC = c.c(wealthNewsArticle, this.f211047b);
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : listC) {
                        Iterator it8 = performances.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(str2, ((vel.a) next).f288344a.f306286a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        vel.a aVar = (vel.a) next;
                        if (aVar != null) {
                            arrayList2.add(aVar);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                    Iterator it9 = arrayList2.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(new i((vel.a) it9.next()));
                    }
                    arrayList.add(new rzj.a(wealthNewsArticle, arrayList3));
                }
                return arrayList;
            default:
                Intrinsics.checkNotNullParameter(performances, "cardTransactions");
                ArrayList arrayList4 = new ArrayList();
                Iterator it10 = performances.iterator();
                while (true) {
                    Pair pair = null;
                    if (!it10.hasNext()) {
                        Map mapT = r0.t(arrayList4);
                        Set set = this.f211047b;
                        int iB = q0.b(w.t(set, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (Object obj3 : set) {
                            String str3 = (String) obj3;
                            List list2 = this.f211048c;
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj4 : list2) {
                                Set set2 = ((p) obj4).G;
                                if (set2 != null) {
                                    Set set3 = set2;
                                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                                        Iterator it11 = set3.iterator();
                                        while (true) {
                                            if (!it11.hasNext()) {
                                            }
                                            if (Intrinsics.f(mapT.get((String) it11.next()), str3)) {
                                                arrayList5.add(obj4);
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                            linkedHashMap.put(obj3, arrayList5);
                        }
                        return zi0.c.P(linkedHashMap, false, null, 3);
                    }
                    a3 a3Var = (a3) it10.next();
                    p6 p6Var = a3Var.A.f272780b;
                    if (p6Var != null && (str = p6Var.f272991a) != null) {
                        pair = new Pair(a3Var.f272581b, str);
                    }
                    if (pair != null) {
                        arrayList4.add(pair);
                    }
                }
                break;
        }
    }

    public /* synthetic */ b(List list, c cVar, Set set) {
        this.f211048c = list;
        this.f211047b = set;
    }
}
