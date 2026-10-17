package c62;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public zz1.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f21582w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21583x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f21582w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f21583x |= Integer.MIN_VALUE;
        return this.f21582w.b(null, this);
    }
}
