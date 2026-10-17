package b58;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.invite_flow.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12470w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.joint.impl.ui.invite_flow.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f12470w |= Integer.MIN_VALUE;
        return com.revolut.feature.joint.impl.ui.invite_flow.d.M2(this.v, null, this);
    }
}
