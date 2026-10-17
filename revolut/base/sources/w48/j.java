package w48;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.deeplink.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f294530w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.joint.impl.ui.deeplink.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f294530w |= Integer.MIN_VALUE;
        return this.v.L2(this);
    }
}
