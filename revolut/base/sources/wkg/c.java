package wkg;

import aii.r;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f298284a;

    public c(boolean z) {
        this.f298284a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f298284a == ((c) obj2).f298284a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f298284a);
    }
}
