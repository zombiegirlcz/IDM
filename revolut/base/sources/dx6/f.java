package dx6;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.c {
    public mr6.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.extension.a f120896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f120897x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.freelancer.impl.ui.extension.a aVar, gim.c cVar) {
        super(cVar);
        this.f120896w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f120897x |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.extension.a.Z2(this.f120896w, this);
    }
}
