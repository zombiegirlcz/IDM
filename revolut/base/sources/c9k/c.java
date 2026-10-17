package c9k;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public AccountId u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f22481w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f22482x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f22483y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, gim.c cVar) {
        super(cVar);
        this.f22482x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f22481w = obj2;
        this.f22483y |= Integer.MIN_VALUE;
        return this.f22482x.a(null, null, null, null, this);
    }
}
