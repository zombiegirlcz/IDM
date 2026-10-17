package ce;

/* JADX INFO: loaded from: classes.dex */
public final class p implements cf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f23314c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f23315a = f23314c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile cf.b f23316b;

    public p(cf.b bVar) {
        this.f23316b = bVar;
    }

    @Override // cf.b
    public final Object get() {
        Object obj2;
        Object obj3 = this.f23315a;
        Object obj4 = f23314c;
        if (obj3 != obj4) {
            return obj3;
        }
        synchronized (this) {
            try {
                obj2 = this.f23315a;
                if (obj2 == obj4) {
                    obj2 = this.f23316b.get();
                    this.f23315a = obj2;
                    this.f23316b = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return obj2;
    }
}
