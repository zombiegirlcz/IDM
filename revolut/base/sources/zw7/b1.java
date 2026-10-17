package zw7;

/* JADX INFO: loaded from: classes4.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f325757a;

    public b1(boolean z) {
        this.f325757a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b1) && this.f325757a == ((b1) obj2).f325757a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f325757a);
    }
}
