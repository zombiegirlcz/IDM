package u1m;

import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.c {
    public Serializable u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f276474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f276475x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, gim.c cVar) {
        super(cVar);
        this.f276474w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f276475x |= Integer.MIN_VALUE;
        return this.f276474w.d(null, this);
    }
}
