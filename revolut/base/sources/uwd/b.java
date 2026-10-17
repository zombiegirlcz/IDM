package uwd;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f283615w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, gim.c cVar) {
        super(cVar);
        this.v = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f283615w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}
