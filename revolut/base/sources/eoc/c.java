package eoc;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f127897a;

    public c(boolean z) {
        this.f127897a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f127897a == ((c) obj2).f127897a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127897a);
    }
}
