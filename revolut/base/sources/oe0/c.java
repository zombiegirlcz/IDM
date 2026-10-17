package oe0;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f224502a;

    public c(float f) {
        this.f224502a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Float.compare(this.f224502a, ((c) obj2).f224502a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f224502a);
    }
}
