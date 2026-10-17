package sc7;

import com.revolut.feature.push_to_card.api.data.CardOwner;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.c {
    public CardOwner u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f261656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f261657x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f261656w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f261657x |= Integer.MIN_VALUE;
        return j.b(this.f261656w, null, this);
    }
}
