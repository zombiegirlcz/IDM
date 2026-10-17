package jc0;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f172685a;

    public b(float f) {
        this.f172685a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Float.compare(this.f172685a, ((b) obj2).f172685a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f172685a);
    }
}
