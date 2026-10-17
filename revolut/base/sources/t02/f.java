package t02;

import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentSource f266856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmTransferDestination f266857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f266858c;
    public final String d;
    public final LocalDate e;
    public final jli.c f;

    public f(ApmPaymentSource source, ApmTransferDestination destination, dj0.d paymentAmount, String description, LocalDate localDate, jli.c cVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f266856a = source;
        this.f266857b = destination;
        this.f266858c = paymentAmount;
        this.d = description;
        this.e = localDate;
        this.f = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f266856a, fVar.f266856a) && Intrinsics.f(this.f266857b, fVar.f266857b) && Intrinsics.f(this.f266858c, fVar.f266858c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f;
    }

    public final int hashCode() {
        int iC = p.a.c(v7.c((this.f266857b.hashCode() + (this.f266856a.hashCode() * 31)) * 31, 31, this.f266858c), 31, this.d);
        LocalDate localDate = this.e;
        int iHashCode = (iC + (localDate == null ? 0 : localDate.hashCode())) * 31;
        jli.c cVar = this.f;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
