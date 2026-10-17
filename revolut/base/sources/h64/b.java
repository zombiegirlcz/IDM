package h64;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f149589w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f149589w |= Integer.MIN_VALUE;
        return c.I2(this.v, this);
    }
}
