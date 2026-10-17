package fmc;

import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ com.revolut.feature.robo.impl.navigation.c C;
    public int D;
    public String u;
    public TradingAccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f136336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public NaviCommand[] f136337x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public NaviCommand[] f136338y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.robo.impl.navigation.c cVar, gim.c cVar2) {
        super(cVar2);
        this.C = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.e(this, null, false);
    }
}
