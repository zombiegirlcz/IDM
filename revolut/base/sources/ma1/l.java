package ma1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.c {
    public CardReaderDevice u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f203888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f203889x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, gim.c cVar) {
        super(cVar);
        this.f203888w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f203889x |= Integer.MIN_VALUE;
        return this.f203888w.b(null, this);
    }
}
