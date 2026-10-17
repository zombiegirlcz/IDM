package wha;

import et6.l0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vge.f1;
import vha.s;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements mf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.a f297451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr6.h f297452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f297453c;

    public e(gr6.a freelancerAccountDetailsInteractor, gr6.h freelancerCashbackInteractor, s proAccountsInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(proAccountsInteractor, "proAccountsInteractor");
        this.f297451a = freelancerAccountDetailsInteractor;
        this.f297452b = freelancerCashbackInteractor;
        this.f297453c = proAccountsInteractor;
    }

    @Override // mf1.a
    public final Flow a() {
        Continuation continuation = null;
        return rd0.e.e(q.Q(((l0) this.f297453c.f289427a).m(), new w2a.q(continuation, this, 12)), h0.f322473a, new f1(3, 21, continuation));
    }

    @Override // mf1.a
    public final String b() {
        return null;
    }
}
