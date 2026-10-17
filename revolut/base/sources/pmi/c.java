package pmi;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements e, kmi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f237588a;

    public c(short s2) {
        this.f237588a = s2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f237588a == ((c) obj2).f237588a;
    }

    public final int hashCode() {
        return Short.hashCode(this.f237588a);
    }
}
