package c0l;

import aii.r;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20295a;

    public c(boolean z) {
        this.f20295a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f20295a == ((c) obj2).f20295a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20295a);
    }
}
