package s3g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3g.b f259675a;

    public i(g3g.b answerWithLabelMapper, g3g.d bookingDetailsStateMapper) {
        Intrinsics.checkNotNullParameter(answerWithLabelMapper, "answerWithLabelMapper");
        Intrinsics.checkNotNullParameter(bookingDetailsStateMapper, "bookingDetailsStateMapper");
        this.f259675a = answerWithLabelMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        List arrayList;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.d;
        Set set = domainState.f259667c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a0.x(((h3g.c) it8.next()).f149122c, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            h3g.a aVar = (h3g.a) obj2;
            if (aVar.f149116c && a1g.a.c(aVar.f149114a.f92761a)) {
                arrayList3.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList3) {
            TravelExperienceBookingQuestion.Category category = ((h3g.a) obj3).f149114a.f92761a.i;
            Object arrayList4 = linkedHashMap.get(category);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(category, arrayList4);
            }
            ((List) arrayList4).add(obj3);
        }
        boolean z = false;
        List listB = g3g.d.b(domainState.f, false, set);
        ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            TravelExperienceBookingQuestion.Category category2 = (TravelExperienceBookingQuestion.Category) entry.getKey();
            List<h3g.a> list2 = (List) entry.getValue();
            if (category2 != null) {
                arrayList = new ArrayList();
                for (h3g.a aVar2 : list2) {
                    a0.x(((g3g.c) this.f259675a).a(aVar2, set.contains(aVar2.f149114a.b())), arrayList);
                }
            } else {
                arrayList = f0.f322471a;
            }
            arrayList5.add(arrayList);
        }
        ArrayList arrayListE0 = d0.E0(w.u(arrayList5), listB);
        List list3 = domainState.d;
        ArrayList arrayList6 = new ArrayList();
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            a0.x(((h3g.c) it9.next()).f149122c, arrayList6);
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : arrayList6) {
            h3g.a aVar3 = (h3g.a) obj4;
            if (aVar3.f149116c) {
                TravelExperienceBookingQuestion travelExperienceBookingQuestion = aVar3.f149114a.f92761a;
                if (travelExperienceBookingQuestion.f92792h && a1g.a.c(travelExperienceBookingQuestion)) {
                    arrayList7.add(obj4);
                }
            }
        }
        if (arrayList7.isEmpty()) {
            z = true;
        } else {
            Iterator it10 = arrayList7.iterator();
            while (it10.hasNext()) {
                if (kotlin.text.d0.W(((h3g.a) it10.next()).f149114a.f92762b)) {
                    break;
                }
            }
            z = true;
        }
        return new g(arrayListE0, z);
    }
}
