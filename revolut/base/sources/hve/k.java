package hve;

import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.c {
    public TopUpMethodsContext u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f155841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f155842x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, gim.c cVar) {
        super(cVar);
        this.f155841w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f155842x |= Integer.MIN_VALUE;
        return this.f155841w.h(null, null, null, this);
    }
}
