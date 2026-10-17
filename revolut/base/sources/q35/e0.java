package q35;

import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentAccountDetails;
import ip0.v7;
import java.io.Serializable;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f241806c;
    public final dj0.d d;
    public final d0 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f241807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f241808h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f241809j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f241810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LoanRepaymentAccountDetails f241811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b0 f241812n;

    public e0(String id10, String transactionId, ZonedDateTime repaymentDate, dj0.d amount, d0 type, String str, String str2, String str3, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, c0 c0Var, LoanRepaymentAccountDetails loanRepaymentAccountDetails, b0 b0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(repaymentDate, "repaymentDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f241804a = id10;
        this.f241805b = transactionId;
        this.f241806c = repaymentDate;
        this.d = amount;
        this.e = type;
        this.f = str;
        this.f241807g = str2;
        this.f241808h = str3;
        this.i = dVar;
        this.f241809j = dVar2;
        this.k = dVar3;
        this.f241810l = c0Var;
        this.f241811m = loanRepaymentAccountDetails;
        this.f241812n = b0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f241804a, e0Var.f241804a) && Intrinsics.f(this.f241805b, e0Var.f241805b) && Intrinsics.f(this.f241806c, e0Var.f241806c) && Intrinsics.f(this.d, e0Var.d) && this.e == e0Var.e && Intrinsics.f(this.f, e0Var.f) && Intrinsics.f(this.f241807g, e0Var.f241807g) && Intrinsics.f(this.f241808h, e0Var.f241808h) && Intrinsics.f(this.i, e0Var.i) && Intrinsics.f(this.f241809j, e0Var.f241809j) && Intrinsics.f(this.k, e0Var.k) && this.f241810l == e0Var.f241810l && Intrinsics.f(this.f241811m, e0Var.f241811m) && this.f241812n == e0Var.f241812n;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + v7.c(h30.l.h(this.f241806c, p.a.c(this.f241804a.hashCode() * 31, 31, this.f241805b), 31), 31, this.d)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f241807g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f241808h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        dj0.d dVar = this.i;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f241809j;
        int iHashCode6 = (iHashCode5 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.k;
        int iHashCode7 = (iHashCode6 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        c0 c0Var = this.f241810l;
        int iHashCode8 = (iHashCode7 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        LoanRepaymentAccountDetails loanRepaymentAccountDetails = this.f241811m;
        int iHashCode9 = (iHashCode8 + (loanRepaymentAccountDetails == null ? 0 : loanRepaymentAccountDetails.hashCode())) * 31;
        b0 b0Var = this.f241812n;
        return iHashCode9 + (b0Var != null ? b0Var.hashCode() : 0);
    }
}
