package b8l;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.c {
    public OrderQuoteParams u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f13295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13296x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f13295w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f13296x |= Integer.MIN_VALUE;
        return this.f13295w.b(null, this);
    }
}
