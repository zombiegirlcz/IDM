package b23;

import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import n33.w;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public CardOrderAccountWrapper.Junior u;
    public w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f11870w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f11871x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11872y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.f11871x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f11870w = obj2;
        this.f11872y |= Integer.MIN_VALUE;
        return this.f11871x.b(null, null, this);
    }
}
