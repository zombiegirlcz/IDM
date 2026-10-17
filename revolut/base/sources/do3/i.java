package do3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116403b;

    public i(int i, int i2) {
        this.f116402a = i;
        this.f116403b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f116402a == iVar.f116402a && this.f116403b == iVar.f116403b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116403b) + (Integer.hashCode(this.f116402a) * 31);
    }
}
