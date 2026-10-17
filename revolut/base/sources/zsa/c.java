package zsa;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public String u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f324857w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f324858x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f324859y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f324858x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f324857w = obj2;
        this.f324859y |= Integer.MIN_VALUE;
        return this.f324858x.a(null, this);
    }
}
