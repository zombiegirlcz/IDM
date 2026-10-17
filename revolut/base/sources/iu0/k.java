package iu0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f168447a = 1.0f;

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Float.compare(this.f168447a, ((k) obj2).f168447a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f168447a);
    }
}
