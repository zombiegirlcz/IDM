package f23;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public e13.a u;
    public b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f131377w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f131378x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f131379y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, gim.c cVar) {
        super(cVar);
        this.f131378x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f131377w = obj2;
        this.f131379y |= Integer.MIN_VALUE;
        return this.f131378x.g3(null, null, this);
    }
}
