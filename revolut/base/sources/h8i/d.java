package h8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public AccountWrapper u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public sh5.c f150052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f150053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f150054y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f150054y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f150053x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f150054y.a(null, null, this);
    }
}
