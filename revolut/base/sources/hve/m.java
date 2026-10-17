package hve;

import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.c {
    public TopUpMethodsContext u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f155844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f155845x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, gim.c cVar) {
        super(cVar);
        this.f155844w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f155845x |= Integer.MIN_VALUE;
        return this.f155844w.j(null, this);
    }
}
