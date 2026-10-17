package ulf;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.c {
    public AccountWrapper u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f280974w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f280975x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f280976y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, gim.c cVar) {
        super(cVar);
        this.f280976y = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f280975x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f280976y.a(null, null, null, this);
    }
}
