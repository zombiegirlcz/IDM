package lp8;

import dp8.f;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f198955b;

    public /* synthetic */ c(e eVar, int i) {
        this.f198954a = i;
        this.f198955b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        List list;
        int i = this.f198954a;
        ArrayList arrayList2 = null;
        e eVar = this.f198955b;
        switch (i) {
            case 0:
                String juniorId = (String) obj2;
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                return (List) eVar.f198958b.get(e.a(juniorId));
            case 1:
                String juniorId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                ue0.c cVar = eVar.f198959c;
                String strA = e.a(juniorId2);
                Type TASK_REWARD_SUGGESTIONS_TYPE = e.f;
                Intrinsics.checkNotNullExpressionValue(TASK_REWARD_SUGGESTIONS_TYPE, "TASK_REWARD_SUGGESTIONS_TYPE");
                List list2 = (List) cVar.T2(strA, TASK_REWARD_SUGGESTIONS_TYPE);
                if (list2 != null) {
                    Intrinsics.checkNotNullParameter(list2, "<this>");
                    List<kp8.b> list3 = list2;
                    arrayList2 = new ArrayList(w.t(list3, 10));
                    for (kp8.b bVar : list3) {
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        arrayList2.add(new f(hx7.a.v(bVar.getAmount())));
                    }
                }
                return arrayList2;
            case 2:
                String params = (String) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                Map map = (Map) eVar.f198958b.get("ALL_TASKS_LIST_KEY");
                if (Intrinsics.f(params, "ALL_TASKS")) {
                    return map;
                }
                List list4 = map != null ? (List) map.get(params) : null;
                if (list4 != null) {
                    return q0.c(new Pair(params, list4));
                }
                return null;
            case 3:
                String params2 = (String) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                ue0.c cVar2 = eVar.f198959c;
                Type ALL_TASKS_LIST_TYPE = e.f198956g;
                Intrinsics.checkNotNullExpressionValue(ALL_TASKS_LIST_TYPE, "ALL_TASKS_LIST_TYPE");
                Map map2 = (Map) cVar2.T2("ALL_TASKS_LIST_KEY", ALL_TASKS_LIST_TYPE);
                if (!Intrinsics.f(params2, "ALL_TASKS")) {
                    if (map2 == null || (list = (List) map2.get(params2)) == null) {
                        arrayList = null;
                    } else {
                        List list5 = list;
                        arrayList = new ArrayList(w.t(list5, 10));
                        Iterator it8 = list5.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(ip8.b.a((kp8.a) it8.next()));
                        }
                    }
                    if (arrayList != null) {
                        return q0.c(new Pair(params2, arrayList));
                    }
                    return null;
                }
                if (map2 == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    List list6 = (List) entry.getValue();
                    Object obj3 = ip8.b.f167679a;
                    Intrinsics.checkNotNullParameter(list6, "<this>");
                    List list7 = list6;
                    ArrayList arrayList3 = new ArrayList(w.t(list7, 10));
                    Iterator it9 = list7.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(ip8.b.a((kp8.a) it9.next()));
                    }
                    linkedHashMap.put(key, arrayList3);
                }
                return linkedHashMap;
            case 4:
                jp8.c createdTask = (jp8.c) obj2;
                Intrinsics.checkNotNullParameter(createdTask, "createdTask");
                return eVar.c(createdTask.getJuniorId());
            default:
                jp8.c createdTask2 = (jp8.c) obj2;
                Intrinsics.checkNotNullParameter(createdTask2, "createdTask");
                return eVar.c(createdTask2.getJuniorId());
        }
    }
}
