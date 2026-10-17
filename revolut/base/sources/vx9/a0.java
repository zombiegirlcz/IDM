package vx9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f292853b;

    public /* synthetic */ a0(g gVar, int i) {
        this.f292852a = i;
        this.f292853b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ml3.u uVar;
        switch (this.f292852a) {
            case 0:
                List recents = (List) obj2;
                Intrinsics.checkNotNullParameter(recents, "recents");
                List list = recents;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    zm3.a aVar = ((jq9.p) it8.next()).f177514b;
                    zm3.p pVar = aVar instanceof zm3.p ? (zm3.p) aVar : null;
                    if (pVar != null) {
                        arrayList.add(pVar);
                    }
                }
                efm.r rVarFromIterable = efm.r.fromIterable(arrayList);
                g gVar = this.f292853b;
                efm.b bVarFlatMapCompletable = rVarFromIterable.flatMapCompletable(new w(new a0(gVar, 2), 5));
                kx9.a aVar2 = gVar.f292862b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(nx9.c.b((jq9.p) it9.next(), false));
                }
                return aVar2.b(arrayList2).e(bVarFlatMapCompletable);
            case 1:
                zm3.p contact = (zm3.p) obj2;
                Intrinsics.checkNotNullParameter(contact, "remoteContact");
                yf.c cVar = (yf.c) this.f292853b.d;
                Intrinsics.checkNotNullParameter(contact, "contact");
                return te0.w.g0(((ml3.x) cVar.b).a(hx7.q.G(contact)));
            default:
                zm3.p contact2 = (zm3.p) obj2;
                Intrinsics.checkNotNullParameter(contact2, "contact");
                yf.c cVar2 = (yf.c) this.f292853b.d;
                Intrinsics.checkNotNullParameter(contact2, "contact");
                ml3.x xVar = (ml3.x) cVar2.b;
                Intrinsics.checkNotNullParameter(contact2, "<this>");
                if (contact2 instanceof zm3.n) {
                    zm3.n nVar = (zm3.n) contact2;
                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                    uVar = new ml3.u(nVar.f323373a, ml3.v.EMAIL, nVar.f323375c, nVar.f323374b);
                } else {
                    if (!(contact2 instanceof zm3.o)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zm3.o oVar = (zm3.o) contact2;
                    Intrinsics.checkNotNullParameter(oVar, "<this>");
                    uVar = new ml3.u(oVar.f323376a, ml3.v.PHONE, oVar.f323378c, oVar.f323377b);
                }
                return te0.w.g0(xVar.c(uVar));
        }
    }
}
