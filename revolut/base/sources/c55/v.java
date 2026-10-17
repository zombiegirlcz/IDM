package c55;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f21460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f21461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f21462c;
    public final LocalDate d;
    public final b95.a e;
    public final dj0.d f;

    public v(dj0.d amountRepaid, dj0.d current, dj0.d dVar, LocalDate date, b95.a product) {
        Intrinsics.checkNotNullParameter(amountRepaid, "amountRepaid");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(dVar, "new");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f21460a = amountRepaid;
        this.f21461b = current;
        this.f21462c = dVar;
        this.d = date;
        this.e = product;
        this.f = pyd.c.H(current, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f21460a, vVar.f21460a) && Intrinsics.f(this.f21461b, vVar.f21461b) && Intrinsics.f(this.f21462c, vVar.f21462c) && Intrinsics.f(this.d, vVar.d) && this.e == vVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + wp5.y.a(v7.c(v7.c(this.f21460a.hashCode() * 31, 31, this.f21461b), 31, this.f21462c), 31, this.d);
    }
}
