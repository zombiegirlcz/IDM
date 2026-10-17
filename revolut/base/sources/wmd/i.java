package wmd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f298651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f298652b;

    public i(dj0.d total, ArrayList remainingRecurringPayments) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(remainingRecurringPayments, "remainingRecurringPayments");
        this.f298651a = total;
        this.f298652b = remainingRecurringPayments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f298651a.equals(iVar.f298651a) && this.f298652b.equals(iVar.f298652b);
    }

    public final int hashCode() {
        return this.f298652b.hashCode() + (this.f298651a.hashCode() * 31);
    }
}
