package su;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f265620a;

    public c() {
        this(true);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f265620a == ((c) obj2).f265620a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265620a);
    }

    public c(boolean z) {
        this.f265620a = z;
    }
}
