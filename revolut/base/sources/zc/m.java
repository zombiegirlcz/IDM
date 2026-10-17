package zc;

/* JADX INFO: loaded from: classes16.dex */
public final class m implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f320990c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile n f320991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f320992b;

    /* JADX WARN: Multi-variable type inference failed */
    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        m mVar = new m();
        mVar.f320992b = f320990c;
        mVar.f320991a = nVar;
        return mVar;
    }

    @Override // zc.o
    public final Object a() {
        Object objA;
        Object obj2 = this.f320992b;
        Object obj3 = f320990c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                objA = this.f320992b;
                if (objA == obj3) {
                    objA = this.f320991a.a();
                    Object obj4 = this.f320992b;
                    if (obj4 != obj3 && obj4 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f320992b = objA;
                    this.f320991a = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return objA;
    }
}
