package mod;

import com.revolut.retail.feature.api.trips.models.Trip;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.c {
    public Trip u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f207620w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f207621x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f207620w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f207621x |= Integer.MIN_VALUE;
        return this.f207620w.e(null, this);
    }
}
