package ef2;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lef2/d;", "", "", "toString", "()Ljava/lang/String;", "Lef2/b;", "a", "Lef2/b;", "getSource", "()Lef2/b;", "source", "Lef2/a;", "b", "Lef2/a;", "getDestination", "()Lef2/a;", "destination", "Ljo3/a;", "c", "Ljo3/a;", "getPaymentAmount", "()Ljo3/a;", "paymentAmount", "d", "Ljava/lang/String;", "getDescription", "description", "e", "getScheduledDate", "scheduledDate", "Lef2/i;", "f", "Lef2/i;", "getPeriod", "()Lef2/i;", "period", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final b source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("destination")
    @NotNull
    private final a destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentAmount")
    @NotNull
    private final jo3.a paymentAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("scheduledDate")
    private final String scheduledDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("period")
    private final i period;

    public d(b source, a destination, jo3.a paymentAmount, String description, String str, i iVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        Intrinsics.checkNotNullParameter(description, "description");
        this.source = source;
        this.destination = destination;
        this.paymentAmount = paymentAmount;
        this.description = description;
        this.scheduledDate = str;
        this.period = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.source, dVar.source) && Intrinsics.f(this.destination, dVar.destination) && Intrinsics.f(this.paymentAmount, dVar.paymentAmount) && Intrinsics.f(this.description, dVar.description) && Intrinsics.f(this.scheduledDate, dVar.scheduledDate) && this.period == dVar.period;
    }

    public final int hashCode() {
        int iC = p.a.c(v7.j(this.paymentAmount, (this.destination.hashCode() + (this.source.hashCode() * 31)) * 31, 31), 31, this.description);
        String str = this.scheduledDate;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.period;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }
}
