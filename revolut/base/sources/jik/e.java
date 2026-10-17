package jik;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public PricingPlanSubscription u;
    public c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f174594w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f174595x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f174596y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, gim.c cVar) {
        super(cVar);
        this.f174595x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f174594w = obj2;
        this.f174596y |= Integer.MIN_VALUE;
        return this.f174595x.c3(this);
    }
}
