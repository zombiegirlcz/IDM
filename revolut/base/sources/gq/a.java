package gq;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f145467w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f145468x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f145467w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f145468x |= Integer.MIN_VALUE;
        return this.f145467w.a(false, this);
    }
}
