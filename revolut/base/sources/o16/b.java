package o16;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f221308w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f221309x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f221308w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f221309x |= Integer.MIN_VALUE;
        return this.f221308w.b(false, this);
    }
}
