package aw7;

import jki.o;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10743a;

    public j(boolean z) {
        this.f10743a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f10743a == ((j) obj2).f10743a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10743a);
    }
}
