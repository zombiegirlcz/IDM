package kv;

/* JADX INFO: loaded from: classes16.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f189892w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, gim.c cVar) {
        super(cVar);
        this.v = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f189892w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
