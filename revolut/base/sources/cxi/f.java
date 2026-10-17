package cxi;

import aii.r;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109991a;

    public f(int i) {
        this.f109991a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f109991a == ((f) obj2).f109991a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109991a);
    }
}
