package u7d;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f277742w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.shared.help_centre.impl.faq.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f277742w |= Integer.MIN_VALUE;
        return com.revolut.feature.shared.help_centre.impl.faq.c.O2(this.v, this);
    }
}
