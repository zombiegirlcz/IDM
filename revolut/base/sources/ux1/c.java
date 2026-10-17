package ux1;

import com.revolut.feature.apm.core.models.recipients.BlikContact;
import java.util.ArrayList;
import java.util.Iterator;
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
    public final a f283848a;

    public c(a blikContactDao) {
        Intrinsics.checkNotNullParameter(blikContactDao, "blikContactDao");
        this.f283848a = blikContactDao;
        n02.b bVar = n02.b.AANI;
    }

    @Override // rx1.p
    public final List a(nx1.e discovery) {
        Intrinsics.checkNotNullParameter(discovery, "discovery");
        return discovery.f220058c;
    }

    @Override // rx1.p
    public final Unit c(List list, Map map, Map map2, rx1.a aVar) {
        List<iy1.b> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (iy1.b bVar : list2) {
            ox1.b bVar2 = (ox1.b) map.get(bVar.f169585b.f62110b);
            arrayList.add(mx1.f.b(bVar, bVar2 != null ? bVar2.f230526a : null));
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(i.c((BlikContact) it8.next()));
        }
        int i = b.f283847a[aVar.ordinal()];
        a aVar2 = this.f283848a;
        if (i == 1) {
            aVar2.h(arrayList2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2.e(arrayList2);
        }
        return Unit.f186387a;
    }
}
