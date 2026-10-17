package st2;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f265448a;

    public b(boolean z) {
        this.f265448a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f265448a == ((b) obj2).f265448a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265448a);
    }
}
