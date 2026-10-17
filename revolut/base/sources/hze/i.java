package hze;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.c {
    public Ref$ObjectRef u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c f157156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f157157x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f157156w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f157157x |= Integer.MIN_VALUE;
        return this.f157156w.M2(null, this);
    }
}
