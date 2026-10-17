package lhk;

import com.revolut.feature.pricingplans.models.SubscriptionPreviewId;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 extends gim.c {
    public Function1 u;
    public SubscriptionPreviewId.GiftedPlan v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f195327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f195328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e0 f195329y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, gim.c cVar) {
        super(cVar);
        this.f195329y = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f195328x = obj2;
        this.z |= Integer.MIN_VALUE;
        return e0.k3(this.f195329y, null, null, this);
    }
}
