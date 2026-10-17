package zdm;

/* JADX INFO: loaded from: classes23.dex */
public final class c extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ io.ktor.client.engine.okhttp.a f321605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f321606x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(io.ktor.client.engine.okhttp.a aVar, gim.c cVar) {
        super(cVar);
        this.f321605w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f321606x |= Integer.MIN_VALUE;
        return this.f321605w.f(null, this);
    }
}
