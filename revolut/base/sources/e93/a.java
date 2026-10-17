package e93;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f123822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f123823b;

    public a(int i, int i2) {
        this.f123822a = i;
        this.f123823b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f123822a == aVar.f123822a && this.f123823b == aVar.f123823b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f123823b) + (Integer.hashCode(this.f123822a) * 31);
    }
}
