package voi;

import voi.i;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements d4m.a {
    @Override // d4m.a, phm.a
    public final Object get() {
        i.a aVar = i.Companion;
        phm.a aVar2 = (phm.a) j6.a.j(hf0.b.d, h51.a.class);
        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
        if (aVar3 != null) {
            return ((h51.a) aVar3.b()).c();
        }
        throw new IllegalStateException(a0.d.q("Api ", h51.a.class, " is not found"));
    }
}
