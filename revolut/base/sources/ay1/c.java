package ay1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.PixContact;
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
    public final a f11008a;

    public c(a pixContactDao) {
        Intrinsics.checkNotNullParameter(pixContactDao, "pixContactDao");
        this.f11008a = pixContactDao;
        n02.b bVar = n02.b.AANI;
    }

    @Override // rx1.p
    public final List a(nx1.e discovery) {
        Intrinsics.checkNotNullParameter(discovery, "discovery");
        iy1.g gVar = discovery.f220059g;
        if (gVar != null) {
            return gVar.f169602a;
        }
        return null;
    }

    @Override // rx1.p
    public final Unit c(List list, Map map, Map map2, rx1.a aVar) {
        List<iy1.f> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (iy1.f fVar : list2) {
            ApmDescriptor apmDescriptor = fVar.f169597b;
            zm3.g gVarA = null;
            ox1.c cVar = apmDescriptor instanceof ApmDescriptor.Phone ? (ox1.c) map.get(((ApmDescriptor.Phone) apmDescriptor).f62110b) : apmDescriptor instanceof ApmDescriptor.Email ? (ox1.c) map2.get(((ApmDescriptor.Email) apmDescriptor).f62107b) : null;
            if (cVar != null) {
                gVarA = cVar.a();
            }
            arrayList.add(mx1.j.b(fVar, gVarA));
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(j.c((PixContact) it8.next()));
        }
        int i = b.f11007a[aVar.ordinal()];
        a aVar2 = this.f11008a;
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
