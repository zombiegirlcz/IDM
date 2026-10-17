package q63;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f242455a;

    public c(boolean z) {
        this.f242455a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f242455a == ((c) obj2).f242455a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242455a);
    }
}
