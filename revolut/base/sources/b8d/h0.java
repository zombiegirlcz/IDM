package b8d;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends gim.c {
    public aj0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.screens.article.c f13163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13164x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f13163w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f13164x |= Integer.MIN_VALUE;
        return com.revolut.feature.shared.help_centre.impl.faq.screens.article.c.y2(this.f13163w, this);
    }
}
