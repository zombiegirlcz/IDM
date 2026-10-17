package rbh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.c {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ z D;
    public int E;
    public TradingAccount u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f253106w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f253107x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f253108y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, gim.c cVar) {
        super(cVar);
        this.D = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return z.c(this.D, null, null, null, null, this);
    }
}
