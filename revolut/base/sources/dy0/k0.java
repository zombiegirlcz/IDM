package dy0;

/* JADX INFO: loaded from: classes20.dex */
public final class k0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f121000a;

    public k0() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Float.compare(this.f121000a, ((k0) obj2).f121000a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f121000a);
    }

    public k0(int i) {
        this.f121000a = 0.7f;
    }
}
