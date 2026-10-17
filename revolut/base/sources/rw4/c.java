package rw4;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f257821w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, gim.c cVar) {
        super(cVar);
        this.v = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f257821w |= Integer.MIN_VALUE;
        return this.v.i(null, this);
    }
}
