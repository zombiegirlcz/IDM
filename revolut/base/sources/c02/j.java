package c02;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f20116c;
    public final dj0.d d;
    public final b e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20118h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f20119j;

    public j(String id10, e paymentType, dj0.d amount, dj0.d dVar, b merchant, String str, long j2, long j3, long j5, String origin) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f20114a = id10;
        this.f20115b = paymentType;
        this.f20116c = amount;
        this.d = dVar;
        this.e = merchant;
        this.f = str;
        this.f20117g = j2;
        this.f20118h = j3;
        this.i = j5;
        this.f20119j = origin;
    }

    public final String a() {
        return this.f20114a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f20114a, jVar.f20114a) && this.f20115b == jVar.f20115b && Intrinsics.f(this.f20116c, jVar.f20116c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && this.f20117g == jVar.f20117g && this.f20118h == jVar.f20118h && this.i == jVar.i && Intrinsics.f(this.f20119j, jVar.f20119j);
    }

    public final int hashCode() {
        int iC = v7.c((this.f20115b.hashCode() + (this.f20114a.hashCode() * 31)) * 31, 31, this.f20116c);
        dj0.d dVar = this.d;
        int iHashCode = (this.e.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        String str = this.f;
        return this.f20119j.hashCode() + a0.d.c(a0.d.c(a0.d.c((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f20117g), 31, this.f20118h), 31, this.i);
    }
}
