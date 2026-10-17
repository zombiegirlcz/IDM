package aqd;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorterDestinationId f8352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yqi.b f8353b;

    public j(IncomeSorterDestinationId destinationId, yqi.b error) {
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8352a = destinationId;
        this.f8353b = error;
    }

    @Override // aqd.l
    public final IncomeSorterDestinationId a() {
        return this.f8352a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f8352a, jVar.f8352a) && Intrinsics.f(this.f8353b, jVar.f8353b);
    }

    public final int hashCode() {
        return this.f8353b.hashCode() + (this.f8352a.hashCode() * 31);
    }
}
