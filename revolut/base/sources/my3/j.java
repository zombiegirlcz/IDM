package my3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f210323c;
    public final String d;
    public final dj0.d e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xi0.b f210324g;

    public j(String id10, boolean z, boolean z3, String label, dj0.d dVar, String str, xi0.b currency) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f210321a = id10;
        this.f210322b = z;
        this.f210323c = z3;
        this.d = label;
        this.e = dVar;
        this.f = str;
        this.f210324g = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f210321a, jVar.f210321a) && this.f210322b == jVar.f210322b && this.f210323c == jVar.f210323c && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f210324g, jVar.f210324g);
    }

    @Override // my3.o
    public final boolean f0() {
        return this.f210323c;
    }

    @Override // my3.o
    public final String getId() {
        return this.f210321a;
    }

    @Override // my3.o
    public final Object getValue() {
        return this.e;
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(j6.a.c(this.f210321a.hashCode() * 31, 31, this.f210322b), 31, this.f210323c), 31, this.d);
        dj0.d dVar = this.e;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f;
        return this.f210324g.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // my3.o
    public final boolean k0() {
        return this.f210322b;
    }
}
