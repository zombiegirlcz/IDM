package hcl;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0010\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lhcl/e;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "b", "()Ljava/time/LocalDate;", "issueDate", "Ljo3/b;", "Ljo3/b;", "c", "()Ljo3/b;", "issuePrice", "d", "maturityDate", "faceValue", "e", "outstandingVolume", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("issue_date")
    private final LocalDate issueDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("issue_price")
    private final jo3.b issuePrice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("maturity_date")
    private final LocalDate maturityDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("face_value")
    private final jo3.b faceValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("outstanding_volume")
    private final jo3.b outstandingVolume;

    public e(LocalDate localDate, jo3.b bVar, LocalDate localDate2, jo3.b bVar2, jo3.b bVar3) {
        this.issueDate = localDate;
        this.issuePrice = bVar;
        this.maturityDate = localDate2;
        this.faceValue = bVar2;
        this.outstandingVolume = bVar3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getFaceValue() {
        return this.faceValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getIssuePrice() {
        return this.issuePrice;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getMaturityDate() {
        return this.maturityDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getOutstandingVolume() {
        return this.outstandingVolume;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.issueDate, eVar.issueDate) && Intrinsics.f(this.issuePrice, eVar.issuePrice) && Intrinsics.f(this.maturityDate, eVar.maturityDate) && Intrinsics.f(this.faceValue, eVar.faceValue) && Intrinsics.f(this.outstandingVolume, eVar.outstandingVolume);
    }

    public final int hashCode() {
        LocalDate localDate = this.issueDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        jo3.b bVar = this.issuePrice;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        LocalDate localDate2 = this.maturityDate;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        jo3.b bVar2 = this.faceValue;
        int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.outstandingVolume;
        return iHashCode4 + (bVar3 != null ? bVar3.hashCode() : 0);
    }
}
