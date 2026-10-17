package de9;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113331b;

    public o(boolean z, boolean z3) {
        this.f113330a = z;
        this.f113331b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f113330a == oVar.f113330a && this.f113331b == oVar.f113331b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113331b) + (Boolean.hashCode(this.f113330a) * 31);
    }
}
