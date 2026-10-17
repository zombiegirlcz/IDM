package y07;

import aii.r;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f310159a;

    public h() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f310159a == ((h) obj2).f310159a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f310159a);
    }

    public h(boolean z) {
        this.f310159a = z;
    }
}
