package opf;

import com.revolut.feature.defi.accounts.api.model.DeFiBalance;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends gim.c {
    public String u;
    public DeFiBalance v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f227629w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f227630x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f227631y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z zVar, gim.c cVar) {
        super(cVar);
        this.f227630x = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f227629w = obj2;
        this.f227631y |= Integer.MIN_VALUE;
        return this.f227630x.c(null, this);
    }
}
