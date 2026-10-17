package au0;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9145a;

    public b(float f) {
        this.f9145a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Float.compare(this.f9145a, ((b) obj2).f9145a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9145a);
    }
}
