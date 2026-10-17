package bo6;

import aii.r;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17292a;

    public b(int i) {
        this.f17292a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f17292a == ((b) obj2).f17292a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17292a);
    }
}
