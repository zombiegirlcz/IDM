package k8d;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.screens.list.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f182125w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.shared.help_centre.impl.faq.screens.list.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f182125w |= Integer.MIN_VALUE;
        return com.revolut.feature.shared.help_centre.impl.faq.screens.list.b.y2(this.v, this);
    }
}
