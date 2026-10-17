package buf;

import com.revolut.domain.models.moneyrequest.MoneyRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 extends gim.c {
    public MoneyRequest u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f18788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18789x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a1 a1Var, gim.c cVar) {
        super(cVar);
        this.f18788w = a1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f18789x |= Integer.MIN_VALUE;
        return a1.y2(this.f18788w, null, this);
    }
}
