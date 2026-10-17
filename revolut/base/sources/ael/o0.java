package ael;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 extends gim.c {
    public TradingAccount u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f3643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3644x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var, gim.c cVar) {
        super(cVar);
        this.f3643w = q0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f3644x |= Integer.MIN_VALUE;
        return this.f3643w.m(null, null, null, this);
    }
}
