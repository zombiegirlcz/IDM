package cmh;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f25253w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.v = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f25253w |= Integer.MIN_VALUE;
        return this.v.i3(null, this);
    }
}
