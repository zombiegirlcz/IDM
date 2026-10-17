package i55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u0010\u0010\u001c¨\u0006\u001e"}, d2 = {"Li55/m;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "backupCard", "Ljava/lang/String;", "autoPay", "c", "i", "statements", "d", "g", "repaymentDayChange", "e", "financialDifficulties", "f", "h", "repaymentManagement", "cancellation", "helpTopic", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "cooldownPeriodDays", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("backupCard")
    private final boolean backupCard;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoPay")
    @NotNull
    private final String autoPay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("statements")
    @NotNull
    private final String statements;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("repaymentDayChange")
    private final boolean repaymentDayChange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("financialDifficulties")
    private final boolean financialDifficulties;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("repaymentManagement")
    @NotNull
    private final String repaymentManagement;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellation")
    private final boolean cancellation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("helpTopic")
    private final String helpTopic;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("cooldownPeriod")
    private final Integer cooldownPeriodDays;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAutoPay() {
        return this.autoPay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getBackupCard() {
        return this.backupCard;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCancellation() {
        return this.cancellation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getCooldownPeriodDays() {
        return this.cooldownPeriodDays;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getFinancialDifficulties() {
        return this.financialDifficulties;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.backupCard == mVar.backupCard && Intrinsics.f(this.autoPay, mVar.autoPay) && Intrinsics.f(this.statements, mVar.statements) && this.repaymentDayChange == mVar.repaymentDayChange && this.financialDifficulties == mVar.financialDifficulties && Intrinsics.f(this.repaymentManagement, mVar.repaymentManagement) && this.cancellation == mVar.cancellation && Intrinsics.f(this.helpTopic, mVar.helpTopic) && Intrinsics.f(this.cooldownPeriodDays, mVar.cooldownPeriodDays);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getHelpTopic() {
        return this.helpTopic;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getRepaymentDayChange() {
        return this.repaymentDayChange;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRepaymentManagement() {
        return this.repaymentManagement;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(Boolean.hashCode(this.backupCard) * 31, 31, this.autoPay), 31, this.statements), 31, this.repaymentDayChange), 31, this.financialDifficulties), 31, this.repaymentManagement), 31, this.cancellation);
        String str = this.helpTopic;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.cooldownPeriodDays;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStatements() {
        return this.statements;
    }
}
