package kkf;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ x B;
    public int C;
    public tof.a3 u;
    public tof.t3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ChargeBreakdown f184945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public aim.e f184946x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public aim.e f184947y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, gim.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, this, null, null, false);
    }
}
