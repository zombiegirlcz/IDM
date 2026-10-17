package ael;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends gim.c {
    public efl.f u;
    public efl.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3676w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f3677x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3678y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, gim.c cVar) {
        super(cVar);
        this.f3677x = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f3676w = obj2;
        this.f3678y |= Integer.MIN_VALUE;
        return this.f3677x.k(null, null, null, this);
    }
}
