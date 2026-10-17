package t82;

import com.revolut.feature.transfer.core.models.FundingSource;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public long u;
    public FundingSource v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f268803w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f268804x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f268805y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f268804x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f268803w = obj2;
        this.f268805y |= Integer.MIN_VALUE;
        return this.f268804x.a(this);
    }
}
