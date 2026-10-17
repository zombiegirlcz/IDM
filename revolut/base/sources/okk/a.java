package okk;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226132w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f226132w |= Integer.MIN_VALUE;
        return this.v.b3(this);
    }
}
