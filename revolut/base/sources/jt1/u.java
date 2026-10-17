package jt1;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f178299w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, gim.c cVar) {
        super(cVar);
        this.v = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f178299w |= Integer.MIN_VALUE;
        return z.z2(this.v, this);
    }
}
