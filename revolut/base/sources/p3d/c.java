package p3d;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f232739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f232740b;

    public c(boolean z, int i) {
        this.f232739a = z;
        this.f232740b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f232739a == cVar.f232739a && this.f232740b == cVar.f232740b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f232740b) + (Boolean.hashCode(this.f232739a) * 31);
    }
}
