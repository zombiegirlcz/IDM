package bxg;

import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        pwg.g gVar = ((pwg.b) obj3).f240452c;
        Float fValueOf = gVar != null ? Float.valueOf(gVar.f()) : null;
        pwg.g gVar2 = ((pwg.b) obj2).f240452c;
        return cim.b.b(fValueOf, gVar2 != null ? Float.valueOf(gVar2.f()) : null);
    }
}
