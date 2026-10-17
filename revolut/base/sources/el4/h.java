package el4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127264a;

    public h(int i) {
        this.f127264a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f127264a == ((h) obj2).f127264a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f127264a);
    }
}
