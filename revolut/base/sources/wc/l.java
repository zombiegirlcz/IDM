package wc;

/* JADX INFO: loaded from: classes.dex */
public final class l implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f296293c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile n f296294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f296295b = f296293c;

    public l(n nVar) {
        this.f296294a = nVar;
    }

    public static l a(n nVar) {
        return nVar instanceof l ? (l) nVar : new l(nVar);
    }

    public static n b(n nVar) {
        return nVar instanceof l ? nVar : new l(nVar);
    }

    @Override // wc.n
    public final Object zza() {
        Object objZza;
        Object obj2 = this.f296295b;
        Object obj3 = f296293c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                objZza = this.f296295b;
                if (objZza == obj3) {
                    objZza = this.f296294a.zza();
                    Object obj4 = this.f296295b;
                    if (obj4 != obj3 && obj4 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f296295b = objZza;
                    this.f296294a = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return objZza;
    }
}
