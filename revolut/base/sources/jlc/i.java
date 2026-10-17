package jlc;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f175686a;

    public i() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f175686a == ((i) obj2).f175686a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175686a);
    }

    public i(boolean z) {
        this.f175686a = z;
    }
}
