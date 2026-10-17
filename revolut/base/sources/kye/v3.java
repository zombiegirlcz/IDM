package kye;

/* JADX INFO: loaded from: classes8.dex */
public final class v3 extends gim.c {
    public dj0.d u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f190858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w3 f190859x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f190860y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(w3 w3Var, gim.c cVar) {
        super(cVar);
        this.f190859x = w3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f190858w = obj2;
        this.f190860y |= Integer.MIN_VALUE;
        return this.f190859x.e(null, 0L, null, null, this);
    }
}
