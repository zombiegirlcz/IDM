package wkg;

import jki.i;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f298283a;

    public b(boolean z) {
        this.f298283a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f298283a == ((b) obj2).f298283a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f298283a);
    }
}
