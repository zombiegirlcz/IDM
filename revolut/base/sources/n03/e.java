package n03;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d f210859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f210860x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d dVar, gim.c cVar) {
        super(cVar);
        this.f210859w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f210860x |= Integer.MIN_VALUE;
        return this.f210859w.K2(null, this);
    }
}
