package l3d;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jul.o f191918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f191919c;

    public /* synthetic */ m(jul.o oVar, String str, int i) {
        this.f191917a = i;
        this.f191918b = oVar;
        this.f191919c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f191917a) {
            case 0:
                z3d.d watchlist = (z3d.d) obj2;
                Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                a4d.a aVar = (a4d.a) this.f191918b.f178695b;
                return nim.a.v(((n4d.m) aVar).d(this.f191919c, watchlist.f319250a), new d(watchlist, 2));
            case 1:
                z3d.a allWatchlists = (z3d.a) obj2;
                Intrinsics.checkNotNullParameter(allWatchlists, "allWatchlists");
                if (allWatchlists.f319245a.isEmpty()) {
                    return new go.g(zi0.c.P(new Pair(allWatchlists, r0.g()), false, null, 3), 2);
                }
                ArrayList<z3d.d> arrayList = allWatchlists.f319245a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (z3d.d dVar : arrayList) {
                    a4d.a aVar2 = (a4d.a) this.f191918b.f178695b;
                    arrayList2.add(nim.a.v(nim.a.y(((n4d.m) aVar2).d(this.f191919c, dVar.f319250a), new l2d.a(11)), new d(dVar, 3)));
                }
                return nim.a.v(u0.k(arrayList2), new l0c.s(allWatchlists, 9));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                z3d.a aVar3 = (z3d.a) pair.f186385a;
                Map map = (Map) pair.f186386b;
                if (aVar3.f319245a.isEmpty()) {
                    return new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
                }
                ArrayList<z3d.d> arrayList3 = aVar3.f319245a;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                for (z3d.d dVar2 : arrayList3) {
                    Object obj3 = map.get(dVar2);
                    if (obj3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arrayList4.add(((jid.z) this.f191918b.f178696c).t(dVar2, null, this.f191919c, false, (ogd.k) obj3));
                }
                return u0.k(arrayList4);
        }
    }
}
