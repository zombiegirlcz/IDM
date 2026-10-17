package pz0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240861c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public a(int i, String id10, String label, String language, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(language, "language");
        this.f240859a = id10;
        this.f240860b = label;
        this.f240861c = language;
        this.d = i;
        this.e = z;
        this.f = z3;
    }

    public final int a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f240859a, aVar.f240859a) && Intrinsics.f(this.f240860b, aVar.f240860b) && Intrinsics.f(this.f240861c, aVar.f240861c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.b(this.d, p.a.c(p.a.c(this.f240859a.hashCode() * 31, 31, this.f240860b), 31, this.f240861c), 31), 31, this.e);
    }
}
