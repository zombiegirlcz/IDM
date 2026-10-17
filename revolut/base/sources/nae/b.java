package nae;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.u;
import te0.s;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f213860b;

    public /* synthetic */ b(d dVar, int i) {
        this.f213859a = i;
        this.f213860b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List subscriptions = (List) obj2;
        switch (this.f213859a) {
            case 0:
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                ArrayList arrayList = new ArrayList();
                Iterator it8 = subscriptions.iterator();
                while (it8.hasNext()) {
                    Set set = ((qua.p) it8.next()).G;
                    if (set != null) {
                        arrayList.add(set);
                    }
                }
                return ((pae.h) this.f213860b.f213864c).w0().c(s.f270018a).map(new a(new imk.e(16, d0.i1(w.u(arrayList))), 0));
            default:
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : subscriptions) {
                    qua.p pVar = (qua.p) obj3;
                    if (u.B(pVar) && pVar.f249314a.f160152c == ibd.h.CARD_MANDATE) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    Set set2 = ((qua.p) it9.next()).G;
                    if (set2 != null) {
                        arrayList3.add(set2);
                    }
                }
                return ((pae.h) this.f213860b.f213864c).w0().c(s.f270018a).map(new a(new imk.e(17, d0.i1(w.u(arrayList3))), 1));
        }
    }
}
