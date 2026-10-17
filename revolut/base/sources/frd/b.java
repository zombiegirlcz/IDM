package frd;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f137456w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f137457x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, gim.c cVar) {
        super(cVar);
        this.f137456w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f137457x |= Integer.MIN_VALUE;
        return this.f137456w.c(null, this);
    }
}
