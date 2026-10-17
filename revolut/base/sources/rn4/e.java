package rn4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0013"}, d2 = {"Lrn4/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "statementDate", "b", "fileName", "", "c", "J", "d", "()J", "statementBalance", "minPayment", "cycleId", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementDate")
    @NotNull
    private final String statementDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fileName")
    @NotNull
    private final String fileName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementBalance")
    private final long statementBalance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("minPayment")
    private final long minPayment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cycleId")
    private final String cycleId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getMinPayment() {
        return this.minPayment;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStatementBalance() {
        return this.statementBalance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStatementDate() {
        return this.statementDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.statementDate, eVar.statementDate) && Intrinsics.f(this.fileName, eVar.fileName) && this.statementBalance == eVar.statementBalance && this.minPayment == eVar.minPayment && Intrinsics.f(this.cycleId, eVar.cycleId);
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(p.a.c(this.statementDate.hashCode() * 31, 31, this.fileName), 31, this.statementBalance), 31, this.minPayment);
        String str = this.cycleId;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
