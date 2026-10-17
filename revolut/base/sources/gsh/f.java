package gsh;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public hlm.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f146474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f146475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146476y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, gim.c cVar) {
        super(cVar);
        this.f146475x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f146474w = obj2;
        this.f146476y |= Integer.MIN_VALUE;
        return this.f146475x.d(this);
    }
}
