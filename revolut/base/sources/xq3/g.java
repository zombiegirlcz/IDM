package xq3;

import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import ft3.a1;
import ft3.d1;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public int A;
    public d1 u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public IntendedPricingPlan f308072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a1 f308073x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f308074y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, gim.c cVar) {
        super(cVar);
        this.z = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f308074y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, null, null, null, this);
    }
}
