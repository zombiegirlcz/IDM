package vx9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f292877b;

    public /* synthetic */ l(o oVar, int i) {
        this.f292876a = i;
        this.f292877b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f292876a) {
            case 0:
                List recents = (List) obj2;
                Intrinsics.checkNotNullParameter(recents, "recents");
                o oVar = this.f292877b;
                kx9.a aVar = oVar.f292880c;
                List list = recents;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(nx9.c.b((jq9.p) it8.next(), false));
                }
                efm.b bVarB = aVar.b(arrayList);
                efm.b bVarFlatMapCompletable = efm.r.fromIterable(list).flatMapCompletable(new vx5.m(new l(oVar, 1), 24));
                Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                return bVarB.e(bVarFlatMapCompletable);
            default:
                jq9.p recent = (jq9.p) obj2;
                Intrinsics.checkNotNullParameter(recent, "recent");
                zm3.a aVar2 = recent.f177514b;
                fl3.a aVar3 = this.f292877b.f292878a;
                String point = hx7.q.E(aVar2);
                int iB = aVar2.b();
                long jA = aVar2.a();
                Intrinsics.checkNotNullParameter(point, "point");
                ao.h hVar = ((sl3.k) aVar3).f264113a;
                Intrinsics.checkNotNullParameter(point, "point");
                efm.b bVarR = ((ml3.a) hVar.f7847b).r(iB, jA, point);
                pfm.h hVar2 = new pfm.h(new ll3.b(hVar, point, iB, jA, 0), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                pfm.a aVarE = bVarR.e(hVar2);
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return te0.w.g0(aVarE);
        }
    }
}
