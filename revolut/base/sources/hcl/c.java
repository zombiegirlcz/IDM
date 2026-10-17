package hcl;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0016"}, d2 = {"Lhcl/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "callable", "Ljava/time/LocalDate;", "b", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "nextCallDate", "Ljo3/b;", "Ljo3/b;", "d", "()Ljo3/b;", "nextCallPrice", "confirmedCallDate", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("callable")
    private final boolean callable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextCallDate")
    private final LocalDate nextCallDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextCallPrice")
    private final jo3.b nextCallPrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("confirmedCallDate")
    private final LocalDate confirmedCallDate;

    public c(boolean z, LocalDate localDate, jo3.b bVar, LocalDate localDate2) {
        this.callable = z;
        this.nextCallDate = localDate;
        this.nextCallPrice = bVar;
        this.confirmedCallDate = localDate2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCallable() {
        return this.callable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getConfirmedCallDate() {
        return this.confirmedCallDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getNextCallDate() {
        return this.nextCallDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getNextCallPrice() {
        return this.nextCallPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.callable == cVar.callable && Intrinsics.f(this.nextCallDate, cVar.nextCallDate) && Intrinsics.f(this.nextCallPrice, cVar.nextCallPrice) && Intrinsics.f(this.confirmedCallDate, cVar.confirmedCallDate);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.callable) * 31;
        LocalDate localDate = this.nextCallDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        jo3.b bVar = this.nextCallPrice;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        LocalDate localDate2 = this.confirmedCallDate;
        return iHashCode3 + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
