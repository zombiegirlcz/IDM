package jlf;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r10.r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f175747w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r10.r rVar, gim.c cVar) {
        super(cVar);
        this.v = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f175747w |= Integer.MIN_VALUE;
        return this.v.p(this);
    }
}
