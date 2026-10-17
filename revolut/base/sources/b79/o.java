package b79;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f12966b;

    public /* synthetic */ o(r rVar, int i) {
        this.f12965a = i;
        this.f12966b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        s69.m mVarF;
        Object next2;
        s69.m mVarE;
        switch (this.f12965a) {
            case 0:
                Map response = (Map) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                ArrayList arrayList = new ArrayList(response.size());
                for (Map.Entry entry : response.entrySet()) {
                    String str = (String) entry.getKey();
                    List<a79.n> list = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (a79.n nVar : list) {
                        r rVar = this.f12966b;
                        Iterator it8 = rVar.f12971c.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (((f79.a) next).c(nVar.f1806a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        f79.a aVar = (f79.a) next;
                        if (aVar == null || (mVarF = aVar.f(nVar.f1807b)) == null) {
                            mVarF = rVar.d.f(nVar.f1807b);
                        }
                        if (mVarF != null) {
                            arrayList2.add(mVarF);
                        }
                    }
                    arrayList.add(new Pair(str, arrayList2));
                }
                return r0.t(arrayList);
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (Map) this.f12966b.e.get("NOTIFICATIONS_KEY");
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                r rVar2 = this.f12966b;
                List list2 = (List) rVar2.f12969a.T2("NOTIFICATIONS_KEY", r.f);
                if (list2 == null) {
                    return null;
                }
                List<c79.b> list3 = list2;
                int iB = q0.b(w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (c79.b bVar : list3) {
                    String type = bVar.getType();
                    List<c79.a> notifications = bVar.getNotifications();
                    ArrayList arrayList3 = new ArrayList();
                    for (c79.a value : notifications) {
                        Iterator it10 = rVar2.f12971c.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next2 = it10.next();
                                f79.a mapper = (f79.a) next2;
                                Intrinsics.checkNotNullParameter(mapper, "mapper");
                                if (mapper.d(value)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        f79.a mapper2 = (f79.a) next2;
                        if (mapper2 == null) {
                            mVarE = null;
                        } else {
                            Intrinsics.checkNotNullParameter(mapper2, "mapper");
                            Intrinsics.checkNotNullParameter(value, "value");
                            mVarE = mapper2.e(value);
                            if (mVarE == null) {
                                mVarE = rVar2.d.e(value);
                            }
                        }
                        if (mVarE != null) {
                            arrayList3.add(mVarE);
                        }
                    }
                    linkedHashMap.put(type, arrayList3);
                }
                return linkedHashMap;
        }
    }
}
