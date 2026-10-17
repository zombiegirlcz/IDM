package e0f;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 extends gim.c {
    public int A;
    public xi0.b u;
    public TopUpConfig v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f121676w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e7l.f f121677x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f121678y;
    public final /* synthetic */ t0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.z = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f121678y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.g(null, null, this);
    }
}
