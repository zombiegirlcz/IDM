package l6h;

import com.revolut.feature.wealth.gia.margin_trading.impl.pushes.WealthGiaMarginCallRefreshWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public WealthGiaMarginCallRefreshWorker u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f192406w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ WealthGiaMarginCallRefreshWorker f192407x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f192408y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WealthGiaMarginCallRefreshWorker wealthGiaMarginCallRefreshWorker, Continuation continuation) {
        super(continuation);
        this.f192407x = wealthGiaMarginCallRefreshWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f192406w = obj2;
        this.f192408y |= Integer.MIN_VALUE;
        return this.f192407x.doWork(this);
    }
}
