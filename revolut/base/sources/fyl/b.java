package fyl;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f139062a;

    public b(boolean z) {
        this.f139062a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f139062a == ((b) obj2).f139062a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139062a);
    }
}
