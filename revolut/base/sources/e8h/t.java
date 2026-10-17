package e8h;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w7h.a;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.q implements Function1 {
    public static final t f = new t();

    public t() {
        super(1, w7h.b.class, "toDomain", "toDomain(Ljava/util/List;)Lcom/revolut/feature/wealth/api/domain/model/PopularFirstBuyAssets;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        Object next;
        List listA;
        List listA2;
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List list = p0;
        Iterator it8 = list.iterator();
        while (true) {
            obj3 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((w7h.a) next).getKey() == a.b.STOCKS) {
                break;
            }
        }
        w7h.a aVar = (w7h.a) next;
        if (aVar == null || (listA = w7h.b.a(aVar)) == null) {
            listA = zhm.f0.f322471a;
        }
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            if (((w7h.a) next2).getKey() == a.b.ETFS) {
                obj3 = next2;
                break;
            }
        }
        w7h.a aVar2 = (w7h.a) obj3;
        if (aVar2 == null || (listA2 = w7h.b.a(aVar2)) == null) {
            listA2 = zhm.f0.f322471a;
        }
        return new xzg.g0(listA, listA2);
    }
}
