package ls1;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f199585w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, gim.c cVar) {
        super(cVar);
        this.v = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f199585w |= Integer.MIN_VALUE;
        return this.v.i(this);
    }
}
