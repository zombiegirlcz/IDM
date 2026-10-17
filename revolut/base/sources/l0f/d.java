package l0f;

import aii.r;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f191241a;

    public d(boolean z) {
        this.f191241a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f191241a == ((d) obj2).f191241a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191241a);
    }
}
