package tof;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class m4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f272932a;

    public m4(double d) {
        this.f272932a = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m4) && Double.compare(this.f272932a, ((m4) obj2).f272932a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f272932a);
    }
}
