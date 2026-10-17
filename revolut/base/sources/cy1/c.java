package cy1;

import com.revolut.feature.apm.core.models.recipients.BrebContact;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx1.l;
import rx1.p;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110021a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f110022b;

    public c(a spinContactDao) {
        Intrinsics.checkNotNullParameter(spinContactDao, "spinContactDao");
        this.f110022b = spinContactDao;
        n02.b bVar = n02.b.AANI;
    }

    @Override // rx1.p
    public final List a(nx1.e discovery) {
        switch (this.f110021a) {
            case 0:
                Intrinsics.checkNotNullParameter(discovery, "discovery");
                return discovery.i;
            case 1:
                Intrinsics.checkNotNullParameter(discovery, "discovery");
                return discovery.d;
            default:
                Intrinsics.checkNotNullParameter(discovery, "discovery");
                return discovery.e;
        }
    }

    @Override // rx1.p
    public final Unit c(List list, Map map, Map map2, rx1.a aVar) {
        switch (this.f110021a) {
            case 0:
                a aVar2 = (a) this.f110022b;
                List<iy1.i> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (iy1.i iVar : list2) {
                    ox1.b bVar = (ox1.b) map.get(iVar.f169609b.getF62112a());
                    arrayList.add(l.b(iVar, bVar != null ? bVar.f230526a : null));
                }
                ArrayList arrayListC = i.c(arrayList);
                int i = b.f110020a[aVar.ordinal()];
                if (i == 1) {
                    aVar2.h(arrayListC);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.e(arrayListC);
                }
                return Unit.f186387a;
            case 1:
                vx1.a aVar3 = (vx1.a) this.f110022b;
                List<iy1.c> list3 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                for (iy1.c cVar : list3) {
                    ox1.b bVar2 = (ox1.b) map.get(cVar.f169588b.getF62112a());
                    arrayList2.add(mx1.g.b(cVar, bVar2 != null ? bVar2.f230526a : null));
                }
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(vx1.h.c((BrebContact) it8.next()));
                }
                int i2 = vx1.b.f292788a[aVar.ordinal()];
                if (i2 == 1) {
                    aVar3.h(arrayList3);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.e(arrayList3);
                }
                return Unit.f186387a;
            default:
                xx1.a aVar4 = (xx1.a) this.f110022b;
                List<iy1.d> list4 = list;
                ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                for (iy1.d dVar : list4) {
                    ox1.b bVar3 = (ox1.b) map.get(dVar.f169591b.getF62112a());
                    arrayList4.add(mx1.h.b(dVar, bVar3 != null ? bVar3.f230526a : null));
                }
                ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                Iterator it9 = arrayList4.iterator();
                while (it9.hasNext()) {
                    arrayList5.add(xx1.h.c((IrisContact) it9.next()));
                }
                int i3 = xx1.b.f309378a[aVar.ordinal()];
                if (i3 == 1) {
                    aVar4.h(arrayList5);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar4.e(arrayList5);
                }
                return Unit.f186387a;
        }
    }

    public c(vx1.a brebContactDao) {
        Intrinsics.checkNotNullParameter(brebContactDao, "brebContactDao");
        this.f110022b = brebContactDao;
        n02.b bVar = n02.b.AANI;
    }

    public c(xx1.a irisContactDao) {
        Intrinsics.checkNotNullParameter(irisContactDao, "irisContactDao");
        this.f110022b = irisContactDao;
        n02.b bVar = n02.b.AANI;
    }
}
