package tx1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rx1.p;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f275302a;

    public d(a bizumContactDao) {
        Intrinsics.checkNotNullParameter(bizumContactDao, "bizumContactDao");
        this.f275302a = bizumContactDao;
        n02.b bVar = n02.b.AANI;
    }

    @Override // rx1.p
    public final List a(nx1.e discovery) {
        Intrinsics.checkNotNullParameter(discovery, "discovery");
        return discovery.f220057b;
    }

    @Override // rx1.p
    public final Unit c(List list, Map map, Map map2, rx1.a aVar) {
        List<jy1.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (jy1.c cVar : list2) {
            ox1.b bVar = (ox1.b) map.get(cVar.f179303b.getF62112a());
            arrayList.add(mx1.e.b(cVar, bVar != null ? bVar.f230526a : null));
        }
        ArrayList arrayListC = k.c(arrayList);
        int i = b.f275299a[aVar.ordinal()];
        a aVar2 = this.f275302a;
        if (i == 1) {
            aVar2.j(arrayListC);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2.g(arrayListC);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r3.b(r2, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // rx1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx1.d.d(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
