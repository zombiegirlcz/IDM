package qfe;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f245293a;

    public g() {
        this(3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f245293a == ((g) obj2).f245293a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f245293a);
    }

    public g(int i) {
        this.f245293a = i;
    }
}
