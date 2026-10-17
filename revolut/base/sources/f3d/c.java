package f3d;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f131936w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f131937x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, gim.c cVar) {
        super(cVar);
        this.f131936w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f131937x |= Integer.MIN_VALUE;
        return this.f131936w.i(null, null, this);
    }
}
