package b7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public AccountWrapper u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f13045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13046x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f13045w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f13046x |= Integer.MIN_VALUE;
        return this.f13045w.a(this);
    }
}
