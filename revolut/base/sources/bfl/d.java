package bfl;

import h30.l;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f15023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f15024c;
    public final String d;
    public final String e;
    public final dj0.d f;

    public d(String id10, ZonedDateTime completedDate, ZonedDateTime updatedDate, String symbol, String ref2, dj0.d fees) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f15022a = id10;
        this.f15023b = completedDate;
        this.f15024c = updatedDate;
        this.d = symbol;
        this.e = ref2;
        this.f = fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f15022a, dVar.f15022a) && Intrinsics.f(this.f15023b, dVar.f15023b) && Intrinsics.f(this.f15024c, dVar.f15024c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(l.h(this.f15024c, l.h(this.f15023b, this.f15022a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }
}
