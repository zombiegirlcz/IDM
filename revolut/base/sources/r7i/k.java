package r7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.c {
    public AccountWrapper u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f252223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f252224x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, gim.c cVar) {
        super(cVar);
        this.f252223w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f252224x |= Integer.MIN_VALUE;
        return this.f252223w.b(null, this);
    }
}
