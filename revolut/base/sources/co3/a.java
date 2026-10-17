package co3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f25486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f25487b;

    public a(double d, double d5) {
        this.f25486a = d;
        this.f25487b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.f25486a, aVar.f25486a) == 0 && Double.compare(this.f25487b, aVar.f25487b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f25487b) + (Double.hashCode(this.f25486a) * 31);
    }
}
