package buf;

import com.revolut.domain.models.moneyrequest.MoneyRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class z0 extends gim.c {
    public MoneyRequest u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f18847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18848x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, gim.c cVar) {
        super(cVar);
        this.f18847w = a1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f18848x |= Integer.MIN_VALUE;
        return this.f18847w.D2(null, this);
    }
}
