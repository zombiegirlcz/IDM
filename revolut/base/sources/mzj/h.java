package mzj;

import com.revolut.core.model.account.AccountId;
import efm.r;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import mx0.oc;
import mz3.s;
import nzj.q;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f210792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f210793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nzj.d f210794c;

    public h(t pricingPlanInteractor, wsg.n walletInteractor, mt8.d kycInteractor, nzj.d state) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f210792a = pricingPlanInteractor;
        this.f210793b = walletInteractor;
        this.f210794c = state;
    }

    public static r e(r rVar, String str) {
        r map = rVar.map(new s(new mll.h(str, 7), 28));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // mzj.a
    public final r a() {
        return e(nim.a.w(this.f210793b.U(getAccountId(), false), new oc(16)), com.revolut.feature.wallets.api.module.a.TRANSFER_YEARLY.a());
    }

    @Override // mzj.a
    public final r b() {
        return e(nim.a.w(this.f210793b.U(getAccountId(), false), new oc(17)), com.revolut.feature.wallets.api.module.a.TRANSFER_WEEKLY.a());
    }

    @Override // mzj.a
    public final r c(mha.m limitType) {
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        return e(nim.a.w(this.f210792a.t(false), new mt9.c(this, limitType, 23)), limitType.f205460a);
    }

    @Override // mzj.a
    public final r d() {
        return e(nim.a.w(this.f210793b.U(getAccountId(), false), new oc(18)), com.revolut.feature.wallets.api.module.a.TRANSFER_DAILY.a());
    }

    @Override // mzj.a
    public final AccountId getAccountId() {
        q qVar = (q) this.f210794c;
        return (AccountId) qVar.f221091c.getValue(qVar, q.e[1]).get();
    }
}
