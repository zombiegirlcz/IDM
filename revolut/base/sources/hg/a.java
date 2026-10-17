package hg;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements phm.a, gg.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f152037c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile phm.a f152038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f152039b = f152037c;

    public a(phm.a aVar) {
        this.f152038a = aVar;
    }

    public static phm.a a(b bVar) {
        return bVar instanceof a ? bVar : new a(bVar);
    }

    @Override // phm.a
    public final Object get() {
        Object obj2;
        Object obj3 = this.f152039b;
        Object obj4 = f152037c;
        if (obj3 != obj4) {
            return obj3;
        }
        synchronized (this) {
            try {
                obj2 = this.f152039b;
                if (obj2 == obj4) {
                    obj2 = this.f152038a.get();
                    Object obj5 = this.f152039b;
                    if (obj5 != obj4 && obj5 != obj2) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj5 + " & " + obj2 + ". This is likely due to a circular dependency.");
                    }
                    this.f152039b = obj2;
                    this.f152038a = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return obj2;
    }
}
