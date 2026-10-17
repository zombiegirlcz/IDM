package e0f;

import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;

/* JADX INFO: loaded from: classes8.dex */
public final class q1 extends gim.c {
    public hve.b u;
    public TopUpMethodsContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f121672w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r1 f121673x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f121674y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.f121673x = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f121672w = obj2;
        this.f121674y |= Integer.MIN_VALUE;
        return this.f121673x.o(null, null, this);
    }
}
