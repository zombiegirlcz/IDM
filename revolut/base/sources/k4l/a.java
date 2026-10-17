package k4l;

import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f180940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f180942c;
    public final int d;

    public a(boolean z, int i, int i2, int i3) {
        this.f180940a = z;
        this.f180941b = i;
        this.f180942c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f180940a == aVar.f180940a && this.f180941b == aVar.f180941b && this.f180942c == aVar.f180942c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f180942c, j6.a.b(this.f180941b, Boolean.hashCode(this.f180940a) * 31, 31), 31);
    }
}
