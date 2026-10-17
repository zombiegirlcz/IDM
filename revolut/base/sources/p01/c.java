package p01;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public k01.m u;
    public s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f231416w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f231417x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f231418y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f231417x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f231416w = obj2;
        this.f231418y |= Integer.MIN_VALUE;
        return this.f231417x.a(null, this);
    }
}
