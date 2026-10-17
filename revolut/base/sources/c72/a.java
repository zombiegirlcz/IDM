package c72;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f21831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21832c;
    public final String d;
    public final String e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f21833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f21834h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f21835j;

    public a(String id10, c state, String code, String ownerId, String revolutCardId, jo3.b amount, long j2, long j3, long j5, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(revolutCardId, "revolutCardId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f21830a = id10;
        this.f21831b = state;
        this.f21832c = code;
        this.d = ownerId;
        this.e = revolutCardId;
        this.f = amount;
        this.f21833g = j2;
        this.f21834h = j3;
        this.i = j5;
        this.f21835j = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f21830a, aVar.f21830a) && this.f21831b == aVar.f21831b && Intrinsics.f(this.f21832c, aVar.f21832c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f21833g == aVar.f21833g && this.f21834h == aVar.f21834h && this.i == aVar.i && Intrinsics.f(this.f21835j, aVar.f21835j);
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(a0.d.c(y.e(this.f, p.a.c(p.a.c(p.a.c((this.f21831b.hashCode() + (this.f21830a.hashCode() * 31)) * 31, 31, this.f21832c), 31, this.d), 31, this.e), 31), 31, this.f21833g), 31, this.f21834h), 31, this.i);
        String str = this.f21835j;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
