package yn4;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000f\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0006\u0010\u0012¨\u0006!"}, d2 = {"Lyn4/s;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "d", "()Ljo3/a;", "maxPlanAmount", "b", "e", "minTransactionAmount", "", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "transactionIds", "Ljava/lang/String;", "h", "transactionSelectionRule", "eligibilityStatus", "Lyn4/l;", "f", "Lyn4/l;", "()Lyn4/l;", "ineligibility", "", "terms", "Lyn4/c;", "documents", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxPlanAmount")
    @NotNull
    private final jo3.a maxPlanAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("minTransactionAmount")
    @NotNull
    private final jo3.a minTransactionAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionIds")
    @NotNull
    private final List<String> transactionIds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transactionSelectionRule")
    private final String transactionSelectionRule;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("eligibilityStatus")
    @NotNull
    private final String eligibilityStatus;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("ineligibility")
    private final l ineligibility;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms")
    @NotNull
    private final List<Integer> terms;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<c> documents;

    public s(jo3.a maxPlanAmount, jo3.a minTransactionAmount, List transactionIds, String str, String eligibilityStatus, l lVar, List terms, ArrayList documents) {
        Intrinsics.checkNotNullParameter(maxPlanAmount, "maxPlanAmount");
        Intrinsics.checkNotNullParameter(minTransactionAmount, "minTransactionAmount");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(eligibilityStatus, "eligibilityStatus");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.maxPlanAmount = maxPlanAmount;
        this.minTransactionAmount = minTransactionAmount;
        this.transactionIds = transactionIds;
        this.transactionSelectionRule = str;
        this.eligibilityStatus = eligibilityStatus;
        this.ineligibility = lVar;
        this.terms = terms;
        this.documents = documents;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l getIneligibility() {
        return this.ineligibility;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getMaxPlanAmount() {
        return this.maxPlanAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getMinTransactionAmount() {
        return this.minTransactionAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.maxPlanAmount, sVar.maxPlanAmount) && Intrinsics.f(this.minTransactionAmount, sVar.minTransactionAmount) && Intrinsics.f(this.transactionIds, sVar.transactionIds) && Intrinsics.f(this.transactionSelectionRule, sVar.transactionSelectionRule) && Intrinsics.f(this.eligibilityStatus, sVar.eligibilityStatus) && Intrinsics.f(this.ineligibility, sVar.ineligibility) && Intrinsics.f(this.terms, sVar.terms) && Intrinsics.f(this.documents, sVar.documents);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getTransactionIds() {
        return this.transactionIds;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTransactionSelectionRule() {
        return this.transactionSelectionRule;
    }

    public final int hashCode() {
        int iD = p.a.d(v7.j(this.minTransactionAmount, this.maxPlanAmount.hashCode() * 31, 31), 31, this.transactionIds);
        String str = this.transactionSelectionRule;
        int iC = p.a.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.eligibilityStatus);
        l lVar = this.ineligibility;
        return this.documents.hashCode() + p.a.d((iC + (lVar != null ? lVar.hashCode() : 0)) * 31, 31, this.terms);
    }
}
