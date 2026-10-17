package b58;

import n38.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.c {
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.invite_flow.d A;
    public int B;
    public d0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12466y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.joint.impl.ui.invite_flow.d dVar, gim.c cVar) {
        super(cVar);
        this.A = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return com.revolut.feature.joint.impl.ui.invite_flow.d.J2(this.A, null, this);
    }
}
