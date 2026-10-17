package wik;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ utk.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f297922w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(utk.f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f297922w |= Integer.MIN_VALUE;
        return this.v.f(null, null, this);
    }
}
