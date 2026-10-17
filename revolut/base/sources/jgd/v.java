package jgd;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f173985w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, gim.c cVar) {
        super(cVar);
        this.v = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f173985w |= Integer.MIN_VALUE;
        return this.v.y2(null, this);
    }
}
