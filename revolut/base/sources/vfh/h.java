package vfh;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f288650w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, gim.c cVar) {
        super(cVar);
        this.v = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f288650w |= Integer.MIN_VALUE;
        return l.b3(this.v, null, this);
    }
}
