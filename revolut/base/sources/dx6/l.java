package dx6;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.c {
    public com.revolut.feature.freelancer.impl.ui.extension.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.extension.a f120906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f120907x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.freelancer.impl.ui.extension.a aVar, gim.c cVar) {
        super(cVar);
        this.f120906w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f120907x |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.extension.a.d3(this.f120906w, null, this);
    }
}
