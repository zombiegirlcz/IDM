package b58;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.c {
    public int A;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12467w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12468x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f12469y;
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.invite_flow.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.joint.impl.ui.invite_flow.d dVar, gim.c cVar) {
        super(cVar);
        this.z = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f12469y = obj2;
        this.A |= Integer.MIN_VALUE;
        return com.revolut.feature.joint.impl.ui.invite_flow.d.K2(this.z, this);
    }
}
