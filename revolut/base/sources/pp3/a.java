package pp3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f238251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f238252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f238253c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public a(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f238251a = z;
        this.f238252b = z3;
        this.f238253c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f238251a == aVar.f238251a && this.f238252b == aVar.f238252b && this.f238253c == aVar.f238253c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f238251a) * 31, 31, this.f238252b), 31, this.f238253c), 31, this.d), 31, this.e);
    }
}
