package q12;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.c {
    public l2j.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f241327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241328x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, gim.c cVar) {
        super(cVar);
        this.f241327w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f241328x |= Integer.MIN_VALUE;
        return this.f241327w.a(null, null, this);
    }
}
