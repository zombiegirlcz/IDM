package f1l;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public TradingAccountType u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f131295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f131296x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.f131295w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f131296x |= Integer.MIN_VALUE;
        return this.f131295w.c(null, this);
    }
}
