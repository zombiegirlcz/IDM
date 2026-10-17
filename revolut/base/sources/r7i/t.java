package r7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.c {
    public AccountWrapper u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f252247w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f252248x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f252249y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, gim.c cVar) {
        super(cVar);
        this.f252248x = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f252247w = obj2;
        this.f252249y |= Integer.MIN_VALUE;
        return this.f252248x.a(null, null, this);
    }
}
