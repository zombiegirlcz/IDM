package ki0;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f184162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f184163b;

    public d(int i, int i2) {
        this.f184162a = i;
        this.f184163b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f184162a == dVar.f184162a && this.f184163b == dVar.f184163b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f184163b) + (Integer.hashCode(this.f184162a) * 31);
    }
}
