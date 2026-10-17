package cpi;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements rj0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f107958a;

    public final b1j.a a() {
        phm.a aVar = (phm.a) j6.a.i(this.f107958a.f107964a, c1j.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (b1j.a) ((c1j.a) aVar2.b()).f20528c.get();
        }
        throw new IllegalStateException(a0.d.q("Api ", c1j.a.class, " is not found"));
    }
}
