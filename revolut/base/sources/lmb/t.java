package lmb;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f196940w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f196940w |= Integer.MIN_VALUE;
        return this.v.L2(null, this);
    }
}
