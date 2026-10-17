package suh;

import aii.r;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265771a;

    public n(int i) {
        this.f265771a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f265771a == ((n) obj2).f265771a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265771a);
    }
}
