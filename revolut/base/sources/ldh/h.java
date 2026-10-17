package ldh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import nel.n;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.c {
    public n u;
    public TradingAccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public bfl.g f194114w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f194115x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f194116y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f194116y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f194115x = obj2;
        this.z |= Integer.MIN_VALUE;
        return i.a(this.f194116y, null, null, null, this);
    }
}
