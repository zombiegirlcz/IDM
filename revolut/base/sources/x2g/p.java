package x2g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.a0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3g.b f302569a;

    public p(g3g.b answerWithLabelMapper) {
        Intrinsics.checkNotNullParameter(answerWithLabelMapper, "answerWithLabelMapper");
        this.f302569a = answerWithLabelMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List arrayList;
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a0.x(((h3g.c) it8.next()).f149122c, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it9 = arrayList2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next = it9.next();
            h3g.a aVar = (h3g.a) next;
            if (aVar.f149116c) {
                TravelExperienceBookingQuestion.Category category = aVar.f149114a.f92761a.i;
                if (Intrinsics.f(category != null ? category.f92795a : null, "PICKUP")) {
                    arrayList3.add(next);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            TravelExperienceBookingQuestion.Category category2 = ((h3g.a) obj2).f149114a.f92761a.i;
            Object arrayList4 = linkedHashMap.get(category2);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(category2, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            TravelExperienceBookingQuestion.Category category3 = (TravelExperienceBookingQuestion.Category) entry.getKey();
            List<h3g.a> list2 = (List) entry.getValue();
            if (category3 != null) {
                arrayList = new ArrayList();
                for (h3g.a aVar2 : list2) {
                    a0.x(((g3g.c) this.f302569a).a(aVar2, domainState.f302557c.contains(aVar2.f149114a.b())), arrayList);
                }
            } else {
                arrayList = f0.f322471a;
            }
            arrayList5.add(arrayList);
        }
        ArrayList arrayListU = w.u(arrayList5);
        List list3 = domainState.d;
        ArrayList arrayList6 = new ArrayList();
        Iterator it10 = list3.iterator();
        while (it10.hasNext()) {
            a0.x(((h3g.c) it10.next()).f149122c, arrayList6);
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : arrayList6) {
            h3g.a aVar3 = (h3g.a) obj3;
            if (aVar3.f149116c) {
                TravelExperienceBookingQuestion travelExperienceBookingQuestion = aVar3.f149114a.f92761a;
                if (travelExperienceBookingQuestion.f92792h) {
                    TravelExperienceBookingQuestion.Category category4 = travelExperienceBookingQuestion.i;
                    if (Intrinsics.f(category4 != null ? category4.f92795a : null, "PICKUP")) {
                        arrayList7.add(obj3);
                    }
                }
            }
        }
        boolean z = true;
        if (!arrayList7.isEmpty()) {
            Iterator it11 = arrayList7.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    break;
                }
                if (d0.W(((h3g.a) it11.next()).f149114a.f92762b)) {
                    z = false;
                    break;
                }
            }
        }
        return new m(arrayListU, z);
    }
}
