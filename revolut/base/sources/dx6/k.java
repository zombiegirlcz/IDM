package dx6;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.c {
    public com.revolut.feature.freelancer.impl.ui.extension.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.extension.a f120904w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f120905x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.freelancer.impl.ui.extension.a aVar, gim.c cVar) {
        super(cVar);
        this.f120904w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f120905x |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.extension.a.c3(this.f120904w, this);
    }
}
