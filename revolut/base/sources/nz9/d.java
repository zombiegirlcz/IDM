package nz9;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f221006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f221007x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f221006w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f221007x |= Integer.MIN_VALUE;
        return this.f221006w.e(null, this);
    }
}
