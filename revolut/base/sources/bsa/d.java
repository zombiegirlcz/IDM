package bsa;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public AccountId u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f18143w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f18144x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18145y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, gim.c cVar) {
        super(cVar);
        this.f18144x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f18143w = obj2;
        this.f18145y |= Integer.MIN_VALUE;
        return this.f18144x.a(null, null, null, null, this);
    }
}
