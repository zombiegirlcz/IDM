package qu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f249199c;
    public final boolean d;

    public c(String id10, String str, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f249197a = id10;
        this.f249198b = str;
        this.f249199c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f249197a, cVar.f249197a) && Intrinsics.f(this.f249198b, cVar.f249198b) && this.f249199c == cVar.f249199c && this.d == cVar.d;
    }

    @Override // qu3.d
    public final boolean f0() {
        return this.d;
    }

    @Override // qu3.d
    public final String getId() {
        return this.f249197a;
    }

    @Override // qu3.d
    public final Object getValue() {
        return this.f249198b;
    }

    public final int hashCode() {
        int iHashCode = this.f249197a.hashCode() * 31;
        String str = this.f249198b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f249199c);
    }

    @Override // qu3.d
    public final boolean k0() {
        return this.f249199c;
    }
}
