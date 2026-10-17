package fmc;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f136357w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, gim.c cVar) {
        super(cVar);
        this.v = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f136357w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
