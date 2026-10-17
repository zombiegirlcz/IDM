package jt1;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f178298w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, gim.c cVar) {
        super(cVar);
        this.v = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f178298w |= Integer.MIN_VALUE;
        return z.y2(this.v, this);
    }
}
