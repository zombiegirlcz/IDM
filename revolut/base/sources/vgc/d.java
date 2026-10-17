package vgc;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f288819w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f288819w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
