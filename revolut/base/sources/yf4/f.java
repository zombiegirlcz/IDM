package yf4;

import aii.r;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f313175a;

    public f(int i) {
        this.f313175a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f313175a == ((f) obj2).f313175a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f313175a);
    }
}
