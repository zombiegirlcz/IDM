package o07;

import com.revolut.feature.freelancer.impl.ui.profile.payment_processing_fees.FreelancerPaymentProcessingFeesContract$InputData;
import gr6.o;
import jki.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FreelancerPaymentProcessingFeesContract$InputData f221164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f221165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l61.a f221166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f221167s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f221168t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p stateMapper, FreelancerPaymentProcessingFeesContract$InputData inputData, o interactor, l61.a userCompanyInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f221164p = inputData;
        this.f221165q = interactor;
        this.f221166r = userCompanyInteractor;
        this.f221167s = new b(0);
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f221168t = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f221168t, new ns9.h(continuation, this, 9)), null, null, new nwc.f(this, continuation, 10), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f221167s;
    }
}
