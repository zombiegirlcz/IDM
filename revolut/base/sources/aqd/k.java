package aqd;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorterDestinationId f8356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yqi.b f8357b;

    public k(IncomeSorterDestinationId destinationId, yqi.b error) {
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8356a = destinationId;
        this.f8357b = error;
    }

    @Override // aqd.l
    public final IncomeSorterDestinationId a() {
        return this.f8356a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f8356a, kVar.f8356a) && Intrinsics.f(this.f8357b, kVar.f8357b);
    }

    public final int hashCode() {
        return this.f8357b.hashCode() + (this.f8356a.hashCode() * 31);
    }
}
