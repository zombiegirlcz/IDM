package h90;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f150078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150079b;

    public a(int i, int i2) {
        this.f150078a = i;
        this.f150079b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f150078a == aVar.f150078a && this.f150079b == aVar.f150079b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f150079b) + (Integer.hashCode(this.f150078a) * 31);
    }
}
