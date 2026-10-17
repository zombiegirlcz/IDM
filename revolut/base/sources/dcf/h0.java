package dcf;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends gim.c {
    public gcf.a u;
    public Integer v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f112939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f112940x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i0 f112941y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.f112941y = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f112940x = obj2;
        this.z |= Integer.MIN_VALUE;
        return i0.y2(this.f112941y, null, this);
    }
}
