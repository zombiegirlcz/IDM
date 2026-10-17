package pze;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.c {
    public Ref$ObjectRef u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b f240998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f240999x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b bVar, gim.c cVar) {
        super(cVar);
        this.f240998w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f240999x |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.L2(this.f240998w, this);
    }
}
