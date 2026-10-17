package gsh;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public ukm.b u;
    public Exception v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f146479w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f146480x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146481y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, gim.c cVar) {
        super(cVar);
        this.f146480x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f146479w = obj2;
        this.f146481y |= Integer.MIN_VALUE;
        return n.b(this.f146480x, null, this);
    }
}
