package ar9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f8568c;
    public final p d;
    public final long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8570h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f8571j;
    public final boolean k;

    public o(String id10, String groupId, q type, p state, long j2, String currencyCode, long j3, String displayCurrencyCode, String payerId, String payeeId, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(displayCurrencyCode, "displayCurrencyCode");
        Intrinsics.checkNotNullParameter(payerId, "payerId");
        Intrinsics.checkNotNullParameter(payeeId, "payeeId");
        this.f8566a = id10;
        this.f8567b = groupId;
        this.f8568c = type;
        this.d = state;
        this.e = j2;
        this.f = currencyCode;
        this.f8569g = j3;
        this.f8570h = displayCurrencyCode;
        this.i = payerId;
        this.f8571j = payeeId;
        this.k = z;
    }

    public final long a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    public final long c() {
        return this.f8569g;
    }

    public final String d() {
        return this.f8570h;
    }

    public final String e() {
        return this.f8567b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f8566a, oVar.f8566a) && Intrinsics.f(this.f8567b, oVar.f8567b) && this.f8568c == oVar.f8568c && this.d == oVar.d && this.e == oVar.e && Intrinsics.f(this.f, oVar.f) && this.f8569g == oVar.f8569g && Intrinsics.f(this.f8570h, oVar.f8570h) && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f8571j, oVar.f8571j) && this.k == oVar.k;
    }

    public final String f() {
        return this.f8566a;
    }

    public final String g() {
        return this.f8571j;
    }

    public final String h() {
        return this.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + p.a.c(p.a.c(p.a.c(a0.d.c(p.a.c(a0.d.c((this.d.hashCode() + ((this.f8568c.hashCode() + p.a.c(this.f8566a.hashCode() * 31, 31, this.f8567b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.f8569g), 31, this.f8570h), 31, this.i), 31, this.f8571j);
    }

    public final p i() {
        return this.d;
    }

    public final boolean j() {
        return this.k;
    }

    public final q k() {
        return this.f8568c;
    }
}
