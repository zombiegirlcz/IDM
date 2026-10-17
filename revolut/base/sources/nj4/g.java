package nj4;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f216361w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f216361w |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a.I2(this.v, this);
    }
}
