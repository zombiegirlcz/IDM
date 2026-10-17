package e0f;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 extends gim.c {
    public TopUpConfig u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f121670w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f121671x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.f121670w = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f121671x |= Integer.MIN_VALUE;
        return this.f121670w.f(null, this);
    }
}
