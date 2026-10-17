package el;

import com.onfido.dagger.Lazy;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements Provider, Lazy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f127223c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Provider f127224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f127225b = f127223c;

    public a(Provider provider) {
        this.f127224a = provider;
    }

    public static Lazy a(Provider provider) {
        if (provider instanceof Lazy) {
            return (Lazy) provider;
        }
        provider.getClass();
        return new a(provider);
    }

    public static Provider b(b bVar) {
        bVar.getClass();
        return bVar instanceof a ? bVar : new a(bVar);
    }

    @Override // com.onfido.javax.inject.Provider
    public final Object get() {
        Object obj2;
        Object obj3 = this.f127225b;
        Object obj4 = f127223c;
        if (obj3 != obj4) {
            return obj3;
        }
        synchronized (this) {
            try {
                obj2 = this.f127225b;
                if (obj2 == obj4) {
                    obj2 = this.f127224a.get();
                    Object obj5 = this.f127225b;
                    if (obj5 != obj4 && obj5 != obj2) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj5 + " & " + obj2 + ". This is likely due to a circular dependency.");
                    }
                    this.f127225b = obj2;
                    this.f127224a = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return obj2;
    }
}
