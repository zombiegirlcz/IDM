package hze;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.c {
    public Ref$ObjectRef u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c f157160w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f157161x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f157160w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f157161x |= Integer.MIN_VALUE;
        return this.f157160w.N2(null, null, this);
    }
}
