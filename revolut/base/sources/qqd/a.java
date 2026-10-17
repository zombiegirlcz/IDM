package qqd;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f248519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f248520b;

    public a(d limit, d allocated) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(allocated, "allocated");
        this.f248519a = limit;
        this.f248520b = allocated;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f248519a, aVar.f248519a) && Intrinsics.f(this.f248520b, aVar.f248520b);
    }

    public final int hashCode() {
        return this.f248520b.hashCode() + (this.f248519a.hashCode() * 31);
    }
}
