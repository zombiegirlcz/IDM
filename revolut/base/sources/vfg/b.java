package vfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public TravelMilesAccountV2 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f288610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f288611x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f288610w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f288611x |= Integer.MIN_VALUE;
        return this.f288610w.b(null, this);
    }
}
