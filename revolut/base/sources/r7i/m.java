package r7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.c {
    public int A;
    public TradingAccount u;
    public kel.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x5i.d f252228w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountWrapper f252229x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f252230y;
    public final /* synthetic */ p z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, gim.c cVar) {
        super(cVar);
        this.z = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f252230y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.d(null, null, null, null, this);
    }
}
