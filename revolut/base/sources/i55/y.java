package i55;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Li55/y;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "borrowed", "available", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "fundsExpirationDate", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("borrowed")
    private final long borrowed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("available")
    private final long available;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundsExpirationDate")
    @NotNull
    private final LocalDate fundsExpirationDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBorrowed() {
        return this.borrowed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getFundsExpirationDate() {
        return this.fundsExpirationDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.borrowed == yVar.borrowed && this.available == yVar.available && Intrinsics.f(this.fundsExpirationDate, yVar.fundsExpirationDate);
    }

    public final int hashCode() {
        return this.fundsExpirationDate.hashCode() + a0.d.c(Long.hashCode(this.borrowed) * 31, 31, this.available);
    }
}
