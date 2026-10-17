package o3g;

import jki.o;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f221811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f221812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f221813c;

    public h(boolean z, boolean z3, boolean z4) {
        this.f221811a = z;
        this.f221812b = z3;
        this.f221813c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f221811a == hVar.f221811a && this.f221812b == hVar.f221812b && this.f221813c == hVar.f221813c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221813c) + j6.a.c(Boolean.hashCode(this.f221811a) * 31, 31, this.f221812b);
    }
}
