package ehl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f126288c;
    public final LocalDate d;
    public final int e;
    public final int f;

    public t(String symbol, String ref2, LocalDate localDate, LocalDate paymentDate, int i, int i2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        this.f126286a = symbol;
        this.f126287b = ref2;
        this.f126288c = localDate;
        this.d = paymentDate;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f126286a, tVar.f126286a) && Intrinsics.f(this.f126287b, tVar.f126287b) && Intrinsics.f(this.f126288c, tVar.f126288c) && Intrinsics.f(this.d, tVar.d) && this.e == tVar.e && this.f == tVar.f;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f126286a.hashCode() * 31, 31, this.f126287b);
        LocalDate localDate = this.f126288c;
        return Integer.hashCode(this.f) + j6.a.b(this.e, y.a((iC + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.d), 31);
    }
}
