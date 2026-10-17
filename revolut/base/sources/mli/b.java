package mli;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f206961a;

    public b(boolean z) {
        this.f206961a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f206961a == ((b) obj2).f206961a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206961a);
    }
}
