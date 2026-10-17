package pc;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f234755c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile c f234756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f234757b;

    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        b bVar = new b();
        bVar.f234757b = f234755c;
        bVar.f234756a = cVar;
        return bVar;
    }

    @Override // pc.c
    public final Object zza() {
        Object objZza;
        Object obj2 = this.f234757b;
        Object obj3 = f234755c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                objZza = this.f234757b;
                if (objZza == obj3) {
                    objZza = this.f234756a.zza();
                    Object obj4 = this.f234757b;
                    if (obj4 != obj3 && obj4 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f234757b = objZza;
                    this.f234756a = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return objZza;
    }
}
