package v9;

/* JADX INFO: loaded from: classes16.dex */
public final class m0 extends o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient oi0.d f286921c;

    public m0() {
        super(String.class, 0);
        this.f286921c = u9.k.f278279a;
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        Class<?> cls = obj2.getClass();
        oi0.d dVar = this.f286921c;
        k9.k kVarH = dVar.H(cls);
        if (kVarH == null) {
            if (cls == Object.class) {
                kVarH = new l0(8, cls);
                this.f286921c = dVar.E(cls, kVarH);
            } else {
                kVarH = vVar.l(vVar.f182201a.d(cls), null);
                oi0.d dVarE = dVar.E(cls, kVarH);
                if (dVar != dVarE) {
                    this.f286921c = dVarE;
                }
            }
        }
        kVarH.f(obj2, hVar, vVar);
    }
}
