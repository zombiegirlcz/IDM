package g6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.c {
    public MoneyRequest u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f141004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f141005x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, gim.c cVar) {
        super(cVar);
        this.f141004w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f141005x |= Integer.MIN_VALUE;
        return this.f141004w.e3(null, this);
    }
}
