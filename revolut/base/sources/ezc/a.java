package ezc;

import efm.d0;
import efm.r;
import ewh.x;
import hyc.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ue0.e;
import ufm.i;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zq.a f130937b;

    public /* synthetic */ a(zq.a aVar, int i) {
        this.f130936a = i;
        this.f130937b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f130936a) {
            case 0:
                g it8 = (g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = it8.f156784a;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(((hyc.b) it9.next()).f156778c);
                }
                r rVarFlatMapSingle = r.fromIterable(arrayList).flatMapSingle(new ey7.a(new a(this.f130937b, 1), 6));
                Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
                d0 list2 = te0.w.a0(rVarFlatMapSingle, new x(21)).map(new ey7.a(new x(22), 3)).toList();
                ey7.a aVar = new ey7.a(new x(16), 4);
                list2.getClass();
                i iVar = new i(list2, aVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                r rVarX = e.I(iVar, h0.f322473a, new x(17)).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                return rVarX;
            default:
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                return m70.a.g(com.revolut.domain.interactors.transactions.a.c((com.revolut.domain.interactors.transactions.a) this.f130937b.f324336c, id10, null, false, 6), null, null, 3).firstOrError();
        }
    }
}
