package r7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.c {
    public int A;
    public boolean B;
    public /* synthetic */ Object C;
    public final /* synthetic */ p D;
    public int E;
    public TradingAccount u;
    public x5i.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountWrapper f252231w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f252232x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f252233y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, gim.c cVar) {
        super(cVar);
        this.D = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.e(null, null, null, this);
    }
}
