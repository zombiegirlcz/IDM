package zt2;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f325045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f325046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f325047y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f325046x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f325045w = obj2;
        this.f325047y |= Integer.MIN_VALUE;
        return c.a(this.f325046x, null, this);
    }
}
