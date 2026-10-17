package x9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public final class l extends n implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f303514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f303515c;

    public l(n nVar, n nVar2) {
        this.f303514b = nVar;
        this.f303515c = nVar2;
    }

    @Override // x9.n
    public final String a(String str) {
        return this.f303514b.a(this.f303515c.a(str));
    }

    public final String toString() {
        return "[ChainedTransformer(" + this.f303514b + ", " + this.f303515c + ")]";
    }
}
