package pl7;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f237277w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, gim.c cVar) {
        super(cVar);
        this.v = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f237277w |= Integer.MIN_VALUE;
        return this.v.d(this);
    }
}
