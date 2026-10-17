package b45;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f12170w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12171x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, gim.c cVar) {
        super(cVar);
        this.f12170w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f12171x |= Integer.MIN_VALUE;
        return this.f12170w.d(null, this, null);
    }
}
