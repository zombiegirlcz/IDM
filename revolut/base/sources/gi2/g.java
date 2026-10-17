package gi2;

import g12.r;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public r u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f144064w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.wero.impl.ui.pay.b f144065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f144066y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.apm.wero.impl.ui.pay.b bVar, gim.c cVar) {
        super(cVar);
        this.f144065x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f144064w = obj2;
        this.f144066y |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.wero.impl.ui.pay.b.J2(this.f144065x, null, this);
    }
}
