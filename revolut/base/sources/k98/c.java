package k98;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public com.revolut.feature.junior.card_request.impl.ui.flow.request_review.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.card_request.impl.ui.flow.request_review.b f182294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f182295x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.junior.card_request.impl.ui.flow.request_review.b bVar, gim.c cVar) {
        super(cVar);
        this.f182294w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f182295x |= Integer.MIN_VALUE;
        return com.revolut.feature.junior.card_request.impl.ui.flow.request_review.b.O2(this.f182294w, this);
    }
}
