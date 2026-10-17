package y45;

import kotlin.jvm.internal.Intrinsics;
import o55.h0;
import o55.j0;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f310806a;

    public k(j0 loanStatementDocumentRepository) {
        Intrinsics.checkNotNullParameter(loanStatementDocumentRepository, "loanStatementDocumentRepository");
        this.f310806a = loanStatementDocumentRepository;
    }

    public final String a(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        j0 j0Var = this.f310806a;
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        return j6.a.r(j0Var.e.getBaseUrl(), "/loan-management/loan/", loanId, "/generate-statement");
    }

    public final vkm.d b(String loanId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        j0 j0Var = this.f310806a;
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(nim.a.w(j0Var.f.e(loanId, loadingStrategy), new h0(j0Var, 0)));
    }
}
