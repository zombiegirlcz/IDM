package i55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Li55/h0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "statementId", "b", "loanId", "issueDate", "d", "statementPeriodFrom", "e", "statementPeriodTo", "f", "type", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementId")
    @NotNull
    private final String statementId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("loanId")
    @NotNull
    private final String loanId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("issueDate")
    @NotNull
    private final String issueDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("statementPeriodFrom")
    @NotNull
    private final String statementPeriodFrom;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("statementPeriodTo")
    @NotNull
    private final String statementPeriodTo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    public h0(String statementId, String loanId, String issueDate, String statementPeriodFrom, String statementPeriodTo, String type) {
        Intrinsics.checkNotNullParameter(statementId, "statementId");
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(issueDate, "issueDate");
        Intrinsics.checkNotNullParameter(statementPeriodFrom, "statementPeriodFrom");
        Intrinsics.checkNotNullParameter(statementPeriodTo, "statementPeriodTo");
        Intrinsics.checkNotNullParameter(type, "type");
        this.statementId = statementId;
        this.loanId = loanId;
        this.issueDate = issueDate;
        this.statementPeriodFrom = statementPeriodFrom;
        this.statementPeriodTo = statementPeriodTo;
        this.type = type;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLoanId() {
        return this.loanId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStatementId() {
        return this.statementId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStatementPeriodFrom() {
        return this.statementPeriodFrom;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStatementPeriodTo() {
        return this.statementPeriodTo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.statementId, h0Var.statementId) && Intrinsics.f(this.loanId, h0Var.loanId) && Intrinsics.f(this.issueDate, h0Var.issueDate) && Intrinsics.f(this.statementPeriodFrom, h0Var.statementPeriodFrom) && Intrinsics.f(this.statementPeriodTo, h0Var.statementPeriodTo) && Intrinsics.f(this.type, h0Var.type);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.statementId.hashCode() * 31, 31, this.loanId), 31, this.issueDate), 31, this.statementPeriodFrom), 31, this.statementPeriodTo);
    }
}
