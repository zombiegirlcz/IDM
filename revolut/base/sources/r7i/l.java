package r7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.c {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ p C;
    public int D;
    public TradingAccount.Margin u;
    public b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TradingAccount.Margin f252225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public kel.b f252226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x5i.d f252227y;
    public AccountWrapper z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, gim.c cVar) {
        super(cVar);
        this.C = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.c(null, null, null, null, this);
    }
}
