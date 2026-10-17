package mpc;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s56.d0;
import t1h.k;
import zjh.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f207783a;

    public a(f portfolioInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f207783a = portfolioInteractor;
    }

    @Override // t1h.k
    public final Object a(String str, d0 d0Var) throws Throwable {
        Object objE = this.f207783a.E(str, d0Var);
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : Unit.f186387a;
    }
}
