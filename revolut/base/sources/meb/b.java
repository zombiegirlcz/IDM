package meb;

import aii.r;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f204641a;

    public b(int i) {
        this.f204641a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f204641a == ((b) obj2).f204641a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f204641a);
    }
}
