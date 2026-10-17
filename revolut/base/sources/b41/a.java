package b41;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.c {
    public hlm.a u;
    public c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f12142x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f12143y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f12143y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f12142x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f12143y.a(this);
    }
}
