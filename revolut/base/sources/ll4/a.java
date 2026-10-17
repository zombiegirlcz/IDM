package ll4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f196499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f196500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f196501c;

    public a(long j2, int i, int i2) {
        this.f196499a = j2;
        this.f196500b = i;
        this.f196501c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f196499a == aVar.f196499a && this.f196500b == aVar.f196500b && this.f196501c == aVar.f196501c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f196501c) + j6.a.b(this.f196500b, Long.hashCode(this.f196499a) * 31, 31);
    }
}
