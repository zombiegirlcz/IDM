package y45;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o55.j f310803a;

    public i(o55.j loanProductRepository) {
        Intrinsics.checkNotNullParameter(loanProductRepository, "loanProductRepository");
        this.f310803a = loanProductRepository;
    }

    public static r f(i iVar, String loanId) {
        iVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        o55.q qVar = (o55.q) iVar.f310803a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return qVar.i.e(new o55.r(loanId), loadingStrategy);
    }

    public r a(String loanId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(d(loadingStrategy), new k7c.n(loanId, 29));
    }

    public final r b(String loanId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        o55.q qVar = (o55.q) this.f310803a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(u1.d(rd0.e.c(qVar.a(), kotlin.coroutines.g.f186406a), qVar.f222363h.e(new o55.d(loanId), loadingStrategy)), new o23.l(loanId, 9));
    }

    public final r d(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        o55.q qVar = (o55.q) this.f310803a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(u1.d(rd0.e.c(qVar.a(), kotlin.coroutines.g.f186406a), qVar.f222362g.e(o55.g.f222339a, loadingStrategy)), new o55.l(qVar, 4));
    }

    public final efm.b g(String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        o55.q qVar = (o55.q) this.f310803a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        return qVar.f222363h.g(new o55.d(loanId), false);
    }
}
