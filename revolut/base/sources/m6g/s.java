package m6g;

import com.revolut.feature.travel.flights.models.domain.offer_details.TravelFlightsOfferDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p6g.a0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f203113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f203114c;

    public /* synthetic */ s(w wVar, i iVar, int i) {
        this.f203112a = i;
        this.f203113b = wVar;
        this.f203114c = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f203112a) {
            case 0:
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter((TravelFlightsOfferDetails) obj2, "<unused var>");
                i iVar = this.f203114c;
                return (List) iii.c.f(iVar.f203095c, new m62.l(3), new m56.g(4), new s(this.f203113b, iVar, 1));
            default:
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter((do3.n) obj2, "<unused var>");
                List list = this.f203114c.f203094b;
                boolean z = true;
                boolean z3 = list.size() > 1;
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list2) {
                    if (((a0) obj5).f233267b == m7g.j.ADULT) {
                        arrayList.add(obj5);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : list2) {
                    m7g.j jVar = ((a0) obj6).f233267b;
                    if (jVar == m7g.j.CHILD || jVar == m7g.j.INFANT) {
                        arrayList2.add(obj6);
                    }
                }
                aim.e eVarB = zhm.u.b();
                Iterator it8 = arrayList.iterator();
                int i = 0;
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    w wVar = this.f203113b;
                    if (!zHasNext) {
                        int i2 = 0;
                        for (Object obj7 : arrayList2) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            eVarB.addAll(wVar.a((a0) obj7, i2, z3, z));
                            z = false;
                            i2 = i3;
                        }
                        return zhm.u.a(eVarB);
                    }
                    Object next = it8.next();
                    int i5 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    eVarB.addAll(wVar.a((a0) next, i, z3, z));
                    z = false;
                    i = i5;
                }
                break;
        }
    }
}
