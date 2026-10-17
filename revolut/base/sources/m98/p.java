package m98;

import com.revolut.data.model.Data;
import com.revolut.feature.junior.card_request.impl.ui.screen.request_review.CardRequestReviewScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m2f.b0;
import skm.a2;
import vkm.q0;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CardRequestReviewScreenContract$InputData f203657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hj8.a f203658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f203659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ic8.b f203660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ha3.f f203661t;
    public final l98.f u;
    public a2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f203662w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f203663x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f203664y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(jki.p stateMapper, CardRequestReviewScreenContract$InputData inputData, hj8.a juniorProfileInteractor, ang.f userInteractor, ic8.b juniorCardRequestInteractor, ha3.f cardsConfigInteractor, l98.f juniorCardRequestApprovalHandler, i90.b uuidUtils) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(juniorCardRequestInteractor, "juniorCardRequestInteractor");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorCardRequestApprovalHandler, "juniorCardRequestApprovalHandler");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f203657p = inputData;
        this.f203658q = juniorProfileInteractor;
        this.f203659r = userInteractor;
        this.f203660s = juniorCardRequestInteractor;
        this.f203661t = cardsConfigInteractor;
        this.u = juniorCardRequestApprovalHandler;
        this.f203662w = new vii.b();
        this.f203663x = y.u(uuidUtils, "toString(...)");
        this.f203664y = new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), true);
    }

    @Override // yji.l
    public final void T1(long j2) {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f203664y;
    }

    public final void y2() {
        a2 a2Var = this.v;
        if (a2Var == null || !a2Var.d()) {
            Continuation continuation = null;
            this.v = yji.l.b1(this, vkm.q.Q(new q0(this.f203662w, new b0(this, continuation, 12), 1), new li2.f(continuation, this, 23)), null, new m75.i(this, continuation, 4), 3);
        }
    }
}
