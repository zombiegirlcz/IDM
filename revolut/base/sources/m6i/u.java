package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.c {
    public int A;
    public AccountWrapper u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountWrapper f203205w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountWrapper f203206x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f203207y;
    public final /* synthetic */ w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, gim.c cVar) {
        super(cVar);
        this.z = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203207y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, null, this);
    }
}
