package jik;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public String u;
    public PricingPlanSubscription v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f174597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f174598x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f174599y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.f174599y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f174598x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f174599y.d3(null, this);
    }
}
