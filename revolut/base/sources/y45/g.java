package y45;

import com.revolut.data.model.Data;
import efm.d0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import o55.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f310799a;

    public g(ecm.q recentGroupsInteractor) {
        Intrinsics.checkNotNullParameter(recentGroupsInteractor, "recentGroupsInteractor");
        this.f310799a = recentGroupsInteractor;
    }

    public r a(long j2) {
        lr9.j jVar = (lr9.j) ((ecm.q) this.f310799a).f124861b;
        d0 d0VarFirstOrError = jVar.c(j2).firstOrError();
        lr9.b bVar = new lr9.b(9, new lr9.f(jVar, j2, 0));
        d0VarFirstOrError.getClass();
        sfm.b bVar2 = new sfm.b(d0VarFirstOrError, bVar, 2);
        Intrinsics.checkNotNullExpressionValue(bVar2, "flatMapObservable(...)");
        mq9.e.Companion.getClass();
        r rVarStartWith = bVar2.startWith(new Data(mq9.d.a(), null, true, 2, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return ue0.e.E(rVarStartWith, new Data(mq9.d.a(), null, false, 6, null));
    }

    public r b(String loanId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        f0 f0Var = (f0) this.f310799a;
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r map = f0Var.i.l(o55.i.f222346a).map(new o4a.e(25, new o5.b(24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return nim.a.w(u1.d(map, f0Var.f.e(loanId, loadingStrategy)), new o23.l(loanId, 10));
    }

    public g(f0 loanRepository) {
        Intrinsics.checkNotNullParameter(loanRepository, "loanRepository");
        this.f310799a = loanRepository;
    }
}
