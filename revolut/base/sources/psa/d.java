package psa;

import com.revolut.feature.push_to_card.api.data.CardOwner;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public CardOwner u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f239460w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f239461x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f239460w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f239461x |= Integer.MIN_VALUE;
        return this.f239460w.b3(null, null, this);
    }
}
