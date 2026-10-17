package zqa;

import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public CardOwnerCreationFlowContract$CreationProcessState u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f324440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f324441x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f324440w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f324441x |= Integer.MIN_VALUE;
        return this.f324440w.Z2(null, this);
    }
}
