package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public AccountWrapper u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jul.o f203125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f203126x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jul.o oVar, gim.c cVar) {
        super(cVar);
        this.f203125w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f203126x |= Integer.MIN_VALUE;
        return this.f203125w.j(null, this);
    }
}
