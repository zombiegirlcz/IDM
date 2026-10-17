package br4;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17921a;

    public s(boolean z) {
        this.f17921a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f17921a == ((s) obj2).f17921a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17921a);
    }
}
