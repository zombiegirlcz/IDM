package mv3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f209123a;

    public g(long j2) {
        this.f209123a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f209123a == ((g) obj2).f209123a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f209123a);
    }
}
