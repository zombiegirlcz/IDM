package uuk;

import uuk.b;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f283243a;

    public c(boolean z) {
        this.f283243a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f283243a == ((c) obj2).f283243a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283243a);
    }
}
