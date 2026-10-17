package p48;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.close_flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f232845w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.joint.impl.ui.close_flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f232845w |= Integer.MIN_VALUE;
        return com.revolut.feature.joint.impl.ui.close_flow.a.I2(this.v, this);
    }
}
