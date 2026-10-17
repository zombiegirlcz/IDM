package v20;

import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 extends gim.c {
    public UUID u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f285369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f285370x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, gim.c cVar) {
        super(cVar);
        this.f285369w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f285370x |= Integer.MIN_VALUE;
        return this.f285369w.q(null, null, this);
    }
}
