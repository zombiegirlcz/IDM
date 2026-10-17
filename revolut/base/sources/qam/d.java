package qam;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public nam.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f244065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f244066x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f244065w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f244066x |= Integer.MIN_VALUE;
        return e.a(this.f244065w, null, this);
    }
}
