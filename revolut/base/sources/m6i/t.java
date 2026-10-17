package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.c {
    public AccountWrapper u;
    public com.revolut.shared.feature.move_money.api.navigation.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f203202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f203203x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f203204y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, gim.c cVar) {
        super(cVar);
        this.f203203x = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203202w = obj2;
        this.f203204y |= Integer.MIN_VALUE;
        return this.f203203x.a(null, null, null, this);
    }
}
