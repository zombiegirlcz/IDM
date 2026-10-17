package bfl;

import h30.l;
import ip0.v7;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f15014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f15015c;
    public final dj0.d d;
    public final g e;

    public a(String id10, ZonedDateTime completedDate, ZonedDateTime updatedDate, dj0.d amount, g side) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f15013a = id10;
        this.f15014b = completedDate;
        this.f15015c = updatedDate;
        this.d = amount;
        this.e = side;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f15013a, aVar.f15013a) && Intrinsics.f(this.f15014b, aVar.f15014b) && Intrinsics.f(this.f15015c, aVar.f15015c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(l.h(this.f15015c, l.h(this.f15014b, this.f15013a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
