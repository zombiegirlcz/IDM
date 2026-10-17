package uoe;

import com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public jf0.c u;
    public StampDutyAccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f281639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f281640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f281641y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f281640x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f281639w = obj2;
        this.f281641y |= Integer.MIN_VALUE;
        return this.f281640x.e(null, this);
    }
}
