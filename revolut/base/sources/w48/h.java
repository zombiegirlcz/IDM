package w48;

import n38.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.c {
    public d0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.deeplink.a f294527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f294528x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.joint.impl.ui.deeplink.a aVar, gim.c cVar) {
        super(cVar);
        this.f294527w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f294528x |= Integer.MIN_VALUE;
        return this.f294527w.J2(null, this);
    }
}
