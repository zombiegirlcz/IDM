package xdk;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public AccountId u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f304491w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f304492x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.f304491w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f304492x |= Integer.MIN_VALUE;
        return this.f304491w.d3(null, this, null);
    }
}
