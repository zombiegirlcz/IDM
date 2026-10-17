package rnd;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f255623w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(y yVar, gim.c cVar) {
        super(cVar);
        this.v = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f255623w |= Integer.MIN_VALUE;
        return y.a(this.v, null, this);
    }
}
