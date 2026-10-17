package x61;

import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f303012a;

    public d(boolean z) {
        this.f303012a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f303012a == ((d) obj2).f303012a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f303012a);
    }
}
