package zx1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rx1.p;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f326021a;

    public c(a multibancoContactDao) {
        Intrinsics.checkNotNullParameter(multibancoContactDao, "multibancoContactDao");
        this.f326021a = multibancoContactDao;
        n02.b bVar = n02.b.AANI;
    }

    @Override // rx1.p
    public final List a(nx1.e discovery) {
        Intrinsics.checkNotNullParameter(discovery, "discovery");
        return discovery.f;
    }

    @Override // rx1.p
    public final Unit c(List list, Map map, Map map2, rx1.a aVar) {
        List<iy1.e> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (iy1.e eVar : list2) {
            ox1.b bVar = (ox1.b) map.get(eVar.f169594b.f62110b);
            arrayList.add(mx1.i.b(eVar, bVar != null ? bVar.f230526a : null));
        }
        ArrayList arrayListC = j.c(arrayList);
        int i = b.f326020a[aVar.ordinal()];
        a aVar2 = this.f326021a;
        if (i == 1) {
            aVar2.h(arrayListC);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2.e(arrayListC);
        }
        return Unit.f186387a;
    }
}
