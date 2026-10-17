package b8d;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.screens.article.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13198w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f13198w |= Integer.MIN_VALUE;
        return this.v.B2(this);
    }
}
