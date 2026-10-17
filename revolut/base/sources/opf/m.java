package opf;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ ogm.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f227624w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ogm.i iVar, gim.c cVar) {
        super(cVar);
        this.v = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f227624w |= Integer.MIN_VALUE;
        return this.v.b(null, this);
    }
}
