package gce;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ twg.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f142422w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(twg.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f142422w |= Integer.MIN_VALUE;
        return this.v.o(null, this);
    }
}
