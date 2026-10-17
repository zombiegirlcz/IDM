package z7c;

import com.revolut.feature.revolutpay.impl.external.service.IsReadyToPayService;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ IsReadyToPayService v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f319957w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(IsReadyToPayService isReadyToPayService, gim.c cVar) {
        super(cVar);
        this.v = isReadyToPayService;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f319957w |= Integer.MIN_VALUE;
        return IsReadyToPayService.c(this.v, null, null, this);
    }
}
