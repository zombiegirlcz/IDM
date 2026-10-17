package fmc;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.c {
    public TradingAccount.Portfolio u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f136350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f136351x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f136350w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f136351x |= Integer.MIN_VALUE;
        return this.f136350w.a(this);
    }
}
