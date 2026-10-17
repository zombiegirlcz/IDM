package n2c;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.SpareChangeRefundQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f211514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpareChangeRefundQuote f211515b;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f211514a, bVar.f211514a) && Intrinsics.f(this.f211515b, bVar.f211515b);
    }

    public final int hashCode() {
        int iHashCode = this.f211514a.hashCode() * 31;
        SpareChangeRefundQuote spareChangeRefundQuote = this.f211515b;
        return iHashCode + (spareChangeRefundQuote == null ? 0 : spareChangeRefundQuote.hashCode());
    }

    public b(Data spareChangeRefund, SpareChangeRefundQuote spareChangeRefundQuote) {
        Intrinsics.checkNotNullParameter(spareChangeRefund, "spareChangeRefund");
        this.f211514a = spareChangeRefund;
        this.f211515b = spareChangeRefundQuote;
    }

    public /* synthetic */ b(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}
