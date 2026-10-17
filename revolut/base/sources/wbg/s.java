package wbg;

import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.t f296197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mt8.d f296198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sh3.a f296199c;
    public final q7c.g d;
    public final q7c.m e;
    public final j2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2 f296200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j2 f296201h;
    public final j2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j2 f296202j;

    public s(r10.t travelPhysicalCardsProvider, mt8.d kycInteractor, sh3.a checkoutInteractor, q7c.g paymentMethodsInteractor, a bedOptionsPriceCalculator, q7c.m quoteInteractor) {
        Intrinsics.checkNotNullParameter(travelPhysicalCardsProvider, "travelPhysicalCardsProvider");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(bedOptionsPriceCalculator, "bedOptionsPriceCalculator");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        this.f296197a = travelPhysicalCardsProvider;
        this.f296198b = kycInteractor;
        this.f296199c = checkoutInteractor;
        this.d = paymentMethodsInteractor;
        this.e = quoteInteractor;
        this.f = m72.b.y(null, null, false, 7, null);
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        this.f296200g = vkm.q.c(iVar);
        this.f296201h = vkm.q.c(iVar);
        this.i = vkm.q.c(iVar);
        this.f296202j = m72.b.y(null, null, false, 7, null);
    }

    public final t38.e a(w6c.h topUpTarget, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        return new t38.e(this.d.f(new u6c.p(topUpTarget.f295415a, (String) null, (u6c.u) null, u6c.t.STAYS, dVar != null ? Long.valueOf(dVar.f115082a) : null, dVar != null ? dVar.f115083b : null, false, Constants.TAG_POWER_OFF_TIMEOUT), topUpTarget.f295416b, topUpTarget.f295417c), 29, this, topUpTarget);
    }

    public final void b(od0.i selectedPointsRedeemOption) {
        Intrinsics.checkNotNullParameter(selectedPointsRedeemOption, "selectedPointsRedeemOption");
        j2 j2Var = this.f296200g;
        j2Var.getClass();
        j2Var.g(null, selectedPointsRedeemOption);
    }
}
