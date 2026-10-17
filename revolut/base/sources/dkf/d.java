package dkf;

import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public RevPointsSpareChangeControllerApi$InputData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f115507w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f115508x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f115507w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f115508x |= Integer.MIN_VALUE;
        return this.f115507w.b3(this);
    }
}
