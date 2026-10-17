package n7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends gim.c {
    public AccountWrapper u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k7i.i f213152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f213153x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(k7i.i iVar, gim.c cVar) {
        super(cVar);
        this.f213152w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f213153x |= Integer.MIN_VALUE;
        return this.f213152w.g(null, null, null, this);
    }
}
