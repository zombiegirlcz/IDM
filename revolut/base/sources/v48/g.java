package v48;

import n38.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public d0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.creation_flow.b f285991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f285992x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.joint.impl.ui.creation_flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f285991w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f285992x |= Integer.MIN_VALUE;
        return this.f285991w.J2(null, this);
    }
}
