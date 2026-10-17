package k2j;

import h30.q;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f180609w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f180609w |= Integer.MIN_VALUE;
        return this.v.G0(this);
    }
}
