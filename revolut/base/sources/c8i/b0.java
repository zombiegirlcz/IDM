package c8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends gim.c {
    public AccountWrapper u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f22175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f0 f22176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f22177y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var, gim.c cVar) {
        super(cVar);
        this.f22176x = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f22175w = obj2;
        this.f22177y |= Integer.MIN_VALUE;
        return this.f22176x.a(null, null, null, null, this);
    }
}
