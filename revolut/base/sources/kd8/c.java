package kd8;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v6d.a f182814w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f182815x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f182816y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f182816y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f182815x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f182816y.a(null, null, null, this);
    }
}
