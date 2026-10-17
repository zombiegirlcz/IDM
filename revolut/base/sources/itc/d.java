package itc;

import h30.q;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f168363w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f168363w |= Integer.MIN_VALUE;
        return this.v.P0(this);
    }
}
