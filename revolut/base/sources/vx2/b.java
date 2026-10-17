package vx2;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public Throwable u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f292806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f292807x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f292806w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f292807x |= Integer.MIN_VALUE;
        return this.f292806w.b(null, null, this);
    }
}
