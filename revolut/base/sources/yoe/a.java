package yoe;

import com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public StampDutyAccount u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f315666w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f315667x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f315666w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f315667x |= Integer.MIN_VALUE;
        return this.f315666w.a(null, this);
    }
}
