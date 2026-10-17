package sh1;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f263341a;

    public c(int i) {
        this.f263341a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f263341a == ((c) obj2).f263341a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f263341a);
    }
}
