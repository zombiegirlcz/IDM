package gx7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b\u0016\u0010#R \u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u000f\u0010\u001fR\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\f\u0010\u001fR \u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u001c\u00104\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b'\u00103¨\u00065"}, d2 = {"Lgx7/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "l", "policyNumber", "c", "k", "planName", "d", "j", "planDisplayName", "e", "o", "startDate", "endDate", "g", "coverageAmount", "h", "paymentAmount", "i", "paymentFrequency", "", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "options", "Lgx7/i;", "Lgx7/i;", "()Lgx7/i;", "insurer", "Lgx7/h;", "documents", "m", "p", "status", "n", "cancellationReason", "Lgx7/r;", "coverages", "Lgx7/t;", "restrictions", "Lgx7/y;", "q", "Lgx7/y;", "()Lgx7/y;", "renewalDetails", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

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
    @lg.b("options")
    @NotNull
    private final List<Object> options;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("insurer")
    @NotNull
    private final i insurer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<h> documents;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationReason")
    private final String cancellationReason;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("coverages")
    @NotNull
    private final List<r> coverages;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("restrictions")
    @NotNull
    private final List<t> restrictions;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("renewalDetails")
    private final y renewalDetails;

    public s(String id10, String policyNumber, String planName, String planDisplayName, String startDate, String endDate, String coverageAmount, String paymentAmount, String paymentFrequency, f0 options, i insurer, ArrayList documents, String status, String str, ArrayList coverages, ArrayList restrictions, y yVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(policyNumber, "policyNumber");
        Intrinsics.checkNotNullParameter(planName, "planName");
        Intrinsics.checkNotNullParameter(planDisplayName, "planDisplayName");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(coverageAmount, "coverageAmount");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(insurer, "insurer");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(coverages, "coverages");
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.id = id10;
        this.policyNumber = policyNumber;
        this.planName = planName;
        this.planDisplayName = planDisplayName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.coverageAmount = coverageAmount;
        this.paymentAmount = paymentAmount;
        this.paymentFrequency = paymentFrequency;
        this.options = options;
        this.insurer = insurer;
        this.documents = documents;
        this.status = status;
        this.cancellationReason = str;
        this.coverages = coverages;
        this.restrictions = restrictions;
        this.renewalDetails = yVar;
    }

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
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.id, sVar.id) && Intrinsics.f(this.policyNumber, sVar.policyNumber) && Intrinsics.f(this.planName, sVar.planName) && Intrinsics.f(this.planDisplayName, sVar.planDisplayName) && Intrinsics.f(this.startDate, sVar.startDate) && Intrinsics.f(this.endDate, sVar.endDate) && Intrinsics.f(this.coverageAmount, sVar.coverageAmount) && Intrinsics.f(this.paymentAmount, sVar.paymentAmount) && Intrinsics.f(this.paymentFrequency, sVar.paymentFrequency) && Intrinsics.f(this.options, sVar.options) && Intrinsics.f(this.insurer, sVar.insurer) && Intrinsics.f(this.documents, sVar.documents) && Intrinsics.f(this.status, sVar.status) && Intrinsics.f(this.cancellationReason, sVar.cancellationReason) && Intrinsics.f(this.coverages, sVar.coverages) && Intrinsics.f(this.restrictions, sVar.restrictions) && Intrinsics.f(this.renewalDetails, sVar.renewalDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i getInsurer() {
        return this.insurer;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d((this.insurer.hashCode() + p.a.d(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.policyNumber), 31, this.planName), 31, this.planDisplayName), 31, this.startDate), 31, this.endDate), 31, this.coverageAmount), 31, this.paymentAmount), 31, this.paymentFrequency), 31, this.options)) * 31, 31, this.documents), 31, this.status);
        String str = this.cancellationReason;
        int iD = p.a.d(p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.coverages), 31, this.restrictions);
        y yVar = this.renewalDetails;
        return iD + (yVar != null ? yVar.hashCode() : 0);
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
    public final y getRenewalDetails() {
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
