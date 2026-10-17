package f83;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f132699a;

    public c(boolean z) {
        this.f132699a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f132699a == ((c) obj2).f132699a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f132699a);
    }
}
