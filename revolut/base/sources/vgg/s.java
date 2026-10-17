package vgg;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f289174a;

    public s(boolean z) {
        this.f289174a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f289174a == ((s) obj2).f289174a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f289174a);
    }
}
