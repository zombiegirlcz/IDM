package zqa;

import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState;
import fqa.m;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public CardOwnerCreationFlowContract$CreationProcessState u;
    public m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f324442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f324443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f324444y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f324443x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f324442w = obj2;
        this.f324444y |= Integer.MIN_VALUE;
        return this.f324443x.c3(null, null, this);
    }
}
