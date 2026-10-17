package xd1;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f304225w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar, gim.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f304225w |= Integer.MIN_VALUE;
        return this.v.J2(this);
    }
}
