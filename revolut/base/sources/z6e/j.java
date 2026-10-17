package z6e;

import com.revolut.feature.tab.accounts.models.ProductAccountId;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.c {
    public ProductAccountId u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f319739w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f319740x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f319739w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f319740x |= Integer.MIN_VALUE;
        return this.f319739w.d(null, this);
    }
}
