package ks6;

import ip0.v7;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f189238c;
    public final LocalDateTime d;
    public final LocalDateTime e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f189239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f189240h;
    public final jo3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f189241j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f189242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f189243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f189244n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f189245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f189246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f189247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f189248s;

    public q(String id10, String state, LocalDateTime createdAt, LocalDateTime localDateTime, LocalDateTime localDateTime2, jo3.b amount, jo3.b tipAmount, jo3.b bVar, jo3.b bVar2, String type, String paymentMethod, n nVar, String str, List list, List list2, o oVar, String str2, l lVar, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(tipAmount, "tipAmount");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f189236a = id10;
        this.f189237b = state;
        this.f189238c = createdAt;
        this.d = localDateTime;
        this.e = localDateTime2;
        this.f = amount;
        this.f189239g = tipAmount;
        this.f189240h = bVar;
        this.i = bVar2;
        this.f189241j = type;
        this.k = paymentMethod;
        this.f189242l = nVar;
        this.f189243m = str;
        this.f189244n = list;
        this.o = list2;
        this.f189245p = oVar;
        this.f189246q = str2;
        this.f189247r = lVar;
        this.f189248s = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f189236a, qVar.f189236a) && Intrinsics.f(this.f189237b, qVar.f189237b) && Intrinsics.f(this.f189238c, qVar.f189238c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f189239g, qVar.f189239g) && Intrinsics.f(this.f189240h, qVar.f189240h) && Intrinsics.f(this.i, qVar.i) && Intrinsics.f(this.f189241j, qVar.f189241j) && Intrinsics.f(this.k, qVar.k) && Intrinsics.f(this.f189242l, qVar.f189242l) && Intrinsics.f(this.f189243m, qVar.f189243m) && Intrinsics.f(this.f189244n, qVar.f189244n) && Intrinsics.f(this.o, qVar.o) && Intrinsics.f(this.f189245p, qVar.f189245p) && Intrinsics.f(this.f189246q, qVar.f189246q) && Intrinsics.f(this.f189247r, qVar.f189247r) && Intrinsics.f(this.f189248s, qVar.f189248s);
    }

    public final int hashCode() {
        int i = v7.i(this.f189238c, p.a.c(this.f189236a.hashCode() * 31, 31, this.f189237b), 31);
        LocalDateTime localDateTime = this.d;
        int iHashCode = (i + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.e;
        int iE = wp5.y.e(this.f189239g, wp5.y.e(this.f, (iHashCode + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31, 31), 31);
        jo3.b bVar = this.f189240h;
        int iHashCode2 = (iE + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.i;
        int iC = p.a.c(p.a.c((iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31, this.f189241j), 31, this.k);
        n nVar = this.f189242l;
        int iHashCode3 = (iC + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str = this.f189243m;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f189244n;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.o;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        o oVar = this.f189245p;
        int iHashCode7 = (iHashCode6 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str2 = this.f189246q;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        l lVar = this.f189247r;
        int iHashCode9 = (iHashCode8 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str3 = this.f189248s;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }
}
