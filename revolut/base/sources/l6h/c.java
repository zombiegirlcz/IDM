package l6h;

import com.revolut.feature.wealth.gia.margin_trading.impl.pushes.WealthGiaMarginCallRefreshWorker;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ WealthGiaMarginCallRefreshWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f192409w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WealthGiaMarginCallRefreshWorker wealthGiaMarginCallRefreshWorker, gim.c cVar) {
        super(cVar);
        this.v = wealthGiaMarginCallRefreshWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f192409w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
