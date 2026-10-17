package my3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f210336c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f210337g;

    public n(String id10, boolean z, boolean z3, String label, String str, String str2, m picker) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(picker, "picker");
        this.f210334a = id10;
        this.f210335b = z;
        this.f210336c = z3;
        this.d = label;
        this.e = str;
        this.f = str2;
        this.f210337g = picker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f210334a, nVar.f210334a) && this.f210335b == nVar.f210335b && this.f210336c == nVar.f210336c && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f210337g, nVar.f210337g);
    }

    @Override // my3.o
    public final boolean f0() {
        return this.f210336c;
    }

    @Override // my3.o
    public final String getId() {
        return this.f210334a;
    }

    @Override // my3.o
    public final Object getValue() {
        return this.e;
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(j6.a.c(this.f210334a.hashCode() * 31, 31, this.f210335b), 31, this.f210336c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.f210337g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // my3.o
    public final boolean k0() {
        return this.f210335b;
    }
}
