package tnb;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f272391w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f272391w |= Integer.MIN_VALUE;
        return this.v.g(null, this);
    }
}
