package rob;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import djb.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rnb.x;
import yhm.r;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f255957b;

    public /* synthetic */ k(l lVar, int i) {
        this.f255956a = i;
        this.f255957b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f255956a) {
            case 0:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                List list2 = (List) rVar.f314202b;
                ArrayList arrayListE0 = d0.E0((List) rVar.f314203c, d0.E0(list2, list));
                l lVar = this.f255957b;
                u uVar = lVar.f255958p;
                ArrayList arrayList = new ArrayList(w.t(arrayListE0, 10));
                Iterator it8 = arrayListE0.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((SavingsAccountDetails) it8.next()).f86460a);
                }
                w4l.h hVar = w4l.h.f294642c;
                vkm.d dVarB = rd0.e.b(((x) uVar).a(arrayList, hVar));
                e[] elements = {e.TOTAL, e.TEEN_SAVINGS};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return nim.a.v(u0.m(dVarB, !kotlin.collections.d.y0(elements).contains(lVar.f255960r.f83362b) ? new go.g(new Data(r0.g(), null, false, 6, null), 2) : nim.a.v(lVar.f255959q.b(hVar), new rnd.k(21))), new rgf.m(arrayListE0, lVar, 17));
            case 1:
                List filters = (List) obj2;
                Intrinsics.checkNotNullParameter(filters, "filters");
                if (filters.isEmpty()) {
                    return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                }
                List list3 = filters;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(this.f255957b.J2((djb.l) it9.next()));
                }
                return nim.a.v(u0.k(arrayList2), new rnd.k(22));
            default:
                ejb.b data = (ejb.b) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                List list4 = data.f126837b;
                this.f255957b.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list4) {
                    pcd.a aVarA = opg.c.a(((SavingsAccountDetails) obj3).f86460a);
                    String str = aVarA != null ? aVarA.f234844g : null;
                    if (str == null || str.length() == 0) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
        }
    }
}
