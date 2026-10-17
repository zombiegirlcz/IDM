package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends gim.c {
    public AccountWrapper u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hd.r f203127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f203128x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(hd.r rVar, gim.c cVar) {
        super(cVar);
        this.f203127w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f203128x |= Integer.MIN_VALUE;
        return this.f203127w.w(null, null, this);
    }
}
