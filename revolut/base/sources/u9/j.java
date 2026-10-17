package u9;

/* JADX INFO: loaded from: classes16.dex */
public final class j extends oi0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f278276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f278277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.k f278278c;
    public final k9.k d;

    public j(m mVar, Class cls, k9.k kVar, Class cls2, k9.k kVar2) {
        this.f278276a = cls;
        this.f278278c = kVar;
        this.f278277b = cls2;
        this.d = kVar2;
    }

    @Override // oi0.d
    public final oi0.d E(Class cls, k9.k kVar) {
        return new l(this, new n[]{new n(this.f278276a, this.f278278c), new n(this.f278277b, this.d), new n(cls, kVar)});
    }

    @Override // oi0.d
    public final k9.k H(Class cls) {
        if (cls == this.f278276a) {
            return this.f278278c;
        }
        if (cls == this.f278277b) {
            return this.d;
        }
        return null;
    }
}
