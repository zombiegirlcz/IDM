package v9;

/* JADX INFO: loaded from: classes16.dex */
public abstract class p0 extends o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f286940c = 1;

    public /* synthetic */ p0(Class cls) {
        super(cls);
    }

    @Override // k9.k
    public boolean d(k9.v vVar, Object obj2) {
        switch (this.f286940c) {
            case 2:
                return q(obj2).isEmpty();
            default:
                return super.d(vVar, obj2);
        }
    }

    @Override // k9.k
    public void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        hVar.B(q(obj2));
    }

    @Override // k9.k
    public void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) {
        switch (this.f286940c) {
            case 1:
                f9.d dVarE = cVar.e(hVar, cVar.d(obj2, com.fasterxml.jackson.core.n.VALUE_STRING));
                f(obj2, hVar, vVar);
                cVar.f(hVar, dVarE);
                break;
            case 2:
                f9.d dVarE2 = cVar.e(hVar, cVar.d(obj2, com.fasterxml.jackson.core.n.VALUE_STRING));
                f(obj2, hVar, vVar);
                cVar.f(hVar, dVarE2);
                break;
            default:
                super.h(obj2, hVar, vVar, cVar);
                break;
        }
    }

    public abstract String q(Object obj2);

    public /* synthetic */ p0(Class cls, int i) {
        super(cls, i);
    }
}
