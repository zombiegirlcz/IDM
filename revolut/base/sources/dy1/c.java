package dy1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import iy1.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx1.m;
import rx1.p;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f121035a;

    public c(a weroContactDao) {
        Intrinsics.checkNotNullParameter(weroContactDao, "weroContactDao");
        this.f121035a = weroContactDao;
        n02.b bVar = n02.b.AANI;
    }

    @Override // rx1.p
    public final List a(nx1.e discovery) {
        Intrinsics.checkNotNullParameter(discovery, "discovery");
        return discovery.f220061j;
    }

    @Override // rx1.p
    public final Unit c(List list, Map map, Map map2, rx1.a aVar) {
        List<j> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (j jVar : list2) {
            ApmDescriptor apmDescriptor = jVar.f169612b;
            zm3.g gVarA = null;
            ox1.c cVar = apmDescriptor instanceof ApmDescriptor.Phone ? (ox1.c) map.get(((ApmDescriptor.Phone) apmDescriptor).f62110b) : apmDescriptor instanceof ApmDescriptor.Email ? (ox1.c) map2.get(((ApmDescriptor.Email) apmDescriptor).f62107b) : null;
            if (cVar != null) {
                gVarA = cVar.a();
            }
            arrayList.add(m.b(jVar, gVarA));
        }
        ArrayList arrayListC = i.c(arrayList);
        int i = b.f121034a[aVar.ordinal()];
        a aVar2 = this.f121035a;
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
