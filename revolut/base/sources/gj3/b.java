package gj3;

import hj3.c;
import hj3.d;
import hj3.e;
import hj3.f;
import hj3.g;
import hj3.h;
import ij3.i;
import ij3.k;
import ij3.n;
import ij3.p;
import ij3.s;
import ij3.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b {
    public static final hj3.a a(n nVar) {
        f fVar;
        e eVar;
        c cVar;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        String str = nVar.f161683a;
        p pVar = nVar.f161684b;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        int i = a.f144233a[pVar.ordinal()];
        if (i == 1) {
            fVar = f.MARKETING;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = f.FIN_CRIME;
        }
        k kVar = nVar.f161685c;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        int i2 = a.f144234b[kVar.ordinal()];
        if (i2 == 1) {
            eVar = e.NONE;
        } else if (i2 == 2) {
            eVar = e.ALL_SCREENS;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = e.END_SCREEN;
        }
        e eVar2 = eVar;
        String str2 = nVar.d;
        List<i> list = nVar.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (i iVar : list) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            arrayList.add(new d(iVar.f161680a, iVar.f161681b));
        }
        List<s> list2 = nVar.f;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (s sVar : list2) {
            Intrinsics.checkNotNullParameter(sVar, "<this>");
            String str3 = sVar.f161689a;
            ij3.f fVar2 = sVar.f161690b;
            if (fVar2 != null) {
                Intrinsics.checkNotNullParameter(fVar2, "<this>");
                cVar = new c(fVar2.f161677a, fVar2.f161678b);
            } else {
                cVar = null;
            }
            c cVar2 = cVar;
            String str4 = sVar.f161691c;
            String str5 = sVar.d;
            ij3.c cVar3 = sVar.e;
            Intrinsics.checkNotNullParameter(cVar3, "<this>");
            arrayList2.add(new g(str3, cVar2, str4, str5, new hj3.b(cVar3.f161674a, cVar3.f161675b)));
            fVar = fVar;
        }
        f fVar3 = fVar;
        String str6 = nVar.f161686g;
        t tVar = nVar.f161687h;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        b.Companion companion = kotlin.time.b.INSTANCE;
        long j2 = tVar.f161692a;
        pkm.e eVar3 = pkm.e.SECONDS;
        return new hj3.a(str, fVar3, eVar2, str2, arrayList, arrayList2, str6, new h(kotlin.time.c.h(j2, eVar3), kotlin.time.c.h(tVar.f161693b, eVar3)));
    }
}
