package n4l;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f212468a;

    public a(int i) {
        this.f212468a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f212468a == ((a) obj2).f212468a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f212468a);
    }
}
