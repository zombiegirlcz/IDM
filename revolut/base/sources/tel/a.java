package tel;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f270113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f270114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f270115c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f270116g;

    public a(LocalDate date, dj0.d investment, dj0.d minus2Std, dj0.d minus1Std, dj0.d mean, dj0.d plus1Std, dj0.d plus2Std) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(investment, "investment");
        Intrinsics.checkNotNullParameter(minus2Std, "minus2Std");
        Intrinsics.checkNotNullParameter(minus1Std, "minus1Std");
        Intrinsics.checkNotNullParameter(mean, "mean");
        Intrinsics.checkNotNullParameter(plus1Std, "plus1Std");
        Intrinsics.checkNotNullParameter(plus2Std, "plus2Std");
        this.f270113a = date;
        this.f270114b = investment;
        this.f270115c = minus2Std;
        this.d = minus1Std;
        this.e = mean;
        this.f = plus1Std;
        this.f270116g = plus2Std;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f270113a, aVar.f270113a) && Intrinsics.f(this.f270114b, aVar.f270114b) && Intrinsics.f(this.f270115c, aVar.f270115c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f270116g, aVar.f270116g);
    }

    public final int hashCode() {
        return this.f270116g.hashCode() + v7.c(v7.c(v7.c(v7.c(v7.c(this.f270113a.hashCode() * 31, 31, this.f270114b), 31, this.f270115c), 31, this.d), 31, this.e), 31, this.f);
    }
}
