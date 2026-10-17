package o45;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222040c;
    public final String d;
    public final String e;
    public final String f;

    public d2(String loanId, String statementId, String issueDate, String statementPeriodFrom, String statementPeriodTo, String type) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(statementId, "statementId");
        Intrinsics.checkNotNullParameter(issueDate, "issueDate");
        Intrinsics.checkNotNullParameter(statementPeriodFrom, "statementPeriodFrom");
        Intrinsics.checkNotNullParameter(statementPeriodTo, "statementPeriodTo");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f222038a = loanId;
        this.f222039b = statementId;
        this.f222040c = issueDate;
        this.d = statementPeriodFrom;
        this.e = statementPeriodTo;
        this.f = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return Intrinsics.f(this.f222038a, d2Var.f222038a) && Intrinsics.f(this.f222039b, d2Var.f222039b) && Intrinsics.f(this.f222040c, d2Var.f222040c) && Intrinsics.f(this.d, d2Var.d) && Intrinsics.f(this.e, d2Var.e) && Intrinsics.f(this.f, d2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f222038a.hashCode() * 31, 31, this.f222039b), 31, this.f222040c), 31, this.d), 31, this.e);
    }
}
