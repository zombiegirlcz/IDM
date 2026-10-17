package fq;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.appwidget_core.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f137140w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.appwidget_core.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f137140w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
