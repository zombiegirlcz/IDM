package el;

import com.onfido.dagger.Lazy;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements b, Lazy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f127226a;

    public c(Object obj2) {
        this.f127226a = obj2;
    }

    @Override // com.onfido.javax.inject.Provider
    public final Object get() {
        return this.f127226a;
    }
}
