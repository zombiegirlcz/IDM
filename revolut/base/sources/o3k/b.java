package o3k;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public AccountId u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f221830w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f221831x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f221832y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, gim.c cVar) {
        super(cVar);
        this.f221831x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f221830w = obj2;
        this.f221832y |= Integer.MIN_VALUE;
        return this.f221831x.b(null, null, null, null, this);
    }
}
