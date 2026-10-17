package eie;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public ProductAccountDescriptor$Value u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zq.a f126592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f126593x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zq.a aVar, gim.c cVar) {
        super(cVar);
        this.f126592w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f126593x |= Integer.MIN_VALUE;
        return zq.a.d(this.f126592w, null, this);
    }
}
