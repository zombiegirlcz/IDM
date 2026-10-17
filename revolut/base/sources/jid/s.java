package jid;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f174452a;

    public s(boolean z) {
        this.f174452a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f174452a == ((s) obj2).f174452a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174452a);
    }
}
