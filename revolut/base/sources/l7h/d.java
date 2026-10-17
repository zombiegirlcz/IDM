package l7h;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import v7h.a;
import xzg.s;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, v7h.c.class, "toDomain", "toDomain(Ljava/util/List;)Lcom/revolut/feature/wealth/api/domain/model/MostOwnedAssets;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        Object next;
        List listA;
        Object next2;
        List listA2;
        Object next3;
        List listA3;
        List listA4;
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
            if (((v7h.a) next).getSection() == a.c.MOST_OWNED_COMMODITIES) {
                break;
            }
        }
        v7h.a aVar = (v7h.a) next;
        if (aVar == null || (listA = v7h.c.a(aVar)) == null) {
            listA = f0.f322471a;
        }
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (((v7h.a) next2).getSection() == a.c.MOST_OWNED_ASSETS) {
                break;
            }
        }
        v7h.a aVar2 = (v7h.a) next2;
        if (aVar2 == null || (listA2 = v7h.c.a(aVar2)) == null) {
            listA2 = f0.f322471a;
        }
        Iterator it10 = list.iterator();
        while (true) {
            if (!it10.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it10.next();
            if (((v7h.a) next3).getSection() == a.c.MOST_OWNED_STOCKS) {
                break;
            }
        }
        v7h.a aVar3 = (v7h.a) next3;
        if (aVar3 == null || (listA3 = v7h.c.a(aVar3)) == null) {
            listA3 = f0.f322471a;
        }
        Iterator it11 = list.iterator();
        while (true) {
            if (!it11.hasNext()) {
                break;
            }
            Object next4 = it11.next();
            if (((v7h.a) next4).getSection() == a.c.MOST_OWNED_CRYPTO) {
                obj3 = next4;
                break;
            }
        }
        v7h.a aVar4 = (v7h.a) obj3;
        if (aVar4 == null || (listA4 = v7h.c.a(aVar4)) == null) {
            listA4 = f0.f322471a;
        }
        return new s(listA, listA2, listA3, listA4);
    }
}
