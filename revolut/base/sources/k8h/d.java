package k8h;

import java.util.ArrayList;
import java.util.List;
import k8h.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xzg.q;
import xzg.r;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d {
    public static final ArrayList a(List list) {
        q qVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<b.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (b.a aVar : list2) {
            String symbol = aVar.getSymbol();
            String ref2 = aVar.getRef();
            a assetType = aVar.getAssetType();
            Intrinsics.checkNotNullParameter(assetType, "<this>");
            int i = c.f182161b[assetType.ordinal()];
            if (i == 1) {
                qVar = q.COMMODITY;
            } else if (i == 2) {
                qVar = q.SECURITY;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar = q.CRYPTO;
            }
            arrayList.add(new r(symbol, ref2, qVar));
        }
        return arrayList;
    }

    public static final ArrayList b(List list) {
        a aVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<r> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (r rVar : list2) {
            String str = rVar.f310022a;
            String str2 = rVar.f310023b;
            q qVar = rVar.f310024c;
            Intrinsics.checkNotNullParameter(qVar, "<this>");
            int i = c.f182160a[qVar.ordinal()];
            if (i == 1) {
                aVar = a.COMMODITY;
            } else if (i == 2) {
                aVar = a.SECURITY;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = a.CRYPTO;
            }
            arrayList.add(new b.a(str, str2, aVar));
        }
        return arrayList;
    }
}
