package v7h;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import v7h.a;
import xzg.q;
import xzg.r;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    public static final List a(a aVar) {
        q qVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List instruments = aVar.getInstruments();
        if (instruments == null || instruments.isEmpty()) {
            return f0.f322471a;
        }
        List<a.b> instruments2 = aVar.getInstruments();
        ArrayList arrayList = new ArrayList();
        for (a.b bVar : instruments2) {
            a.EnumC1582a assetType = bVar.getAssetType();
            int i = assetType == null ? -1 : b.f286657a[assetType.ordinal()];
            if (i == -1) {
                qVar = null;
            } else if (i == 1) {
                qVar = q.SECURITY;
            } else if (i == 2) {
                qVar = q.CRYPTO;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar = q.COMMODITY;
            }
            r rVar = qVar != null ? new r(bVar.getSymbol(), bVar.getRef(), qVar) : null;
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }
}
