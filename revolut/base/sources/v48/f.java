package v48;

import n38.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.c {
    public d0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.creation_flow.b f285989w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f285990x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.joint.impl.ui.creation_flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f285989w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f285990x |= Integer.MIN_VALUE;
        return com.revolut.feature.joint.impl.ui.creation_flow.b.I2(this.f285989w, null, this);
    }
}
