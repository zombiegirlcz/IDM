package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class w3 extends gim.c {
    public chj.k0 u;
    public dej.a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f114142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k4 f114143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f114144y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(k4 k4Var, gim.c cVar) {
        super(cVar);
        this.f114143x = k4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f114142w = obj2;
        this.f114144y |= Integer.MIN_VALUE;
        return this.f114143x.d(null, null, this);
    }
}
