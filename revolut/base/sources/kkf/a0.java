package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f184584a;

    public a0(boolean z) {
        this.f184584a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && this.f184584a == ((a0) obj2).f184584a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184584a);
    }
}
