package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.c {
    public AccountWrapper u;
    public com.revolut.shared.feature.move_money.api.navigation.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f203190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f203191x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f203192y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, gim.c cVar) {
        super(cVar);
        this.f203191x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203190w = obj2;
        this.f203192y |= Integer.MIN_VALUE;
        return this.f203191x.a(null, null, this);
    }
}
