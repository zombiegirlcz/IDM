package bsd;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18163a;

    public b(int i) {
        this.f18163a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f18163a == ((b) obj2).f18163a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18163a);
    }
}
