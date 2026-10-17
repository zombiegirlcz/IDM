package ix7;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR \u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b\u000f\u0010#R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010+\u001a\b\u0012\u0004\u0012\u00020)0 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b\f\u0010#R \u0010-\u001a\b\u0012\u0004\u0012\u00020,0 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b*\u0010#R\u001c\u00101\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010/\u001a\u0004\b'\u00100¨\u00062"}, d2 = {"Lix7/x;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "l", "policyNumber", "c", "k", "planName", "d", "j", "planDisplayName", "e", "o", "startDate", "endDate", "g", "coverageAmount", "h", "paymentAmount", "i", "paymentFrequency", "Lix7/k;", "Lix7/k;", "()Lix7/k;", "insurer", "", "Lix7/h;", "Ljava/util/List;", "()Ljava/util/List;", "documents", "p", "status", "m", "cancellationReason", "Lix7/w;", "n", "coverages", "Lix7/z;", "restrictions", "Lix7/f0;", "Lix7/f0;", "()Lix7/f0;", "renewalDetails", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("policyNumber")
    @NotNull
    private final String policyNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("planName")
    @NotNull
    private final String planName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("planDisplayName")
    @NotNull
    private final String planDisplayName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("startDate")
    @NotNull
    private final String startDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("endDate")
    @NotNull
    private final String endDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageAmount")
    @NotNull
    private final String coverageAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentAmount")
    @NotNull
    private final String paymentAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("paymentFrequency")
    @NotNull
    private final String paymentFrequency;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("insurer")
    @NotNull
    private final k insurer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<h> documents;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationReason")
    private final String cancellationReason;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverages")
    @NotNull
    private final List<w> coverages;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("restrictions")
    @NotNull
    private final List<z> restrictions;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("renewalDetails")
    private final f0 renewalDetails;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCancellationReason() {
        return this.cancellationReason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCoverageAmount() {
        return this.coverageAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getCoverages() {
        return this.coverages;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.id, xVar.id) && Intrinsics.f(this.policyNumber, xVar.policyNumber) && Intrinsics.f(this.planName, xVar.planName) && Intrinsics.f(this.planDisplayName, xVar.planDisplayName) && Intrinsics.f(this.startDate, xVar.startDate) && Intrinsics.f(this.endDate, xVar.endDate) && Intrinsics.f(this.coverageAmount, xVar.coverageAmount) && Intrinsics.f(this.paymentAmount, xVar.paymentAmount) && Intrinsics.f(this.paymentFrequency, xVar.paymentFrequency) && Intrinsics.f(this.insurer, xVar.insurer) && Intrinsics.f(this.documents, xVar.documents) && Intrinsics.f(this.status, xVar.status) && Intrinsics.f(this.cancellationReason, xVar.cancellationReason) && Intrinsics.f(this.coverages, xVar.coverages) && Intrinsics.f(this.restrictions, xVar.restrictions) && Intrinsics.f(this.renewalDetails, xVar.renewalDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final k getInsurer() {
        return this.insurer;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d((this.insurer.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.policyNumber), 31, this.planName), 31, this.planDisplayName), 31, this.startDate), 31, this.endDate), 31, this.coverageAmount), 31, this.paymentAmount), 31, this.paymentFrequency)) * 31, 31, this.documents), 31, this.status);
        String str = this.cancellationReason;
        int iD = p.a.d(p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.coverages), 31, this.restrictions);
        f0 f0Var = this.renewalDetails;
        return iD + (f0Var != null ? f0Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPaymentFrequency() {
        return this.paymentFrequency;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPlanDisplayName() {
        return this.planDisplayName;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPlanName() {
        return this.planName;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPolicyNumber() {
        return this.policyNumber;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final f0 getRenewalDetails() {
        return this.renewalDetails;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final List getRestrictions() {
        return this.restrictions;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getStatus() {
        return this.status;
    }
}
