package q35;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f241830a;

    public l(int i) {
        this.f241830a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f241830a == ((l) obj2).f241830a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f241830a);
    }
}
