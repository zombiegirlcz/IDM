package opf;

import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public io3.d u;
    public CurrencyFilteringPolicy v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f227609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f227610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f227611y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f227610x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f227609w = obj2;
        this.f227611y |= Integer.MIN_VALUE;
        return this.f227610x.a(null, null, this);
    }
}
