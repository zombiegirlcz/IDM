package kye;

/* JADX INFO: loaded from: classes8.dex */
public final class t3 extends gim.c {
    public xi0.b u;
    public Long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f190839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f190840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w3 f190841y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(w3 w3Var, gim.c cVar) {
        super(cVar);
        this.f190841y = w3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f190840x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f190841y.b(null, null, this);
    }
}
