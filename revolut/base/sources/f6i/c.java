package f6i;

import com.revolut.feature_move_money.api.model.AccountSource;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public x5i.a u;
    public x5i.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountSource f132443w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f132444x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f132445y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f132445y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f132444x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f132445y.Z2(null, null, this);
    }
}
