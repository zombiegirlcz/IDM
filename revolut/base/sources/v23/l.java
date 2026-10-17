package v23;

import cli.q;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f285638a;

    public l(boolean z) {
        this.f285638a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f285638a == ((l) obj2).f285638a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285638a);
    }
}
