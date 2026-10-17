package e4m;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f122672a;

    public static void a(e eVar, e eVar2) {
        a aVar = (a) eVar;
        if (aVar.f122672a != null) {
            throw new IllegalStateException();
        }
        aVar.f122672a = eVar2;
    }

    @Override // phm.a
    public final Object get() {
        e eVar = this.f122672a;
        if (eVar != null) {
            return eVar.get();
        }
        throw new IllegalStateException();
    }
}
