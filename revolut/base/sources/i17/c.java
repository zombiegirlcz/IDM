package i17;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.prompt.restrictions.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f157587w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.freelancer.impl.ui.prompt.restrictions.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f157587w |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.prompt.restrictions.c.I2(this.v, this);
    }
}
