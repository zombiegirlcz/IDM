package hze;

import com.revolut.feature.topup_screen.api.descriptor.CardTopUpType;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.c {
    public CardTopUpType.RegularTopUp u;
    public Ref$ObjectRef v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f157173w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f157174x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c f157175y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f157175y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f157174x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f157175y.P2(null, this);
    }
}
