package b23;

import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public kc8.a u;
    public CardOrderAccountWrapper.Junior v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f11876w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f11877x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11878y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f11877x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f11876w = obj2;
        this.f11878y |= Integer.MIN_VALUE;
        return this.f11877x.c(null, null, this);
    }
}
