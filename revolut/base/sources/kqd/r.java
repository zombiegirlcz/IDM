package kqd;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e f188399w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f188400x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e eVar, gim.c cVar) {
        super(cVar);
        this.f188399w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f188400x |= Integer.MIN_VALUE;
        return com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e.I2(this.f188399w, this);
    }
}
