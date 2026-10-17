package yea;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.ui.add_new.c f312838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f312839x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.pockets.impl.ui.add_new.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f312838w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f312839x |= Integer.MIN_VALUE;
        return com.revolut.feature.pockets.impl.ui.add_new.c.I2(this.f312838w, null, this);
    }
}
