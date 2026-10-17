package n6i;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.c {
    public String u;
    public pcd.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f212824w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x f212825x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f212826y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, gim.c cVar) {
        super(cVar);
        this.f212825x = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f212824w = obj2;
        this.f212826y |= Integer.MIN_VALUE;
        return this.f212825x.d(null, null, this);
    }
}
