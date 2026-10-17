package bc;

/* JADX INFO: loaded from: classes.dex */
public final class a implements phm.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f14353c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f14354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f14355b;

    public static phm.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f14355b = f14353c;
        aVar.f14354a = bVar;
        return aVar;
    }

    @Override // phm.a
    public final Object get() {
        Object obj2;
        Object obj3 = this.f14355b;
        Object obj4 = f14353c;
        if (obj3 != obj4) {
            return obj3;
        }
        synchronized (this) {
            try {
                obj2 = this.f14355b;
                if (obj2 == obj4) {
                    obj2 = this.f14354a.get();
                    Object obj5 = this.f14355b;
                    if (obj5 != obj4 && obj5 != obj2) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj5 + " & " + obj2 + ". This is likely due to a circular dependency.");
                    }
                    this.f14355b = obj2;
                    this.f14354a = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return obj2;
    }
}
