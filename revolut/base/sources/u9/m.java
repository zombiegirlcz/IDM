package u9;

/* JADX INFO: loaded from: classes16.dex */
public final class m extends oi0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f278281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9.k f278282b;

    public m(oi0.d dVar, Class cls, k9.k kVar) {
        this.f278281a = cls;
        this.f278282b = kVar;
    }

    @Override // oi0.d
    public final oi0.d E(Class cls, k9.k kVar) {
        return new j(this, this.f278281a, this.f278282b, cls, kVar);
    }

    @Override // oi0.d
    public final k9.k H(Class cls) {
        if (cls == this.f278281a) {
            return this.f278282b;
        }
        return null;
    }
}
