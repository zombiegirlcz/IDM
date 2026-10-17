package bqf;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public String u;
    public iy9.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f17819w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f17820x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17821y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f17820x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f17819w = obj2;
        this.f17821y |= Integer.MIN_VALUE;
        return this.f17820x.b(null, null, this);
    }
}
