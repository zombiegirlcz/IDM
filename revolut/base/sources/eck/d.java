package eck;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f124759a;

    public d(boolean z) {
        this.f124759a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f124759a == ((d) obj2).f124759a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124759a);
    }
}
