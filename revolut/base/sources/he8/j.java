package he8;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f151601w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f151601w |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a.J2(this.v, this);
    }
}
