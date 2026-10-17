package lzi;

import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f200995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f200996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f200997c;
    public final dj0.d d;
    public final ArrayList e;

    public p(LocalDate effectiveFrom, LocalDate localDate, h cycle, dj0.d total, ArrayList categories) {
        Intrinsics.checkNotNullParameter(effectiveFrom, "effectiveFrom");
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f200995a = effectiveFrom;
        this.f200996b = localDate;
        this.f200997c = cycle;
        this.d = total;
        this.e = categories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f200995a, pVar.f200995a) && Intrinsics.f(this.f200996b, pVar.f200996b) && this.f200997c.equals(pVar.f200997c) && this.d.equals(pVar.d) && this.e.equals(pVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f200995a.hashCode() * 31;
        LocalDate localDate = this.f200996b;
        return this.e.hashCode() + v7.c((this.f200997c.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31)) * 31, 31, this.d);
    }
}
