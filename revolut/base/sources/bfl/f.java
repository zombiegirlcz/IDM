package bfl;

import h30.l;
import ip0.v7;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f15030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f15031c;
    public final String d;
    public final String e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f15033h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f15034j;
    public final g k;

    public f(String id10, ZonedDateTime completedDate, ZonedDateTime updatedDate, String symbol, String ref2, dj0.d amount, float f, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, g side) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f15029a = id10;
        this.f15030b = completedDate;
        this.f15031c = updatedDate;
        this.d = symbol;
        this.e = ref2;
        this.f = amount;
        this.f15032g = f;
        this.f15033h = dVar;
        this.i = dVar2;
        this.f15034j = dVar3;
        this.k = side;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f15029a, fVar.f15029a) && Intrinsics.f(this.f15030b, fVar.f15030b) && Intrinsics.f(this.f15031c, fVar.f15031c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Float.compare(this.f15032g, fVar.f15032g) == 0 && Intrinsics.f(this.f15033h, fVar.f15033h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f15034j, fVar.f15034j) && this.k == fVar.k;
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f15032g, v7.c(p.a.c(p.a.c(l.h(this.f15031c, l.h(this.f15030b, this.f15029a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31);
        dj0.d dVar = this.f15033h;
        int iHashCode = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.i;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f15034j;
        return this.k.hashCode() + ((iHashCode2 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31);
    }
}
