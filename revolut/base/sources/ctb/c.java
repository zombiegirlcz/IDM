package ctb;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f108657w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f108657w |= Integer.MIN_VALUE;
        return com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b.I2(this.v, this);
    }
}
