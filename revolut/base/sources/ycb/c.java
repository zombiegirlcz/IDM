package ycb;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f312604a;

    public c() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f312604a == ((c) obj2).f312604a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f312604a);
    }

    public c(boolean z) {
        this.f312604a = z;
    }
}
