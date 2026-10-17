package gpd;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import smd.u;
import tof.i3;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3 f145444b;

    public /* synthetic */ j(i3 i3Var, int i) {
        this.f145443a = i;
        this.f145444b = i3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i3 i3Var;
        Object next;
        switch (this.f145443a) {
            case 0:
                b update = (b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return b.a(update, null, this.f145444b, 1);
            case 1:
                Map categoryAmountMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(categoryAmountMap, "categoryAmountMap");
                Long l2 = (Long) categoryAmountMap.get(this.f145444b);
                return Long.valueOf(l2 != null ? l2.longValue() : 0L);
            case 2:
                List categoryGroupList = (List) obj2;
                Intrinsics.checkNotNullParameter(categoryGroupList, "categoryGroupList");
                i3 i3Var2 = this.f145444b;
                if (i3Var2 == null) {
                    return categoryGroupList;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : categoryGroupList) {
                    if (Intrinsics.f(((he3.j) obj3).f151563a, i3Var2.getId())) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                smd.j update2 = (smd.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                smd.h hVar = (smd.h) update2.f264423a.getContent();
                if (hVar == null) {
                    return update2;
                }
                List list = hVar.f264419c;
                List listF0 = hVar.f264418b;
                dj0.d dVar = new dj0.d(0L, hVar.f264417a.f115083b);
                Iterator it8 = listF0.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    i3Var = this.f145444b;
                    if (zHasNext) {
                        next = it8.next();
                        if (Intrinsics.f(((smd.g) next).f264414a.getId(), i3Var.getId())) {
                        }
                    } else {
                        next = null;
                    }
                }
                smd.g gVar = (smd.g) next;
                smd.g gVar2 = gVar == null ? new smd.g(i3Var, dVar, null, null) : gVar;
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        if (Intrinsics.f(((smd.g) it9.next()).f264414a.getId(), i3Var.getId())) {
                            return update2;
                        }
                    }
                }
                Data data = update2.f264423a;
                if (gVar == null) {
                    listF0 = d0.F0(gVar2, listF0);
                }
                return smd.j.a(Data.copy$default(data, smd.h.a(hVar, listF0, d0.F0(smd.g.a(gVar2, dVar), list), 9), null, false, 6, null), u.I2(gVar2, new smd.a(dVar), update2.f264424b), r0.q(update2.f264425c, new Pair(i3Var.getId(), gVar2)));
        }
    }

    public /* synthetic */ j(i3 i3Var, u uVar) {
        this.f145443a = 3;
        this.f145444b = i3Var;
    }
}
