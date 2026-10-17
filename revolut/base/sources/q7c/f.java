package q7c;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f242811w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f242812x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f242811w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f242812x |= Integer.MIN_VALUE;
        return this.f242811w.a(null, this);
    }
}
