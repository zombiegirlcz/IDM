package pcl;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0007\u001a\u0004\b!\u0010\t¨\u0006#"}, d2 = {"Lpcl/q;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/Instant;", "a", "Ljava/time/Instant;", "f", "()Ljava/time/Instant;", "launchDate", "Lpcl/z;", "b", "Lpcl/z;", "h", "()Lpcl/z;", "priceRange", "c", "Ljava/lang/String;", "companyDescription", "d", "filingDate", "e", "i", "priceRangeIssueDate", "finalPriceDate", "Ljo3/b;", "g", "Ljo3/b;", "()Ljo3/b;", "fundraisingTotal", "officialValuation", "cancellationDeadline", "j", "requestStartDate", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("launchDate")
    private final Instant launchDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("priceRange")
    @NotNull
    private final z priceRange;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("companyDescription")
    @NotNull
    private final String companyDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("filingDate")
    private final Instant filingDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("priceRangeIssueDate")
    @NotNull
    private final Instant priceRangeIssueDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("finalPriceDate")
    private final Instant finalPriceDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundraisingTotal")
    private final jo3.b fundraisingTotal;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("officialValuation")
    private final jo3.b officialValuation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("cancellationDeadline")
    private final Instant cancellationDeadline;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("requestStartDate")
    private final Instant requestStartDate;

    public q(Instant instant, z priceRange, String companyDescription, Instant instant2, Instant priceRangeIssueDate, Instant instant3, jo3.b bVar, jo3.b bVar2, Instant instant4, Instant instant5) {
        Intrinsics.checkNotNullParameter(priceRange, "priceRange");
        Intrinsics.checkNotNullParameter(companyDescription, "companyDescription");
        Intrinsics.checkNotNullParameter(priceRangeIssueDate, "priceRangeIssueDate");
        this.launchDate = instant;
        this.priceRange = priceRange;
        this.companyDescription = companyDescription;
        this.filingDate = instant2;
        this.priceRangeIssueDate = priceRangeIssueDate;
        this.finalPriceDate = instant3;
        this.fundraisingTotal = bVar;
        this.officialValuation = bVar2;
        this.cancellationDeadline = instant4;
        this.requestStartDate = instant5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Instant getCancellationDeadline() {
        return this.cancellationDeadline;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCompanyDescription() {
        return this.companyDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Instant getFilingDate() {
        return this.filingDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Instant getFinalPriceDate() {
        return this.finalPriceDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getFundraisingTotal() {
        return this.fundraisingTotal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.launchDate, qVar.launchDate) && Intrinsics.f(this.priceRange, qVar.priceRange) && Intrinsics.f(this.companyDescription, qVar.companyDescription) && Intrinsics.f(this.filingDate, qVar.filingDate) && Intrinsics.f(this.priceRangeIssueDate, qVar.priceRangeIssueDate) && Intrinsics.f(this.finalPriceDate, qVar.finalPriceDate) && Intrinsics.f(this.fundraisingTotal, qVar.fundraisingTotal) && Intrinsics.f(this.officialValuation, qVar.officialValuation) && Intrinsics.f(this.cancellationDeadline, qVar.cancellationDeadline) && Intrinsics.f(this.requestStartDate, qVar.requestStartDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Instant getLaunchDate() {
        return this.launchDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.b getOfficialValuation() {
        return this.officialValuation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final z getPriceRange() {
        return this.priceRange;
    }

    public final int hashCode() {
        Instant instant = this.launchDate;
        int iC = p.a.c((this.priceRange.hashCode() + ((instant == null ? 0 : instant.hashCode()) * 31)) * 31, 31, this.companyDescription);
        Instant instant2 = this.filingDate;
        int iC2 = r6.b.c((iC + (instant2 == null ? 0 : instant2.hashCode())) * 31, 31, this.priceRangeIssueDate);
        Instant instant3 = this.finalPriceDate;
        int iHashCode = (iC2 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
        jo3.b bVar = this.fundraisingTotal;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.officialValuation;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Instant instant4 = this.cancellationDeadline;
        int iHashCode4 = (iHashCode3 + (instant4 == null ? 0 : instant4.hashCode())) * 31;
        Instant instant5 = this.requestStartDate;
        return iHashCode4 + (instant5 != null ? instant5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Instant getPriceRangeIssueDate() {
        return this.priceRangeIssueDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Instant getRequestStartDate() {
        return this.requestStartDate;
    }
}
