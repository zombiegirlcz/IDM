package epc;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public TradingAccount.Robo u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f128142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f128143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f128144y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.f128143x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f128142w = obj2;
        this.f128144y |= Integer.MIN_VALUE;
        return h.a(this.f128143x, null, null, null, this);
    }
}
