package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends gim.c {
    public AccountWrapper u;
    public com.revolut.shared.feature.move_money.api.navigation.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f203208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f203209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f203210y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, gim.c cVar) {
        super(cVar);
        this.f203209x = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203208w = obj2;
        this.f203210y |= Integer.MIN_VALUE;
        return this.f203209x.d(null, null, this);
    }
}
