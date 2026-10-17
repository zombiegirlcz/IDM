package kg9;

import aii.r;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f183936a;

    public b(int i) {
        this.f183936a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f183936a == ((b) obj2).f183936a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f183936a);
    }
}
