package ql4;

import ip0.v7;
import java.io.Serializable;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f247176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f247177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f247178c;
    public final LocalDate d;
    public final Integer e;

    public r(dj0.d instalment, dj0.d lastInstalment, LocalDate firstPaymentDate, LocalDate lastPaymentDate, Integer num) {
        Intrinsics.checkNotNullParameter(instalment, "instalment");
        Intrinsics.checkNotNullParameter(lastInstalment, "lastInstalment");
        Intrinsics.checkNotNullParameter(firstPaymentDate, "firstPaymentDate");
        Intrinsics.checkNotNullParameter(lastPaymentDate, "lastPaymentDate");
        this.f247176a = instalment;
        this.f247177b = lastInstalment;
        this.f247178c = firstPaymentDate;
        this.d = lastPaymentDate;
        this.e = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f247176a, rVar.f247176a) && Intrinsics.f(this.f247177b, rVar.f247177b) && Intrinsics.f(this.f247178c, rVar.f247178c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e);
    }

    public final int hashCode() {
        int iA = wp5.y.a(wp5.y.a(v7.c(this.f247176a.hashCode() * 31, 31, this.f247177b), 31, this.f247178c), 31, this.d);
        Integer num = this.e;
        return iA + (num == null ? 0 : num.hashCode());
    }
}
