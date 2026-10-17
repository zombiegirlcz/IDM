package yjh;

import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ c D;
    public int E;
    public WealthAction u;
    public TradingAccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TradingLegalEntityInformation f314453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f314454x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f314455y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.D = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.b(null, this);
    }
}
