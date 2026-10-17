package tnb;

import com.revolut.feature.tab.accounts.models.ProductAccountId;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.c {
    public ProductAccountId u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f272392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f272393x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, gim.c cVar) {
        super(cVar);
        this.f272392w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f272393x |= Integer.MIN_VALUE;
        return this.f272392w.c(null, this);
    }
}
