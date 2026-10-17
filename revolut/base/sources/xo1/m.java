package xo1;

import ip0.v7;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f307579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f307580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f307581c;
    public final String d;
    public final LocalDate e;

    public m(g paymentMethod, List inputs, dj0.d amount, String str, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f307579a = paymentMethod;
        this.f307580b = inputs;
        this.f307581c = amount;
        this.d = str;
        this.e = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f307579a == mVar.f307579a && Intrinsics.f(this.f307580b, mVar.f307580b) && Intrinsics.f(this.f307581c, mVar.f307581c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.d(this.f307579a.hashCode() * 31, 31, this.f307580b), 31, this.f307581c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.e;
        return iHashCode + (localDate != null ? localDate.hashCode() : 0);
    }
}
