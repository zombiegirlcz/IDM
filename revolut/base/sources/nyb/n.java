package nyb;

import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.terms.api.model.TermsScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.x0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f220815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f220816c;
    public final /* synthetic */ RevPointsOptInSource d;

    public /* synthetic */ n(o oVar, boolean z, RevPointsOptInSource revPointsOptInSource, int i) {
        this.f220814a = i;
        this.f220815b = oVar;
        this.f220816c = z;
        this.d = revPointsOptInSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f220814a) {
            case 0:
                x0 optInState = (x0) obj2;
                Intrinsics.checkNotNullParameter(optInState, "optInState");
                if (optInState != x0.OPTED_OUT) {
                    return pfm.m.f235744a;
                }
                o oVar = this.f220815b;
                return new pfm.a(oVar.e.a(), new ny7.j(new n(oVar, this.f220816c, this.d, 1), 12), 4);
            default:
                oyb.d config = (oyb.d) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                List list = config.f230930b;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    o oVar2 = this.f220815b;
                    if (!zHasNext) {
                        pfm.f fVarI = efm.b.i(arrayList);
                        jxb.l lVar = (jxb.l) oVar2.f220820a;
                        efm.d0<hxb.f> d0VarCreateRevPointsAccount = lVar.f179124a.createRevPointsAccount();
                        ju0.f fVar = new ju0.f(23, new jxb.g(11));
                        d0VarCreateRevPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(d0VarCreateRevPointsAccount, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.f fVar2 = new ufm.f(te0.w.i0(iVar), new ju0.f(24, new jxb.h(lVar, 1)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVarI.e(new pfm.h(new ufm.f(fVar2, new ny7.j(new nvg.b0(oVar2, this.d, 8), 13), 3), 4).e(ue0.e.v(oVar2.f220824h.a(this.f220816c))));
                    }
                    TermsScope termsScope = (TermsScope) it8.next();
                    efm.d0 d0VarFirstOrError = m70.a.g(pre.c.d(oVar2.f220821b, zhm.u.c(termsScope)), null, null, 3).firstOrError();
                    ny7.j jVar = new ny7.j(new nvg.b0(oVar2, termsScope, 9), 14);
                    d0VarFirstOrError.getClass();
                    pfm.a aVar = new pfm.a(d0VarFirstOrError, jVar, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                    arrayList.add(aVar);
                }
                break;
        }
    }
}
