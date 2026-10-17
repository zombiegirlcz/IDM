package h8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public int A;
    public AccountWrapper u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f150046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f150047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f150048y;
    public final /* synthetic */ c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.z = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f150048y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, false, this);
    }
}
