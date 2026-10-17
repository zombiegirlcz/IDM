package dtl;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f117468a;

    public c() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f117468a == ((c) obj2).f117468a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f117468a);
    }

    public c(boolean z) {
        this.f117468a = z;
    }
}
