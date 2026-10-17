package ubd;

import com.revolut.feature.shared.savings.models.account.SavingsAccountCreate;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public sbd.h u;
    public SavingsAccountCreate v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f278818w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f278819x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f278820y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, gim.c cVar) {
        super(cVar);
        this.f278819x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f278818w = obj2;
        this.f278820y |= Integer.MIN_VALUE;
        return this.f278819x.b(null, this);
    }
}
