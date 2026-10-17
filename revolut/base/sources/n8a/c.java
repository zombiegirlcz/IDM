package n8a;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public AccountId u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f213300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f213301x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, gim.c cVar) {
        super(cVar);
        this.f213300w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f213301x |= Integer.MIN_VALUE;
        return this.f213300w.e(null, null, this);
    }
}
