package lmb;

import com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public SavingsAccountCreationStepDestination.Fund u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f196916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f196917x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f196918y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f196917x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f196916w = obj2;
        this.f196918y |= Integer.MIN_VALUE;
        return this.f196917x.Z2(null, this);
    }
}
