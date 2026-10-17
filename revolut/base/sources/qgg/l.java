package qgg;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f245839w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, gim.c cVar) {
        super(cVar);
        this.v = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f245839w |= Integer.MIN_VALUE;
        return o.y2(this.v, this);
    }
}
