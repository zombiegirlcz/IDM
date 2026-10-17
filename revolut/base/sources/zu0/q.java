package zu0;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f325210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f325211b;

    public q(int i, int i2) {
        this.f325210a = i;
        this.f325211b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f325210a == qVar.f325210a && this.f325211b == qVar.f325211b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f325211b) + (Integer.hashCode(this.f325210a) * 31);
    }
}
