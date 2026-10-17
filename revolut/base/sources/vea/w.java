package vea;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        io3.k kVar = ((q) ((zsc.q) obj3).f324880a).f288230a.f;
        io3.k kVar2 = io3.k.ACTIVE;
        return cim.b.b(Boolean.valueOf(kVar == kVar2), Boolean.valueOf(((q) ((zsc.q) obj2).f324880a).f288230a.f == kVar2));
    }
}
