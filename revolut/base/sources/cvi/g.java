package cvi;

import aii.r;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109469a;

    public g(int i) {
        this.f109469a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f109469a == ((g) obj2).f109469a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109469a);
    }
}
