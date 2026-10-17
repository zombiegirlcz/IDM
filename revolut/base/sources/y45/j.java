package y45;

import i55.z;
import kotlin.jvm.internal.Intrinsics;
import o55.w;
import q35.g0;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f310804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f310805b;

    public j(w loanRepaymentsRepository, i loanProductInteractor) {
        Intrinsics.checkNotNullParameter(loanRepaymentsRepository, "loanRepaymentsRepository");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        this.f310804a = loanRepaymentsRepository;
        this.f310805b = loanProductInteractor;
    }

    public final pfm.a a(String loanId, String repaymentToken, long j2, g0 g0Var, String str) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(repaymentToken, "repaymentToken");
        w wVar = this.f310804a;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(repaymentToken, "repaymentToken");
        pfm.a aVarE = te0.w.g0(wVar.f222374a.repay(loanId, new z(repaymentToken, j2, g0Var != null ? g0Var.toString() : null, str))).e(this.f310805b.g(loanId));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
