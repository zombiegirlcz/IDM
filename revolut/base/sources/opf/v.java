package opf;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.c {
    public String u;
    public AccountId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f227640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f227641x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f227642y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, gim.c cVar) {
        super(cVar);
        this.f227641x = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f227640w = obj2;
        this.f227642y |= Integer.MIN_VALUE;
        return this.f227641x.g(null, this, null);
    }
}
