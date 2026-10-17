package pqa;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f238708a;

    public h(boolean z) {
        this.f238708a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f238708a == ((h) obj2).f238708a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f238708a);
    }
}
