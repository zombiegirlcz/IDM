package wgk;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f297332a;

    public c(boolean z) {
        this.f297332a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f297332a == ((c) obj2).f297332a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f297332a);
    }
}
