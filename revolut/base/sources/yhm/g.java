package yhm;

import java.io.Serializable;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f314188a;

    public g(Object obj2) {
        this.f314188a = obj2;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        return this.f314188a;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.f314188a);
    }
}
