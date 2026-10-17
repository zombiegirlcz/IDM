package br4;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17916a;

    public n(boolean z) {
        this.f17916a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f17916a == ((n) obj2).f17916a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17916a);
    }
}
