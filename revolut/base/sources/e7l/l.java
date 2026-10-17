package e7l;

import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f123415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f123416b;

    public l(boolean z, boolean z3) {
        this.f123415a = z;
        this.f123416b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f123415a == lVar.f123415a && this.f123416b == lVar.f123416b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123416b) + (Boolean.hashCode(this.f123415a) * 31);
    }
}
