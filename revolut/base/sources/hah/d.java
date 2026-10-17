package hah;

import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.flows.add_money.b A;
    public int B;
    public AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithAccountIdAndHoldingId u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f150514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TradingAccount.Portfolio f150515x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public WealthAccountType f150516y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.wealth.impl.ui.flows.add_money.b bVar, gim.c cVar) {
        super(cVar);
        this.A = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return com.revolut.feature.wealth.impl.ui.flows.add_money.b.I2(this.A, null, this);
    }
}
