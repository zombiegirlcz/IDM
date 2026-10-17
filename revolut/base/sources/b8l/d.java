package b8l;

import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.c {
    public LegacyOrderQuoteParams u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f13293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13294x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f13293w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f13294x |= Integer.MIN_VALUE;
        return this.f13293w.a(null, this);
    }
}
