package iy8;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f169632a;

    public m(boolean z) {
        this.f169632a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f169632a == ((m) obj2).f169632a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f169632a);
    }
}
