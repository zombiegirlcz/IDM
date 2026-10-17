package t7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.c {
    public int A;
    public long u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountWrapper f268736w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j8l.j f268737x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f268738y;
    public final /* synthetic */ p z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, gim.c cVar) {
        super(cVar);
        this.z = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f268738y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.i(0L, null, null, null, null, null, this);
    }
}
