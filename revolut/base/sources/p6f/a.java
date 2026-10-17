package p6f;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f233255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f233256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f233257c;
    public final BigDecimal d;

    public a(long j2, BigDecimal percentage, BigDecimal percentageDiff, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(percentageDiff, "percentageDiff");
        this.f233255a = j2;
        this.f233256b = percentage;
        this.f233257c = percentageDiff;
        this.d = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f233255a == aVar.f233255a && Intrinsics.f(this.f233256b, aVar.f233256b) && Intrinsics.f(this.f233257c, aVar.f233257c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f233257c, t61.a.d(this.f233256b, Long.hashCode(this.f233255a) * 31, 31), 31);
        BigDecimal bigDecimal = this.d;
        return iD + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
