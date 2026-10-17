package i4g;

import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.c {
    public FlightSearchQuery u;
    public r7g.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ihm.f f158428w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f158429x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f158430y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f158430y = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f158429x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f158430y.a(null, null, null, this);
    }
}
