package eub;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f129539a;

    public b(Exception exc2) {
        this.f129539a = exc2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f129539a.equals(((b) obj2).f129539a);
    }

    public final int hashCode() {
        return this.f129539a.hashCode();
    }
}
