package s5h;

import cli.j;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f260083a;

    public f() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f260083a == ((f) obj2).f260083a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260083a);
    }

    public f(boolean z) {
        this.f260083a = z;
    }
}
