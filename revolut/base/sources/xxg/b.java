package xxg;

import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import d9.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jel.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309515a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f309516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vyg.a f309517c;

    public /* synthetic */ b(List list, vyg.a aVar) {
        this.f309516b = list;
        this.f309517c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        Object next;
        Object aVar;
        Object next2;
        Object obj4;
        Object next3;
        switch (this.f309515a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                List<mwg.c> list3 = this.f309516b;
                ArrayList arrayList = new ArrayList();
                for (mwg.c cVar : list3) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        obj3 = null;
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((n) next).f214596b, cVar.e)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    n nVar = (n) next;
                    if (nVar == null) {
                        Iterator it9 = list2.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next2 = it9.next();
                                if (Intrinsics.f(((n) next2).e, cVar.f209442a)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        nVar = (n) next2;
                    }
                    if (nVar != null) {
                        String str = nVar.e;
                        String str2 = nVar.f214596b;
                        String str3 = nVar.d;
                        int i = d.f309519b[nVar.f214597c.ordinal()];
                        if (i == 1) {
                            aVar = new wxg.a(cVar, str3, str2, str);
                        } else if (i == 2) {
                            aVar = new wxg.h(cVar, str3, str2, str);
                        } else if (i != 3) {
                            aVar = new wxg.l(cVar, str3, str2, str);
                        } else {
                            int i2 = d.f309518a[this.f309517c.ordinal()];
                            if (i2 == 1) {
                                n nVar2 = nVar;
                                ej0.b bVar = cVar.f209445g;
                                if (bVar != null) {
                                    aVar = new wxg.c(cVar, nVar2.d, nVar2.f214596b, nVar2.e, t0.D(bVar, nVar2));
                                } else {
                                    obj3 = null;
                                }
                            } else if (i2 == 2) {
                                n nVar3 = nVar;
                                String str4 = nVar3.d;
                                String str5 = nVar3.f214596b;
                                String str6 = nVar3.e;
                                ej0.b bVar2 = cVar.f;
                                aVar = new wxg.e(cVar, str4, str5, str6, bVar2 != null ? t0.D(bVar2, nVar3) : null, cVar.f209446h);
                            } else if (i2 != 3 && i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        obj3 = aVar;
                    }
                    if (obj3 != null) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                List portfolioInfos = (List) obj2;
                Intrinsics.checkNotNullParameter(portfolioInfos, "portfolioInfos");
                List list4 = portfolioInfos;
                Iterator it10 = list4.iterator();
                while (true) {
                    obj4 = null;
                    if (it10.hasNext()) {
                        next3 = it10.next();
                        if (((RoboPortfolioInfo) next3).f95704g == xdh.c.ACTIVE) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) next3;
                if (roboPortfolioInfo == null) {
                    Iterator it11 = list4.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            Object next4 = it11.next();
                            if (m.e.contains(((RoboPortfolioInfo) next4).f95704g)) {
                                obj4 = next4;
                            }
                        }
                    }
                    roboPortfolioInfo = (RoboPortfolioInfo) obj4;
                    if (roboPortfolioInfo == null) {
                        return f0.f322471a;
                    }
                }
                mwg.c cVar2 = (mwg.c) d0.b0(this.f309516b);
                return (this.f309517c == vyg.a.SECTOR && ta6.a.c0(cVar2.f209442a) == a3.ROBO) ? u.c(new wxg.k(cVar2)) : u.c(new wxg.j(roboPortfolioInfo, cVar2));
        }
    }

    public /* synthetic */ b(m mVar, List list, vyg.a aVar) {
        this.f309516b = list;
        this.f309517c = aVar;
    }
}
