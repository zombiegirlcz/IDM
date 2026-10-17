package tof;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f273151a;

    public x(int i) {
        this.f273151a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && this.f273151a == ((x) obj2).f273151a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f273151a);
    }
}
