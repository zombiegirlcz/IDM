package o3k;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public AccountId u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f221836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f221837x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f221838y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f221837x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f221836w = obj2;
        this.f221838y |= Integer.MIN_VALUE;
        return this.f221837x.d(null, this, null);
    }
}
