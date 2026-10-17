package sw4;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f266092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f266093x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, gim.c cVar) {
        super(cVar);
        this.f266092w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f266093x |= Integer.MIN_VALUE;
        return this.f266092w.i(null, this);
    }
}
