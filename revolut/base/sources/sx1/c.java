package sx1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
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
    public final a f266248a;

    public c(a aaniContactDao) {
        Intrinsics.checkNotNullParameter(aaniContactDao, "aaniContactDao");
        this.f266248a = aaniContactDao;
        n02.b bVar = n02.b.AANI;
    }

    @Override // rx1.p
    public final List a(nx1.e discovery) {
        Intrinsics.checkNotNullParameter(discovery, "discovery");
        return discovery.f220056a;
    }

    @Override // rx1.p
    public final Unit c(List list, Map map, Map map2, rx1.a aVar) {
        List<iy1.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (iy1.a aVar2 : list2) {
            ApmDescriptor apmDescriptor = aVar2.f169582b;
            zm3.g gVarA = null;
            ox1.c cVar = apmDescriptor instanceof ApmDescriptor.Phone ? (ox1.c) map.get(((ApmDescriptor.Phone) apmDescriptor).f62110b) : apmDescriptor instanceof ApmDescriptor.Email ? (ox1.c) map2.get(((ApmDescriptor.Email) apmDescriptor).f62107b) : null;
            if (cVar != null) {
                gVarA = cVar.a();
            }
            arrayList.add(mx1.a.b(aVar2, gVarA));
        }
        ArrayList arrayListC = i.c(arrayList);
        int i = b.f266247a[aVar.ordinal()];
        a aVar3 = this.f266248a;
        if (i == 1) {
            aVar3.h(arrayListC);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar3.e(arrayListC);
        }
        return Unit.f186387a;
    }
}
