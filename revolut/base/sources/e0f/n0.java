package e0f;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes8.dex */
public final class n0 extends gim.c {
    public final /* synthetic */ t0 A;
    public int B;
    public AccountId u;
    public t0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f121648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f121649x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f121650y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.A = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, this);
    }
}
