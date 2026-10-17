package c55;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f21463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f21464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f21465c;
    public final b95.a d;
    public final dj0.d e;

    public w(b95.a product, dj0.d current, dj0.d dVar, LocalDate date) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(dVar, "new");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f21463a = current;
        this.f21464b = dVar;
        this.f21465c = date;
        this.d = product;
        this.e = pyd.c.H(dVar, current);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f21463a, wVar.f21463a) && Intrinsics.f(this.f21464b, wVar.f21464b) && Intrinsics.f(this.f21465c, wVar.f21465c) && this.d == wVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + wp5.y.a(v7.c(this.f21463a.hashCode() * 31, 31, this.f21464b), 31, this.f21465c);
    }
}
