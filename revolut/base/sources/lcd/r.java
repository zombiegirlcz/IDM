package lcd;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f193868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f193869b;

    public r(boolean z, boolean z3) {
        this.f193868a = z;
        this.f193869b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f193868a == rVar.f193868a && this.f193869b == rVar.f193869b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193869b) + (Boolean.hashCode(this.f193868a) * 31);
    }
}
