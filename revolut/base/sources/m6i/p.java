package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.c {
    public com.revolut.shared.feature.move_money.api.navigation.a u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f203193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f203194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f203195y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, gim.c cVar) {
        super(cVar);
        this.f203194x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203193w = obj2;
        this.f203195y |= Integer.MIN_VALUE;
        return this.f203194x.b(null, null, this);
    }
}
