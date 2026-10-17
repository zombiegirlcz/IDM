package h6i;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 extends gim.c {
    public kel.b u;
    public TradingAccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f149681w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k0 f149682x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149683y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, gim.c cVar) {
        super(cVar);
        this.f149682x = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149681w = obj2;
        this.f149683y |= Integer.MIN_VALUE;
        return this.f149682x.a(null, this);
    }
}
