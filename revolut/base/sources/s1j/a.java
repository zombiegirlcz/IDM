package s1j;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public TradingAccount u;
    public hel.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f259142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f259143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f259144y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f259143x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f259142w = obj2;
        this.f259144y |= Integer.MIN_VALUE;
        return this.f259143x.a(null, this);
    }
}
