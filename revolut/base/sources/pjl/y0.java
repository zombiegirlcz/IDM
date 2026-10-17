package pjl;

import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class y0 extends gim.c {
    public Set u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z0 f236868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f236869x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, gim.c cVar) {
        super(cVar);
        this.f236868w = z0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f236869x |= Integer.MIN_VALUE;
        return this.f236868w.o(null, null, this);
    }
}
