package tpl;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f273424a;

    public m(boolean z) {
        this.f273424a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f273424a == ((m) obj2).f273424a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273424a);
    }
}
