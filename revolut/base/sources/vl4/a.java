package vl4;

import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f290242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f290243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f290244c;
    public final ZonedDateTime d;
    public final List e;

    public a(ZonedDateTime createdDateFrom, ZonedDateTime createdDateTo, ZonedDateTime completedDateFrom, ZonedDateTime completedDateTo, List excludeIds) {
        Intrinsics.checkNotNullParameter(createdDateFrom, "createdDateFrom");
        Intrinsics.checkNotNullParameter(createdDateTo, "createdDateTo");
        Intrinsics.checkNotNullParameter(completedDateFrom, "completedDateFrom");
        Intrinsics.checkNotNullParameter(completedDateTo, "completedDateTo");
        Intrinsics.checkNotNullParameter(excludeIds, "excludeIds");
        this.f290242a = createdDateFrom;
        this.f290243b = createdDateTo;
        this.f290244c = completedDateFrom;
        this.d = completedDateTo;
        this.e = excludeIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f290242a, aVar.f290242a) && Intrinsics.f(this.f290243b, aVar.f290243b) && Intrinsics.f(this.f290244c, aVar.f290244c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h30.l.h(this.d, h30.l.h(this.f290244c, h30.l.h(this.f290243b, this.f290242a.hashCode() * 31, 31), 31), 31);
    }
}
