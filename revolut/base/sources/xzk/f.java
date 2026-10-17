package xzk;

import com.revolut.data.model.Data;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import te0.w;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f310042b;

    public /* synthetic */ f(g gVar, int i) {
        this.f310041a = i;
        this.f310042b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        switch (this.f310041a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                int iIntValue = ((Number) pair.f186386b).intValue();
                zzk.a aVar = this.f310042b.d;
                Integer numA = zzk.a.a(iIntValue, list2);
                od0.i.Companion.getClass();
                return od0.h.a(numA);
            case 1:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return w.z0(((i) this.f310042b.f310043a).x0(), r0.l(Integer.valueOf(((Number) pair2.f186386b).intValue()), (Map) pair2.f186385a));
            case 2:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list3 = (List) pair3.f186385a;
                Map map = (Map) pair3.f186386b;
                List list4 = list3;
                ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
                Iterator it8 = list4.iterator();
                int i = 0;
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    g gVar = this.f310042b;
                    if (!zHasNext) {
                        zzk.a aVar2 = gVar.d;
                        return zzk.a.b(arrayList);
                    }
                    Object next = it8.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    xel.c cVar = (xel.c) next;
                    xel.a aVar3 = (xel.a) map.get(Integer.valueOf(i));
                    arrayList.add(aVar3 != null ? gVar.d.c(cVar, aVar3, false) : new xel.f(cVar, false, false));
                    i = i2;
                }
                break;
            case 3:
                List documents = (List) obj2;
                Intrinsics.checkNotNullParameter(documents, "documents");
                if (documents.isEmpty()) {
                    return zi0.c.j(Unit.f186387a);
                }
                r rVarStartWith = new z(this.f310042b.f310045c.s(new xel.d(documents)).D(new Data(Unit.f186387a, null, false, 6, null)), 1, new x2l.a(17, false), null).x().startWith(new Data(null, null, true, 3, null));
                Intrinsics.h(rVarStartWith);
                return rVarStartWith;
            default:
                Data data = (Data) obj2;
                Intrinsics.h(data);
                if (zi0.c.E(data) && (list = (List) data.getContent()) != null) {
                    ((i) this.f310042b.f310043a).y0().set(list);
                }
                return Unit.f186387a;
        }
    }
}
