package sod;

import aii.r;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f264819a;

    public b(boolean z) {
        this.f264819a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f264819a == ((b) obj2).f264819a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264819a);
    }
}
