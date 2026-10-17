package a6c;

import u6c.k;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f1600a;

    public c() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f1600a == ((c) obj2).f1600a;
    }

    public final int hashCode() {
        k kVar = this.f1600a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public c(k kVar) {
        this.f1600a = kVar;
    }
}
