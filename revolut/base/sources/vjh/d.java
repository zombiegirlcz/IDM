package vjh;

import bih.m;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        m mVar = (m) ((dih.a) obj2).f115059b.getContent();
        Integer numValueOf = mVar != null ? Integer.valueOf(mVar.getOrder()) : null;
        m mVar2 = (m) ((dih.a) obj3).f115059b.getContent();
        return cim.b.b(numValueOf, mVar2 != null ? Integer.valueOf(mVar2.getOrder()) : null);
    }
}
