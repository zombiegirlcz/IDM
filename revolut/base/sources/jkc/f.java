package jkc;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f175154a;

    public f(int i) {
        this.f175154a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f175154a == ((f) obj2).f175154a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f175154a);
    }
}
