package k4l;

import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f180945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180946b;

    public b(int i, int i2) {
        this.f180945a = i;
        this.f180946b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f180945a == bVar.f180945a && this.f180946b == bVar.f180946b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f180946b) + (Integer.hashCode(this.f180945a) * 31);
    }
}
