package w08;

import aii.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f293668a;

    public b(boolean z) {
        this.f293668a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f293668a == ((b) obj2).f293668a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f293668a);
    }
}
