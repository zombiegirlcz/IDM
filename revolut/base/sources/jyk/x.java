package jyk;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends gim.c {
    public String u;
    public TradingAccount.Robo.Regular v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FeatureCommand f179510w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f179511x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y f179512y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, gim.c cVar) {
        super(cVar);
        this.f179512y = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f179511x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f179512y.e(null, this);
    }
}
