package khe;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.c {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a f184106w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184107x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar, Continuation continuation) {
        super(continuation);
        this.f184106w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184107x |= Integer.MIN_VALUE;
        return com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a.I2(this.f184106w, null, this);
    }
}
