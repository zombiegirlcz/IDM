package lmb;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.c {
    public pcd.s u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f196943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a f196944x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f196945y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a aVar, gim.c cVar) {
        super(cVar);
        this.f196944x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f196943w = obj2;
        this.f196945y |= Integer.MIN_VALUE;
        return com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a.J2(this.f196944x, null, this);
    }
}
