package kyl;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public hlm.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f191015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f191016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f191017y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.f191016x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f191015w = obj2;
        this.f191017y |= Integer.MIN_VALUE;
        return this.f191016x.c(this);
    }
}
