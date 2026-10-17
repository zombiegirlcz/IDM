package jhk;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.c {
    public Function0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b f174302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f174303x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar, gim.c cVar) {
        super(cVar);
        this.f174302w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f174303x |= Integer.MIN_VALUE;
        return this.f174302w.J2(null, this);
    }
}
