package x48;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public c u;
    public AccountId.Joint v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f302805w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f302806x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f302807y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, gim.c cVar) {
        super(cVar);
        this.f302806x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f302805w = obj2;
        this.f302807y |= Integer.MIN_VALUE;
        return this.f302806x.c(null, null, this);
    }
}
