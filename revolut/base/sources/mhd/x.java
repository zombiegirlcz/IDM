package mhd;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f205538a;

    public x(boolean z) {
        this.f205538a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && this.f205538a == ((x) obj2).f205538a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205538a);
    }
}
