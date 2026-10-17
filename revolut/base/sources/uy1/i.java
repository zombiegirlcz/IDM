package uy1;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.c {
    public int A;
    public String u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f284040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f284041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f284042y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.z = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f284042y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.i(null, 0L, 0, this);
    }
}
