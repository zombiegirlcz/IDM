package e4m;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e, d4m.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f122673c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile e f122674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f122675b = f122673c;

    public b(e eVar) {
        this.f122674a = eVar;
    }

    public static d4m.a a(e eVar) {
        if (eVar instanceof d4m.a) {
            return (d4m.a) eVar;
        }
        eVar.getClass();
        return new b(eVar);
    }

    public static e b(e eVar) {
        eVar.getClass();
        return eVar instanceof b ? eVar : new b(eVar);
    }

    @Override // phm.a
    public final Object get() {
        Object obj2;
        Object obj3 = this.f122675b;
        Object obj4 = f122673c;
        if (obj3 != obj4) {
            return obj3;
        }
        synchronized (this) {
            obj2 = this.f122675b;
            if (obj2 == obj4) {
                obj2 = this.f122674a.get();
                Object obj5 = this.f122675b;
                if (obj5 != obj4 && obj5 != obj2) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj5 + " & " + obj2 + ". This is likely due to a circular dependency.");
                }
                this.f122675b = obj2;
                this.f122674a = null;
            }
        }
        return obj2;
    }
}
