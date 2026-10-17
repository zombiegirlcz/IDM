package nyb;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;

/* JADX INFO: loaded from: classes6.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f220826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f220827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ffk.t f220828c;
    public final wsg.n d;

    public p0(k revPointsInteractor, f0 revPointsPlanInteractor, ffk.t pricingPlansInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(revPointsPlanInteractor, "revPointsPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansInteractor, "pricingPlansInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f220826a = revPointsInteractor;
        this.f220827b = revPointsPlanInteractor;
        this.f220828c = pricingPlansInteractor;
        this.d = walletInteractor;
    }

    public final efm.r a(f1 product, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(product, "revPointsProduct");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k kVar = this.f220826a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jxb.l lVar = (jxb.l) kVar.f220804a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarW = nim.a.w(lVar.f.e(Unit.f186387a, loadingStrategy), new nya.b0(product, 7));
        jxb.e eVar = this.f220827b.f220787a;
        if (product == null) {
            product = f1.UNKNOWN;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        efm.r rVarF = eVar.d.f(new jxb.d(product), true);
        ffk.t tVar = this.f220828c;
        efm.r rVarN = tVar.n();
        efm.r rVarQ = tVar.q();
        w4l.h hVar = w4l.h.f294642c;
        efm.r rVarDistinctUntilChanged = nim.a.w(mif.a.g(rVarW, rVarF, rVarN, rVarQ, this.d.J(AccountId.Personal.f51414a, hVar)), new m(15)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }
}
