package z5j;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f319633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f319634x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f319633w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f319634x |= Integer.MIN_VALUE;
        return this.f319633w.b(null, this);
    }
}
