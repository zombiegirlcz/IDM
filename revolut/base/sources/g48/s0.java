package g48;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends gim.c {
    public AccountId.Joint u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f140409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f140410x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.f140409w = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f140410x |= Integer.MIN_VALUE;
        return this.f140409w.a(null, this);
    }
}
