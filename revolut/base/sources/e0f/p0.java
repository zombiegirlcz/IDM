package e0f;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends gim.c {
    public TopUpConfig u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f121663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f121664x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.f121663w = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f121664x |= Integer.MIN_VALUE;
        return this.f121663w.e(null, null, this);
    }
}
