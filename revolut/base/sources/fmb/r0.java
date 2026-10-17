package fmb;

/* JADX INFO: loaded from: classes6.dex */
public final class r0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b f136298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f136299x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar, gim.c cVar) {
        super(cVar);
        this.f136298w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f136299x |= Integer.MIN_VALUE;
        return com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b.J2(this.f136298w, null, this);
    }
}
