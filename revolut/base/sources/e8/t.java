package e8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8.j f123518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f123519b;

    public t(u8.j jVar, Executor executor) {
        this.f123518a = jVar;
        this.f123519b = executor;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof t) {
            return this.f123518a.equals(((t) obj2).f123518a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f123518a.hashCode();
    }
}
