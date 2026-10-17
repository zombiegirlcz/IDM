package s8a;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public AccountId.Personal u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f260939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260940x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f260939w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f260940x |= Integer.MIN_VALUE;
        return this.f260939w.b(null, null, this);
    }
}
