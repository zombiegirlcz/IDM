package bfl;

import h30.l;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f15017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f15018c;
    public final dj0.d d;

    public b(String id10, ZonedDateTime completedDate, ZonedDateTime updatedDate, dj0.d fees) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f15016a = id10;
        this.f15017b = completedDate;
        this.f15018c = updatedDate;
        this.d = fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f15016a, bVar.f15016a) && Intrinsics.f(this.f15017b, bVar.f15017b) && Intrinsics.f(this.f15018c, bVar.f15018c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + l.h(this.f15018c, l.h(this.f15017b, this.f15016a.hashCode() * 31, 31), 31);
    }
}
