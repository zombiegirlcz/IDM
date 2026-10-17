package i52;

import com.revolut.feature.transfer.models.transfer.RecipientTrustState;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.c {
    public String u;
    public RecipientTrustState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f158570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f158571x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f158572y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, gim.c cVar) {
        super(cVar);
        this.f158571x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f158570w = obj2;
        this.f158572y |= Integer.MIN_VALUE;
        return o.a(this.f158571x, this);
    }
}
