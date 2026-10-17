package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class bm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f163630a;

    public bm0(float f) {
        this.f163630a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof bm0) && Float.compare(this.f163630a, ((bm0) obj2).f163630a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f163630a);
    }
}
