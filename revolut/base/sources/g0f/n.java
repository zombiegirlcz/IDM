package g0f;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.c {
    public com.revolut.feature.topup_screen.impl.mcy.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.mcy.b f139488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f139489x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.topup_screen.impl.mcy.b bVar, gim.c cVar) {
        super(cVar);
        this.f139488w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f139489x |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.mcy.b.J2(this.f139488w, null, this);
    }
}
