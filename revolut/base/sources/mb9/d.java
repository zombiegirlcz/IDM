package mb9;

import aii.r;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f204182a;

    public d(boolean z) {
        this.f204182a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f204182a == ((d) obj2).f204182a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f204182a);
    }
}
