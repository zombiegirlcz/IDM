package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class v4 extends x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10571a;

    public v4(float f) {
        this.f10571a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v4) && Float.compare(this.f10571a, ((v4) obj2).f10571a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10571a);
    }
}
