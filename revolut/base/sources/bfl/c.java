package bfl;

import h30.l;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f15020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f15021c;
    public final String d;
    public final String e;
    public final dj0.d f;

    public c(String id10, ZonedDateTime completedDate, ZonedDateTime updatedDate, String symbol, String ref2, dj0.d amount) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f15019a = id10;
        this.f15020b = completedDate;
        this.f15021c = updatedDate;
        this.d = symbol;
        this.e = ref2;
        this.f = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f15019a, cVar.f15019a) && Intrinsics.f(this.f15020b, cVar.f15020b) && Intrinsics.f(this.f15021c, cVar.f15021c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(l.h(this.f15021c, l.h(this.f15020b, this.f15019a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }
}
